import os
import sys
import time
import shutil
import fileinput
import subprocess
import multiprocessing

quixbugs_directory = "/Users/ajitesh/dev/CS527-team11/QuixBugs"
class_path_structure = "/Users/ajitesh/dev/CS527-team11/QuixBugs/{}/{}"

randoop_jar_path = "/Users/ajitesh/dev/randoop-4.3.2/randoop-all-4.3.2.jar"
evousite_jar_path = "/Users/ajitesh/dev/evosuite/evosuite-1.0.6.jar"



def get_all_projects(directory):
    projects = [dir for dir in os.listdir(directory) if os.path.isdir(os.path.join(directory,dir)) and dir.isupper()]
    return projects


def generate_coverage(project):
    os.chdir(f"{quixbugs_directory}/{project}/")
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Coverage")
    except FileNotFoundError:   
        pass
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Buggy-version-Randoop")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Buggy-version-Evosuite")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Patched-version-Randoop")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Patched-version-Evosuite")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Buggy-version-All")
    os.mkdir(f"{quixbugs_directory}/{project}/Coverage/Patched-version-All")

    os.chdir(f"{quixbugs_directory}/{project}/Buggy-Version")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Buggy-version-Randoop")

    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' evosuiteCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Buggy-version-Evosuite")
    
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' allCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Buggy-version-All")

    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Buggy-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass


    os.chdir(f"{quixbugs_directory}/{project}/Patched-Version")
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Patched-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Patched-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Patched-version-Randoop")

    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Patched-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' evosuiteCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Patched-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Patched-version-Evosuite")
    
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Patched-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' allCoverage")
    os.system(f"cp -r {quixbugs_directory}/{project}/Patched-Version/JacocoCoverage/* {quixbugs_directory}/{project}/Coverage/Patched-version-All")

    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/Patched-Version/JacocoCoverage")
    except FileNotFoundError:  
        pass
    os.system(f"gradle -Dorg.gradle.jvmargs='-Xmx3g' clean")


    
    

def find_failing_test_Patched(project):
    os.chdir(f"{quixbugs_directory}/{project}")
    print("Running patched tests on patched code",project)
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/temp")
    except FileNotFoundError:
        pass
    os.mkdir(f"{quixbugs_directory}/{project}/temp")
    os.system(f"cp -r {quixbugs_directory}/{project}/Patched-Version/* {quixbugs_directory}/{project}/temp")
    os.chdir(f"{quixbugs_directory}/{project}/temp")
    test_command = " gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopEvosuite"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    failed_tests_logs = [line for line in test_output.stdout.split("\n") if "FAILED" in line and ">" in line]
    failed_tests_P_P = []
    for i in range(1, len(failed_tests_logs)):
        log = failed_tests_logs[i]
        if "Evosuite" in log:
            failed_test = log.split(" ")[0]+"."+log.split(" ")[2]
            failed_tests_P_P.append(failed_test)
        elif "Randoop" in log:
            failed_test = log.split(" ")[2]
            failed_tests_P_P.append(failed_test)
        
    print("??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")
    print("Running patched tests on buggy code",project)
    for filename in os.listdir(f"{quixbugs_directory}/{project}/temp/correct_java_programs"):
            file_path = os.path.join(f"{quixbugs_directory}/{project}/temp/correct_java_programs", filename)
            if os.path.isfile(file_path):
                os.remove(file_path)
   
    os.system(f"cp {quixbugs_directory}/{project}/Buggy-Version/java_programs/{project}.java {quixbugs_directory}/{project}/temp/correct_java_programs")
    nodeDependency = False
    for filename in os.listdir(f"{quixbugs_directory}/{project}/Buggy-Version/java_programs"):
        if filename.startswith("Node"):
            nodeDependency = True
            break

    for line in fileinput.input(f"{quixbugs_directory}/{project}/temp/correct_java_programs/{project}.java", inplace=True):
        if "package java_programs;" in line:
            line = line.replace("package java_programs;","package correct_java_programs;")
            
            if nodeDependency:
                sys.stdout.write(line)
                line ="import java_programs.Node;\n"

        sys.stdout.write(line)

    
    
    subprocess.run(f"javac {quixbugs_directory}/{project}/temp/correct_java_programs/{project}.java", shell=True)
    
    test_command = " gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopEvosuite"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    failed_tests_logs = [line for line in test_output.stdout.split("\n") if "FAILED" in line and ">" in line]
    failed_tests_P_B = []
    for i in range(1, len(failed_tests_logs)):
        log = failed_tests_logs[i]
        if "Evosuite" in log:
            failed_test = log.split(" ")[0]+"."+log.split(" ")[2]
            failed_tests_P_B.append(failed_test)
        elif "Randoop" in log:
            failed_test = log.split(" ")[2]
            failed_tests_P_B.append(failed_test)

    error_revealing_tests = []
    for failed_test in failed_tests_P_B:
        if failed_test not in failed_tests_P_P:
            if "Evosuite" in failed_test or "Randoop" in failed_test and not("Evosuite" in failed_test and "randoop" in failed_test):
                error_revealing_tests.append(failed_test)

    with open(f"{quixbugs_directory}/{project}/test.txt", "a") as file:
        file.write("\n")
        file.write("\n".join(error_revealing_tests))

    shutil.rmtree(f"{quixbugs_directory}/{project}/temp")

def find_failing_test_Buggy(project):
    os.chdir(f"{quixbugs_directory}/{project}")
    print("Running buggy tests on buggy code",project)
    try:
        shutil.rmtree(f"{quixbugs_directory}/{project}/temp")
    except FileNotFoundError:
        pass
    os.mkdir(f"{quixbugs_directory}/{project}/temp")
    os.system(f"cp -r {quixbugs_directory}/{project}/Buggy-Version/* {quixbugs_directory}/{project}/temp")
    os.chdir(f"{quixbugs_directory}/{project}/temp")
    test_command = " gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopEvosuite"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    failed_tests_logs = [line for line in test_output.stdout.split("\n") if "FAILED" in line and ">" in line]
    failed_tests_B_B = []
    for i in range(1, len(failed_tests_logs)):
        log = failed_tests_logs[i]
        if "Evosuite" in log:
            failed_test = log.split(" ")[0]+"."+log.split(" ")[2]
            failed_tests_B_B.append(failed_test)
        elif "Randoop" in log:
            failed_test = log.split(" ")[2]
            failed_tests_B_B.append(failed_test)
    print("??????????????????????????????????????????????????????????????????????????????????????????????????????????")
    print("Running buggy tests on patched code",project)
    
    for filename in os.listdir(f"{quixbugs_directory}/{project}/temp/java_programs"):
            file_path = os.path.join(f"{quixbugs_directory}/{project}/temp/java_programs", filename)
            if os.path.isfile(file_path) and not filename.startswith("Node.java"):
                os.remove(file_path)
   
    os.system(f"cp {quixbugs_directory}/{project}/Patched-Version/correct_java_programs/{project}.java {quixbugs_directory}/{project}/temp/java_programs")

    for line in fileinput.input(f"{quixbugs_directory}/{project}/temp/java_programs/{project}.java", inplace=True):
        if "package correct_java_programs;" in line:
            line = line.replace("package correct_java_programs;","package java_programs;")
            
        if "import java_programs.Node;" in line:
            continue

        sys.stdout.write(line)
    
    subprocess.run(f"javac {quixbugs_directory}/{project}/temp/java_programs/Node.java", shell=True)
    subprocess.run(f"javac {quixbugs_directory}/{project}/temp/java_programs/{project}.java", shell=True)
    
    test_command = " gradle -Dorg.gradle.jvmargs='-Xmx3g' randoopEvosuite"
    test_output = subprocess.run(test_command, shell=True, capture_output=True, text=True)
    failed_tests_logs = [line for line in test_output.stdout.split("\n") if "FAILED" in line and ">" in line]
    failed_tests_B_P = []
    for i in range(1, len(failed_tests_logs)):
        log = failed_tests_logs[i]
        if "Evosuite" in log:
            failed_test = log.split(" ")[0]+"."+log.split(" ")[2]
            failed_tests_B_P.append(failed_test)
        elif "Randoop" in log:
            failed_test = log.split(" ")[2]
            failed_tests_B_P.append(failed_test)

    error_revealing_tests = []
    for failed_test in failed_tests_B_B:
        if failed_test not in failed_tests_B_P:
            if "Evosuite" in failed_test or "Randoop" in failed_test and not("Evosuite" in failed_test and "randoop" in failed_test):
                error_revealing_tests.append(failed_test)
               
            

    with open(f"{quixbugs_directory}/{project}/test.txt", "a") as file:
        file.write("\n")
        file.write("\n".join(error_revealing_tests))


    shutil.rmtree(f"{quixbugs_directory}/{project}/temp")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python3 QuixBugs_execute_test_coverage.py [coverage/find_failing_test]")
        exit(1)
   
    arg1 = sys.argv[1].lower()

    if arg1 not in ["coverage", "find_failing_test"]:
        print(f"Invalid argument: {arg1}, valid arguments: ['coverage', 'find_failing_test']")
        exit(1)



    # Check if quixbugs directory exists
    if not os.path.isdir(quixbugs_directory):
        print(f"Quixbugs directory '{quixbugs_directory}' not found.")
        exit(1)


    projects = get_all_projects(quixbugs_directory)
   


    if arg1 == "coverage":
        for project in projects:
            
               generate_coverage(project)
               time.sleep(10)
    else:   
        for project in projects:
            print("-------------------------------------------------------------------------------------------------------------------------------------------")
            print(f"Finding failing test for {project}")
            find_failing_test_Patched(project)
            print("***********************************************************************************************************************************************")
            find_failing_test_Buggy(project)
            print("-------------------------------------------------------------------------------------------------------------------------------------------")

    print("Script completed successfully.")
