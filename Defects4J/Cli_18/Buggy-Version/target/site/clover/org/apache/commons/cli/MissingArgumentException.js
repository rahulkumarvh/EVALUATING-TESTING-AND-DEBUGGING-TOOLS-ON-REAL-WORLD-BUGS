var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":429,"methods":[{"el":41,"sc":5,"sl":38},{"el":54,"sc":5,"sl":50},{"el":65,"sc":5,"sl":62}],"name":"MissingArgumentException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_22":{"methods":[{"sl":38},{"sl":50},{"sl":62}],"name":"testMissingArg","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":64}]},"test_4":{"methods":[{"sl":38},{"sl":50},{"sl":62}],"name":"testLackOfError","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":64}]},"test_44":{"methods":[{"sl":38},{"sl":50}],"name":"test13425","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53}]},"test_58":{"methods":[{"sl":38},{"sl":50},{"sl":62}],"name":"testMissingArg","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4, 44, 22, 58], [], [4, 44, 22, 58], [], [], [], [], [], [], [], [], [], [4, 44, 22, 58], [], [4, 44, 22, 58], [4, 44, 22, 58], [], [], [], [], [], [], [], [], [4, 22, 58], [], [4, 22, 58], [], []]
