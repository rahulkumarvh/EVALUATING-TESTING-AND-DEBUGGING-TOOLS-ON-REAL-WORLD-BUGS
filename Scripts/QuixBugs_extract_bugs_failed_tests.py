import os
import shutil
import random
import subprocess

source_buggy_directory = "/Users/ajitesh/dev/QuixBugs/java_programs"
source_correct_directory = "/Users/ajitesh/dev/QuixBugs/correct_java_programs"
destination_directory = "/Users/ajitesh/dev/CS527-team11/Bugs/QuixBugs/Bugs"

def select_random_java_files(source_directory, num_files = 20):
    java_files = [os.path.splitext(java_file)[0] for java_file in os.listdir(source_directory) if java_file.endswith(".java") and java_file[:-5].isupper()]
    random_files = random.sample(java_files, num_files)
    return random_files

def find_diff(java_file):
    diff_command = f"diff --color -ur Buggy-Version/{java_file}.java Patched-Version/{java_file}.java > Diff"
    subprocess.run(diff_command, shell=True)
    print(f"Diff for {java_file} saved")

def find_failed_tests(java_file):
    # Extract the failed tests and store the names in a file
    os.chdir(os.path.join("/".join(source_buggy_directory.split("/")[:-1])))
    test_command = f"gradle test --tests {java_file}_TEST"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    failed_tests_logs = [line for line in test_output.stdout.split("\n") if "FAILED" in line]
    failed_tests = []
    for i in range(1, len(failed_tests_logs)):
        log = failed_tests_logs[i]
        failed_tests.append(java_file+"_TEST."+log.split(" ")[2])
    print("Failed_tests: ", failed_tests)
    with open(f"{destination_directory}/{java_file}/test.txt", "w") as file:
        file.write("\n".join(failed_tests))

    

if __name__ == "__main__":

    # Check if source directory exists
    if not os.path.isdir(source_correct_directory):
        print(f"Source directory '{source_correct_directory}' not found.")
        exit(1)

    # Create destination directory if it doesn't exist
    os.makedirs(destination_directory, exist_ok=True)

    # Select 20 random java programs
    random_java_files = select_random_java_files(source_correct_directory, 20)
    print(random_java_files)

    for java_file in random_java_files:
        # Create a folder for this program in the destination directory
        destination_buggy_folder = os.path.join(destination_directory, java_file, "Buggy-Version")
        os.makedirs(destination_buggy_folder, exist_ok=True)

        destination_correct_folder = os.path.join(destination_directory, java_file, "Patched-Version")
        os.makedirs(destination_correct_folder, exist_ok=True)

        # Copy the .java file to the destination folder
        shutil.copy(os.path.join(source_correct_directory, java_file + ".java"), destination_correct_folder)
        print(f"Copied {java_file}.java to {destination_correct_folder}/")

        shutil.copy(os.path.join(source_buggy_directory, java_file + ".java"), destination_buggy_folder)
        print(f"Copied {java_file}.java to {destination_buggy_folder}/")

        # Change to the directory
        os.chdir(os.path.join(destination_directory, java_file))

        # Execute diff between the files in buggy and patched folders
        find_diff(java_file)


        # Execute tests and save failed tests
        find_failed_tests(java_file)



        



print("Script completed successfully.")
