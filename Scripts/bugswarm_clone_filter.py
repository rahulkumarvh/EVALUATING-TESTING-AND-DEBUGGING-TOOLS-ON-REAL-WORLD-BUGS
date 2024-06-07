import json
import os
import subprocess
import shutil
import random
from multiprocessing import Pool

# Adjust these paths as needed
json_file_path = '/Users/urjakhadilkar/Desktop/Filtered20.json'
base_dir = '/Users/urjakhadilkar/Desktop/cloned_repos'
filtered_json_file_path = 'filtered_bugs.json'
num_bugs_to_process = 20

def run_command(command, cwd=None):
    process = subprocess.run(command, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, universal_newlines=True)
    return process.returncode, process.stdout, process.stderr

def clone_repo(bug):
    repo_url = f"https://github.com/{bug['repo']}.git"
    repo_dir = os.path.join(base_dir, bug['repo'].replace('/', '_'))
    
    if not os.path.exists(repo_dir):
        returncode, _, stderr = run_command(['git', 'clone', repo_url, repo_dir], cwd=base_dir)
        if returncode != 0:
            print(f"Error cloning {repo_url}: {stderr}")
            shutil.rmtree(repo_dir)  # Delete repo if cloning fails
            return None
    
    # Check if the repository is empty
    if not os.listdir(repo_dir) or (len(os.listdir(repo_dir)) == 1 and os.listdir(repo_dir)[0] == ".git"):
        print(f"Repository {repo_url} is empty.")
        shutil.rmtree(repo_dir)  # Delete empty repository
        return None
    
    return bug

def filter_and_clone_bugs(bugs):
    with Pool(processes=os.cpu_count()) as pool:
        results = pool.map(clone_repo, bugs)
    return [bug for bug in results if bug is not None]

def select_and_filter_json(bugs):
    selected_bugs = random.sample(bugs, min(len(bugs), num_bugs_to_process))
    with open(filtered_json_file_path, 'w') as outfile:
        json.dump(selected_bugs, outfile, indent=4)
    
    return selected_bugs

def main():
    with open(json_file_path, 'r') as file:
        bugs = json.load(file)
    
    successful_bugs = filter_and_clone_bugs(bugs)
    # filtered_bugs = select_and_filter_json(successful_bugs)
    
    # print(f"Filtered {len(filtered_bugs)} bugs successfully cloned and saved to {filtered_json_file_path}")

if __name__ == '__main__':
    main()
