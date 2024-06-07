import os

def parse_failing_tests(test_results_path):
    """Parse the .txt file to extract failing tests."""
    failing_tests = set()
    if not os.path.exists(test_results_path):
        return failing_tests  # Return an empty set if the file doesn't exist
    
    with open(test_results_path, 'r') as file:
        for line in file:
            if '::' in line or '  - ' in line:  # Adjust based on the format of your file
                test_name = line.strip().split()[-1]  # Adjust to correctly parse the test name
                failing_tests.add(test_name)
    return failing_tests

def compare_and_save_test_results(project_dir, project_name):
    """Identify tests failing in buggy version but not in patched version."""
    buggy_results_path = os.path.join(project_dir, f"{project_name}_Buggy-Version_test_results.txt")
    patched_results_path = os.path.join(project_dir, f"{project_name}_Patched-Version_test_results.txt")
    
    failing_in_buggy = parse_failing_tests(buggy_results_path)
    failing_in_patched = parse_failing_tests(patched_results_path)
    
    # Tests that are failing in buggy but not failing in patched
    fixed_in_patched = failing_in_buggy - failing_in_patched
    
    # Save the names of these tests to a .txt file
    results_file_path = os.path.join(project_dir, f"randoop_ER_{project_name}_tests_fixed_in_patched.txt")
    with open(results_file_path, 'w') as file:
        for test in sorted(fixed_in_patched):
            file.write(test + '\n')
    
    print(f"Fixed tests in patched version for {project_name} saved to {results_file_path}")

# Main
projects_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/project_repo/defects4j"

for project_name in os.listdir(projects_dir):
    project_path = os.path.join(projects_dir, project_name)
    if os.path.isdir(project_path):
        compare_and_save_test_results(project_path, project_name)
