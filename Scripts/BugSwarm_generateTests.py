import os
import subprocess

def run_maven_test(project_dir):
    """Run Maven test to ensure the project is in a testable state."""
    subprocess.run(['mvn', 'test'], cwd=project_dir)

def run_evosuite(test_classes, version_dir, evosuite_jar_path):
    """Run EvoSuite on a list of test classes for a given project version."""
    # Create an EvoSuite test output directory inside the version directory
    evosuite_output_dir = os.path.join(version_dir, 'evosuite_tests')
    os.makedirs(evosuite_output_dir, exist_ok=True)
    
    for test_class in test_classes:
        # Classpath setup for Maven projects, may require adjustment
        classpath = f"{version_dir}/store/target/classes:{version_dir}/store/target/test-classes/com/alibaba/otter/cancel/store/memory/buffer"
        cmd = [
            'java',
            '-jar', evosuite_jar_path,
            '-class', test_class,
            '-projectCP', classpath,
            '-Dsearch_budget=60',  # Time budget for EvoSuite, adjust as needed
            '-Dtest_dir=' + evosuite_output_dir,  # Directory to output the generated tests
            # More EvoSuite parameters can be added if needed
        ]
        subprocess.run(cmd, cwd=version_dir)

def extract_test_classes(test_file_path):
    """Extracts test class names from a test.txt file."""
    with open(test_file_path, 'r') as test_file:
        return [line.strip().split('.')[0] for line in test_file]  # Assuming each line is TestClass.TestMethod

# Path to the EvoSuite jar
evosuite_jar_path = '/Users/urjakhadilkar/Downloads/evosuite-1.2.0.jar'

# Base directory where the bugs are stored
bugs_base_dir = '/Users/urjakhadilkar/Desktop/CS527-team11/BugSwarm'

# Generate tests for each bug
for bug_dir_name in os.listdir(bugs_base_dir):
    bug_dir_path = os.path.join(bugs_base_dir, bug_dir_name)

    # Check for the test.txt file
    test_file_path = os.path.join(bug_dir_path, 'test.txt')
    if not os.path.exists(test_file_path):
        print(f"No test.txt found for {bug_dir_name}, skipping.")
        continue

    # Extract test classes from test.txt
    test_classes = extract_test_classes(test_file_path)

    # Paths for the buggy and patched project versions
    buggy_dir_path = os.path.join(bug_dir_path, 'Buggy-Version')
    patched_dir_path = os.path.join(bug_dir_path, 'Patched-Version')

    # Run Maven tests and generate tests for the buggy version
    if os.path.isdir(buggy_dir_path):
        # run_maven_test(buggy_dir_path)  # Run Maven test phase
        run_evosuite(test_classes, buggy_dir_path, evosuite_jar_path)  # Run EvoSuite

    # Run Maven tests and generate tests for the patched version
    if os.path.isdir(patched_dir_path):
        # run_maven_test(patched_dir_path)  # Run Maven test phase
        run_evosuite(test_classes, patched_dir_path, evosuite_jar_path)  # Run EvoSuite

    print(f"Test generation completed for bug {bug_dir_name}")

print("Test generation for all bugs completed.")
