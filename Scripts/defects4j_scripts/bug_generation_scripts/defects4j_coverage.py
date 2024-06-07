import os
import subprocess
import json

# Define paths
tests_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/generated_tests_evosuite_regression_fixed"
projects_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/project_repo/defects4j"
coverage_script = "run_coverage.pl" 
json_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts/defects4j_project_bugs.json"

# Load the project information from the JSON file
with open(json_path, 'r') as file:
    projects_info = json.load(file)

def get_project_info(original):
    """Extract project name and ID from the 'original' field."""
    parts = original.split('_')
    project = parts[0]
    id_version = parts[1]
    return project, id_version

def run_coverage(project, id_version, suite_dir):
    """Run the coverage analysis using defects4j's run_coverage.pl script."""
    out_dir = os.path.join(projects_dir, f"{project}_{id_version}/Coverage/Patched-version-Evosuite-test-coverage")
    os.makedirs(out_dir, exist_ok=True)
    
    # # Run the run_coverage.pl script
    # cmd = [coverage_script, "-p", project, "-d", suite_dir, "-o", out_dir, "-v", f"{id_version}b"]
    # print(f"Running coverage analysis for {project}-{id_version}: {' '.join(cmd)}")
    # subprocess.run(cmd, shell=True)  # Use shell=True if necessary
    
    cmd = f"{coverage_script} -p {project} -d {suite_dir} -o {out_dir} -v {id_version}f"
    # print("COMMAND:", cmd)
    
    print(f"Running coverage analysis for {project}-{id_version}: {cmd}")
    subprocess.run(cmd, shell=True)

# Main execution loop
for project_bug in projects_info:
    project, id_version = get_project_info(project_bug['original'])
    project_test_dir = os.path.join(tests_dir, project, 'evosuite', '1')
    
    if os.path.isdir(project_test_dir):
        for filename in os.listdir(project_test_dir):
            if filename.endswith(".tar.bz2"):
                archive_path = os.path.join(project_test_dir, filename)
                suite_dir = os.path.dirname(archive_path)
                run_coverage(project, id_version, suite_dir)
    else:
        print(f"Archive directory does not exist: {project_test_dir}")

print("Completed coverage analysis for all projects.")
