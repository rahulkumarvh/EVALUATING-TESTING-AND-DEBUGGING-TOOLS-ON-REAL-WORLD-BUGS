import os

def process_failing_tests(input_file, base_dir):
    # Dictionary to store failing tests by project_bugid
    failing_tests_by_project = {}

    # Read the failing_tests.txt file and parse its content
    with open(input_file, 'r') as file:
        lines = file.readlines()
        current_project_bugid = ""
        for line in lines:
            print("Line: ", line)
            if line.strip() and not line.startswith("- ") and not line.startswith("Failing"):
                print("new project bug line")
                # New project_bugid section
                current_project_bugid = line.strip().replace(':', '')
                failing_tests_by_project[current_project_bugid] = []
            elif line.startswith("- "):
                print("line starts with -")
                # Failing test for the current project_bugid
                failing_tests_by_project[current_project_bugid].append(line.strip().lstrip("- "))

    # Write the failing tests to their respective directories
    for project_bugid, failing_tests in failing_tests_by_project.items():
        if failing_tests:  # Check if there are any failing tests
            output_path = os.path.join(base_dir, project_bugid, 'failing_tests.txt')
            with open(output_path, 'w') as output_file:
                for test in failing_tests:
                    output_file.write(test + '\n')
                print(f"Failing tests for {project_bugid} written to {output_path}")

if __name__ == "__main__":
    input_file = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/scripts/failing_tests.txt"  # Update with the actual path
    base_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"
    process_failing_tests(input_file, base_dir)
