import os
import sys
import lizard
from Levenshtein import distance as levenshtein_distance
from codebleu import calc_codebleu  # Ensure you have a proper implementation for this

def get_files_from_directory(directory_path):
    """Get all java files from a directory recursively."""
    java_files = []
    for root, dirs, files in os.walk(directory_path):
        for file in files:
            if file.endswith(".java"):
                java_files.append(os.path.join(root, file))
    return java_files

def read_files(file_paths):
    """Read and concatenate file contents."""
    contents = []
    for file_path in file_paths:
        with open(file_path, 'r') as file:
            contents.append(file.read())
    return '\n'.join(contents)

def get_buggy_directory_path(bug_id):
    return os.path.join("../../../defects4j/", bug_id, "Buggy-Version")

def get_fixed_directory_path(bug_id):
    return os.path.join("../../../defects4j/", bug_id, "Patched-Version")

def get_cyclomatic_complexity(directory_path):
    """Calculate total cyclomatic complexity for all Java files in a directory."""
    java_files = get_files_from_directory(directory_path)
    total_cyclomatic_complexity = 0
    for java_file in java_files:
        analysis = lizard.analyze_file(java_file)
        for function in analysis.function_list:
            total_cyclomatic_complexity += function.cyclomatic_complexity
    return total_cyclomatic_complexity

def get_levenshtein_distance(bug_id):
    """Calculate Levenshtein distance between buggy and fixed versions."""
    buggy_files = read_files(get_files_from_directory(get_buggy_directory_path(bug_id)))
    fixed_files = read_files(get_files_from_directory(get_fixed_directory_path(bug_id)))
    return levenshtein_distance(buggy_files, fixed_files)

# def get_codebleu_score(bug_id):
#     """Calculate CodeBLEU score between buggy and fixed versions."""
#     buggy_files = get_files_from_directory(get_buggy_directory_path(bug_id))
#     fixed_files = get_files_from_directory(get_fixed_directory_path(bug_id))
#     # Note: Implement or integrate calc_codebleu function
#     return calc_codebleu(buggy_files, fixed_files, lang="java")

def get_codebleu_score(bug_id):
    buggy_dir = get_buggy_directory_path(bug_id)
    fixed_dir = get_fixed_directory_path(bug_id)

    # Get all Java files from each version
    buggy_files = get_files_from_directory(buggy_dir)
    fixed_files = get_files_from_directory(fixed_dir)

    # Read and concatenate all file contents for each version
    buggy_content = [read_files(buggy_files)]
    fixed_content = [read_files(fixed_files)]

    # Attempt to compute the CodeBLEU score, default to None on error
    try:
        # Ensure calc_codebleu can handle the input in this format
        # The reference and prediction lists now each contain a single, concatenated string of all relevant code
        codebleu_score = calc_codebleu(buggy_content, fixed_content, lang="java")
        return codebleu_score
    except Exception as e:
        print(f"Error calculating CodeBLEU for {bug_id}: {e}")
        return None


def read_diff(bug_id):
        
    diff_path = os.path.join("../../../defects4j/", bug_id, "diff.patch")
    with open(diff_path, 'r') as diff_file:
        diff_content = diff_file.read()
    return diff_content

def analyze_diff(diff_content):
    lines_changed = classes_changed = 0
    methods_changed = set()  # Use a set to track unique method changes
    
    current_class = ""
    for line in diff_content.split('\n'):
        if line.startswith('diff --git'):
            paths = line.split(' ')
            if len(paths) > 2:
                # Extract class name from the file path in the diff header
                current_class = os.path.basename(paths[2]).split('.')[0]
            classes_changed += 1
        elif line.strip().startswith('@@'):
            lines_changed += sum(1 for c in line if c in ('+', '-'))
        elif line.strip().startswith('+') or line.strip().startswith('-'):
            if '(' in line and ')' in line and current_class:
                method_signature = line.strip().split(' ')[-1]
                methods_changed.add((current_class, method_signature))

    return classes_changed, len(methods_changed), lines_changed

def get_cchange_mchange_lchange(bug_id):
    diff_content = read_diff(bug_id)
    c_change, m_change, l_change = analyze_diff(diff_content)
    return c_change, m_change, l_change


def get_metric(bug_id, metric):
    """Dispatch function to get the requested metric."""
    metrics_functions = {
        'CChange': lambda bid: get_cchange_mchange_lchange(bid)[0],
        'MChange': lambda bid: get_cchange_mchange_lchange(bid)[1],
        'LChange': lambda bid: get_cchange_mchange_lchange(bid)[2],
        'CB': lambda bid: get_cyclomatic_complexity(get_buggy_directory_path(bid)),
        'CP': lambda bid: get_cyclomatic_complexity(get_fixed_directory_path(bid)),
        'CC': lambda bid: abs(get_cyclomatic_complexity(get_buggy_directory_path(bid)) - get_cyclomatic_complexity(get_fixed_directory_path(bid))),
        'CodeBLEU': get_codebleu_score,
        'LD': get_levenshtein_distance
    }
    
    if metric in metrics_functions:
        return metrics_functions[metric](bug_id)
    else:
        raise ValueError("Invalid metric specified.")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python script.py [bugname] [metric]")
        sys.exit(1)

    bug_id = sys.argv[1]
    metric = sys.argv[2]
    

    try:
        result = get_metric(bug_id, metric)
        print(f"{metric} for {bug_id}: {result}")
    except ValueError as e:
        print(e)
        sys.exit(1)