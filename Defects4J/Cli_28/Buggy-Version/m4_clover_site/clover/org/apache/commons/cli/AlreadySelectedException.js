var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":0,"methods":[{"el":44,"sc":5,"sl":41},{"el":60,"sc":5,"sl":54},{"el":71,"sc":5,"sl":68},{"el":82,"sc":5,"sl":79}],"name":"AlreadySelectedException","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_134":{"methods":[{"sl":41},{"sl":54},{"sl":68},{"sl":79}],"name":"testTwoOptionsFromGroup","pass":true,"statements":[{"sl":43},{"sl":56},{"sl":58},{"sl":59},{"sl":70},{"sl":81}]},"test_32":{"methods":[{"sl":41},{"sl":54},{"sl":68},{"sl":79}],"name":"testTwoLongOptionsFromGroup","pass":true,"statements":[{"sl":43},{"sl":56},{"sl":58},{"sl":59},{"sl":70},{"sl":81}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [32, 134], [], [32, 134], [], [], [], [], [], [], [], [], [], [], [32, 134], [], [32, 134], [], [32, 134], [32, 134], [], [], [], [], [], [], [], [], [32, 134], [], [32, 134], [], [], [], [], [], [], [], [], [32, 134], [], [32, 134], [], []]
