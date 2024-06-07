var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":138,"id":2188,"methods":[{"el":43,"sc":5,"sl":31},{"el":55,"sc":5,"sl":45},{"el":67,"sc":5,"sl":57},{"el":87,"sc":5,"sl":69},{"el":114,"sc":5,"sl":89},{"el":136,"sc":5,"sl":116}],"name":"ParseRequiredTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_104":{"methods":[{"sl":45}],"name":"testWithRequiredOption","pass":true,"statements":[{"sl":47},{"sl":49},{"sl":51},{"sl":52},{"sl":53},{"sl":54}]},"test_17":{"methods":[{"sl":69}],"name":"testMissingRequiredOption","pass":true,"statements":[{"sl":71},{"sl":73},{"sl":75},{"sl":80},{"sl":81}]},"test_32":{"methods":[{"sl":89}],"name":"testMissingRequiredOptions","pass":true,"statements":[{"sl":91},{"sl":93},{"sl":99},{"sl":101},{"sl":106},{"sl":107},{"sl":108}]},"test_53":{"methods":[{"sl":57}],"name":"testOptionAndRequiredOption","pass":true,"statements":[{"sl":59},{"sl":61},{"sl":63},{"sl":64},{"sl":65},{"sl":66}]},"test_73":{"methods":[{"sl":116}],"name":"testReuseOptionsTwice","pass":true,"statements":[{"sl":118},{"sl":119},{"sl":121},{"sl":124},{"sl":126},{"sl":129}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [104], [], [104], [], [104], [], [104], [104], [104], [104], [], [], [53], [], [53], [], [53], [], [53], [53], [53], [53], [], [], [17], [], [17], [], [17], [], [17], [], [], [], [], [17], [17], [], [], [], [], [], [], [], [32], [], [32], [], [32], [], [], [], [], [], [32], [], [32], [], [], [], [], [32], [32], [32], [], [], [], [], [], [], [], [73], [], [73], [73], [], [73], [], [], [73], [], [73], [], [], [73], [], [], [], [], [], [], [], [], []]
