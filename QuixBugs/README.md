# QuixBugs

## Install prerequisites

- Java version 8 or above
- Install gradle
```bash
brew install gradle
```

## Test Execution

``` bash
# Gradle build and tests are stored in Tests folder
$ cd QuixBugs/KNAPSACK/Buggy-Version
# Run test on buggy code
$ gradle test --tests KNAPSACK_TEST.test_1
# Run test on patched code
$ cd QuixBugs/KNAPSACK/Patched-Version
$ gradle crtTest --tests KNAPSACK_TEST.test_1
```

## Benchmark Scripts Execution

- Make sure you have installed <b><i>lizard, Levenshtein and codebleu</i></b> packages using pip.
- Execute the benchmark script in scripts folder using
  ```bash
  cd Scripts/
  python QuixBugs_Benchmark.py QuixBugs BUCKETSORT LD
  ```
- Ensure that the Bug is present in the Bugs folder and the metric is one of <i>"CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"</i>

## Benchmark Results
<p align="middle">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/CB.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/CC.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/CChange.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/CP.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/CodeBleu.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/LChange.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/LD.png" height ="100px" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/Quixbugs-Milestone2/Bugs/QuixBugs/results/BoxPlots/MChange.png" height ="100px" width="500px">

The average cyclomatic complexity is approximately 5, and it does not differ significantly between buggy and fixed files. The complexity of the majority of bugs remains constant even in patched code, but a handful differ by one. Quixbugs only contains simple bugs, with only one class and method that need patching. The average Levenshtein Edit Distance is roughly 25, implying that just about 25 characters need to be changed in the buggy code to repair it. The average CodeBLEU metric is about 0.94, indicating high similarity between the buggy and patched files.



# Dataset Description (Milestone 1)
## Introduction

Quixbugs is a dataset containing 40 Java and Python programs, each containing a single bug.  These buggy programs were built as part of the Quixey Challenge, organized by a startup named Quixey in 2011. These buggy programs of classic algorithms were provided to programmers to fix in a minute for a monetary prize. These programs were initially written only in Python. Researchers at MIT and Google translated them into Java to generate a dataset for Multilingual Program Repair. Each bug is accompanied by pass/fail test cases.

## Number of Bugs
| Language | Bug Count                                                   |
|----------|-------------------------------------------------------------|
| Java     | 46 (including 6 extras with no tests or correct code)       | 
| Python   | 40                                                          | 


## Test cases per bug

### Java
| Bug                        | Total Tests | Passing Tests | Failing Tests |
|----------------------------|-------------|---------------|---------------|
| BITCOUNT                   | 9           | 0             | 9             |
| BREADTH_FIRST_SEARCH       | 5           | 4             | 1             |
| BUCKETSORT                 | 6           | 0             | 6             |
| DEPTH_FIRST_SEARCH         | 5           | 4             | 1             |
| DETECT_CYCLE               | 6           | 5             | 1             |
| FIND_FIRST_IN_SORTED       | 7           | 4             | 3             |
| FIND_IN_SORTED             | 7           | 5             | 2             |
| FLATTEN                    | 7           | 1             | 6             |
| GCD                        | 5           | 0             | 5             |
| GET_FACTORS                | 11          | 1             | 10            |
| HANOI                      | 7           | 0             | 7             |
| IS_VALID_PARENTHESIZATION  | 3           | 2             | 1             |
| KHEAPSORT                  | 4           | 1             | 3             |
| KNAPSACK                   | 10          | 4             | 6             |
| KTH                        | 7           | 3             | 4             |
| LCS_LENGTH                 | 9           | 1             | 8             |
| LEVENSHTEIN                | 7           | 2             | 5             |
| LIS                        | 4           | 0             | 4             |
| LONGEST_COMMON_SUBSEQUENCE | 10          | 6             | 4             |
| MAX_SUBLIST_SUM            | 6           | 2             | 4             |
| MERGESORT                  | 13          | 0             | 13            |
| MINIMUM_SPANNING_TREE      | 3           | 1             | 2             |
| NEXT_PALINDROME            | 5           | 4             | 1             |
| NEXT_PERMUTATION           | 8           | 0             | 8             |
| PASCAL                     | 5           | 1             | 4             |
| POSSIBLE_CHANGE            | 9           | 0             | 9             |
| POWERSET                   | 5           | 1             | 4             |
| QC_LEVENSHTEIN             | 0           | 0             | 0             |
| QUICKSORT                  | 13          | 12            | 1             |
| REVERSE_LINKED_LIST        | 3           | 1             | 2             |
| RPN_EVAL                   | 6           | 3             | 3             |
| SHORTEST_PATH_LENGTH       | 4           | 2             | 2             |
| SHORTEST_PATH_LENGTHS      | 4           | 0             | 4             |
| SHORTEST_PATHS             | 3           | 0             | 3             |
| SHUNTING_YARD              | 4           | 0             | 4             |
| SIEVE                      | 6           | 1             | 5             |
| SQRT                       | 7           | 1             | 6             |
| SUBSEQUENCES               | 12          | 2             | 10            |
| TO_BASE                    | 7           | 0             | 7             |
| TOPOLOGICAL_ORDERING       | 3           | 0             | 3             |
| WRAP                       | 5           | 0             | 5             |
| BINARY_SEARCH              | 0           | 0             | 0             |
| MAXIMUM_WEIGHTED_SUBSET    | 0           | 0             | 0             |
| MODULO_INVERSE             | 0           | 0             | 0             |
| NESTED_PARENS_orig         | 0           | 0             | 0             |
| NESTED_PARENS              | 0           | 0             | 0             |


### Python
| Bug                        | Total Tests | Passing Tests | Failing Tests |
|----------------------------|-------------|---------------|---------------|
| BITCOUNT                   | 9           | 0             | 9             |
| BREADTH_FIRST_SEARCH       | 5           | 4             | 1             |
| BUCKETSORT                 | 7           | 1             | 6             |
| DEPTH_FIRST_SEARCH         | 5           | 4             | 1             |
| DETECT_CYCLE               | 6           | 5             | 1             |
| FIND_FIRST_IN_SORTED       | 7           | 4             | 3             |
| FIND_IN_SORTED             | 7           | 5             | 2             |
| FLATTEN                    | 7           | 1             | 6             |
| GCD                        | 6           | 1             | 5             |
| GET_FACTORS                | 11          | 1             | 10            |
| HANOI                      | 8           | 1             | 7             |
| IS_VALID_PARENTHESIZATION  | 3           | 2             | 1             |
| KHEAPSORT                  | 4           | 1             | 3             |
| KNAPSACK                   | 10          | 4             | 6             |
| KTH                        | 7           | 3             | 4             |
| LCS_LENGTH                 | 9           | 1             | 8             |
| LEVENSHTEIN                | 7           | 2             | 5             |
| LIS                        | 12          | 8             | 4             |
| LONGEST_COMMON_SUBSEQUENCE | 10          | 6             | 4             |
| MAX_SUBLIST_SUM            | 6           | 2             | 4             |
| MERGESORT                  | 14          | 1             | 13            |
| MINIMUM_SPANNING_TREE      | 3           | 0             | 3             |
| NEXT_PALINDROME            | 5           | 4             | 1             |
| NEXT_PERMUTATION           | 8           | 0             | 8             |
| PASCAL                     | 5           | 1             | 4             |
| POSSIBLE_CHANGE            | 10          | 1             | 9             |
| POWERSET                   | 5           | 1             | 4             |
| QUICKSORT                  | 13          | 12            | 1             |
| REVERSE_LINKED_LIST        | 3           | 1             | 2             |
| RPN_EVAL                   | 6           | 3             | 3             |
| SHORTEST_PATH_LENGTH       | 4           | 2             | 2             |
| SHORTEST_PATH_LENGTHS      | 4           | 0             | 4             |
| SHORTEST_PATHS             | 3           | 0             | 3             |
| SHUNTING_YARD              | 6           | 2             | 4             |
| SIEVE                      | 6           | 1             | 5             |
| SQRT                       | 7           | 1             | 6             |
| SUBSEQUENCES               | 12          | 2             | 10            |
| TO_BASE                    | 10          | 3             | 7             |
| TOPOLOGICAL_ORDERING       | 3           | 0             | 3             |
| WRAP                       | 5           | 0             | 5             |


### Bug Samples

#### GCD

```diff
--- buggy/GCD.java	2024-02-06 22:19:15
+++ fixed/GCD.java	2024-02-06 22:24:19
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -16,7 +16,7 @@
         if (b == 0) {
             return a;
         } else {
-            return gcd(a % b, b);
+            return gcd(b, a%b);
         }
     }
 }
```
The program is supposed to find the GCD of two numbers. As per Euclid's algorithm, GCD of a number and 0 is the number itself. In the recursive function, the base condition checks if the second number (b) is zero. However, in the buggy code, the recursive call always reduces the first number instead of the second number causing an infinite recursion. It was fixed by interchanging the numbers in the fixed code.

#### BitCount
```diff
--- buggy/bitcount.py	2024-02-06 22:50:36
+++ fixed/bitcount.py	2024-02-06 22:53:37
@@ -2,25 +2,6 @@
 def bitcount(n):
     count = 0
     while n:
-        n ^= n - 1
+        n &= n - 1
         count += 1
     return count
-
-
-"""
-Bitcount
-bitcount
-
-
-Input:
-    n: a nonnegative int
-
-Output:
-    The number of 1-bits in the binary encoding of n
-
-Examples:
-    >>> bitcount(127)
-    7
-    >>> bitcount(128)
-    1
-"""
```
The expected output of this function is to return the number of 1's in the bit representation of a number. The bitcount can be found by counting the number of times a number can be & (bitwise AND) with the previous number. The buggy code used ^ , which was replaced by & in the fixed code.

#### Is_valid_parenthesization
```diff
--- buggy/IS_VALID_PARENTHESIZATION.java	2024-02-06 22:19:15
+++ fixed/IS_VALID_PARENTHESIZATION.java	2024-02-06 22:24:19
@@ -1,5 +1,6 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
+
 /*
  * To change this template, choose Tools | Templates
  * and open the template in the editor.
@@ -21,6 +22,6 @@
                 if (depth < 0) { return false; }
             }
         }
-        return true;
+        return depth==0;
     }
 }
```
The buggy code always returns true irrespective of the value of the depth. This was fixed to return true only when the value of depth becomes 0.


#### Sieve
```diff
--- buggy/SIEVE.java	2024-02-06 22:19:15
+++ fixed/SIEVE.java	2024-02-06 22:24:19
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -38,7 +38,7 @@
     public static ArrayList<Integer> sieve(Integer max) {
         ArrayList<Integer> primes = new ArrayList<Integer>();
         for (int n=2; n<max+1; n++) {
-            if (any(list_comp(n, primes))) {
+            if (all(list_comp(n, primes))) {
                 primes.add(n);
             }
         }
```
In this program, list_comp is a user-defined function which returns a list of the result of n%p>0 for all primes. n must only be added to primes if all of the elements of the list are true. The buggy program makes use of any() which returns true if any one of the element is true. It was replaced by all() to give the correct implementation in the fixed code.

#### QuickSort
```diff
--- buggy/QUICKSORT.java	2024-02-06 22:19:15
+++ fixed/QUICKSORT.java	2024-02-06 22:24:19
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -23,7 +23,7 @@
         for (Integer x : arr.subList(1, arr.size())) {
             if (x < pivot) {
                 lesser.add(x);
-            } else if (x > pivot) {
+            } else if (x >= pivot) {
                 greater.add(x);
             }
         }
```
For performing quicksort, while comparing an element to the pivot element, the element should be considered as greater even if it is equal to the pivot element. The buggy code only checks if the element was greater and missed the equal check. This was corrected in the fixed code to include >= instead of >.
