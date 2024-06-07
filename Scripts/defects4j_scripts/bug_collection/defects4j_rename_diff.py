import os

def rename_patch_files(base_dir):
    # Iterate over all items in base_dir
    for project_bugid in os.listdir(base_dir):
        project_bugid_path = os.path.join(base_dir, project_bugid)
        # Check if it's a directory
        if os.path.isdir(project_bugid_path):
            # List all .patch files in the directory
            for file_name in os.listdir(project_bugid_path):
                if file_name.endswith('.patch'):
                    old_file_path = os.path.join(project_bugid_path, file_name)
                    new_file_path = os.path.join(project_bugid_path, "diff.patch")
                    # Rename the file
                    os.rename(old_file_path, new_file_path)
                    print(f"Renamed {old_file_path} to {new_file_path}")

if __name__ == "__main__":
    base_dir = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/defects4j_bugs"
    rename_patch_files(base_dir)
