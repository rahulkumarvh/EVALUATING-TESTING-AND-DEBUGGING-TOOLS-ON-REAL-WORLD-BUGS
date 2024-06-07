import os
import subprocess
import lizard
import Levenshtein
from difflib import unified_diff
from codebleu import calc_codebleu
import csv

# Assuming you have a setup to calculate CodeBLEU
# from your_codebleu_setup import calculate_codebleu 

bugs_dir = '/Users/urjakhadilkar/Desktop/CS527-team11/Bugs/BugSwarm'
output_csv_path = '/Users/urjakhadilkar/Desktop/BugSwarm_BenchmarkingResults.csv'

def read_file(file_path):
    with open(file_path, 'r') as file:
        return file.read()

def get_modified_java_files(bug_dir):
    diff_path = os.path.join(bug_dir, 'Diff.diff')
    modified_files = []
    with open(diff_path, 'r') as file:
        for line in file:
            # print(line)
            if line.startswith('diff --git a/'):
                # Extract the file path after 'b/' which indicates the new file in the patched version
                modified_path = line.split(' ')[2]
                # print(str(modified_path))
                if str(modified_path).endswith('.java'):
                    modified_files.append(str(modified_path)[2:])
    # print(modified_files)
    return modified_files


def calculate_class_changes(buggy_code, patched_code):
    diff_lines = list(unified_diff(buggy_code.splitlines(), patched_code.splitlines()))
    class_changes = sum(1 for line in diff_lines if line.startswith('+ ') and 'class ' in line) \
                  + sum(1 for line in diff_lines if line.startswith('- ') and 'class ' in line)
    print(class_changes)
    return class_changes

def calculate_method_changes(buggy_code, patched_code):
    diff_lines = list(unified_diff(buggy_code.splitlines(), patched_code.splitlines()))
    method_changes = sum(1 for line in diff_lines if line.startswith('+ ') and line.strip().endswith('{')) \
                   + sum(1 for line in diff_lines if line.startswith('- ') and line.strip().endswith('{'))
    print(method_changes)
    return method_changes

def get_java_files(directory, modified_files):
    """Collects Java file paths within a directory, filtering by modified files."""
    java_files = [os.path.join(directory, f) for f in os.listdir(directory) if f in modified_files]
    return java_files


def calculate_codebleu_for_files(buggy_files, patched_files):
    """Calculates CodeBLEU for multiple file pairs."""
    codebleu_scores = [calc_codebleu([read_file(buggy)], [read_file(patched)], lang="java", weights=(0.25, 0.25, 0.25, 0.25))['codebleu'] for buggy, patched in zip(buggy_files, patched_files)]
    return sum(codebleu_scores) / len(codebleu_scores) if codebleu_scores else 0

def calculate_metrics_for_bug(bug_dir):
    modified_files = get_modified_java_files(bug_dir)
    buggy_version_dir = os.path.join(bug_dir, 'Buggy-Version')
    patched_version_dir = os.path.join(bug_dir, 'Patched-Version')
    
    buggy_files = [os.path.join(buggy_version_dir, f) for f in modified_files if os.path.exists(os.path.join(buggy_version_dir, f))]
    patched_files = [os.path.join(patched_version_dir, f) for f in modified_files if os.path.exists(os.path.join(patched_version_dir, f))]

    print(buggy_files)
    
    # Initialize metric accumulators
    total_c_change, total_m_change, total_l_change, total_ld, total_cb, total_cp, count = 0, 0, 0, 0, 0, 0, 0
    
    for buggy_file, patched_file in zip(buggy_files, patched_files):
        buggy_code = read_file(buggy_file)
        patched_code = read_file(patched_file)

        total_c_change += calculate_class_changes(buggy_code, patched_code)
        total_m_change += calculate_method_changes(buggy_code, patched_code)
        
        diff = list(unified_diff(buggy_code.splitlines(), patched_code.splitlines()))
        total_l_change += sum(1 for _ in diff)
        
        total_ld += Levenshtein.distance(buggy_code, patched_code)
        
        buggy_analysis = lizard.analyze_file(buggy_file)
        patched_analysis = lizard.analyze_file(patched_file)
        total_cb += buggy_analysis.average_cyclomatic_complexity
        total_cp += patched_analysis.average_cyclomatic_complexity
        count += 1

    avg_cb = total_cb / count if count else 0
    avg_cp = total_cp / count if count else 0
    
    code_bleu = calculate_codebleu_for_files(buggy_files, patched_files)

    return {
        'CChange': total_c_change,
        'MChange': total_m_change,
        'LChange': total_l_change,
        'LD': total_ld / count if count else 0,
        'CB': avg_cb,
        'CP': avg_cp,
        'CC': abs(avg_cb - avg_cp),
        'CodeBLEU': code_bleu,
    }

def write_metrics_to_csv(metrics_data, output_csv_path):
    """Writes aggregated metrics for all bugs into a CSV file."""
    fieldnames = ['Bug', 'CChange', 'MChange', 'LChange', 'LD', 'CB', 'CP', 'CC', 'CodeBLEU']
    with open(output_csv_path, 'w', newline='') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        for bug, metrics in metrics_data.items():
            row = {'Bug': bug}
            row.update(metrics)
            writer.writerow(row)

def process_bugs(bugs_dir, output_csv_path):
    metrics_data = {}
    for bug_tag in os.listdir(bugs_dir):
        bug_dir = os.path.join(bugs_dir, bug_tag)
        if not os.path.isdir(bug_dir):  # Skip files like .DS_Store
            continue
        metrics = calculate_metrics_for_bug(bug_dir)
        metrics_data[bug_tag] = metrics
    write_metrics_to_csv(metrics_data, output_csv_path)


if __name__ == "__main__":
    process_bugs(bugs_dir, output_csv_path)