import os
import matplotlib.pyplot as plt
from Levenshtein import distance as levenshtein_distance
from codebleu import calc_codebleu
import pandas as pd
from scipy.stats import linregress


def read_file(file_path):
    """Read file contents."""
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as file:
        return file.read()

def combine_read(file_paths):
    """Read and concatenate file contents."""
    contents = []
    for file_path in file_paths:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as file:
            contents.append(file.read())
    return '\n'.join(contents)

# def get_files_from_directory(directory_path):
#     """Get all java files from a directory recursively."""
#     java_files = []
#     for root, dirs, files in os.walk(directory_path):
#         for file in files:
#             if file.endswith(".java"):
#                 java_files.append(os.path.join(root, file))
#     return java_files

def get_levenshtein_distance(original_file_paths, modified_file_paths):
    """Calculate Levenshtein distance between buggy and fixed versions."""
    LD = []
    for i in range(0,len(original_file_paths)-2):
        original_file = read_file(original_file_paths[i])
        modified_file = read_file(modified_file_paths[i])
        ld_distance = levenshtein_distance(original_file, modified_file)
        LD.append(ld_distance)
    
    # for Cli_30 there are 2 modfied files so we conc them before adding.
    LD.append(levenshtein_distance(combine_read(original_file_paths[-2:]), combine_read(modified_file_paths[-2:])))
    
    return LD

def get_codebleu_score(original_file_paths, modified_file_paths):
    """Calculate CodeBLEU score between buggy and fixed versions."""
    codebleu_scores = []
    for i in range(0,len(original_file_paths)-2):
        original_file = read_file(original_file_paths[i])
        modified_file = read_file(modified_file_paths[i])
        codebleu_score = calc_codebleu([original_file], [modified_file], lang="java")
        codebleu_scores.append(codebleu_score['codebleu'])
    
    # for Cli_30 there are 2 modfied files so we conc them before adding.
    codebleu_scores.append(calc_codebleu([combine_read(original_file_paths[-2:])], [combine_read(modified_file_paths[-2:])], lang="java")['codebleu'])
    
    return codebleu_scores

def create_scatter_plot(x, y, ax, title='Scatter Plot', xlabel='X Axis', ylabel='Y Axis'):
    """
    Creates a scatter plot using two lists of data points on a given axes object.
    
    Args:
    x (list): The data points for the x-axis.
    y (list): The data points for the y-axis.
    ax (matplotlib.axes.Axes): The axes object on which to draw the plot.
    title (str): The title of the plot.
    xlabel (str): The label for the x-axis.
    ylabel (str): The label for the y-axis.
    """
    ax.scatter(x, y, color='blue', marker='o')
    slope, intercept, r_value, _, _ = linregress(x, y)
    reg_line = [slope * xi + intercept for xi in x]
    ax.plot(x, reg_line, color='red', label=f'R={r_value:.2f}')
    ax.set_title(title)
    ax.set_xlabel(xlabel)
    ax.set_ylabel(ylabel)
    ax.legend()
    ax.grid(True)
    
if __name__=="__main__":

    original_file_paths = [
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_18/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_20/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_22/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_24/src/java/org/apache/commons/cli/HelpFormatter.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_26/src/java/org/apache/commons/cli/OptionBuilder.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_28/src/java/org/apache/commons/cli/Parser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_30/src/main/java/org/apache/commons/cli/DefaultParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Cli_30/src/main/java/org/apache/commons/cli/Parser.java'
        
    ]
    
    modified_file_paths = [
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_18/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_20/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_22/src/java/org/apache/commons/cli/PosixParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_24/src/java/org/apache/commons/cli/HelpFormatter.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_26/src/java/org/apache/commons/cli/OptionBuilder.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_28/src/java/org/apache/commons/cli/Parser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_30/src/main/java/org/apache/commons/cli/DefaultParser.java',
        '/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone4/milestone-4-new/Patched_Bugs/Cli_30/src/main/java/org/apache/commons/cli/Parser.java'
    ]
    
    # print("ld_distance_data:", ld_distance_data)
    # print("codeBleu_data:", codeBleu_data)
    
    # X Axis: LD Metric Values for Defects4J Bugs - Cli_18, Cli_20, Cli_22, Cli_24, Cli_26, Cli_28, Cli_30
    ld_distance_data = get_levenshtein_distance(original_file_paths, modified_file_paths)
    codeBleu_data = get_codebleu_score(original_file_paths, modified_file_paths)

    
    AR_FR_data = pd.read_csv("./defects4j_bug_localization.csv")
    
    AR = AR_FR_data['AR']
    FR = AR_FR_data['FR']
    
    # create_scatter_plot(ld_distance_data, AR, title='Defects4J: LD vs AR', xlabel='Levenshtein Distance', ylabel='Average Rank')
    # create_scatter_plot(ld_distance_data, FR, title='Defects4J: LD vs FR', xlabel='Levenshtein Distance', ylabel='First Rank')
    
    # create_scatter_plot(codeBleu_data, AR, title='Defects4J: CodeBleu vs AR', xlabel='CodeBleu', ylabel='Average Rank')
    # create_scatter_plot(codeBleu_data, FR, title='Defects4J: CodeBleu vs FR', xlabel='CodeBleu', ylabel='First Rank')
    
    
    # --
    fig, axs = plt.subplots(2, 2, figsize=(14, 10))  # Creating a 2x2 grid of subplots

    # Assuming ld_distance_data and codeBleu_data are lists of distances/scores
    # Assuming AR and FR are pandas Series or lists corresponding to Average and First Ranks
    create_scatter_plot(ld_distance_data, AR, axs[0, 0], 'Defects4J: LD vs AR', 'Levenshtein Distance', 'Average Rank')
    create_scatter_plot(ld_distance_data, FR, axs[0, 1], 'Defects4J: LD vs FR', 'Levenshtein Distance', 'First Rank')
    create_scatter_plot(codeBleu_data, AR, axs[1, 0], 'Defects4J: CodeBleu vs AR', 'CodeBleu', 'Average Rank')
    create_scatter_plot(codeBleu_data, FR, axs[1, 1], 'Defects4J: CodeBleu vs FR', 'CodeBleu', 'First Rank')
    
    plt.tight_layout()  # Adjust subplots to give some spacing between them
    plt.show()

