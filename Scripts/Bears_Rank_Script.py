import csv
import xml.etree.ElementTree as ET

# Parse the XML file
tree = ET.parse("/Users/rahul/Documents/UIUC SEM 2/527/Milestone 4/CS527-team11/Bears/bears-101/Buggy-Version/target/site/jacoco/jacoco.xml")
root = tree.getroot()

# Open the CSV file for writing
with open('coverage.csv', 'w', newline='') as file:
    writer = csv.writer(file)
    writer.writerow(["Line", "Hits", "Rank"])  # Write the header

    # Create a list to hold the data
    data = []

    # Iterate over all sourcefile elements
    for sourcefile in root.iter('sourcefile'):
        # Check if the name attribute is 'StdKeySerializers.java'
        if sourcefile.get('name') == 'Gl200ProtocolDecoder.java':
            # Iterate over all line elements of this sourcefile
            for line in sourcefile.iter('line'):
                # Append the data to the list
                data.append((int(line.get('nr')), int(line.get('ci'))))

    # Sort the data based on the 'Hits' column in descending order
    data.sort(key=lambda x: x[1], reverse=True)

    # Assign ranks
    rank = 1
    prev_hits = None
    for idx, (line_nr, hits) in enumerate(data, start=1):
        if hits != prev_hits:
            rank = idx
        writer.writerow([line_nr, hits, rank])
        prev_hits = hits
