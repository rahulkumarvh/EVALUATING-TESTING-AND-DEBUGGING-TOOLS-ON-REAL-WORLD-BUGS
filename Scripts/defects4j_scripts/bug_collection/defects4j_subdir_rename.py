import os

def rename_subfolders(base_path):
    # Define the directory names to change from and to
    dir_names_to_change = {
        "fixed": "Patched-Version",
        "buggy": "Buggy-Version"
    }

    # Walk through the given base directory
    for root, dirs, files in os.walk(base_path):
        for dir_name in dirs:
            # Check if the directory name needs to be changed
            if dir_name in dir_names_to_change:
                old_dir_path = os.path.join(root, dir_name)
                new_dir_path = os.path.join(root, dir_names_to_change[dir_name])
                # Rename the directory
                os.rename(old_dir_path, new_dir_path)
                print(f"Renamed '{old_dir_path}' to '{new_dir_path}'")

# Base directory containing the 'fixed' and 'buggy' subdirectories
base_path = "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/project_repo/Bugs/defects4j/"
rename_subfolders(base_path)
