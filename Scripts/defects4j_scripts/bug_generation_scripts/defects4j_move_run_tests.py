import os
import tarfile
import shutil
import subprocess
import json

# Define paths
json_path = "./defects4j_project_bugs.json"
# tests_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/generated_tests_randoop_regression_patched"
# tests_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/generated_tests_randoop_errorrevealing_buggy"
tests_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/generated_tests_evosuite_regression_fixed"
projects_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/project_repo/defects4j"

# Load the project information from the JSON file
with open(json_path, 'r') as file:
    projects_info = json.load(file)

# Function to extract, rename, and move tests
def process_tests(project_bug, archive_path, test_dir_suffix):
    print("Processing Tests: ", project_bug, " archive path: ", archive_path, " test_dir_suffix: ", test_dir_suffix)
    with tarfile.open(archive_path, 'r:bz2') as tar:
        tar.extractall(path=os.path.dirname(archive_path))

    extracted_dir = os.path.dirname(archive_path)

    for root, dirs, files in os.walk(extracted_dir):
        for file in files:
            if file.endswith('.java'):
                source_file = os.path.join(root, file)
                new_file_name = "Evosuite" + file  # Rename the file by prefixing with "Randoop or Evosuite"
                for version in ["Buggy-Version", "Patched-Version"]:
                    dest_dir = os.path.join(projects_dir, project_bug['original'], version, test_dir_suffix)
                    os.makedirs(dest_dir, exist_ok=True)
                    shutil.copy(source_file, os.path.join(dest_dir, new_file_name))  # Use the new file name

# Function to run defects4j test and save output
def run_defects4j_and_save(project_bug):
    print("Running the tests for: ", project_bug['original'])
    for version in ["Buggy-Version", "Patched-Version"]:
        project_version_path = os.path.join(projects_dir, project_bug['original'], version)
        os.chdir(project_version_path)
        result = subprocess.run(['defects4j', 'test'], capture_output=True, text=True)
        with open(f"{project_bug['original']}_{version}_test_results.txt", "w") as file:
            file.write(result.stdout + result.stderr)

# Main execution loop
for project_bug in projects_info:
    project_test_dir = os.path.join(tests_dir, project_bug['project'], 'evosuite', '1')
    expected_filename = f"{project_bug['project']}-{project_bug['id']}f-evosuite.1.tar.bz2"
    archive_path = os.path.join(project_test_dir, expected_filename)
    
    if os.path.exists(archive_path):
        print("Archive found: ", archive_path)
        process_tests(project_bug, archive_path, project_bug.get('test_dir'))
        # Uncomment the next line to enable running defects4j test and saving the output
        # run_defects4j_and_save(project_bug)

print("Completed processing all projects.")