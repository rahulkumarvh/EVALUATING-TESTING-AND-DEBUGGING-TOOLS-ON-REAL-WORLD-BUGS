var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":1234,"methods":[{"el":41,"sc":5,"sl":38},{"el":55,"sc":5,"sl":51},{"el":65,"sc":5,"sl":62}],"name":"UnrecognizedOptionException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":38},{"sl":51},{"sl":62}],"name":"testUnrecognizedOption","pass":true,"statements":[{"sl":40},{"sl":53},{"sl":54},{"sl":64}]},"test_105":{"methods":[{"sl":38},{"sl":51},{"sl":62}],"name":"testUnrecognizedOption","pass":true,"statements":[{"sl":40},{"sl":53},{"sl":54},{"sl":64}]},"test_72":{"methods":[{"sl":38},{"sl":51},{"sl":62}],"name":"testUnrecognizedOption2","pass":true,"statements":[{"sl":40},{"sl":53},{"sl":54},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [105, 103, 72], [], [105, 103, 72], [], [], [], [], [], [], [], [], [], [], [105, 103, 72], [], [105, 103, 72], [105, 103, 72], [], [], [], [], [], [], [], [105, 103, 72], [], [105, 103, 72], [], []]
