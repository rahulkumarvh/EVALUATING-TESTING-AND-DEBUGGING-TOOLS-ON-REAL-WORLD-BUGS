import json
import subprocess

# Path to the JSON file containing the project and bug IDs
json_file_path = './defects4j_project_bugs.json'

# Read the projects from the JSON file
with open(json_file_path, 'r') as file:
    projects = json.load(file)

# Base command template
base_cmd = "gen_tests.pl -g randoop -p {project_name} -v {bug_id}b -n 1 -o /Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/generated_tests_randoop_errorrevealing_buggy -b 250 -E"

# Iterate over each project_bug directory
for project in projects:
    # Extract project name and id
    project_name = project["project"]
    bug_id = project["id"]
    
    # Format command with the current project and bug id
    cmd = base_cmd.format(project_name=project_name, bug_id=bug_id)
    
    try:
        if project_name!="Chart":
            subprocess.run(cmd, shell=True, check=True)
            print(f"\n\n Successful Execution of: {cmd}\n\n")
        else:
            print(f"\n\nIgnoring to execute: {cmd}\n\n")
    except subprocess.CalledProcessError as e:
        print(f"\n\nFailed to execute: {cmd}\nError: {e}\n\n")
