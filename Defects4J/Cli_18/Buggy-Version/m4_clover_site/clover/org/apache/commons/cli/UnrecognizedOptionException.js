var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":1236,"methods":[{"el":41,"sc":5,"sl":38},{"el":55,"sc":5,"sl":51},{"el":65,"sc":5,"sl":62}],"name":"UnrecognizedOptionException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3":{"methods":[{"sl":38},{"sl":51},{"sl":62}],"name":"testUnrecognizedOption","pass":true,"statements":[{"sl":40},{"sl":53},{"sl":54},{"sl":64}]},"test_48":{"methods":[{"sl":38},{"sl":51},{"sl":62}],"name":"testUnrecognizedOption","pass":true,"statements":[{"sl":40},{"sl":53},{"sl":54},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [48, 3], [], [48, 3], [], [], [], [], [], [], [], [], [], [], [48, 3], [], [48, 3], [48, 3], [], [], [], [], [], [], [], [48, 3], [], [48, 3], [], []]
