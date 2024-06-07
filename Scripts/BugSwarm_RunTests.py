import json
import os
import subprocess
import random
import shutil
import re

bugs_json_path = 'FilteredExport.json'
repos_base_dir = 'repos'
output_base_dir = '/Users/urjakhadilkar/Desktop/TestedBugs'
allowed_projects = ['canal', 'Wikidata-Toolkit', 'java-fundamentals-exercises', 'mp4parser']
num_bugs = 20 

def load_and_filter_bugs(bugs_json_path):
    with open(bugs_json_path, 'r') as f:
        all_bugs = json.load(f)
    filtered_bugs = [bug for bug in all_bugs if bug['repo'].split('/')[-1] in allowed_projects]
    return random.sample(filtered_bugs, min(len(filtered_bugs), num_bugs))

def modify_pom_xml(repo_dir):
    pom_path = os.path.join(repo_dir, 'pom.xml')
    if not os.path.exists(pom_path):
        return False

    with open(pom_path, 'r') as file:
        pom_contents = file.read()

    pom_contents = re.sub(r'<maven.compiler.source>.*?</maven.compiler.source>', '<maven.compiler.source>1.8</maven.compiler.source>', pom_contents)
    pom_contents = re.sub(r'<maven.compiler.target>.*?</maven.compiler.target>', '<maven.compiler.target>1.8</maven.compiler.target>', pom_contents)
    
    pom_contents = re.sub(
        r'(<plugin>\s*<groupId>org.apache.maven.plugins</groupId>\s*<artifactId>maven-gpg-plugin</artifactId>\s*<version>).*?(</version>\s*</plugin>)',
        r'\g<1>1.8\g<2>',
        pom_contents,
        flags=re.DOTALL
    )

    pom_contents = re.sub(r'<source>.*?</source>',
                          r'<source>1.8</source>',
                          pom_contents)

    pom_contents = re.sub(r'<target>.*?</target>',
                          r'<target>1.8</target>',
                          pom_contents)

    pom_contents = re.sub(r'<source-version>.*?</source-version>',
                          r'<source-version>1.8</source-version>',
                          pom_contents)

    pom_contents = re.sub(r'<target-version>.*?</target-version>',
                          r'<target-version>1.8</target-version>',
                          pom_contents)

    with open(pom_path, 'w') as file:
        file.write(pom_contents)

    return True

def run_tests(repo_dir, output_path):
    result = subprocess.run(['mvn', 'test'], cwd=repo_dir, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    with open(output_path, 'w') as file:
        file.write(result.stdout.decode())

def process_bug(bug):
    repo_dir = os.path.join(repos_base_dir, bug['repo'].split('/')[-1])
    bug_output_dir = os.path.join(output_base_dir, bug['image_tag'])
    os.makedirs(bug_output_dir, exist_ok=True)

    for job_type in ['failed_job', 'passed_job']:
        version_dir_name = 'Buggy-Version' if job_type == 'failed_job' else 'Patched-Version'
        output_filename = 'Buggy-output.txt' if job_type == 'failed_job' else 'Patched-output.txt'
        version_dir = os.path.join(bug_output_dir, version_dir_name)
        os.makedirs(version_dir, exist_ok=True)
        subprocess.run(['git', 'checkout', '-f', bug[job_type]['trigger_sha']], cwd=repo_dir)
        shutil.copytree(repo_dir, version_dir, dirs_exist_ok=True, ignore=shutil.ignore_patterns('.git', 'target'))
        if modify_pom_xml(version_dir):
            run_tests(version_dir, os.path.join(bug_output_dir, output_filename))

    diff_path = os.path.join(bug_output_dir, 'Diff.diff')
    subprocess.run(['git', 'diff', bug['failed_job']['trigger_sha'], bug['passed_job']['trigger_sha']], cwd=repo_dir, stdout=open(diff_path, 'w'))

def main():
    bugs = load_and_filter_bugs(bugs_json_path)
    for bug in bugs:
        process_bug(bug)
    print(f"Processed {len(bugs)} bugs from allowed projects.")

if __name__ == '__main__':
    main()
