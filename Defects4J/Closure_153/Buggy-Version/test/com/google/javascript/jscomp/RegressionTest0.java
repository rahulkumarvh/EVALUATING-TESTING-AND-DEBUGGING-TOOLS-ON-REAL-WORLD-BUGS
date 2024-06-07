package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize normalize2 = new com.google.javascript.jscomp.Normalize(abstractCompiler0, false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(abstractCompiler0, "", "\"JSCompiler_renameProperty\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CheckLevel checkLevel1 = null;
        com.google.javascript.jscomp.VariableReferenceCheck variableReferenceCheck2 = new com.google.javascript.jscomp.VariableReferenceCheck(abstractCompiler0, checkLevel1);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode5 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode5);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode8 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode8);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode5, (com.google.javascript.rhino.Node) scriptOrFnNode8);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        boolean boolean15 = jSTypeRegistry13.hasNamespace("JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node17 = jSTypeRegistry13.createOptionalParameters(jSTypeArray16);
        com.google.javascript.rhino.Node node18 = node11.clonePropsFrom(node17);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode20 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode20);
        boolean boolean23 = scriptOrFnNode20.addConst("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        scriptOrFnNode20.setJSType(jSType24);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = scriptOrFnNode20.children();
        // The following exception was thrown during execution in test generation
        try {
            variableReferenceCheck2.process(node11, (com.google.javascript.rhino.Node) scriptOrFnNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodeIterable26);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions1.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = null;
        compilerOptions1.brokenClosureRequiresLevel = checkLevel4;
        compilerOptions1.checkSymbols = false;
        com.google.javascript.jscomp.CheckLevel checkLevel8 = compilerOptions1.checkGlobalThisLevel;
        com.google.javascript.jscomp.VariableReferenceCheck variableReferenceCheck9 = new com.google.javascript.jscomp.VariableReferenceCheck(abstractCompiler0, checkLevel8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            variableReferenceCheck9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel8 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel8.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile17 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset16);
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile20 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset19);
        java.lang.String str21 = jSSourceFile20.getCodeNoCache();
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile24 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset23);
        java.lang.String str25 = jSSourceFile24.getCodeNoCache();
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile28 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset27);
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile31 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset30);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile17, jSSourceFile20, jSSourceFile24, jSSourceFile28, jSSourceFile31 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray33 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.init(jSSourceFileArray32, jSModuleArray33, compilerOptions34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSSourceFile17);
        org.junit.Assert.assertNotNull(jSSourceFile20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(jSSourceFile24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jSSourceFile28);
        org.junit.Assert.assertNotNull(jSSourceFile31);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertNotNull(jSModuleArray33);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler1.getModuleGraph();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput24 = compiler1.getInput("function (): {1029624666}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
        org.junit.Assert.assertNull(jSModuleGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler1.getModuleGraph();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = compiler1.getWarningCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
        org.junit.Assert.assertNull(jSModuleGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        boolean boolean15 = compiler1.hasRegExpGlobalReferences();
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset17);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile21 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset20);
        java.lang.String str22 = jSSourceFile21.getCodeNoCache();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile21 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.inlineConstantVars = true;
        java.util.Set<java.lang.String> strSet27 = compilerOptions24.stripNameSuffixes;
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy28 = compilerOptions24.propertyRenaming;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions24.brokenClosureRequiresLevel;
        java.lang.Object obj30 = compilerOptions24.clone();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result31 = compiler1.compile(jSSourceFile18, jSSourceFileArray23, compilerOptions24);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jSSourceFile18);
        org.junit.Assert.assertNotNull(jSSourceFile21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy28 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy28.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, "", false);
        java.io.PrintStream printStream4 = null;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(printStream4);
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel9 = null;
        compilerOptions6.brokenClosureRequiresLevel = checkLevel9;
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions6.checkGlobalThisLevel;
        com.google.javascript.jscomp.VariableReferenceCheck variableReferenceCheck12 = new com.google.javascript.jscomp.VariableReferenceCheck((com.google.javascript.jscomp.AbstractCompiler) compiler5, checkLevel11);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode15 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode15);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode18 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode18);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode15, (com.google.javascript.rhino.Node) scriptOrFnNode18);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        compiler5.externAndJsRoot = node21;
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter23 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler5);
        compilerInput3.setCompiler((com.google.javascript.jscomp.AbstractCompiler) compiler5);
        com.google.javascript.jscomp.ErrorFormat errorFormat25 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
        java.io.PrintStream printStream26 = null;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler(printStream26);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode30 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode30);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode33 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode33);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode30, (com.google.javascript.rhino.Node) scriptOrFnNode33);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants39 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler37, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler27, node35, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap42 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions41);
        compilerOptions41.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler27.options = compilerOptions41;
        com.google.javascript.rhino.Node node46 = compiler27.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList47 = compiler27.getInputsForTesting();
        com.google.javascript.jscomp.MessageFormatter messageFormatter49 = errorFormat25.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler27, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = compilerInput3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler) compiler27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(errorFormat25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(compilerInputList47);
        org.junit.Assert.assertNotNull(messageFormatter49);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.rhino.Node node20 = compiler1.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList21 = compiler1.getInputsForTesting();
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter22 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(compilerInputList21);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap21 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions20);
        compilerOptions20.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel27 = null;
        compilerOptions24.brokenClosureRequiresLevel = checkLevel27;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions24.checkGlobalThisLevel;
        compilerOptions20.checkRequires = checkLevel29;
        compilerOptions15.checkMethods = checkLevel29;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = compiler1.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        compiler1.addToDebugLog("hi!");
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap22 = compiler1.getFunctionalInformationMap();
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode25 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] { scriptOrFnNode25 };
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray26, 37, 7);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        boolean boolean31 = node30.isLocalResultCall();
        java.lang.String str32 = compiler1.toSource(node30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(functionInformationMap22);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "void 0" + "'", str32, "void 0");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.javascript.jscomp.ErrorFormat errorFormat0 = com.google.javascript.jscomp.ErrorFormat.MULTILINE;
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
        com.google.javascript.jscomp.MessageFormatter messageFormatter24 = errorFormat0.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler2, false);
        java.io.PrintStream printStream25 = null;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel30 = null;
        compilerOptions27.brokenClosureRequiresLevel = checkLevel30;
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions27.checkGlobalThisLevel;
        com.google.javascript.jscomp.VariableReferenceCheck variableReferenceCheck33 = new com.google.javascript.jscomp.VariableReferenceCheck((com.google.javascript.jscomp.AbstractCompiler) compiler26, checkLevel32);
        com.google.javascript.jscomp.CodingConvention codingConvention34 = compiler26.defaultCodingConvention;
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode36 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode36);
        boolean boolean39 = scriptOrFnNode36.addConst("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        scriptOrFnNode36.setJSType(jSType40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr((com.google.javascript.rhino.Node) scriptOrFnNode36);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode45 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] { scriptOrFnNode45 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray46, 37, 7);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        java.lang.String str51 = codingConvention34.extractClassNameIfRequire((com.google.javascript.rhino.Node) scriptOrFnNode36, node49);
        java.lang.String str52 = codingConvention34.getGlobalObject();
        compiler2.defaultCodingConvention = codingConvention34;
        org.junit.Assert.assertNotNull(errorFormat0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(compilerInputList22);
        org.junit.Assert.assertNotNull(messageFormatter24);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(codingConvention34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "goog.global" + "'", str52, "goog.global");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler1.getModuleGraph();
        boolean boolean22 = compiler1.isTypeCheckingEnabled();
        com.google.javascript.jscomp.PassConfig passConfig23 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.setPassConfig(passConfig23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
        org.junit.Assert.assertNull(jSModuleGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.rhino.Node node20 = compiler1.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList21 = compiler1.getInputsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(compilerInputList21);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile22 = com.google.javascript.jscomp.JSSourceFile.fromFile("JSCompiler_renameProperty");
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile25 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset24);
        java.lang.String str26 = jSSourceFile25.getCodeNoCache();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile28 = com.google.javascript.jscomp.JSSourceFile.fromFile("JSCompiler_renameProperty");
        com.google.javascript.jscomp.SourceFile sourceFile30 = com.google.javascript.jscomp.SourceFile.fromFile("(Proxy)");
        com.google.javascript.jscomp.JsAst jsAst31 = new com.google.javascript.jscomp.JsAst(sourceFile30);
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile34 = com.google.javascript.jscomp.JSSourceFile.fromFile("(Proxy)", charset33);
        jsAst31.setSourceFile((com.google.javascript.jscomp.SourceFile) jSSourceFile34);
        jSSourceFile34.clearCachedSource();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile22, jSSourceFile25, jSSourceFile28, jSSourceFile34 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray38 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.collapseProperties = true;
        compilerOptions39.coalesceVariableNames = false;
        byte[] byteArray44 = compilerOptions39.inputPropertyMapSerialized;
        boolean boolean45 = compilerOptions39.decomposeExpressions;
        compilerOptions39.sourceMapOutputPath = "Parse error. {0}";
        java.lang.String str48 = compilerOptions39.aliasableGlobals;
        java.util.Set<java.lang.String> strSet49 = compilerOptions39.stripTypePrefixes;
        boolean boolean50 = compilerOptions39.reserveRawExports;
        boolean boolean51 = compilerOptions39.allowLegacyJsMessages;
        compiler1.init(jSSourceFileArray37, jSSourceFileArray38, compilerOptions39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
        org.junit.Assert.assertNotNull(jSSourceFile22);
        org.junit.Assert.assertNotNull(jSSourceFile25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(jSSourceFile28);
        org.junit.Assert.assertNotNull(sourceFile30);
        org.junit.Assert.assertNotNull(jSSourceFile34);
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertNotNull(jSSourceFileArray38);
        org.junit.Assert.assertNull(byteArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = compiler1.getTypeRegistry();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler22 = null;
        compiler1.addChangeHandler(codeChangeHandler22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap26 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions25);
        com.google.javascript.jscomp.ProcessDefines processDefines27 = new com.google.javascript.jscomp.ProcessDefines(abstractCompiler24, strMap26);
        com.google.javascript.jscomp.ProcessDefines processDefines28 = new com.google.javascript.jscomp.ProcessDefines((com.google.javascript.jscomp.AbstractCompiler) compiler1, strMap26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
        org.junit.Assert.assertNotNull(jSTypeRegistry21);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        boolean boolean15 = compiler1.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.CheckLevel checkLevel19 = com.google.javascript.jscomp.CheckLevel.ERROR;
        com.google.javascript.jscomp.DiagnosticType diagnosticType20 = com.google.javascript.jscomp.ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR;
        java.lang.String[] strArray27 = new java.lang.String[] { "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}", "LinkedGraph", "Not declared as a type name", "JSCompiler_renameProperty", "^", "(Proxy)" };
        com.google.javascript.jscomp.JSError jSError28 = com.google.javascript.jscomp.JSError.make("^", (int) (byte) 1, (int) (short) 0, checkLevel19, diagnosticType20, strArray27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap30 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions29);
        compilerOptions29.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel36 = null;
        compilerOptions33.brokenClosureRequiresLevel = checkLevel36;
        com.google.javascript.jscomp.CheckLevel checkLevel38 = compilerOptions33.checkGlobalThisLevel;
        compilerOptions29.checkRequires = checkLevel38;
        java.io.PrintStream printStream40 = null;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(printStream40);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.collapseProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel45 = null;
        compilerOptions42.brokenClosureRequiresLevel = checkLevel45;
        com.google.javascript.jscomp.CheckLevel checkLevel47 = compilerOptions42.checkGlobalThisLevel;
        com.google.javascript.jscomp.VariableReferenceCheck variableReferenceCheck48 = new com.google.javascript.jscomp.VariableReferenceCheck((com.google.javascript.jscomp.AbstractCompiler) compiler41, checkLevel47);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode51 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode51);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode54 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode54);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode51, (com.google.javascript.rhino.Node) scriptOrFnNode54);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        compiler41.externAndJsRoot = node57;
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter59 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler41);
        java.lang.String str60 = jSError28.format(checkLevel38, (com.google.javascript.jscomp.MessageFormatter) lightweightMessageFormatter59);
        int int61 = jSError28.lineNumber;
        int int62 = jSError28.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel63 = compiler1.getErrorLevel(jSError28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(diagnosticType20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(jSError28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel47 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel47.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        boolean boolean15 = compiler1.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = null;
        compiler1.tracker = performanceTracker16;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput19 = compiler1.newExternInput("JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Map<java.lang.String, com.google.javascript.rhino.Node> strMap16 = com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(compilerOptions15);
        compilerOptions15.checkMissingGetCssNameBlacklist = "JSC_UNKNOWN_OVERRIDE: property {0} not defined on any superclass of {1}";
        compiler1.options = compilerOptions15;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups20 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback((com.google.javascript.jscomp.AbstractCompiler) compiler1, behavior21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups20);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        boolean boolean15 = compiler1.hasRegExpGlobalReferences();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeValidator typeValidator16 = compiler1.getTypeValidator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode4 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode4);
        com.google.javascript.rhino.ScriptOrFnNode scriptOrFnNode7 = new com.google.javascript.rhino.ScriptOrFnNode(46);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn((com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(20, (com.google.javascript.rhino.Node) scriptOrFnNode4, (com.google.javascript.rhino.Node) scriptOrFnNode7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants13 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler11, true);
        com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node9, (com.google.javascript.jscomp.NodeTraversal.Callback) verifyConstants13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region17 = compiler1.getSourceRegion("34", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
    }
}
