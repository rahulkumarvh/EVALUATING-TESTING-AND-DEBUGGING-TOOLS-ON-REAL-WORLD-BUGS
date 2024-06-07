var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":441,"methods":[{"el":41,"sc":5,"sl":38},{"el":54,"sc":5,"sl":50},{"el":66,"sc":5,"sl":63}],"name":"MissingArgumentException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_163":{"methods":[{"sl":38},{"sl":50},{"sl":63}],"name":"testMissingArg","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":65}]},"test_172":{"methods":[{"sl":38},{"sl":50},{"sl":63}],"name":"testLackOfError","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":65}]},"test_30":{"methods":[{"sl":38},{"sl":50},{"sl":63}],"name":"testMissingArg","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":65}]},"test_63":{"methods":[{"sl":38},{"sl":50},{"sl":63}],"name":"testMissingArgWithBursting","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":65}]},"test_85":{"methods":[{"sl":38},{"sl":50},{"sl":63}],"name":"testMissingArg","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53},{"sl":65}]},"test_95":{"methods":[{"sl":38},{"sl":50}],"name":"test13425","pass":true,"statements":[{"sl":40},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [172, 163, 95, 30, 63, 85], [], [172, 163, 95, 30, 63, 85], [], [], [], [], [], [], [], [], [], [172, 163, 95, 30, 63, 85], [], [172, 163, 95, 30, 63, 85], [172, 163, 95, 30, 63, 85], [], [], [], [], [], [], [], [], [], [172, 163, 30, 63, 85], [], [172, 163, 30, 63, 85], [], []]
