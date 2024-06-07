# EVALUATING-TESTING-AND-DEBUGGING-TOOLS-ON-REAL-WORLD-BUGS

> The project evaluated testing and debugging tools using real-world bug datasets like Defects4J, Bears, BugSwarm, and QuixBugs. Utilizing technologies such as JAVA, RANDOOP, EVOSUITE, CLOVER, PYTHON, and LEVENSHTEIN, the team generated test suites and conducted code coverage analysis. Metrics like Cyclomatic Complexity Change (CC) and Levenshtein distance (LD) were assessed, aiding in bug localization based on suspiciousness scores. This comprehensive analysis provided insights into effective bug detection and fixing methodologies.

### Project Findings and Report

<a href="https://drive.google.com/file/d/1JmaF_pxYVp2Iw6j2ArNuqp7_0LvnzR8j/view?usp=share_link">Link to Project Document</a>

### How to Reproduce Bug Localization Results for the Project?

#### Defects4J

For Defects4J the bugs are localized by doing the following. We have used Clover reports to get test coverage metrics for the above bugs.

Update and Running Selenium Python Script to retrieve the statement wise metrics of tests passing and failing.

1.  For this go to [./Scripts/defects4j_scripts/bug_localization/defects4j_selenium_clover_get_susp.py](./Scripts/defects4j_scripts/bug_localization/defects4j_selenium_clover_get_susp.py).
2.  Update hard coded local machine paths:
    1. Download and update selenium chrome driver path.
    2. Update the location of the buggy and fixed versions of involved files in our bugs of interest (they are currently hardcoded to local machine system paths).
    3. Update locations of the index.html files for bugs of interest.
3.  Now run the selenium python script.
4.  Once the chrome window opens up, navigate to the modified files (script waits till it sees a source file page in the clover website). Then auto clicks and reads the statement wise test coverage results. Then computes Suspiciousness, AR, FR and writes them to a CSV file.

#### QuixBugs

For QuixBugs, the results can be reproduced by running QuixBugs_rank_statements.py.

1. cd into Scripts folder
2. Replace Buggy_directory and xml_location with your local paths in QuixBugs_rank_statements.py file. Only the prefix upto CS527-team11 has to be changed.
3. Run the script with
   ```bash
   python3 QuixBugs_rank_statements.py
   ```
4. The results will be displayed as well as appended to BL-Results.csv

#### Bears

For Bears, the results can be reproduced by running Bears_Rank_Script.py.

1. cd into Scripts folder
2. Replace tree path with your local path for target Bug's xml file in Bears_Rank_Script.py file.
3. Run the script with
   ```bash
   python3 Bears_Rank_Script.py
   ```
4. The results will be appended to coverage.csv
