import os
import json
import shutil

def copy_patch_files(json_file, source_base_path, target_base_path):
    # Load the JSON file with the projects and bug IDs
    with open(json_file, 'r') as file:
        project_bugs = json.load(file)

    for project, bug_ids in project_bugs.items():
        for bug_id in bug_ids:
            # Construct the source path for the patch file
            patch_file_name = f"{bug_id}.src.patch"
            source_patch_path = os.path.join(source_base_path, project, "patches", patch_file_name)

            # Check if the patch file exists
            if os.path.exists(source_patch_path):
                # Construct the target directory path
                target_dir = os.path.join(target_base_path, f"{project}_{bug_id}")
                os.makedirs(target_dir, exist_ok=True)  # Ensure the target directory exists

                # Construct the target path for the patch file
                target_patch_path = os.path.join(target_dir, patch_file_name)

                # Copy the patch file
                shutil.copy(source_patch_path, target_patch_path)
                print(f"Copied: {source_patch_path} to {target_patch_path}")
            else:
                print(f"Patch file does not exist: {source_patch_path}")

if __name__ == "__main__":
    json_file = "./extracted_bugs.json" 
    source_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j/framework/projects"
    target_base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"
    
    copy_patch_files(json_file, source_base_path, target_base_path)
