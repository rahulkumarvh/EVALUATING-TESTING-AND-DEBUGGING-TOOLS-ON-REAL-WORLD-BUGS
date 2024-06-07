var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":2457,"methods":[{"el":32,"sc":5,"sl":27},{"el":36,"sc":5,"sl":34}],"name":"UtilTest","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_54":{"methods":[{"sl":34}],"name":"testStripLeadingAndTrailingQuotes","pass":true,"statements":[{"sl":35}]},"test_9":{"methods":[{"sl":27}],"name":"testStripLeadingHyphens","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [9], [9], [9], [9], [9], [], [], [54], [54], [], []]
