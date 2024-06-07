# Benchmark Scripts Execution

- Make sure you have installed <b><i>lizard, Levenshtein and codebleu</i></b> packages using pip.
- cd into this folder (CS527-team11/Scripts) and execute the benchmark script using
  ```bash
  python3 Benchmark.py [bug-datset] [bug-name] [metric]
  ```
- Ensure that the <i>bug-name</i> is present in the Bugs folder of the corresponding dataset and the metric is one of <i>"CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"</i>
