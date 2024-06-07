# BugSwarm

# Milestone 4

## Bug Localization

**Challenges**: We encountered limitations with JaCoCo's coverage reporting in multi-module projects, where a separate coverage report is generated for each module without aggregation. This structure does not provide a unified view of project coverage. Additionally, the generated reports lacked details on failing tests, complicating our efforts to correlate bug benchmarking metrics with coverage metrics (AR and FR).

# Milestone 3

## Test Generation

We perform automated test generation using Randoop and Evosuite, focusing on creating tests that reveal the discrepancies between buggy and patched versions of the code. This approach targets specific classes or methods associated with known bugs. Following the generation of these tests, we proceed to execute them, collecting both the execution results and coverage information with JaCoCo. This methodology serves a dual purpose: it not only assists in pinpointing regression issues but also deepens our understanding of the code's resilience and the efficiency of our testing methodologies.

# Milestone 2

## Install prerequisites

- Java version 8 or above
- Install maven
```bash
brew install maven
```

## Test Execution

Checkout to respective SHA for buggy/patched version.
``` bash
$ mvn test
```

## Benchmark Scripts Execution

- Make sure you have installed <b><i>lizard, Levenshtein and codebleu</i></b> packages using pip.
- Execute the benchmark script in scripts folder using
  ```bash
  python3 Scripts/BugSwarm_Script.py alibaba-canal-559456425 CodeBLEU
  ```
- Ensure that the Bug is present in the Bugs folder and the metric is one of <i>"CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"</i>

## Benchmark Results
<p align="middle">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/CB.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/CC.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/CChange.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/CP.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/CodeBleu.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/LChange.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/Levenshtein.png" width="500px">
<img src="https://github.com/urjakhadilkar/CS527-team11/blob/main/Bugs/BugSwarm/Results/Visualizations/MChange.png" width="500px">

The benchmarking metrics for the 20 bugs reveal a diverse set of fixes, from minor line edits to more significant structural changes, without dramatically altering the cyclomatic complexity of the codebase. Most fixes didn't require class modifications, but varied in the number of methods and lines changed, indicating different levels of effort and complexity in resolving the bugs. The Levenshtein distances and CodeBLEU scores suggest that while some bugs required extensive textual modifications, the fixes generally maintained high syntactic and semantic similarity to the original code, indicating precise and effective integration of patches that preserved the original code's intent and readability.

# MileStone 1

## Introduction

BugSwarm is a toolset that helps create a continuously growing set of real-world reproducible build failures and fixes. It involves 2 parts, mining for the bugs from GitHub projects that use Travis-CI, and reproducing by generating scripts to build and run regression tests for each build. The BugSwarm toolset has mined a dataset of ~3000 bugs and the tests run on them.

The JSON file for the dataset of bugs contains fields like 'repo', 'trigger_sha' for failed and passed builds, 'num_tests_run', and 'num_tests_failed', which we use to clone the repositories, get the diff of the buggy and fixed versions, and then find the buggy and fixed files corresponding to the diff.

## Number of bugs

Number of bugs: ~3000
| Language | No. of bugs |
| ---------|-------------|
| Java     | ~1800       |
| Python   | ~1200       |

## Tests per bug

(Showing 20 of 2900. Remaining tests per bug are stored in 'test_info.json' file.)
| Bug                        | Total Tests | Tests Passed | Tests Failed |
--------------------------------------|---------------|------------------|------------------
| gwtbootstrap3-gwtbootstrap3-92837490 | 16            | 0                 | 16      |         
| gwtbootstrap3-gwtbootstrap3-92837483 | 16            |  0                | 16        |       
| gwtbootstrap3-gwtbootstrap3-49364896 | 6             | 2                | 4           |     
| ontop-ontop-81801045                 |        0       |   0               |  0         |       
| ontop-ontop-87451223                 |       0        |    0              |   0         |      
| ontop-ontop-83925341                 |      0         |     0             |    0         |     
| ontop-ontop-76305782                 | 4075          | 36               | 4039            | 
| ontop-ontop-83689235                 |     0          |      0            |     0          |   
| ocpsoft-rewrite-64363050             | 838           | 1                | 837              |
| ocpsoft-rewrite-118490281            | 386           | 2                | 384              |
| ocpsoft-rewrite-118490284            | 385           | 2                | 383              |
| ocpsoft-rewrite-64439039             |    0           |  0                |      0          |  
| ocpsoft-rewrite-118490282            | 381           | 2                | 379              |
| bwhmather-verktyg-102468155          | 247           |   0               | 247              |
| bwhmather-verktyg-102468154          | 247           |    0              | 247              |
| bwhmather-verktyg-78833091           | 247           |     0             | 247              |
| bwhmather-verktyg-109227527          | 247           | 5                | 242              |
| bwhmather-verktyg-109183187          | 247           |      0            | 247              |
| bwhmather-verktyg-109227526          | 247           | 5                | 242              |
| bwhmather-verktyg-109183188          | 247           |       0           | 247              |

## Bug Samples

### zxing-zxing-139981065
``` diff --git a/core/src/main/java/com/google/zxing/pdf417/decoder/ec/ModulusGF.java b/core/src/main/java/com/google/zxing/pdf417/decoder/ec/ModulusGF.java
index cc50fe1f..535ba02f 100644
--- a/core/src/main/java/com/google/zxing/pdf417/decoder/ec/ModulusGF.java
+++ b/core/src/main/java/com/google/zxing/pdf417/decoder/ec/ModulusGF.java
@@ -43,7 +43,7 @@ public final class ModulusGF {
       expTable[i] = x;
       x = (x * generator) % modulus;
     }
-    for (int i = 0; i < modulus - e1; i++) {
+    for (int i = 0; i < modulus - 1; i++) {
       logTable[expTable[i]] = i;
     }
     // logTable[0] == 0 but this should never be used
```

### davidmoten-rxjava-jdbc-79059303
```diff --git a/src/test/java/com/github/davidmoten/rx/jdbc/TestingUtil.java b/src/test/java/com/github/davidmoten/rx/jdbc/TestingUtil.java
new file mode 100644
index 0000000..566c834
--- /dev/null
+++ b/src/test/java/com/github/davidmoten/rx/jdbc/TestingUtil.java
@@ -0,0 +1,18 @@
+package com.github.davidmoten.rx.jdbc;
+
+import java.util.concurrent.CountDownLatch;
+
+import rx.functions.Action0;
+
+public final class  TestingUtil {
+    
+    public static Action0 countDown(final CountDownLatch latch) {
+        return new Action0() {
+
+            @Override
+            public void call() {
+                latch.countDown();
+            }
+        };
+    }
+}
```

### square-okio-140452394
```diff --git a/okio/src/main/java/okio/Buffer.java b/okio/src/main/java/okio/Buffer.java
index ff9060fb..3e910e46 100644
--- a/okio/src/main/java/okio/Buffer.java
+++ b/okio/src/main/java/okio/Buffer.java
@@ -1456,8 +1456,8 @@ public final class Buffer implements BufferedSource, BufferedSink, Cloneable {
   }
 
   @Override public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
+    if (offset < 0) throw new ArrayIndexOutOfBoundsException("offset=" + offset);
     int bytesSize = bytes.size();
-    Util.checkOffsetAndCount(size, offset, bytesSize);
     if ((bytesOffset | byteCount) < 0
         || bytesOffset > bytesSize
         || bytesSize - bytesOffset < byteCount) {
diff --git a/okio/src/test/java/okio/BufferedSourceTest.java b/okio/src/test/java/okio/BufferedSourceTest.java
index dfecb5ea..bfec8145 100644
--- a/okio/src/test/java/okio/BufferedSourceTest.java
+++ b/okio/src/test/java/okio/BufferedSourceTest.java
@@ -942,14 +942,11 @@ public final class BufferedSourceTest {
   }
 
   @Test public void rangeEqualsArgumentValidation() throws IOException {
-    sink.writeUtf8("ABC");
-
     try {
       source.rangeEquals(-1, ByteString.encodeUtf8("A"));
       fail();
     } catch (ArrayIndexOutOfBoundsException expected) {
-      // This message is formatted differently based on Buffer or RealBufferedSource.
-      assertTrue(expected.getMessage().contains("offset=-1"));
+      assertEquals("offset=-1", expected.getMessage());
     }
     try {
       source.rangeEquals(0, ByteString.encodeUtf8("A"), -1, 1);
```

### SonarSource-sonar-java-109803135
```diff --git a/travis.sh b/travis.sh
index b5d35acb8..aa5e48b8f 100755
--- a/travis.sh
+++ b/travis.sh
@@ -58,7 +58,7 @@ CI)
 
 plugin|ruling)
   if [ "$TRAVIS_BRANCH" != "master" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
-   stringEcho "We do not run plugin or ruling tests on branches, open a pull request to run those!"
+   strongEcho "We do not run plugin or ruling tests on branches, open a pull request to run those!"
    exit 0;
   fi
```

### joyent-java-manta-97927888
```diff --git a/checkstyle.xml b/checkstyle.xml
index 4909cee0..9428dce8 100644
--- a/checkstyle.xml
+++ b/checkstyle.xml
@@ -92,7 +92,9 @@
 
         <!-- Checks for imports                              -->
         <!-- See http://checkstyle.sf.net/config_import.html -->
-        <module name="AvoidStarImport"/>
+        <module name="AvoidStarImport">
+            <property name="allowStaticMemberImports" value="true"/>
+        </module>
         <module name="IllegalImport"/> <!-- defaults to sun.* packages -->
         <module name="RedundantImport"/>
         <module name="UnusedImports"/>
diff --git a/java-manta-client/src/main/java/com/joyent/manta/client/HttpRequestFactoryProvider.java b/java-manta-client/src/main/java/com/joyent/manta/client/HttpRequestFactoryProvider.java
index 260a6519..3461bd2d 100644
--- a/java-manta-client/src/main/java/com/joyent/manta/client/HttpRequestFactoryProvider.java
+++ b/java-manta-client/src/main/java/com/joyent/manta/client/HttpRequestFactoryProvider.java
@@ -108,7 +108,8 @@ public class HttpRequestFactoryProvider implements AutoCloseable {
             throws IOException {
         this.config = config;
         this.httpClient = buildHttpClient();
-        this.requestFactory = buildRequestFactory(httpSigner, httpClient);}
+        this.requestFactory = buildRequestFactory(httpSigner, httpClient);
+    }
 
     /**
      * Creates the parameters used to configure the Apache HTTP Client.
```
