import os
import sys
import subprocess


valid_datasets = ["bears", "quixbugs", "defects4j", "bugswarm"]
valid_metrics = ["CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"]


bugs_folder = {
    "bears": "./../Bears",
    "quixbugs": "./../QuixBugs/Bugs",
    "defects4j": "./../defects4j",
    "bugswarm": "./../BugSwarm"
}

dataset_scripts_invoke_folder = {
    "bears": "./",
    "quixbugs": "./",
    "defects4j": "./defects4j_scripts/benchmarking_scripts/",
    "bugswarm": "./",
}

dataset_scripts_call = {
    "bears": lambda bug_name, metric: f"python3 Bears_Benchmark.py Bears {bug_name} {metric}",
    "quixbugs": lambda bug_name, metric: f"python3 QuixBugs_Benchmark.py QuixBugs {bug_name} {metric}",
    "defects4j": lambda bug_name, metric: f"python3 benchmark.py {bug_name} {metric}",
    "bugswarm": lambda bug_name, metric: f"python3 BugSwarm_Script.py {bug_name} {metric}",
}

def get_metric(dataset, bug, metric):

    os.chdir(dataset_scripts_invoke_folder[dataset])
    script_command = dataset_scripts_call[dataset](bug, metric)
    sp = subprocess.Popen(script_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    out, err = sp.communicate()
    if err:
        return None, err.decode("utf-8")
    return out.decode("utf-8"), None


if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Usage: python3 Benchmark.py [bug-dataset] [bug-name] [metric]")
        exit(1)
   
    arg1 = sys.argv[1].lower()
    arg2 = sys.argv[2]
    arg3 = sys.argv[3]

    if arg1 not in valid_datasets:
        print(f"Invalid dataset: {arg1}, valid datasets: {valid_datasets}")
        exit(1)

    if arg3 not in valid_metrics:
        print(f"Invalid metric: {arg3}, valid metrics: {valid_metrics}")
        exit(1)

    metric, err = get_metric(arg1, arg2, arg3)
    if err:
        print(err)
        exit(1)
    print(metric)

