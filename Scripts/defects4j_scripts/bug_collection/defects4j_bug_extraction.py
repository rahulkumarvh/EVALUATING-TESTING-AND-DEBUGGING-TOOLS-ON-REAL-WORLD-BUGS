"""
Goes through each project (open-source java) that defects4j has bugs collected from and picks 4 random bugs out of the currently active (as of feb 28 2024) bugs.
"""

import subprocess
import os
import random

# Base directory for checking out bugs
base_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"

# Project information extracted from the markdown table
projects_info = [
    {"Identifier": "Chart", "ActiveBugIds": "1-26"},
    {"Identifier": "Cli", "ActiveBugIds": "1-5,7-40"},
    {"Identifier": "Closure", "ActiveBugIds": "1-62,64-92,94-176"},
    {"Identifier": "Codec", "ActiveBugIds": "1-18"},
    {"Identifier": "Collections", "ActiveBugIds": "25-28"},
    {"Identifier": "Compress", "ActiveBugIds": "1-47"},
    {"Identifier": "Csv", "ActiveBugIds": "1-16"},
    {"Identifier": "Gson", "ActiveBugIds": "1-18"},
    {"Identifier": "JacksonCore", "ActiveBugIds": "1-26"},
    {"Identifier": "JacksonDatabind", "ActiveBugIds": "1-112"},
    {"Identifier": "JacksonXml", "ActiveBugIds": "1-6"},
    {"Identifier": "Jsoup", "ActiveBugIds": "1-93"},
    {"Identifier": "JxPath", "ActiveBugIds": "1-22"},
    {"Identifier": "Lang", "ActiveBugIds": "1,3-65"},
    {"Identifier": "Math", "ActiveBugIds": "1-106"},
    {"Identifier": "Mockito", "ActiveBugIds": "1-38"},
    {"Identifier": "Time", "ActiveBugIds": "1-20,22-27"},
]

def parse_active_bug_ids(active_bug_ids):
    """Parse the active bug ID string into a list of integers."""
    bug_ids = []
    for part in active_bug_ids.split(','):
        if '-' in part:
            start, end = map(int, part.split('-'))
            bug_ids.extend(range(start, end + 1))
        else:
            bug_ids.append(int(part))
    return bug_ids

for project_info in projects_info:
    project_id = project_info["Identifier"]
    active_bug_ids = parse_active_bug_ids(project_info["ActiveBugIds"])
    selected_bug_ids = random.sample(active_bug_ids, min(len(active_bug_ids), 4))  # Select 4 bugs at random

    for bug_id in selected_bug_ids:
        for version in ["b", "f"]:  # b for buggy, f for fixed
            # Construct the working directory path
            version_dir = "buggy" if version == "b" else "fixed"
            work_dir = os.path.join(base_dir, version_dir, project_id, f"{project_id}_{bug_id}")

            # Ensure the working directory exists
            os.makedirs(work_dir, exist_ok=True)

            # Construct the checkout command
            checkout_cmd = [
                "defects4j", "checkout",
                "-p", project_id,
                "-v", f"{bug_id}{version}",
                "-w", work_dir
            ]

            # Execute the checkout command
            print(f"Checking out {project_id} {bug_id} {version} to {work_dir}")
            try:
                subprocess.run(checkout_cmd, check=True)
            except subprocess.CalledProcessError as e:
                print(f"Failed to checkout {project_id}-{bug_id}{version}: {e}")
