import os
import json
import re

def find_extracted_bugs(base_path):
    # Dictionary to hold the projects and their extracted bugs
    projects_and_bugs = {}

    # List all items in the base directory
    for item in os.listdir(base_path):
        item_path = os.path.join(base_path, item)
        # Check if the item is a directory
        if os.path.isdir(item_path):
            # Use regex to match the project_bugID pattern
            match = re.match(r"([A-Za-z]+)_([0-9]+)", item)
            if match:
                project, bug_id = match.groups()
                # Add the bug ID to the project's list in the dictionary
                if project in projects_and_bugs:
                    projects_and_bugs[project].append(int(bug_id))
                else:
                    projects_and_bugs[project] = [int(bug_id)]

    # Sort bug IDs for each project
    for project in projects_and_bugs:
        projects_and_bugs[project].sort()

    return projects_and_bugs

def save_to_json(data, output_file):
    with open(output_file, 'w') as file:
        json.dump(data, file, indent=4)

if __name__ == "__main__":
    base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"
    output_file = "./extracted_bugs.json"  # Adjust the path as needed
    projects_and_bugs = find_extracted_bugs(base_path)
    save_to_json(projects_and_bugs, output_file)
    print(f"Extracted bugs information saved to {output_file}")
