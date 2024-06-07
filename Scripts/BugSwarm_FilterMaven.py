import json
import os
from multiprocessing import Pool
import random

repos_dir = 'repos'
json_file_path = 'Export.json'
filtered_json_file_path = 'FilteredExport.json'

def is_maven_project(repo_dir):
    return os.path.exists(os.path.join(repo_dir, 'pom.xml'))

def select_random_bugs(filtered_bugs, count=20):
    if len(filtered_bugs) > count:
        return random.sample(filtered_bugs, count)
    return filtered_bugs

def get_maven_repos(repo_dirs):
    maven_repos = [repo for repo in repo_dirs if is_maven_project(os.path.join(repos_dir, repo))]
    return maven_repos

def filter_bugs_by_repos(bugs, maven_repos):
    return [bug for bug in bugs if bug['repo'].split('/')[-1] in maven_repos and bug["failed_job"]["num_tests_failed"] > 0]

def main(json_file_path, repos_dir, filtered_json_file_path):
    repo_dirs = next(os.walk(repos_dir))[1]
    
    with Pool(processes=os.cpu_count()) as pool:
        maven_repos = pool.map(is_maven_project, [os.path.join(repos_dir, repo_dir) for repo_dir in repo_dirs])
    
    maven_repos_names = [repo_dirs[i] for i, is_maven in enumerate(maven_repos) if is_maven]
    with open(json_file_path, 'r') as file:
        bugs = json.load(file)
    
    filtered_bugs = filter_bugs_by_repos(bugs, maven_repos_names)

    # selected_bugs = select_random_bugs(filtered_bugs)
    
    with open(filtered_json_file_path, 'w') as outfile:
        json.dump(filtered_bugs, outfile, indent=4)

if __name__ == '__main__':
    main(json_file_path, repos_dir, filtered_json_file_path)
