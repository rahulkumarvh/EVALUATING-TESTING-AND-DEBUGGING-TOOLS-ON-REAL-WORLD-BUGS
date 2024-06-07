import re
import csv
import pprint
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import TimeoutException, NoSuchElementException

# Setup Chrome WebDriver
service = Service(ChromeDriverManager().install())
driver = webdriver.Chrome(service=service)

total_test_data = {"total_passed": 0, "total_failed": 0}
statements_list_with_susp = []
Bug_to_AR_FR = []
# def pause_till_source_coverage_page():
#     print("Pause execution till the user opens the Source page manually")
#     element_locator = By.XPATH
#     element_value = "//h2[text()='Source view']"


def wait_for_element_to_be_visible(driver, locator_type=By.XPATH, locator_value="//h2[text()='Source view']", timeout=30):
    """
    Waits for an element to be visible on the page.

    Args:
    - driver: The WebDriver instance.
    - locator_type: The type of locator (By.ID, By.XPATH, etc.).
    - locator_value: The locator value.
    - timeout: How long to wait for the element.

    Raises:
    - TimeoutException: If the element is not visible within the timeout period.
    """
    try:
        element = WebDriverWait(driver, timeout).until(
            EC.visibility_of_element_located((locator_type, locator_value))
        )
        print("Element is visible on the page.")
        return element
    except TimeoutException:
        print(f"Element not visible after {timeout} seconds.")
        raise

def get_code_lines():
    line_elements = driver.find_elements(By.XPATH, "//td[contains(@class, 'coverageCount') and contains(@class, 'hitByTest')]")
    return line_elements


def extract_coverage_info_from_line(line_element):
    """
    Opens a dialog by clicking on a row element and retrieves the line number from its preceding sibling.

    Args:
    - row_no_element: WebElement to be clicked and processed.

    Returns:
    - Line number extracted from the preceding sibling element.
    """
    try:
        # Combine scroll into view and click in one JS execution
        driver.execute_script("arguments[0].scrollIntoView(true); arguments[0].click();", line_element)

        # Wait for the element to be clickable and click it
        WebDriverWait(driver, 10).until(EC.element_to_be_clickable(line_element))
        # line_element.click()  # Now using Selenium's click as a backup

        # Wait for the dialog to load
        dialog_div = (By.ID, 'inline-dialog-testsForLineDialog')
        WebDriverWait(driver, 10).until(EC.presence_of_element_located(dialog_div))
        WebDriverWait(driver, 10).until(EC.visibility_of_element_located(dialog_div))

        # Fetch and return the line number from the preceding sibling
        line_number = line_element.find_element(By.XPATH, "./preceding-sibling::*[1]").text
        
        # Get the number of passing and failing tests
        dialog_div_element = driver.find_element(*dialog_div)
        
        failing_tests_for_line = len(dialog_div_element.find_elements(By.XPATH, ".//span[text()='FAIL']"))
        passing_tests_for_line = len(dialog_div_element.find_elements(By.XPATH, ".//span[text()='PASS']"))
        
        # Close the dialog
        driver.find_element(By.TAG_NAME, "body").send_keys(Keys.ESCAPE)
        
        # wait for dialog to hide
        WebDriverWait(driver, 10).until(EC.invisibility_of_element_located(dialog_div)) 
        
        return line_number, failing_tests_for_line, passing_tests_for_line

    except (TimeoutException, NoSuchElementException) as e:
        print(f"Error handling element: {e}")
        raise  # Optionally, handle more gracefully depending on the use case


def calc_susp(line_num, failing_tests_for_line, passing_tests_for_line):
    failed_test_to_total_failed_ratio = failing_tests_for_line/total_test_data["total_failed"]
    passed_test_to_total_passed_ratio = passing_tests_for_line/total_test_data["total_passed"]
    
    suspiciousness_score = failed_test_to_total_failed_ratio/(failed_test_to_total_failed_ratio + passed_test_to_total_passed_ratio)
    
    return suspiciousness_score

def extract_coverage_info_from_lines(line_elements):
    
    for line_element in line_elements:
        line_num, failing_tests_for_line, passing_tests_for_line = extract_coverage_info_from_line(line_element)
        # print(f"Line number: {line_num}, Failing tests: {failing_tests_for_line}, Passing tests: {passing_tests_for_line}")
        
        suspiciousness_score = calc_susp(line_num, failing_tests_for_line, passing_tests_for_line)
        statements_list_with_susp.append((line_num, suspiciousness_score))
        
        
        

def get_total_tests(driver):
    print("Getting total tests")
    """
    Extracts the number of passing tests and total tests from the index.html page.

    Args:
    - driver: The Selenium WebDriver instance.

    Returns:
    - A tuple containing the number of passing tests and total tests.
    """
    try:
        # Use XPath to locate the element containing the test results
        test_results_element = WebDriverWait(driver, 10).until(
            EC.visibility_of_element_located((By.XPATH, "//*[@id='tabs-first']/div[2]/div[1]/div[2]/header/h3/small"))
        )
        
        # Extract the text and parse it to get passing and total tests
        test_results_text = test_results_element.text  # e.g., "145 / 146 tests 0.25 secs"
        # print("test_results_text: ", test_results_text)
        matches = re.search(r"(\d+) / (\d+) tests", test_results_text)
        
        if matches:
            print("Match found")
            passing_tests = int(matches.group(1))
            total_tests = int(matches.group(2))
            return passing_tests, total_tests-passing_tests
        else:
            print("Test results not found in the expected format.")
            return None

    except TimeoutException:
        print("The element containing the test results wasn't found within the expected time.")
        return None

def sort_and_rank_suspiciousness(statements_list_with_susp):
    """
    Sorts and ranks the suspiciousness scores, handling ties properly.
    
    Args:
    - statements_list_with_susp: List of tuples where each tuple is (line number, suspiciousness score)
    
    Returns:
    - List of tuples where each tuple is (line number, suspiciousness score, rank)
    """
    # Sort by suspiciousness score in descending order
    sorted_list = sorted(statements_list_with_susp, key=lambda x: x[1], reverse=True)
    
    # Rank the sorted list
    ranked_list = []
    current_rank = 1
    previous_score = None
    for index, (line_number, score) in enumerate(sorted_list):
        if score == previous_score:
            # Same score as previous, same rank
            ranked_list.append((line_number, score, current_rank))
        else:
            # Different score, update rank based on index
            current_rank = index + 1
            ranked_list.append((line_number, score, current_rank))
            previous_score = score
    
    return ranked_list

# def get_total_tests(driver, test_results_xpath):
#     """
#     Extracts the number of passing tests and total tests from the index.html page.
#     """
#     try:
#         test_results_element = WebDriverWait(driver, 10).until(
#             EC.visibility_of_element_located((By.XPATH, test_results_xpath))
#         )
#         test_results_text = test_results_element.text
#         matches = re.search(r"(\d+) / (\d+) tests", test_results_text)
#         if matches:
#             passing_tests = int(matches.group(1))
#             total_tests = int(matches.group(2))
#             return passing_tests, total_tests
#         else:
#             print("Test results not found in the expected format.")
#             return None
#     except TimeoutException:
#         print("The element containing the test results wasn't found within the expected time.")
#         return None

def find_involved_lines(file1_path, file2_path):
    # Read the content of the first file
    with open(file1_path, 'r') as file:
        file1_lines = file.readlines()

    # Read the content of the second file
    with open(file2_path, 'r') as file:
        file2_lines = file.readlines()

    # Convert the lines of the second file into a set for fast lookup
    file2_lines_set = set(file2_lines)

    # Initialize a list to store the line numbers of lines missing in the second file
    removed_lines = []

    # Check each line in the first file to see if it's in the second file's set
    for index, line in enumerate(file1_lines):
        if line not in file2_lines_set:
            removed_lines.append(index + 1)  # Store line number, not index

    return removed_lines


def process_website(driver, url, original_file_path, modified_file_path):
    statements_list_with_susp.clear()
    driver.get(url)
    total_test_data["total_passed"], total_test_data["total_failed"] = get_total_tests(driver)
    print(f"Total passing tests: {total_test_data['total_passed']}, Total failing tests: {total_test_data['total_failed']}")
    source_view_element = wait_for_element_to_be_visible(driver)
    line_elements = get_code_lines()
    extract_coverage_info_from_lines(line_elements)
    ranked_lines = sort_and_rank_suspiciousness(statements_list_with_susp)
    pprint.pprint(ranked_lines)
    
    # get the statements involved in the bug
    involved_line_numbers = find_involved_lines(original_file_path, modified_file_path)
    involved_line_numbers_str = [str(line) for line in involved_line_numbers]
    
    print(f"Involved line numbers: {involved_line_numbers}")
    print(f"Involved line numbers as strings: {involved_line_numbers_str}")
    
    
    # get the ranks of all involved statements
    involved_line_ranks = [rank for (line, score, rank) in ranked_lines if line in involved_line_numbers_str]
    
    print(f"Ranks of involved statements: {involved_line_ranks}")
    
    # Debugging: Check entries in ranked_lines for duplicates
    line_check = {line: 0 for line in involved_line_numbers_str}
    for line, score, rank in ranked_lines:
        if line in line_check:
            line_check[line] += 1
    print("Line appearance count:", line_check)
    
    
    # get average and highest rank
    average_rank = sum(involved_line_ranks)/len(involved_line_ranks) if involved_line_ranks else 0
    highest_rank = min(involved_line_ranks) if involved_line_ranks else 0
    
    return average_rank, highest_rank
    

if __name__ == "__main__":
    
    bug_names = ["Cli_18", "Cli_20", "Cli_22", "Cli_24", "Cli_26", "Cli_28", "Cli_30"]
    
    urls = [
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_18/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_20/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_22/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_24/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_26/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_28/m4_clover_site/clover/index.html",
        "file:///Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_30/m4_clover_site/clover/index.html"
    ]
    
    original_file_paths = [
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_18/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_20/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_22/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_24/src/java/org/apache/commons/cli/HelpFormatter.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_26/src/java/org/apache/commons/cli/OptionBuilder.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_28/src/java/org/apache/commons/cli/Parser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_30/src/main/java/org/apache/commons/cli/DefaultParser.java'
        
    ]
    
    modified_file_paths = [
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_18/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_20/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_22/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_24/src/java/org/apache/commons/cli/HelpFormatter.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_26/src/java/org/apache/commons/cli/OptionBuilder.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_28/src/java/org/apache/commons/cli/Parser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_30/src/main/java/org/apache/commons/cli/DefaultParser.java'
    ]

    # for url in urls:
    #     process_website(driver, url, original_file_paths, modified_file_paths)
        
    with open('defects4j_bug_localization.csv', 'w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(['Repo name', 'Bug ID', 'AR', 'FR'])
        
        for i in range(len(urls)):
            AR, FR = process_website(driver, urls[i], original_file_paths[i], modified_file_paths[i])
            writer.writerow(["Defects4J",bug_names[i], AR, FR])
            total_test_data["total_passed"], total_test_data["total_failed"] = 0, 0

        
    driver.quit()
