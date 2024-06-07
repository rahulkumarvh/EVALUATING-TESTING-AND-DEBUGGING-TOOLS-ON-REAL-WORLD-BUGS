var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":1345,"methods":[{"el":30,"sc":5,"sl":26},{"el":35,"sc":5,"sl":32},{"el":40,"sc":5,"sl":37},{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":47},{"el":55,"sc":5,"sl":52}],"name":"BasicParserTest","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":32}],"name":"testPropertiesOption","pass":true,"statements":[]},"test_11":{"methods":[{"sl":42}],"name":"testShortWithoutEqual","pass":true,"statements":[]},"test_18":{"methods":[{"sl":47}],"name":"testLongWithEqual","pass":true,"statements":[]},"test_181":{"methods":[{"sl":52}],"name":"testLongWithEqualSingleDash","pass":true,"statements":[]},"test_186":{"methods":[{"sl":37}],"name":"testShortWithEqual","pass":true,"statements":[]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [], [], [], [], [186], [], [], [], [], [11], [], [], [], [], [18], [], [], [], [], [181], [], [], [], []]
