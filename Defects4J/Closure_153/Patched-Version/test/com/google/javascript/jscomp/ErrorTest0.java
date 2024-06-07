package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.io.PrintStream printStream1 = null;
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode5 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode5);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode8 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode8);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode5, (com.google.javascript.rhino.Node) scriptOrFnNode8);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants14 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler12, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler2, node10, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap17 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions16);
        compilerOptions16.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler2.options = compilerOptions16;
        com.google.javascript.rhino.Node node21 = compiler2.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList22 = compiler2.getInputsForTesting();
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter23 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler2);
        com.google.javascript.jscomp.SourceExcerptProvider sourceExcerptProvider24 = lightweightMessageFormatter23.getSource();
        com.google.javascript.jscomp.SourceExcerptProvider sourceExcerptProvider25 = lightweightMessageFormatter23.getSource();
        // during test generation this statement threw an exception of type junit.framework.AssertionFailedError in error
        junit.framework.Assert.assertNull("error reporter", (java.lang.Object) lightweightMessageFormatter23);
    }
}

