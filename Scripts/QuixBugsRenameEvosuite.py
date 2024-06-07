import os
import sys
import fileinput
import subprocess
import multiprocessing

quixbugs_directory = "/Users/ajitesh/dev/CS527-team11/QuixBugs"
tests_dir_path = "/Users/ajitesh/dev/CS527-team11/QuixBugs/{}/{}/java_testcases/evosuite-tests/{}"


def get_all_projects(directory):
    projects = [dir for dir in os.listdir(directory) if os.path.isdir(os.path.join(directory,dir)) and dir.isupper()]
    return projects

def rename_evosuite_tests(project, version):
    if version == "Buggy-Version":
        package_name = "java_programs"
    else:
        package_name = "correct_java_programs"
    
    tests_dir = tests_dir_path.format(project, version, package_name)
    os.chdir(tests_dir)
    
    for filename in os.listdir(tests_dir):
        if filename.endswith(".java") and "scaffolding" not in filename:
            file1 = filename.split(".")[0]
       
    for line in fileinput.input(f"{tests_dir}/{file1}.java", inplace=True):
        if file1 in line:
            line = line.replace(file1,"Evosuite" + file1)
        sys.stdout.write(line)
    for line in fileinput.input(f"{tests_dir}/{file1}_scaffolding.java", inplace=True):
        if file1 in line:
            line = line.replace(file1,"Evosuite" + file1)
        sys.stdout.write(line)


    os.rename(f"{tests_dir}/{file1}.java", f"{tests_dir}/Evosuite{file1}.java")
    os.rename(f"{tests_dir}/{file1}_scaffolding.java", f"{tests_dir}/Evosuite{file1}_scaffolding.java")
    print(f"Renamed evosuite tests for {project} in {version}")

if __name__ == "__main__":

    projects = get_all_projects(quixbugs_directory)

    
    for project in projects:
        processes = []
        for version in ["Buggy-Version", "Patched-Version"]:
            rename_evosuite_tests(project, version)
    
    

    print("Script completed successfully.")
