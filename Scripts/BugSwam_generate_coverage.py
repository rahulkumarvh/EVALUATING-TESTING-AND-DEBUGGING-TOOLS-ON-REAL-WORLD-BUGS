import os
import subprocess
import shutil
from multiprocessing import Pool

def run_maven_and_move_reports(args):
    project_dir, coverage_base_dir = args

    # Execute Maven commands
    print(f"Running mvn clean test in {project_dir}")
    subprocess.run(['mvn', 'clean', 'test', '-Dmaven.test.failure.ignore=true'], cwd=project_dir)
    print(f"Running mvn jacoco:report in {project_dir}")
    subprocess.run(['mvn', 'jacoco:report'], cwd=project_dir)

    # Traverse the source directory to find and move JaCoCo report files
    for root, dirs, files in os.walk(project_dir):
        if root.endswith('target/site/jacoco'):
            module_name = root.split(os.sep)[-4]  # Assuming <module>/target/site/jacoco
            version_type = 'Buggy-version' if 'Buggy-Version' in root else 'Patched-version'
            target_dir = os.path.join(coverage_base_dir, f'{version_type}-All test coverage', module_name)
            os.makedirs(target_dir, exist_ok=True)
            for file in files:
                src_file = os.path.join(root, file)
                dst_file = os.path.join(target_dir, file)
                shutil.copy(src_file, dst_file)

def main():
    base_dir = './BugSwarm'
    image_tags = [d for d in os.listdir(base_dir) if os.path.isdir(os.path.join(base_dir, d))]

    tasks = []
    for tag in image_tags:
        image_tag_dir = os.path.join(base_dir, tag)
        buggy_version_path = os.path.join(image_tag_dir, 'Buggy-Version')
        patched_version_path = os.path.join(image_tag_dir, 'Patched-Version')
        coverage_base_dir = os.path.join(image_tag_dir, 'Coverage')

        # Prepare tasks for multiprocessing
        tasks.append((buggy_version_path, coverage_base_dir))
        tasks.append((patched_version_path, coverage_base_dir))

        # Create base coverage directory
        os.makedirs(coverage_base_dir, exist_ok=True)

    # Run tasks using multiprocessing
    with Pool() as pool:
        pool.map(run_maven_and_move_reports, tasks)



if __name__ == '__main__':
    main()
