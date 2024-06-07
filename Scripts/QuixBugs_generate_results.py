import os
import csv
import QuixBugs_Benchmark


valid_metrics = ["CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"]
results_csv = "./results/QuixBugs_Results.csv"

if __name__ == "__main__":
    bugs = os.listdir("./Bugs")
    bugs = [bug for bug in bugs if os.path.isdir(f"./Bugs/{bug}")]

    column_names = ["Bug Id", "CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"]
    with open(results_csv, mode='a', newline='') as file:
        writer = csv.DictWriter(file, fieldnames=column_names)

        if file.tell() == 0:
            writer.writeheader()

        for bug in bugs:
            row = {}
            row["Bug Id"] = bug
            for metric in valid_metrics:
                row[metric] = QuixBugs_Benchmark.get_metric("QuixBugs", bug, metric)
            writer.writerow(row)

