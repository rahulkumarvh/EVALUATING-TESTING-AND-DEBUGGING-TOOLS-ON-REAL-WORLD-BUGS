import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Load the data
data = pd.read_csv('/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone2/project_repo/Bugs/defects4j/results/defects4j_metrics.csv')

# Select columns for the box plot, excluding 'Bug ID', 'CodeBLEU' as per your request
cols_to_plot = ['CChange', 'MChange', 'LChange', 'CB', 'CP', 'CC', 'LD']

# Remove any rows with missing data for a clean plot
cleaned_data = data[cols_to_plot].dropna()

# Setting up the matplotlib figure - adjust figsize as needed for scale
plt.figure(figsize=(12, 6))

# Use seaborn to plot the box plots
sns.boxplot(data=cleaned_data)

# Enhance the figure
plt.title('Defects4J: Box plot Benchmarked Metrics')
plt.xticks(rotation=45)  # Rotate labels to prevent overlap
plt.yscale('log')  # Use log scale for better visibility of wide-ranging values
plt.grid(True)  # Add grid for easier reading

# Show plot
plt.tight_layout()  # Adjust layout to make room for the rotated x-axis labels
plt.show()
