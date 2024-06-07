import os
import re

tested_bugs_dir = '/Users/urjakhadilkar/Desktop/TestedBugs'

def extract_failing_tests(output):
    failing_tests = set()
    error_failures_section = False
    for line in output.split('\n'):
        if '[ERROR] Failures:' in line:
            error_failures_section = True
        elif '[ERROR]' in line and error_failures_section:
            match = re.search(r'\[ERROR\]\s+(.+?)(?:\:|;)', line)
            if match:
                failing_test = match.group(1).strip()
                semicolon_index = failing_test.find(';')
                if semicolon_index != -1:
                    failing_test = failing_test[:semicolon_index]
                failing_tests.add(failing_test)
            error_failures_section = False
    return failing_tests



def compare_outputs(bug_dir):
    buggy_output_path = os.path.join(bug_dir, 'Buggy-output.txt')
    fixed_output_path = os.path.join(bug_dir, 'Patched-output.txt')
    
    with open(buggy_output_path, 'r') as file:
        buggy_output = file.read()
    with open(fixed_output_path, 'r') as file:
        fixed_output = file.read()
    
    buggy_failing_tests = extract_failing_tests(buggy_output)
    fixed_failing_tests = extract_failing_tests(fixed_output)
    
    tests_passing_in_fixed = set(buggy_failing_tests) - set(fixed_failing_tests)
    
    tests_file_path = os.path.join(bug_dir, 'tests.txt')
    with open(tests_file_path, 'w') as file:
        for test in tests_passing_in_fixed:
            file.write(test + '\n')

def main():
    for bug_folder_name in os.listdir(tested_bugs_dir):
        bug_dir = os.path.join(tested_bugs_dir, bug_folder_name)
        if os.path.isdir(bug_dir): 
            compare_outputs(bug_dir)

if __name__ == '__main__':
    main()
