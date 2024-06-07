import os
import sys
import lizard
import subprocess
import Levenshtein
from codebleu import calc_codebleu

valid_datasets = ["Bears"]
valid_metrics = ["CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"]

def get_buggy_file_path(bug_name):
    return f"./../Bears/{bug_name}/Buggy-Version/{bug_name}.java"

def get_patched_file_path(bug_name):
    return f"./../Bears/{bug_name}/Patched-Version/{bug_name}.java"

def read_file(bug_name):
    with open(get_buggy_file_path(bug_name), "r") as b_file:
        buggy = b_file.read()

    with open(get_patched_file_path(bug_name), "r") as p_file:
        patched = p_file.read()

    return buggy, patched

def read_diff(bug_name):
    with open(f"./../Bears/{bug_name}/Diff", "r") as diff_file:
        diff = diff_file.read()
    return diff

def get_classes_changed(bug):
    buggy, patched = read_file(bug)
    buggy_lines = buggy.split("\n")
    patched_lines = patched.split("\n")
    max_lines = max(len(buggy_lines), len(patched_lines))
    # -U flag will show all the lines in the file
    diff_command = f"diff -r -U {2*max_lines} ./../Bears/{bug}/Buggy-Version/{bug}.java ./../Bears/{bug}/Patched-Version/{bug}.java"
    sp = subprocess.Popen(diff_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    out, err = sp.communicate()
    out = out.decode("utf-8")
    classes_changed = 0
    part_of_class, class_counted = False, False
    for line in out.split("\n")[2:]:
        line = line.lower()
        if len(line) == 0:
            continue
        if "class" in line and "{" in line and ("public" in line or "private" in line or "protected" in line):
            part_of_class = True
            class_counted = False
        if line[0] == '+' and part_of_class and not class_counted:
            classes_changed += 1
            class_counted = True
        elif line[0] == '-' and part_of_class and not class_counted:
            classes_changed += 1
            class_counted = True

    return classes_changed

def get_methods_changed(bug):
    buggy, patched = read_file(bug)
    buggy_lines = buggy.split("\n")
    patched_lines = patched.split("\n")
    max_lines = max(len(buggy_lines), len(patched_lines))
    # -U flag will show all the lines in the file
    diff_command = f"diff -r -U {2*max_lines} ./../Bears/{bug}/Buggy-Version/{bug}.java ./../Bears/{bug}/Patched-Version/{bug}.java"
    sp = subprocess.Popen(diff_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    out, err = sp.communicate()
    out = out.decode("utf-8")
    func_changed = 0
    part_of_func, func_counted = False, False
    for line in out.split("\n")[2:]:
        line = line.lower()
        if len(line) == 0:
            continue
        if "class" not in line and "(" in line and ("public" in line or "private" in line or "protected" in line):
            part_of_func = True
            func_counted = False
        if line[0] == '+' and part_of_func and not func_counted and "class" not in line:
            func_changed += 1
            func_counted = True
        elif line[0] == '-' and part_of_func and not func_counted and "class" not in line:
            func_changed += 1
            func_counted = True

    return func_changed

def get_lines_changed(bug):
    diff = read_diff(bug)
    changed_lines = 0
    for line in diff.split("\n")[2:]:
        if len(line) == 0:
            continue
        if line[0] == '+':
            changed_lines += 1
        elif line[0] == '-':
            changed_lines += 1
    return changed_lines 
    

def get_levenshtein_distance(bug):
    buggy_file, patched_file = read_file(bug)
    return Levenshtein.distance(buggy_file, patched_file)

def get_buggy_cyclomatic(bug):
    i = lizard.analyze_file(get_buggy_file_path(bug))
    cyclomatic_complexity = 0
    for f in i.function_list:
        cyclomatic_complexity += f.cyclomatic_complexity
    return cyclomatic_complexity

def get_patched_cyclomatic(bug):
    i = lizard.analyze_file(get_patched_file_path(bug))
    cyclomatic_complexity = 0
    for f in i.function_list:
        cyclomatic_complexity += f.cyclomatic_complexity
    return cyclomatic_complexity

def get_cyclomatic_change(bug):
    return abs(get_patched_cyclomatic(bug) - get_buggy_cyclomatic(bug))

def get_codebleu(bug):
    buggy, patched= read_file(bug)

    result = calc_codebleu([buggy], [patched], lang="java", weights=(0.25, 0.25, 0.25, 0.25), tokenizer=None)
    return result['codebleu']

def get_metric(dataset, bug, metric):

    function_map = {
        'CChange': get_classes_changed,
        'MChange': get_methods_changed,
        'LChange': get_lines_changed,
        'LD': get_levenshtein_distance,
        'CB': get_buggy_cyclomatic,
        'CP': get_patched_cyclomatic,
        'CC': get_cyclomatic_change,
        'CodeBLEU': get_codebleu
    }

    if metric in function_map:
        return function_map[metric](bug)
    else:
        print("Invalid metric")
        exit(1)


if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Usage: python Scripts/Bears_Benchmark.py [bug-dataset] [bug-name] [metric]")
        exit(1)
   
    arg1 = sys.argv[1]
    arg2 = sys.argv[2]
    arg3 = sys.argv[3]

    if arg1 not in valid_datasets:
        print(f"Invalid dataset: {arg1}, valid datasets: {valid_datasets}")
        exit(1)

    if arg2 not in os.listdir('./../Bears/'):
        print(f'''Invalid bug name: {arg2}, valid bug names: {os.listdir("./../Bears/")}''')
        exit(1)

    if arg3 not in valid_metrics:
        print(f"Invalid metric: {arg3}, valid metrics: {valid_metrics}")
        exit(1)

    metric = get_metric(arg1, arg2, arg3)
    print(metric)

