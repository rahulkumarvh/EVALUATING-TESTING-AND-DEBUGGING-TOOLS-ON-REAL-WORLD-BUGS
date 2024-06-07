# Bears-Benchmark

# Milestone 4

## Bug Localization

**Procedure**: Firstly, the lines involved in the bugs was calculated. For this, the lines modified or deleted in the diff were considered and their line numbers were extracted from the buggy file. Then, all tests were run once to extract the names of all available tests. Then each test was run one by one. A code coverage tool, Jacoco was used to generate code coverage for each test execution. The statement coverage information was extracted by parsing the XML coverage report. The Suspiciousness score was then calculated for each statement and ranked in descending order. The first rank and average rank was then calculated for the statements involved in the bug.

# Milestone 3

## Test Generation

<b>Note:</b> For Bears, we were able to get the tools to generate all tests for Randoop and some tests for Evosuite. The errors faced were arising from dependency issues, file path issues, and java classes. Since many projects in the Bears dataset has different structuring and multiple nested modules, we haven't been able to create perfect scripts to automate generation of tests. However, we are still working on it.

We perform automated test generation using Randoop and Evosuite, focusing on creating tests that reveal the discrepancies between buggy and patched versions of the code. This approach targets specific classes or methods associated with known bugs. Following the generation of these tests, we proceed to execute them, collecting both the execution results and coverage information with the aid of Clover. This methodology serves a dual purpose: it not only assists in pinpointing regression issues but also deepens our understanding of the code's resilience and the efficiency of our testing methodologies.

## Install prerequisite

- Ensure you use Java 8.
```bash
$export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/ 
$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-79-generic", arch: "amd64", family: "unix"
```

## Test Execution
In the folder scripts you can find scripts to check out bugs, to compile them, and to run tests on them.

You can list the bugs in the current version of the benchmark with jq
``` bash
jq ".[].bugId" scripts/data/bug_id_and_branch.json
```
You can check out a single bug by given a bug ID (see bug IDs) as argument with
``` bash
python scripts/checkout_bug.py --bugId <bug ID>
```
For example,
``` bash
python scripts/checkout_bug.py --bugId Bears-1
python scripts/run_tests_bug.py --bugId Bears-1 # this should fail because the checkout_bug.py has checked out the third, buggy commit
```
In the same way as you can check out one or all bugs you can compile the checked out buggy program versions and run tests on them using the scripts compile_all.py, compile_bug.py, run_tests_all.py, run_tests_bug.py.

## Benchmark Scripts Execution

- Make sure you have installed <b><i>lizard, Levenshtein and codebleu</i></b> packages using pip.
- Execute the benchmark script in scripts folder using
  ```bash
  python Scripts/Bears_Benchmark.py Bears Bears-3 CChange
  ```
- Ensure that the Bug is present in the Bugs folder and the metric is one of <i>"CChange", "MChange", "LChange", "LD", "CB", "CP", "CC", "CodeBLEU"</i>

## Benchmarking Results (Visualizations and Observations)

![Bears Metrics Box Plot](https://github.com/urjakhadilkar/CS527-team11/assets/66205950/75ae72f0-fd38-475c-b910-f6598117678a)

CChange (Cyclomatic Complexity Change):
The median CChange is approximately 1, indicating that the cyclomatic complexity of the code does not change significantly between the buggy and fixed versions for most bugs.

MChange (Method Change):
The median MChange is 1, implying that only one method required modification to fix the bug for most cases.

LChange (Line Changes):
The median LChange is around 10, which means that roughly 10 lines of code needed to be changed to fix the bug for most cases.

LD (Levenshtein Distance):
The median Levenshtein Distance (LD) is approximately 200, indicating that on average, around 200 characters needed to be modified to fix the bug.

CB (Cyclomatic Complexity of Buggy Code):
The median CB is around 35, suggesting that the buggy code had a moderate cyclomatic complexity for most cases.

CP (Cyclomatic Complexity of Patched Code):
The median CP is also around 35, similar to the median CB. This observation aligns with the finding that the cyclomatic complexity did not change significantly between the buggy and patched code for most cases.

CC (Cyclomatic Complexity Change):
The median CC is 0, indicating that the cyclomatic complexity remained unchanged for most bugs after fixing them.
CodeBLEU: The median CodeBLEU score is approximately 0.95, suggesting that the patched code is relatively similar to the buggy code for most cases.

## Checkpoint 1
## Introduction

This project aims to provide a comprehensive dataset of software bugs and their fixes, collected from various open-source projects using the Bears-Benchmark. The Bears-Benchmark, or just Bears, is a benchmark of bugs for automatic program repair studies in Java 8. Bugs are collected from open-source projects hosted on GitHub through a process that scans pairs of builds from Travis Continuous Integration and reproduces bugs (by test failure) and their patches (passing test suite). The dataset contains detailed information about each bug, including unique identifiers, commit hashes, file paths, and repository URLs. Additionally, it includes metadata such as bug types, timestamps, and project names. Researchers and developers can leverage this dataset to analyze common types of bugs, study bug fix patterns, and develop automated bug detection and fixing tools. We strive to maintain the accuracy and integrity of the dataset, and contributions or suggestions for improvement are always welcome. Explore the dataset, conduct your research, and join us in advancing software quality and reliability.

## Number of Bugs
| Language | Bug Count                                                   |
|----------|-------------------------------------------------------------|
| Java     | 118                                                         | 

## Test cases per bug

### Java
| Bug ID | Total Tests | Passing Tests | Failing Tests |
| ------ | ----------- | ------------- | ------------- |
| Bears-1 | 1570 | 1569 | 1 |
| Bears-2 | 1571 | 1570 | 1 |
| Bears-3 | 1681 | 1680 | 1 |
| Bears-4 | 1572 | 1571 | 1 |
| Bears-5 | 1572 | 1571 | 1 |
| Bears-6 | 1688 | 1686 | 2 |
| Bears-7 | 1692 | 1690 | 1 |
| Bears-8 | 1694 | 1693 | 1 |
| Bears-9 | 1696 | 1695 | 1 |
| Bears-11 | 1706 | 1705 | 0 |
| Bears-12 | 1712 | 1708 | 0 |
| Bears-14 | 1574 | 1573 | 0 |
| Bears-15 | 1575 | 1574 | 0 |
| Bears-16 | 1975 | 1974 | 1 |
| Bears-17 | 1976 | 1975 | 1 |
| Bears-18 | 1977 | 1976 | 1 |
| Bears-19 | 1721 | 1720 | 0 |
| Bears-20 | 1722 | 1721 | 1 |
| Bears-21 | 1723 | 1722 | 0 |
| Bears-22 | 1725 | 1723 | 0 |
| Bears-23 | 1726 | 1725 | 0 |
| Bears-24 | 1737 | 1736 | 1 |
| Bears-25 | 1738 | 1737 | 1 |
| Bears-26 | 1755 | 1754 | 0 |
| Bears-83 | 1168 | 1167 | 1 |
| Bears-98 | 223 | 222 | 1 |
| Bears-99 | 225 | 224 | 0 |
| Bears-100 | 226 | 225 | 0 |
| Bears-101 | 227 | 226 | 1 |
| Bears-102 | 230 | 229 | 1 |
| Bears-103 | 230 | 227 | 0 |
| Bears-104 | 233 | 232 | 1 |
| Bears-105 | 233 | 232 | 0 |
| Bears-106 | 233 | 232 | 0 |
| Bears-107 | 233 | 232 | 1 |
| Bears-108 | 233 | 232 | 0 |
| Bears-109 | 233 | 232 | 1 |
| Bears-110 | 233 | 232 | 0 |
| Bears-111 | 233 | 232 | 0 |
| Bears-112 | 233 | 232 | 0 |
| Bears-113 | 234 | 233 | 0 |
| Bears-114 | 237 | 236 | 1 |
| Bears-115 | 241 | 240 | 1 |
| Bears-116 | 242 | 241 | 0 |
| Bears-117 | 243 | 242 | 0 |
| Bears-118 | 249 | 248 | 0 |
| Bears-119 | 251 | 250 | 1 |
| Bears-120 | 261 | 260 | 0 |
| Bears-121 | 264 | 119 | 145 |
| Bears-122 | 267 | 266 | 0 |
| Bears-123 | 272 | 269 | 0 |
| Bears-124 | 274 | 273 | 0 |
| Bears-125 | 274 | 273 | 1 |
| Bears-126 | 274 | 273 | 0 |
| Bears-127 | 275 | 274 | 1 |
| Bears-128 | 275 | 274 | 0 |
| Bears-129 | 276 | 275 | 0 |
| Bears-130 | 276 | 275 | 0 |
| Bears-131 | 276 | 275 | 1 |
| Bears-132 | 282 | 281 | 0 |
| Bears-133 | 283 | 282 | 0 |
| Bears-134 | 284 | 283 | 0 |
| Bears-135 | 284 | 283 | 0 |
| Bears-136 | 284 | 283 | 0 |
| Bears-137 | 296 | 295 | 0 |
| Bears-138 | 298 | 297 | 1 |
| Bears-139 | 299 | 298 | 1 |
| Bears-140 | 83 | 80 | 3 |
| Bears-141 | 104 | 102 | 1 |
| Bears-142 | 1952 | 1949 | 0 |
| Bears-143 | 112 | 111 | 1 |
| Bears-144 | 384 | 383 | 0 |
| Bears-146 | 755 | 753 | 2 |
| Bears-149 | 1159 | 1158 | 0 |
| Bears-150 | 33 | 31 | 0 |
| Bears-152 | 754 | 753 | 0 |
| Bears-153 | 635 | 631 | 4 |
| Bears-154 | 144 | 143 | 0 |
| Bears-156 | 1788 | 1787 | 1 |
| Bears-158 | 430 | 429 | 1 |
| Bears-159 | 485 | 484 | 1 |
| Bears-160 | 478 | 477 | 1 |
| Bears-161 | 479 | 478 | 1 |
| Bears-164 | 500 | 496 | 4 |
| Bears-166 | 18 | 17 | 0 |
| Bears-168 | 20 | 18 | 2 |
| Bears-169 | 621 | 620 | 0 |
| Bears-180 | 37 | 36 | 1 |
| Bears-181 | 159 | 158 | 0 |
| Bears-189 | 90 | 85 | 5 |
| Bears-190 | 85 | 84 | 1 |
| Bears-191 | 110 | 104 | 0 |
| Bears-192 | 114 | 112 | 0 |
| Bears-194 | 58 | 57 | 0 |
| Bears-197 | 154 | 153 | 0 |
| Bears-198 | 5726 | 5725 | 1 |
| Bears-201 | 145 | 144 | 1 |
| Bears-202 | 116 | 115 | 1 |
| Bears-203 | 432 | 417 | 15 |
| Bears-204 | 202 | 192 | 0 |
| Bears-209 | 106 | 104 | 0 |
| Bears-211 | 101 | 99 | 0 |
| Bears-221 | 53 | 52 | 0 |
| Bears-222 | 2973 | 2972 | 1 |
| Bears-225 | 2016 | 2013 | 1 |
| Bears-226 | 426 | 425 | 1 |
| Bears-227 | 288 | 286 | 0 |
| Bears-228 | 535 | 533 | 0 |
| Bears-229 | 1168 | 1167 | 1 |
| Bears-230 | 19 | 18 | 1 |
| Bears-232 | 80 | 77 | 0 |
| Bears-234 | 15 | 14 | 0 |
| Bears-235 | 17 | 16 | 0 |
| Bears-238 | 9 | 7 | 0 |
| Bears-241 | 45 | 41 | 0 |
| Bears-242 | 616 | 615 | 0 |
| Bears-245 | 334 | 333 | 0 |
| Bears-246 | 229 | 228 | 0 |


### Bug Samples

#### Bears-1
```diff
diff --git a/release-notes/VERSION b/release-notes/VERSION
index c01c4b36c..52168f311 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -18,6 +18,8 @@ Project: jackson-databind
 #1456: `TypeFactory` type resolution broken in 2.7 for generic types
    when using `constructType` with context
  (reported by Dmitry S)
+#1476: Wrong constructor picked up when deserializing object
+ (reported by laurentgo@github)
 
 2.7.8 (26-Sep-2016)
 
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java b/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
index 8e38f5dec..a530e4b20 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/impl/CreatorCollector.java
@@ -162,36 +162,39 @@ public class CreatorCollector
             SettableBeanProperty[] injectables)
     {
         if (creator.getParameterType(0).isCollectionLikeType()) {
-            verifyNonDup(creator, C_ARRAY_DELEGATE, explicit);
-            _arrayDelegateArgs = injectables;
+            if (verifyNonDup(creator, C_ARRAY_DELEGATE, explicit)) {
+                _arrayDelegateArgs = injectables;
+            }
         } else {
-            verifyNonDup(creator, C_DELEGATE, explicit);
-            _delegateArgs = injectables;
+            if (verifyNonDup(creator, C_DELEGATE, explicit)) {
+                _delegateArgs = injectables;
+            }
         }
     }
     
     public void addPropertyCreator(AnnotatedWithParams creator, boolean explicit,
             SettableBeanProperty[] properties)
     {
-        verifyNonDup(creator, C_PROPS, explicit);
-        // Better ensure we have no duplicate names either...
-        if (properties.length > 1) {
-            HashMap<String,Integer> names = new HashMap<String,Integer>();
-            for (int i = 0, len = properties.length; i < len; ++i) {
-                String name = properties[i].getName();
-                /* [Issue-13]: Need to consider Injectables, which may not have
-                 *   a name at all, and need to be skipped
-                 */
-                if (name.length() == 0 && properties[i].getInjectableValueId() != null) {
-                    continue;
-                }
-                Integer old = names.put(name, Integer.valueOf(i));
-                if (old != null) {
-                    throw new IllegalArgumentException("Duplicate creator property \""+name+"\" (index "+old+" vs "+i+")");
+        if (verifyNonDup(creator, C_PROPS, explicit)) {
+            // Better ensure we have no duplicate names either...
+            if (properties.length > 1) {
+                HashMap<String,Integer> names = new HashMap<String,Integer>();
+                for (int i = 0, len = properties.length; i < len; ++i) {
+                    String name = properties[i].getName();
+                    /* [Issue-13]: Need to consider Injectables, which may not have
+                     *   a name at all, and need to be skipped
+                     */
+                    if (name.length() == 0 && properties[i].getInjectableValueId() != null) {
+                        continue;
+                    }
+                    Integer old = names.put(name, Integer.valueOf(i));
+                    if (old != null) {
+                        throw new IllegalArgumentException("Duplicate creator property \""+name+"\" (index "+old+" vs "+i+")");
+                    }
                 }
             }
+            _propertyBasedArgs = properties;
         }
-        _propertyBasedArgs = properties;
     }
 
     public void addIncompeteParameter(AnnotatedParameter parameter) {
@@ -293,7 +296,10 @@ public class CreatorCollector
         return member;
     }
 
-    protected void verifyNonDup(AnnotatedWithParams newOne, int typeIndex, boolean explicit)
+    /**
+     * @return True if specified Creator is to be used
+     */
+    protected boolean verifyNonDup(AnnotatedWithParams newOne, int typeIndex, boolean explicit)
     {
         final int mask = (1 << typeIndex);
         _hasNonDefaultCreator = true;
@@ -301,11 +307,10 @@ public class CreatorCollector
         // already had an explicitly marked one?
         if (oldOne != null) {
             boolean verify;
-
             if ((_explicitCreators & mask) != 0) { // already had explicitly annotated, leave as-is
                 // but skip, if new one not annotated
                 if (!explicit) {
-                    return;
+                    return false;
                 }
                 // both explicit: verify
                 verify = true;
@@ -327,7 +332,7 @@ public class CreatorCollector
                 // otherwise, which one to choose?
                 if (newType.isAssignableFrom(oldType)) {
                     // new type more generic, use old
-                    return;
+                    return false;
                 }
                 // new type more specific, use it
             }
@@ -336,6 +341,7 @@ public class CreatorCollector
             _explicitCreators |= mask;
         }
         _creators[typeIndex] = _fixAccess(newOne);
+        return true;
     }
 
     /*
diff --git a/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java b/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java
new file mode 100644
index 000000000..94a1eeef6
--- /dev/null
+++ b/src/test/java/com/fasterxml/jackson/databind/creators/Creator1476Test.java
@@ -0,0 +1,43 @@
+package com.fasterxml.jackson.databind.creators;
+
+import com.fasterxml.jackson.annotation.*;
+
+import com.fasterxml.jackson.databind.*;
+
+public class Creator1476Test extends BaseMapTest
+{
+    static final class SimplePojo {
+        private final int intField;
+        private final String stringField;
+
+        public SimplePojo(@JsonProperty("intField") int intField) {
+          this(intField, "empty");
+        }
+
+        public SimplePojo(@JsonProperty("stringField") String stringField) {
+          this(-1, stringField);
+        }
+
+        @JsonCreator
+        public SimplePojo(@JsonProperty("intField") int intField, @JsonProperty("stringField") String stringField) {
+          this.intField = intField;
+          this.stringField = stringField;
+        }
+
+        public int getIntField() {
+          return intField;
+        }
+
+        public String getStringField() {
+          return stringField;
+        }
+    }
+
+    public void testConstructorChoice() throws Exception {
+        ObjectMapper mapper = new ObjectMapper();
+        SimplePojo pojo = mapper.readValue("{ \"intField\": 1, \"stringField\": \"foo\" }", SimplePojo.class);
+
+        assertEquals(1, pojo.getIntField());
+        assertEquals("foo", pojo.getStringField());
+    }
+}
```

#### Bears-2
```diff
diff --git a/release-notes/VERSION b/release-notes/VERSION
index b36d66226..d8049873a 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -1,4 +1,5 @@
 Project: jackson-databind
+
 ------------------------------------------------------------------------
 === Releases ===
 ------------------------------------------------------------------------
@@ -16,7 +17,6 @@ Project: jackson-databind
 #1456: `TypeFactory` type resolution broken in 2.7 for generic types
    when using `constructType` with context
 #1473: Add explicit deserializer for `StringBuilder` due to Java 9 changes
-#1493: `ACCEPT_CASE_INSENSITIVE_PROPERTIES` fails with `@JsonUnwrapped`
 
 2.8.5 (14-Nov-2016)
 
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java b/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
index 8031ee0aa..fd30aaf82 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap.java
@@ -92,7 +92,7 @@ public class BeanPropertyMap
     protected void init(Collection<SettableBeanProperty> props)
     {
         _size = props.size();
-
+        
         // First: calculate size of primary hash area
         final int hashSize = findSize(_size);
         _hashMask = hashSize-1;
@@ -423,8 +423,7 @@ System.err.println("And new propr #"+slot+" '"+key+"'");
      * Specialized method for removing specified existing entry.
      * NOTE: entry MUST exist, otherwise an exception is thrown.
      */
-    public void remove(SettableBeanProperty propToRm)
-    {
+    public void remove(SettableBeanProperty propToRm) {
         ArrayList<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>(_size);
         String key = getPropertyName(propToRm);
         boolean found = false;
@@ -435,9 +434,7 @@ System.err.println("And new propr #"+slot+" '"+key+"'");
                 continue;
             }
             if (!found) {
-                // 09-Jan-2017, tatu: Important: must check name slot and NOT property name,
-                //   as only former is lower-case in case-insensitive case
-                found = key.equals(_hashArea[i-1]);
+                found = key.equals(prop.getName());
                 if (found) {
                     // need to leave a hole here
                     _propsInOrder[_findFromOrdered(prop)] = null;
diff --git a/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java b/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
index dd373f6b9..59ac4e08f 100644
--- a/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
+++ b/src/test/java/com/fasterxml/jackson/databind/struct/TestUnwrapped.java
@@ -97,20 +97,6 @@ public class TestUnwrapped extends BaseMapTest
         private Inner inner;
     }
 
-    // [databind#1493]: case-insensitive handling
-    static class Person {
-        @JsonUnwrapped(prefix = "businessAddress.")
-        public Address businessAddress;
-    }
-
-    static class Address {
-        public String street;
-        public String addon;
-        public String zip;
-        public String town;    
-        public String country;
-    }
-
     /*
     /**********************************************************
     /* Tests, serialization
@@ -206,13 +192,45 @@ public class TestUnwrapped extends BaseMapTest
         assertTrue(actual.contains("Zebra"));
         assertFalse(actual.contains("inner"));
     }
+    
+    // 22-Apr-2013, tatu: Commented out as it can't be simply fixed; requires implementing
+    //    deep-update/merge. But leaving here to help with that effort, if/when it proceeds.
 
-    // [databind#1493]: case-insensitive handling
-    public void testCaseInsensitiveUnwrap() throws Exception
-    {
-        ObjectMapper mapper = new ObjectMapper();
-        mapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
-        Person p = mapper.readValue("{ }", Person.class);
-        assertNotNull(p);
+    /*
+    // [databind#211]: Actually just variant of #160
+
+    static class Issue211Bean {
+        public String test1;
+
+        public String test2;
+        @JsonUnwrapped
+        public Issue211Unwrapped unwrapped;
     }
+
+    static class Issue211Unwrapped {
+        public String test3;
+        public String test4;
+    }
+
+    public void testIssue211() throws Exception
+    {
+         Issue211Bean bean = new Issue211Bean();
+         bean.test1 = "Field 1";
+         bean.test2 = "Field 2";
+         Issue211Unwrapped tJackson2 = new Issue211Unwrapped();
+         tJackson2.test3 = "Field 3";
+         tJackson2.test4 = "Field 4";
+         bean.unwrapped = tJackson2;
+ 
+         final String JSON = "{\"test1\": \"Field 1 merged\", \"test3\": \"Field 3 merged\"}";
+         ObjectMapper o = new ObjectMapper();
+         Issue211Bean result = o.readerForUpdating(bean).withType(Issue211Bean.class).readValue(JSON);
+         assertSame(bean, result);
+         assertEquals("Field 1 merged", result.test1);
+         assertEquals("Field 2", result.test2);
+         assertNotNull(result.unwrapped);
+         assertEquals("Field 3 merged", result.unwrapped.test3);
+         assertEquals("Field 4", result.unwrapped.test4);
+    }
+    */
 }

```

#### Bears-3
```diff
diff --git a/release-notes/CREDITS b/release-notes/CREDITS
index 0a4eddf6d..b426d4272 100644
--- a/release-notes/CREDITS
+++ b/release-notes/CREDITS
@@ -488,7 +488,3 @@ Josh Caplan (jecaplan@github)
 
 Frédéric Camblor (fcamblor@github)
   * Reported #1451: Type parameter not passed by `ObjectWriter` if serializer pre-fetch disabled
-
-Kevin Hogeland (khogeland@github)
-  * Reported #1501: `ArrayIndexOutOfBoundsException` on non-static inner class constructor
-   (2.7.9)
diff --git a/release-notes/VERSION b/release-notes/VERSION
index 7b62df1bb..4e4ab13af 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -20,8 +20,6 @@ Project: jackson-databind
  (reported by Dmitry S)
 #1476: Wrong constructor picked up when deserializing object
  (reported by laurentgo@github)
-#1501: `ArrayIndexOutOfBoundsException` on non-static inner class constructor
- (reported by Kevin H)
 #1506: Missing `KeyDeserializer` for `CharSequence`
 
 2.7.8 (26-Sep-2016)
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/impl/InnerClassProperty.java b/src/main/java/com/fasterxml/jackson/databind/deser/impl/InnerClassProperty.java
index 4a9ca99b9..311802e60 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/impl/InnerClassProperty.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/impl/InnerClassProperty.java
@@ -83,15 +83,6 @@ public final class InnerClassProperty
     public InnerClassProperty withValueDeserializer(JsonDeserializer<?> deser) {
         return new InnerClassProperty(this, deser);
     }
-
-    @Override
-    public void assignIndex(int index) { _delegate.assignIndex(index); }
-
-    @Override
-    public int getPropertyIndex() { return _delegate.getPropertyIndex(); }
-
-    @Override
-    public int getCreatorIndex() { return _delegate.getCreatorIndex(); }
     
     // // // BeanProperty impl
     
diff --git a/src/test/java/com/fasterxml/jackson/databind/creators/InnerClassCreatorTest.java b/src/test/java/com/fasterxml/jackson/databind/creators/InnerClassCreatorTest.java
deleted file mode 100644
index 237581ea1..000000000
--- a/src/test/java/com/fasterxml/jackson/databind/creators/InnerClassCreatorTest.java
+++ /dev/null
@@ -1,32 +0,0 @@
-package com.fasterxml.jackson.databind.creators;
-
-import com.fasterxml.jackson.annotation.JsonCreator;
-import com.fasterxml.jackson.annotation.JsonProperty;
-import com.fasterxml.jackson.databind.*;
-
-// for [databind#1501]
-public class InnerClassCreatorTest extends BaseMapTest
-{
-    static class Something {
-        public InnerSomething a;
-
-        // important: must name the parameter (param names module, or explicit)
-        @JsonCreator
-        public Something(@JsonProperty("a") InnerSomething a) { this.a = a; }
-
-        public Something() { a = new InnerSomething(); }
-
-        class InnerSomething {
-            @JsonCreator
-            public InnerSomething() { }
-        }
-    }
-
-    public void testIssue1501() throws Exception
-    {
-        ObjectMapper mapper = new ObjectMapper();
-        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
-        String ser = mapper.writeValueAsString(new Something());
-        mapper.readValue(ser, Something.class);
-    }
-}
```

#### Bears-4
```diff
diff --git a/release-notes/CREDITS b/release-notes/CREDITS
index 092a4f0b9..0a4eddf6d 100644
--- a/release-notes/CREDITS
+++ b/release-notes/CREDITS
@@ -489,10 +489,6 @@ Josh Caplan (jecaplan@github)
 Frédéric Camblor (fcamblor@github)
   * Reported #1451: Type parameter not passed by `ObjectWriter` if serializer pre-fetch disabled
 
-Diego de Estrada (diegode@github)
-  * Contributed fix for #1367: No Object Id found for an instance when using `@ConstructorProperties`
-   (2.7.9)
-
 Kevin Hogeland (khogeland@github)
   * Reported #1501: `ArrayIndexOutOfBoundsException` on non-static inner class constructor
    (2.7.9)
diff --git a/release-notes/VERSION b/release-notes/VERSION
index 474f41ebf..7b62df1bb 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -6,8 +6,6 @@ Project: jackson-databind
 
 2.7.9 (not yet released)
 
-#1367: No Object Id found for an instance when using `@ConstructorProperties`
- (reported by kajo-bellabeat@github; fix by diegode@github)
 #1392: Custom UnmodifiableSetMixin Fails in Jackson 2.7+ but works in Jackson 2.6
  (reported by Rob W)
 #1411: MapSerializer._orderEntries should check for null keys
diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializer.java
index d0ebabafb..0e2b87490 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializer.java
@@ -373,10 +373,6 @@ public class BeanDeserializer
         for (; t == JsonToken.FIELD_NAME; t = p.nextToken()) {
             String propName = p.getCurrentName();
             p.nextToken(); // to point to value
-            // Object Id property?
-            if (buffer.readIdProperty(propName)) {
-                continue;
-            }
             // creator property?
             SettableBeanProperty creatorProp = creator.findCreatorProperty(propName);
             if (creatorProp != null) {
@@ -409,6 +405,10 @@ public class BeanDeserializer
                 }
                 continue;
             }
+            // Object Id property?
+            if (buffer.readIdProperty(propName)) {
+                continue;
+            }
             // regular property? needs buffering
             SettableBeanProperty prop = _beanProperties.find(propName);
             if (prop != null) {
diff --git a/src/test/java/com/fasterxml/jackson/databind/creators/CreatorWithObjectIdTest.java b/src/test/java/com/fasterxml/jackson/databind/creators/CreatorWithObjectIdTest.java
deleted file mode 100644
index 01c13a0b6..000000000
--- a/src/test/java/com/fasterxml/jackson/databind/creators/CreatorWithObjectIdTest.java
+++ /dev/null
@@ -1,50 +0,0 @@
-package com.fasterxml.jackson.databind.creators;
-
-import java.beans.ConstructorProperties;
-
-import com.fasterxml.jackson.annotation.JsonIdentityInfo;
-import com.fasterxml.jackson.annotation.ObjectIdGenerators;
-import com.fasterxml.jackson.databind.*;
-
-// for [databind#1367]
-public class CreatorWithObjectIdTest
-    extends BaseMapTest
-{
-    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
-//            resolver = SimpleObjectIdResolver.class)
-    public static class A {
-        String id;
-        String name;
-
-        public A() { }
-
-        @ConstructorProperties({"id", "name"})
-        public A(String id, String name) {
-            this.id = id;
-            this.name = name;
-        }
-
-        public String getId() {
-            return id;
-        }
-        public void setId(String id) {
-            this.id = id;
-        }
-        public String getName() {
-            return name;
-        }
-        public void setName(String name) {
-            this.name = name;
-        }
-    }
-
-    public void testObjectIdWithCreator() throws Exception
-    {
-        A a = new A("123", "A");
-
-        ObjectMapper om = new ObjectMapper();
-        String json = om.writeValueAsString(a);
-        A deser = om.readValue(json, A.class);
-        assertEquals(a.name, deser.name);
-    }
-}
```

#### Bears-5
```diff
diff --git a/release-notes/VERSION b/release-notes/VERSION
index a081f9494..079720dff 100644
--- a/release-notes/VERSION
+++ b/release-notes/VERSION
@@ -5,8 +5,7 @@ Project: jackson-databind
 
 2.8.7 (not yet released)
 
-#935: `@JsonProperty(access = Access.READ_ONLY)` - unexpected behaviour
-#1317: '@JsonIgnore' annotation not working with creator properties, serializatio
+#1317: '@JsonIgnore' annotation not working with creator properties, serialization
 
 2.8.6 (12-Jan-2017)
 
diff --git a/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertiesCollector.java b/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertiesCollector.java
index fd6a613e6..f542d84f3 100644
--- a/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertiesCollector.java
+++ b/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertiesCollector.java
@@ -4,7 +4,6 @@ import java.lang.reflect.Modifier;
 import java.util.*;
 
 import com.fasterxml.jackson.annotation.JsonAnySetter;
-import com.fasterxml.jackson.annotation.JsonProperty.Access;
 import com.fasterxml.jackson.databind.*;
 import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
 import com.fasterxml.jackson.databind.cfg.MapperConfig;
@@ -728,14 +727,10 @@ public class POJOPropertiesCollector
 
         while (it.hasNext()) {
             POJOPropertyBuilder prop = it.next();
-            // 26-Jan-2017, tatu: [databind#935]: need to denote removal of
-            Access acc = prop.removeNonVisible(inferMutators);
-            if (!_forSerialization && (acc == Access.READ_ONLY)) {
-                _collectIgnorals(prop.getName());
-            }
+            prop.removeNonVisible(inferMutators);
         }
     }
-
+        
     /**
      * Helper method called to add explicitly ignored properties to a list
      * of known ignored properties; this helps in proper reporting of
diff --git a/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder.java b/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder.java
index b9a403c13..954f5dd46 100644
--- a/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder.java
+++ b/src/main/java/com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder.java
@@ -641,7 +641,7 @@ public class POJOPropertyBuilder
      * @param inferMutators Whether mutators can be "pulled in" by visible
      *    accessors or not. 
      */
-    public JsonProperty.Access removeNonVisible(boolean inferMutators)
+    public void removeNonVisible(boolean inferMutators)
     {
         /* 07-Jun-2015, tatu: With 2.6, we will allow optional definition
          *  of explicit access type for property; if not "AUTO", it will
@@ -680,7 +680,6 @@ public class POJOPropertyBuilder
                 _setters = _removeNonVisible(_setters);
             }
         }
-        return acc;
     }
 
     /**
diff --git a/src/test/java/com/fasterxml/jackson/databind/deser/ReadOrWriteOnlyTest.java b/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
similarity index 92%
rename from src/test/java/com/fasterxml/jackson/databind/deser/ReadOrWriteOnlyTest.java
rename to src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
index 78d54bcc9..b241e7374 100644
--- a/src/test/java/com/fasterxml/jackson/databind/deser/ReadOrWriteOnlyTest.java
+++ b/src/test/java/com/fasterxml/jackson/failing/ReadWriteOnlyProp935Test.java
@@ -1,9 +1,9 @@
-package com.fasterxml.jackson.databind.deser;
+package com.fasterxml.jackson.failing;
 
 import com.fasterxml.jackson.annotation.JsonProperty;
 import com.fasterxml.jackson.databind.*;
 
-public class ReadOrWriteOnlyTest extends BaseMapTest
+public class ReadWriteOnlyProp935Test extends BaseMapTest
 {
     // for [databind#935], verify read/write-only cases
     static class ReadXWriteY {
@@ -56,7 +56,7 @@ public class ReadOrWriteOnlyTest extends BaseMapTest
      */
 
     private final ObjectMapper MAPPER = new ObjectMapper();
-
+    
     // [databind#935]
     public void testReadOnlyAndWriteOnly() throws Exception
     {
@@ -69,7 +69,7 @@ public class ReadOrWriteOnlyTest extends BaseMapTest
         assertEquals(6, result.y);
     }
 
-    public void testReadOnly935() throws Exception
+    public void testReadOnl935() throws Exception
     {
         String json = MAPPER.writeValueAsString(new Pojo935());
         Pojo935 result = MAPPER.readValue(json, Pojo935.class);

```
