import os
import sys
import subprocess
import multiprocessing

quixbugs_directory = "/Users/ajitesh/dev/CS527-team11/QuixBugs"
class_path_structure = "/Users/ajitesh/dev/CS527-team11/QuixBugs/{}/{}"

randoop_jar_path = "/Users/ajitesh/dev/randoop-4.3.2/randoop-all-4.3.2.jar"
evousite_jar_path = "/Users/ajitesh/dev/evosuite/evosuite-1.0.6.jar"

valid_tools =[ "randoop", "evosuite"]

def get_all_projects(directory):
    projects = [dir for dir in os.listdir(directory) if os.path.isdir(os.path.join(directory,dir)) and dir.isupper()]
    return projects

def generate_randoop_tests(project, version):
    os.chdir(f"{quixbugs_directory}/{project}/{version}")
    class_path = class_path_structure.format(project, version)
    output_dir = f"{quixbugs_directory}/{project}/{version}/java_testcases/randoop"
    if version == "Buggy-Version":
       package_name = "java_programs"
    else:
       package_name = "correct_java_programs"
    compile_command = f"javac {class_path}/{package_name}/{project}.java"
    subprocess.run(compile_command, shell=True)
    test_class = f"{package_name}.{project}"
    try:
        os.mkdir(output_dir)
    except FileExistsError:
        pass
    randoop_command = f"java -classpath {class_path}:{randoop_jar_path} randoop.main.Main gentests --testclass={test_class} --time-limit=1200 --output-limit=12500  --error-test-basename=RandoopErrorTest{project}{version.split('-')[0]} --regression-test-basename=RandoopRegressionTest{project}{version.split('-')[0]} --progressintervalmillis=18000 --junit-output-dir={output_dir}"
    print(randoop_command)
    subprocess.run(randoop_command, shell=True)
    print(f"Generated randoop tests for {project} in {version}")

def generate_evosuite_tests(project, version):
    os.chdir(f"{quixbugs_directory}/{project}/{version}")
    class_path = class_path_structure.format(project, version)
    output_dir = f"{quixbugs_directory}/{project}/{version}/java_testcases/"
    if version == "Buggy-Version":
       package_name = "java_programs"
    else:
       package_name = "correct_java_programs"
    compile_command = f"javac {class_path}/{package_name}/{project}.java"
    subprocess.run(compile_command, shell=True)
    test_class = f"{package_name}.{project}"
    evosuite_command = f"java -jar {evousite_jar_path} -class {test_class} -projectCP {class_path} -base_dir {output_dir}  -Dsearch_budget=1200 -Dreport_dir={output_dir}"
    print(evosuite_command)
    subprocess.run(evosuite_command, shell=True)
    print(f"Generated evosuite tests for {project} in {version}")  

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python3 QuixBugs_generate_tests.py [test_generation_tool]")
        exit(1)
   
    arg1 = sys.argv[1].lower()

    if arg1 not in valid_tools:
        print(f"Invalid tool: {arg1}, valid tools: {valid_tools}")
        exit(1)

    # Check if quixbugs directory exists
    if not os.path.isdir(quixbugs_directory):
        print(f"Quixbugs directory '{quixbugs_directory}' not found.")
        exit(1)


    projects = get_all_projects(quixbugs_directory)

    if arg1 == "randoop":
        target = generate_randoop_tests
    else:
        target = generate_evosuite_tests

    
    for project in projects:
        processes = []
        for version in ["Buggy-Version", "Patched-Version"]:
            # Create a process for each project version
            process = multiprocessing.Process(target=target, args=(project, version))
            processes.append(process)
            process.start()
        for process in processes:
            process.join(timeout=1300)
    
    

    print("Script completed successfully.")
