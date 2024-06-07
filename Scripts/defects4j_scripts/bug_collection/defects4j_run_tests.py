import os
import subprocess

def run_tests_and_log_failures(base_dir, output_file):
    # Open the output file for writing
    counter = 0
    with open(output_file, 'w') as file:
        # Iterate over each project directory in the base directory
        for project_dir in os.listdir(base_dir):
            project_path = os.path.join(base_dir, project_dir)
            counter+=1
            if os.path.isdir(project_path) and "buggy" in os.listdir(project_path):
                print(f"{counter}. Processing {project_dir}...")
                file.write(f"{project_dir}:\n")
                buggy_path = os.path.join(project_path, "buggy")
                # Change working directory to the buggy version to run the tests
                os.chdir(buggy_path)
                try:
                    # Run defects4j test and capture the output
                    result = subprocess.run(["defects4j", "test"], capture_output=True, text=True)
                    output = result.stdout + result.stderr
                    # Look for failing tests in the output
                    for line in output.split("\n"):
                        if "Failing tests: " in line or line.strip().startswith("- "):
                            # Write the failing test name to the output file
                            print(f"Failing Tests are: {line.strip()}\n")
                            file.write(f"{line.strip()}\n")
                except subprocess.CalledProcessError as e:
                    print(f"Failed to run tests for {project_dir}: {e}")
                finally:
                    # Change back to the base directory
                    os.chdir(base_dir)

if __name__ == "__main__":
    base_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"
    output_file = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/scripts/failing_tests.txt"
    run_tests_and_log_failures(base_dir, output_file)
    print(f"Failing tests information saved to {output_file}")
