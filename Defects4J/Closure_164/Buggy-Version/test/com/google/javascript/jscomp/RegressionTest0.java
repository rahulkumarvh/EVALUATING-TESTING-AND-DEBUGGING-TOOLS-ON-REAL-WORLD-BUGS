package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node1.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId1 = node0.getInputId();
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] { node0 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.block(nodeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertNull(inputId1);
        org.junit.Assert.assertNotNull(nodeArray2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.falseNode();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.sheq(node6, node8);
        boolean boolean10 = node9.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, node4, node9, node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean19 = node18.isLabelName();
        int int21 = node18.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId24 = node23.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean27 = node26.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression29 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry25, node26, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType30 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry22, node23, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.falseNode();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node2, node16, node18, node23, node32 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.switchNode(node1, nodeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeArray33);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy0 = com.google.javascript.jscomp.VariableRenamingPolicy.OFF;
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy0 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy0.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.Node node9 = node1.cloneNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.sheq(node11, node13);
        boolean boolean15 = node14.isInc();
        boolean boolean16 = node14.isAnd();
        node14.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.caseNode(node1, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry0, node1, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry5, node6, "hi!");
        boolean boolean10 = unresolvedTypeExpression4.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        java.lang.String str18 = unresolvedTypeExpression17.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId21 = node20.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType27 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry19, node20, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.IndexedType indexedType28 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry12, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        boolean boolean29 = indexedType28.matchesNumberContext();
        boolean boolean30 = indexedType28.isInterface();
        boolean boolean31 = indexedType28.detectImplicitPrototypeCycle();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.sheq(node33, node35);
        node33.setLineno(36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.sheq(node40, node42);
        boolean boolean44 = node43.isInc();
        boolean boolean45 = node43.isAnd();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node48 = node33.srcrefTree(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = unresolvedTypeExpression9.defineInferredProperty("hi!", (com.google.javascript.rhino.jstype.JSType) indexedType28, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "?" + "'", str18, "?");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry0, node1, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        com.google.javascript.jscomp.parsing.Config config12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode6, false, (java.util.Set<java.lang.String>) strSet10);
        unresolvedTypeExpression4.collectPropertyNames((java.util.Set<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(config12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("NUMBER 10.0\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        boolean boolean2 = node1.isSwitch();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        boolean boolean17 = unresolvedTypeExpression14.isPropertyTypeDeclared("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType18 = arrowType8.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        int int12 = jSError11.getCharno();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        java.lang.String str5 = node3.toString();
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NUMBER 10.0" + "'", str5, "NUMBER 10.0");
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        node1.setLineno(36);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.sheq(node8, node10);
        boolean boolean12 = node11.isInc();
        boolean boolean13 = node11.isAnd();
        node11.setOptionalArg(false);
        com.google.javascript.rhino.Node node16 = node1.srcrefTree(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node11);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.falseNode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId21 = node20.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType27 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry19, node20, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.sheq(node34, node36);
        boolean boolean38 = node37.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, node32, node37, node40, node44);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.Node node51 = node44.useSourceInfoIfMissingFrom(node47);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] { node18, node20, node30, node51, node52 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.newNode(node11, nodeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeArray53);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("hi!", "");
        java.lang.String str3 = jSSourceFile2.toString();
        org.junit.Assert.assertNotNull(jSSourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean19 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType18);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        java.lang.String str26 = unresolvedTypeExpression25.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.IndexedType indexedType36 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry20, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression25, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.FunctionType functionType37 = unresolvedTypeExpression25.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair38 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) arrowType8, (com.google.javascript.rhino.jstype.JSType) functionType37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = functionType37.isTemplateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "?" + "'", str26, "?");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(functionType37);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        com.google.javascript.jscomp.SourceFile.Builder builder2 = builder0.withOriginalPath("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType17 = unresolvedTypeExpression5.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = enumElementType17.isRecordType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(enumElementType17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.InputId inputId1 = com.google.javascript.jscomp.NodeUtil.getInputId(node0);
        org.junit.Assert.assertNull(inputId1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.isInstanceType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node4.isOptionalArg();
        com.google.javascript.rhino.Node node6 = node4.removeChildren();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.google.javascript.jscomp.CheckLevel checkLevel0 = com.google.javascript.jscomp.CheckLevel.WARNING;
        org.junit.Assert.assertTrue("'" + checkLevel0 + "' != '" + com.google.javascript.jscomp.CheckLevel.WARNING + "'", checkLevel0.equals(com.google.javascript.jscomp.CheckLevel.WARNING));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean17 = arrowType16.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId20 = node19.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType26 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry18, node19, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        boolean boolean27 = arrowType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        java.lang.String str34 = unresolvedTypeExpression33.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId37 = node36.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean40 = node39.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression42 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry38, node39, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType43 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry35, node36, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression42);
        com.google.javascript.rhino.jstype.IndexedType indexedType44 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry28, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression33, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression42);
        boolean boolean45 = indexedType44.matchesNumberContext();
        boolean boolean46 = indexedType44.isInterface();
        boolean boolean47 = indexedType44.detectImplicitPrototypeCycle();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType51 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "?", node6, arrowType26, (com.google.javascript.rhino.jstype.ObjectType) indexedType44, "NUMBER 10.0\n", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "?" + "'", str34, "?");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        java.lang.String str8 = unresolvedTypeExpression7.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId11 = node10.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType17 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry9, node10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.IndexedType indexedType18 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry2, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression7, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType19 = unresolvedTypeExpression7.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType28 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry20, "hi!", (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression26, false);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        java.lang.String str35 = unresolvedTypeExpression34.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId38 = node37.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType44 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry36, node37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.IndexedType indexedType45 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry29, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        boolean boolean46 = unresolvedTypeExpression34.matchesNumberContext();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType48 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention1.applyDelegateRelationship((com.google.javascript.rhino.jstype.ObjectType) enumElementType19, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression26, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, functionType47, functionType48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "?" + "'", str8, "?");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(enumElementType19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "?" + "'", str35, "?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = indexedType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        indexedType16.setJSDocInfo(jSDocInfo31);
        boolean boolean34 = indexedType16.isPropertyTypeInferred("NUMBER 10.0\n");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.NullType nullType1 = new com.google.javascript.rhino.jstype.NullType(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        boolean boolean8 = unresolvedTypeExpression6.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = nullType1.testForEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression6);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(ternaryValue9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.InstanceObjectType instanceObjectType2 = new com.google.javascript.rhino.jstype.InstanceObjectType(jSTypeRegistry0, functionType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType1 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry0);
        boolean boolean2 = booleanType1.isNullable();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry5, node6, "hi!");
        java.lang.String str10 = unresolvedTypeExpression9.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId13 = node12.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean16 = node15.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry14, node15, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType19 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry11, node12, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression18);
        com.google.javascript.rhino.jstype.IndexedType indexedType20 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry4, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression18);
        boolean boolean21 = indexedType20.matchesNumberContext();
        boolean boolean22 = indexedType20.isInterface();
        boolean boolean23 = indexedType20.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType24 = booleanType1.resolveInternal(errorReporter3, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) indexedType20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "?" + "'", str10, "?");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSType24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId18 = node17.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType24 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry16, node17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.IndexedType indexedType25 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression14, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = unresolvedTypeExpression14.getConstructor();
        boolean boolean27 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean30 = node29.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression32 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry28, node29, "hi!");
        java.lang.String str33 = unresolvedTypeExpression32.toAnnotationString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = functionType26.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "?" + "'", str33, "?");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number(100.0d);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry5, node6, "hi!");
        java.lang.String str10 = unresolvedTypeExpression9.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId13 = node12.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean16 = node15.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry14, node15, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType19 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry11, node12, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression18);
        com.google.javascript.rhino.jstype.IndexedType indexedType20 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry4, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression18);
        boolean boolean21 = indexedType20.matchesNumberContext();
        boolean boolean22 = indexedType20.isInterface();
        boolean boolean23 = indexedType20.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean27 = node26.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression29 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry25, node26, "hi!");
        java.lang.String str30 = unresolvedTypeExpression29.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId33 = node32.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType39 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry31, node32, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        com.google.javascript.rhino.jstype.IndexedType indexedType40 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry24, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression29, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        boolean boolean41 = indexedType20.canAssignTo((com.google.javascript.rhino.jstype.JSType) indexedType40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.EnumType enumType42 = new com.google.javascript.rhino.jstype.EnumType(jSTypeRegistry0, "", node3, (com.google.javascript.rhino.jstype.JSType) indexedType40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "?" + "'", str10, "?");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(inputId13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "?" + "'", str30, "?");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = arrowType8.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        java.lang.String str16 = unresolvedTypeExpression15.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId19 = node18.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry20, node21, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType25 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry17, node18, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression24);
        com.google.javascript.rhino.jstype.IndexedType indexedType26 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry10, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression15, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression24);
        boolean boolean27 = indexedType26.matchesNumberContext();
        boolean boolean28 = indexedType26.isInterface();
        boolean boolean30 = indexedType26.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType31 = indexedType26.getParameterType();
        indexedType26.clearCachedValues();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair33 = arrowType8.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) indexedType26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "?" + "'", str16, "?");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jSType31);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        node2.setLineno(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.sheq(node9, node11);
        boolean boolean13 = node12.isInc();
        boolean boolean14 = node12.isAnd();
        node12.setOptionalArg(false);
        com.google.javascript.rhino.Node node17 = node2.srcrefTree(node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node12);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.sheq(node20, node22);
        node20.setLineno(36);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.sheq(node27, node29);
        boolean boolean31 = node30.isInc();
        boolean boolean32 = node30.isAnd();
        node30.setOptionalArg(false);
        com.google.javascript.rhino.Node node35 = node20.srcrefTree(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node30);
        node12.addChildrenToBack(node30);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.sheq(node41, node43);
        boolean boolean45 = node44.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 0, node39, node44, node47, node51);
        boolean boolean53 = node39.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind54 = new com.google.javascript.jscomp.CodingConvention.Bind(node0, node30, node39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.IR.returnNode(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.google.javascript.jscomp.CompilerOptions.Reach reach0 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        org.junit.Assert.assertTrue("'" + reach0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach0.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = com.google.javascript.rhino.Node.LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 52 + "'", int0 == 52);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        java.lang.String str27 = unresolvedTypeExpression26.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId30 = node29.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean33 = node32.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression35 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry31, node32, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType36 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry28, node29, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression35);
        com.google.javascript.rhino.jstype.IndexedType indexedType37 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry21, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression35);
        boolean boolean38 = indexedType37.matchesNumberContext();
        boolean boolean39 = indexedType37.isInterface();
        boolean boolean40 = indexedType37.detectImplicitPrototypeCycle();
        boolean boolean42 = indexedType37.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean45 = node44.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression47 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry43, node44, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode49 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        com.google.javascript.jscomp.parsing.Config config55 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode49, false, (java.util.Set<java.lang.String>) strSet53);
        unresolvedTypeExpression47.collectPropertyNames((java.util.Set<java.lang.String>) strSet53);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = unresolvedTypeExpression47.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair58 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression47);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = indexedType16.defineInferredProperty("", (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression47, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "?" + "'", str27, "?");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(config55);
        org.junit.Assert.assertNotNull(objectType57);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.Node node9 = node1.cloneNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.regexp(node9, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        java.lang.String str24 = unresolvedTypeExpression23.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId27 = node26.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean30 = node29.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression32 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry28, node29, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType33 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry25, node26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.IndexedType indexedType34 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry18, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression23, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = unresolvedTypeExpression23.toMaybeEnumElementType();
        boolean boolean37 = unresolvedTypeExpression23.hasProperty("goog.global");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.sheq(node41, node43);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError50 = com.google.javascript.jscomp.JSError.make("hi!", node43, checkLevel45, diagnosticType48, strArray49);
        boolean boolean51 = node43.isCatch();
        boolean boolean52 = unresolvedTypeExpression5.defineProperty("", (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23, false, node43);
        com.google.javascript.rhino.Node node53 = node43.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "?" + "'", str24, "?");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry8, node9, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, node1, node6, node9, node13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.Node node20 = node13.useSourceInfoIfMissingFrom(node16);
        boolean boolean21 = node20.isFor();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        java.lang.String str44 = unresolvedTypeExpression43.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean50 = node49.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression52 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry48, node49, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType53 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry45, node46, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        com.google.javascript.rhino.jstype.IndexedType indexedType54 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry38, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression43, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        boolean boolean55 = indexedType54.matchesNumberContext();
        boolean boolean56 = indexedType54.isInterface();
        boolean boolean58 = indexedType54.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType59 = indexedType54.getParameterType();
        indexedType54.clearCachedValues();
        boolean boolean61 = indexedType54.isNoResolvedType();
        boolean boolean62 = indexedType16.canAssignTo((com.google.javascript.rhino.jstype.JSType) indexedType54);
        boolean boolean63 = indexedType54.isConstructor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "?" + "'", str44, "?");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityDiGraphNode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeList2 = priorityLinkedDirectedGraph0.getNeighborNodes(priorityDiGraphNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Scope scope2 = compiler1.getTopScope();
        org.junit.Assert.assertNull(scope2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = indexedType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean34 = node33.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression36 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry32, node33, "hi!");
        java.lang.String str37 = unresolvedTypeExpression36.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId40 = node39.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean43 = node42.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression45 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry41, node42, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType46 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry38, node39, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression45);
        com.google.javascript.rhino.jstype.IndexedType indexedType47 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry31, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression36, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression45);
        boolean boolean48 = indexedType47.matchesNumberContext();
        boolean boolean50 = indexedType47.hasProperty("./");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType51 = unresolvedTypeExpression28.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) indexedType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "?" + "'", str37, "?");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node3.isQualifiedName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 100, "goog.global");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean11 = node10.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry9, node10, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 0, node2, node7, node10, node14);
        boolean boolean16 = node2.isSwitch();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(30, node2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId18 = node17.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType24 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry16, node17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.IndexedType indexedType25 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression14, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = unresolvedTypeExpression14.getConstructor();
        boolean boolean27 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = arrowType8.getPossibleToBooleanOutcomes();
        boolean boolean29 = arrowType8.returnTypeInferred;
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        boolean boolean10 = arrowType8.isBooleanObjectType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        java.lang.String str8 = unresolvedTypeExpression7.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId11 = node10.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType17 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry9, node10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.IndexedType indexedType18 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry2, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression7, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        boolean boolean19 = indexedType18.matchesNumberContext();
        boolean boolean20 = indexedType18.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType22 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry0, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        prototypeObjectType22.setImplicitPrototype(objectType23);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "?" + "'", str8, "?");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        boolean boolean11 = unresolvedTypeExpression5.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression10);
        boolean boolean12 = unresolvedTypeExpression10.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair13 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        java.lang.String str3 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.sheq(node7, node9);
        boolean boolean11 = node10.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, node5, node10, node13, node17);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFrom(node20);
        boolean boolean25 = closureCodingConvention1.isOptionalParameter(node24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType18 = indexedType16.getIndexType();
        java.lang.String str20 = indexedType16.toStringHelper(true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "?" + "'", str20, "?");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.breakNode();
        boolean boolean1 = node0.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = indexedType16.getOwnPropertyJSDocInfo("NUMBER 10.0");
        com.google.javascript.rhino.Node node20 = indexedType16.getPropertyNode("hi!");
        java.lang.String str21 = indexedType16.getReferenceName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "?" + "'", str21, "?");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        node1.setLineno(36);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.sheq(node8, node10);
        boolean boolean12 = node11.isInc();
        boolean boolean13 = node11.isAnd();
        node11.setOptionalArg(false);
        com.google.javascript.rhino.Node node16 = node1.srcrefTree(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node11);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.sheq(node19, node21);
        node19.setLineno(36);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.sheq(node26, node28);
        boolean boolean30 = node29.isInc();
        boolean boolean31 = node29.isAnd();
        node29.setOptionalArg(false);
        com.google.javascript.rhino.Node node34 = node19.srcrefTree(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node29);
        node11.addChildrenToBack(node29);
        java.lang.String str40 = node11.toString(true, true, false);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "SHEQ" + "'", str40, "SHEQ");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean19 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType18);
        boolean boolean20 = arrowType8.isNullType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = arrowType29.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId33 = node32.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType39 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry31, node32, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        boolean boolean40 = arrowType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType39);
        boolean boolean41 = arrowType8.hasEqualParameters(arrowType39);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        boolean boolean38 = indexedType16.isNoType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        boolean boolean6 = node5.isOptionalArg();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.sheq(node8, node10);
        boolean boolean12 = node8.isAdd();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.sheq(node16, node18);
        boolean boolean20 = node19.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 0, node14, node19, node22, node26);
        com.google.javascript.rhino.Node node28 = node8.srcref(node26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.sheq(node30, node32);
        boolean boolean34 = node33.isOptionalArg();
        boolean boolean35 = node28.hasChild(node33);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(50, node5, node33, (int) (byte) 10, 39);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$" + "'", str1, "module$");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean19 = indexedType16.hasProperty("./");
        boolean boolean20 = indexedType16.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node4.isInc();
        int int6 = node4.getSourceOffset();
        boolean boolean7 = node4.isTry();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType3 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry2);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = unresolvedTypeExpression10.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType23 = booleanType3.resolveInternal(errorReporter4, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) unresolvedTypeExpression10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = functionParamBuilder1.addVarArgs((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSType23);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean19 = indexedType16.hasProperty("./");
        java.lang.String str20 = indexedType16.getDisplayName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "?" + "'", str20, "?");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Scope scope2 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.sheq(node5, node7);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType12 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError14 = com.google.javascript.jscomp.JSError.make("hi!", node7, checkLevel9, diagnosticType12, strArray13);
        java.lang.String str15 = jSError14.description;
        compiler1.report(jSError14);
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = compiler1.toSourceArray(jSModule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(diagnosticType12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(jSError14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry0, node1, "hi!");
        java.lang.String str5 = unresolvedTypeExpression4.toAnnotationString();
        boolean boolean7 = unresolvedTypeExpression4.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType8 = unresolvedTypeExpression4.getIndexType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId11 = node10.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType17 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry9, node10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.JSType jSType18 = unresolvedTypeExpression16.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType20 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry19);
        boolean boolean21 = booleanType20.matchesStringContext();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanType20.getPossibleToBooleanOutcomes();
        boolean boolean23 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(jSType18, (com.google.javascript.rhino.jstype.JSType) booleanType20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId26 = node25.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType32 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry24, node25, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.JSType jSType33 = unresolvedTypeExpression31.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        java.lang.String str39 = unresolvedTypeExpression38.toAnnotationString();
        boolean boolean41 = unresolvedTypeExpression38.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType42 = unresolvedTypeExpression38.getIndexType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = jSType18.testForEqualityHelper(jSType33, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair44 = jSType8.getTypesUnderShallowInequality(jSType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "?" + "'", str5, "?");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(inputId26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "?" + "'", str39, "?");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(ternaryValue43);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry0, node1, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        com.google.javascript.jscomp.parsing.Config config12 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode6, false, (java.util.Set<java.lang.String>) strSet10);
        unresolvedTypeExpression4.collectPropertyNames((java.util.Set<java.lang.String>) strSet10);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = unresolvedTypeExpression4.toObjectType();
        boolean boolean15 = objectType14.isUnionType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(config12);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.falseNode();
        com.google.javascript.jscomp.NodeTraversal.Callback callback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler) compiler1, node2, callback3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        java.lang.String str24 = unresolvedTypeExpression23.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId27 = node26.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean30 = node29.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression32 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry28, node29, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType33 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry25, node26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.IndexedType indexedType34 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry18, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression23, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = unresolvedTypeExpression23.toMaybeEnumElementType();
        boolean boolean37 = unresolvedTypeExpression23.hasProperty("goog.global");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.sheq(node41, node43);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError50 = com.google.javascript.jscomp.JSError.make("hi!", node43, checkLevel45, diagnosticType48, strArray49);
        boolean boolean51 = node43.isCatch();
        boolean boolean52 = unresolvedTypeExpression5.defineProperty("", (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23, false, node43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.neg(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "?" + "'", str24, "?");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative0 = com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
        org.junit.Assert.assertTrue("'" + jSTypeNative0 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE + "'", jSTypeNative0.equals(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry8, node9, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, node1, node6, node9, node13);
        boolean boolean15 = node6.isTrue();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean1 = node0.isLabelName();
        int int3 = node0.getIntProp((int) (byte) -1);
        boolean boolean4 = node0.isCase();
        node0.setSourceFileForTesting("");
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry0, "hi!", (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, false);
        java.lang.String str9 = prototypeObjectType8.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        java.lang.String str17 = unresolvedTypeExpression16.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId20 = node19.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType26 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry18, node19, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        com.google.javascript.rhino.jstype.IndexedType indexedType27 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry11, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        boolean boolean28 = indexedType27.matchesNumberContext();
        boolean boolean29 = indexedType27.isInterface();
        boolean boolean30 = indexedType27.detectImplicitPrototypeCycle();
        boolean boolean32 = indexedType27.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean35 = node34.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression37 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry33, node34, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode39 = null;
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        com.google.javascript.jscomp.parsing.Config config45 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode39, false, (java.util.Set<java.lang.String>) strSet43);
        unresolvedTypeExpression37.collectPropertyNames((java.util.Set<java.lang.String>) strSet43);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = unresolvedTypeExpression37.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair48 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression37);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean52 = node51.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression54 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry50, node51, "hi!");
        java.lang.String str55 = unresolvedTypeExpression54.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId58 = node57.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean61 = node60.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression63 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry59, node60, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType64 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry56, node57, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression63);
        com.google.javascript.rhino.jstype.IndexedType indexedType65 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry49, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression54, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression63);
        boolean boolean66 = indexedType65.matchesNumberContext();
        boolean boolean67 = indexedType65.isInterface();
        boolean boolean69 = indexedType65.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType70 = indexedType65.getParameterType();
        indexedType65.clearCachedValues();
        boolean boolean72 = indexedType65.isNoResolvedType();
        boolean boolean73 = indexedType27.canAssignTo((com.google.javascript.rhino.jstype.JSType) indexedType65);
        com.google.javascript.rhino.jstype.JSType jSType75 = indexedType27.getPropertyType("module$");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType76 = prototypeObjectType8.resolveInternal(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) indexedType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(config45);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "?" + "'", str55, "?");
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(inputId58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jSType75);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int0 = com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 38 + "'", int0 == 38);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType1 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry4, node5, "hi!");
        java.lang.String str9 = unresolvedTypeExpression8.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        com.google.javascript.rhino.jstype.IndexedType indexedType19 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry3, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean20 = unresolvedTypeExpression8.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType21 = booleanType1.resolveInternal(errorReporter2, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) unresolvedTypeExpression8);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean25 = node24.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression27 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry23, node24, "hi!");
        java.lang.String str28 = unresolvedTypeExpression27.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId31 = node30.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean34 = node33.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression36 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry32, node33, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType37 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry29, node30, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression36);
        com.google.javascript.rhino.jstype.IndexedType indexedType38 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry22, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = unresolvedTypeExpression27.getConstructor();
        unresolvedTypeExpression27.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean44 = node43.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression46 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry42, node43, "hi!");
        java.lang.String str47 = unresolvedTypeExpression46.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId50 = node49.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean53 = node52.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression55 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry51, node52, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType56 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry48, node49, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression55);
        com.google.javascript.rhino.jstype.IndexedType indexedType57 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry41, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression46, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression55);
        boolean boolean58 = indexedType57.matchesNumberContext();
        boolean boolean59 = unresolvedTypeExpression27.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType57);
        com.google.javascript.rhino.Node node61 = indexedType57.getPropertyNode("hi!");
        com.google.javascript.rhino.Node node63 = indexedType57.getPropertyNode("SHEQ");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType64 = unresolvedTypeExpression8.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) indexedType57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "?" + "'", str28, "?");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(functionType39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "?" + "'", str47, "?");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(inputId50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeCollection1 = priorityLinkedDirectedGraph0.getNodes();
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityDiGraphNode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityDiGraphNodeList3 = priorityLinkedDirectedGraph0.getDirectedPredNodes(priorityDiGraphNode2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(priorityGraphNodeCollection1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler1.getCodingConvention();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry0, "hi!", (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, false);
        unresolvedTypeExpression6.clearResolved();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        java.lang.String str17 = unresolvedTypeExpression16.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId20 = node19.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType26 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry18, node19, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        com.google.javascript.rhino.jstype.IndexedType indexedType27 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry11, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        boolean boolean28 = indexedType27.matchesNumberContext();
        indexedType27.clearCachedValues();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType30 = unresolvedTypeExpression6.resolveInternal(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) indexedType27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = unresolvedTypeExpression5.getConstructor();
        unresolvedTypeExpression5.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry20, node21, "hi!");
        java.lang.String str25 = unresolvedTypeExpression24.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId28 = node27.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType34 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry26, node27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.IndexedType indexedType35 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry19, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression24, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        boolean boolean36 = indexedType35.matchesNumberContext();
        boolean boolean37 = unresolvedTypeExpression5.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType35);
        com.google.javascript.rhino.Node node39 = indexedType35.getPropertyNode("hi!");
        java.lang.String str40 = indexedType35.getReferenceName();
        boolean boolean41 = indexedType35.matchesUint32Context();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "?" + "'", str25, "?");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "?" + "'", str40, "?");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeCollection1 = priorityLinkedDirectedGraph0.getNodes();
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority3 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityDiGraphNode4 = priorityLinkedDirectedGraph2.createDirectedGraphNode(priority3);
        boolean boolean5 = priorityLinkedDirectedGraph0.hasNode(priority3);
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(priorityGraphNodeCollection1);
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph2);
        org.junit.Assert.assertTrue("'" + priority3 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC + "'", priority3.equals(com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC));
        org.junit.Assert.assertNotNull(priorityDiGraphNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy0 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF;
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy0 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy0.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = indexedType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        indexedType16.setJSDocInfo(jSDocInfo31);
        boolean boolean33 = indexedType16.isStringObjectType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        int int12 = jSError11.lineNumber;
        com.google.javascript.jscomp.DiagnosticType diagnosticType15 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        com.google.javascript.jscomp.CheckLevel checkLevel16 = com.google.javascript.jscomp.CheckLevel.WARNING;
        diagnosticType15.level = checkLevel16;
        com.google.javascript.jscomp.MessageFormatter messageFormatter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = jSError11.format(checkLevel16, messageFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(diagnosticType15);
        org.junit.Assert.assertTrue("'" + checkLevel16 + "' != '" + com.google.javascript.jscomp.CheckLevel.WARNING + "'", checkLevel16.equals(com.google.javascript.jscomp.CheckLevel.WARNING));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.UnionTypeBuilder unionTypeBuilder1 = new com.google.javascript.rhino.jstype.UnionTypeBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        java.lang.String str8 = unresolvedTypeExpression7.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId11 = node10.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType17 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry9, node10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.IndexedType indexedType18 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry2, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression7, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        boolean boolean19 = indexedType18.matchesNumberContext();
        boolean boolean20 = indexedType18.isInterface();
        boolean boolean22 = indexedType18.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType23 = indexedType18.getParameterType();
        indexedType18.clearCachedValues();
        boolean boolean25 = indexedType18.isNoResolvedType();
        boolean boolean27 = indexedType18.hasOwnDeclaredProperty("NUMBER 10.0");
        com.google.javascript.rhino.jstype.UnionTypeBuilder unionTypeBuilder28 = unionTypeBuilder1.addAlternate((com.google.javascript.rhino.jstype.JSType) indexedType18);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "?" + "'", str8, "?");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unionTypeBuilder28);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry8, node9, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, node1, node6, node9, node13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.Node node20 = node13.useSourceInfoIfMissingFrom(node16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.defaultCase(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.UnionTypeBuilder unionTypeBuilder27 = new com.google.javascript.rhino.jstype.UnionTypeBuilder(jSTypeRegistry1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean2 = node1.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression4 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry0, node1, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry5, node6, "hi!");
        java.lang.String str10 = unresolvedTypeExpression9.toAnnotationString();
        boolean boolean12 = unresolvedTypeExpression9.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType13 = unresolvedTypeExpression9.getIndexType();
        boolean boolean14 = unresolvedTypeExpression4.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression9);
        boolean boolean15 = unresolvedTypeExpression4.matchesStringContext();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "?" + "'", str10, "?");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean20 = indexedType16.isNativeObjectType();
        boolean boolean21 = indexedType16.isUnknownType();
        boolean boolean22 = indexedType16.matchesStringContext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int0 = com.google.javascript.rhino.Node.DIRECTIVES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        com.google.javascript.rhino.Node node3 = nodeTraversal2.getCurrentNode();
        com.google.javascript.jscomp.Scope scope4 = nodeTraversal2.getScope();
        int int5 = nodeTraversal2.getLineNumber();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.NullType nullType1 = new com.google.javascript.rhino.jstype.NullType(jSTypeRegistry0);
        boolean boolean2 = nullType1.matchesNumberContext();
        boolean boolean3 = nullType1.isVoidType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        boolean boolean12 = node4.isCatch();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.sheq(node15, node17);
        node15.setLineno(36);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.sheq(node22, node24);
        boolean boolean26 = node25.isInc();
        boolean boolean27 = node25.isAnd();
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node node30 = node15.srcrefTree(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.sheq(node33, node35);
        node33.setLineno(36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.sheq(node40, node42);
        boolean boolean44 = node43.isInc();
        boolean boolean45 = node43.isAnd();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node48 = node33.srcrefTree(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        node25.addChildrenToBack(node43);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.sheq(node54, node56);
        boolean boolean58 = node57.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean61 = node60.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression63 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry59, node60, "hi!");
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 0, node52, node57, node60, node64);
        boolean boolean66 = node52.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind67 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node43, node52);
        com.google.javascript.rhino.Node node68 = node4.useSourceInfoIfMissingFrom(node52);
        boolean boolean69 = node52.isVoid();
        boolean boolean70 = node52.isNumber();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId73 = node72.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean76 = node75.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression78 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry74, node75, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType79 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry71, node72, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression78);
        com.google.javascript.rhino.Node node80 = node72.cloneNode();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.IR.sheq(node82, node84);
        node82.setLineno(36);
        boolean boolean88 = node82.isFor();
        node52.addChildAfter(node72, node82);
        boolean boolean90 = node52.isEmpty();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(inputId73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Scope scope2 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.sheq(node5, node7);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType12 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError14 = com.google.javascript.jscomp.JSError.make("hi!", node7, checkLevel9, diagnosticType12, strArray13);
        java.lang.String str15 = jSError14.description;
        compiler1.report(jSError14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = compiler1.getSourceLine("", 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(diagnosticType12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(jSError14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        java.lang.String str44 = unresolvedTypeExpression43.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean50 = node49.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression52 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry48, node49, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType53 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry45, node46, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        com.google.javascript.rhino.jstype.IndexedType indexedType54 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry38, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression43, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        boolean boolean55 = indexedType54.matchesNumberContext();
        boolean boolean56 = indexedType54.isInterface();
        boolean boolean58 = indexedType54.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType59 = indexedType54.getParameterType();
        indexedType54.clearCachedValues();
        boolean boolean61 = indexedType54.isNoResolvedType();
        boolean boolean62 = indexedType16.canAssignTo((com.google.javascript.rhino.jstype.JSType) indexedType54);
        com.google.javascript.rhino.jstype.JSType jSType63 = indexedType16.getReferencedTypeInternal();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "?" + "'", str44, "?");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSType63);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean20 = indexedType16.isNativeObjectType();
        boolean boolean21 = indexedType16.isUnknownType();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = indexedType16.getConstructor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(functionType22);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType1 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry4, node5, "hi!");
        java.lang.String str9 = unresolvedTypeExpression8.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        com.google.javascript.rhino.jstype.IndexedType indexedType19 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry3, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean20 = unresolvedTypeExpression8.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType21 = booleanType1.resolveInternal(errorReporter2, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) unresolvedTypeExpression8);
        boolean boolean22 = booleanType1.isOrdinaryFunction();
        boolean boolean23 = booleanType1.isNumberValueType();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry8, node9, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, node1, node6, node9, node13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.thisNode();
        node13.addChildrenToFront(node15);
        boolean boolean17 = node15.isArrayLit();
        boolean boolean18 = node15.isTry();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        com.google.javascript.rhino.jstype.IndexedType indexedType17 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean18 = indexedType17.matchesNumberContext();
        boolean boolean19 = indexedType17.isInterface();
        boolean boolean21 = indexedType17.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        boolean boolean32 = unresolvedTypeExpression26.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) indexedType17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType33.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType33.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType33.findPropertyType("goog.exportProperty");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(jSType37);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("NUMBER 10.0\n");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry1.createNamedType("./", "NUMBER 10.0", 39, (int) (byte) 1);
        boolean boolean63 = jSTypeRegistry1.isForwardDeclaredType("null");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.createUnionType(jSTypeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType8 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry0, "hi!", (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, false);
        java.lang.String str9 = prototypeObjectType8.getReferenceName();
        com.google.javascript.jscomp.CodingConvention codingConvention10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention10);
        java.lang.String str12 = closureCodingConvention11.getGlobalObject();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.sheq(node14, node16);
        boolean boolean18 = node17.isInc();
        boolean boolean19 = node17.isAnd();
        node17.setOptionalArg(false);
        java.util.List<java.lang.String> strList22 = closureCodingConvention11.identifyTypeDeclarationCall(node17);
        java.lang.String str23 = closureCodingConvention11.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = jSTypeRegistry25.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType28 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry25);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType30 = null;
        closureCodingConvention11.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType28, functionType29, subclassType30);
        prototypeObjectType8.setOwnerFunction(functionType29);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.abstractMethod" + "'", str23, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable27);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry1.createNamedType("./", "NUMBER 10.0", 39, (int) (byte) 1);
        boolean boolean63 = jSTypeRegistry1.isForwardDeclaredType("null");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative65 = com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec66 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("./", jSTypeNative65);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.jstype.InstanceObjectType cannot be cast to com.google.javascript.rhino.jstype.FunctionType");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + jSTypeNative65 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE + "'", jSTypeNative65.equals(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType1 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry4, node5, "hi!");
        java.lang.String str9 = unresolvedTypeExpression8.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        com.google.javascript.rhino.jstype.IndexedType indexedType19 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry3, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean20 = unresolvedTypeExpression8.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType21 = booleanType1.resolveInternal(errorReporter2, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) unresolvedTypeExpression8);
        boolean boolean22 = unresolvedTypeExpression8.isStringValueType();
        java.lang.String str24 = unresolvedTypeExpression8.toStringHelper(true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "?" + "'", str24, "?");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.Compiler.CodeBuilder, com.google.javascript.jscomp.VariableRenamingPolicy> codeBuilderLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
        org.junit.Assert.assertNotNull(codeBuilderLinkedDirectedGraph0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        boolean boolean29 = noType26.isPropertyTypeInferred("?");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId21 = node20.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType27 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry19, node20, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.JSType jSType28 = unresolvedTypeExpression26.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        java.lang.String str39 = unresolvedTypeExpression38.toAnnotationString();
        boolean boolean41 = unresolvedTypeExpression38.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType42 = unresolvedTypeExpression38.getIndexType();
        boolean boolean43 = unresolvedTypeExpression33.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        boolean boolean44 = unresolvedTypeExpression26.canAssignTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        java.lang.String str51 = unresolvedTypeExpression50.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId54 = node53.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean57 = node56.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression59 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry55, node56, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType60 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry52, node53, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.IndexedType indexedType61 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry45, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression50, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        boolean boolean62 = indexedType61.matchesNumberContext();
        boolean boolean63 = indexedType61.isInterface();
        boolean boolean65 = indexedType61.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = unresolvedTypeExpression33.testForEquality((com.google.javascript.rhino.jstype.JSType) indexedType61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = indexedType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "?" + "'", str39, "?");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "?" + "'", str51, "?");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(inputId54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        boolean boolean12 = node4.isCatch();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.sheq(node15, node17);
        node15.setLineno(36);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.sheq(node22, node24);
        boolean boolean26 = node25.isInc();
        boolean boolean27 = node25.isAnd();
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node node30 = node15.srcrefTree(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.sheq(node33, node35);
        node33.setLineno(36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.sheq(node40, node42);
        boolean boolean44 = node43.isInc();
        boolean boolean45 = node43.isAnd();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node48 = node33.srcrefTree(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        node25.addChildrenToBack(node43);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.sheq(node54, node56);
        boolean boolean58 = node57.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean61 = node60.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression63 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry59, node60, "hi!");
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 0, node52, node57, node60, node64);
        boolean boolean66 = node52.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind67 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node43, node52);
        com.google.javascript.rhino.Node node68 = node4.useSourceInfoIfMissingFrom(node52);
        boolean boolean69 = node52.isVoid();
        boolean boolean70 = node52.isNumber();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId73 = node72.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean76 = node75.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression78 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry74, node75, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType79 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry71, node72, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression78);
        com.google.javascript.rhino.Node node80 = node72.cloneNode();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.IR.sheq(node82, node84);
        node82.setLineno(36);
        boolean boolean88 = node82.isFor();
        node52.addChildAfter(node72, node82);
        com.google.javascript.jscomp.SourceFile.Builder builder90 = com.google.javascript.jscomp.SourceFile.builder();
        com.google.javascript.jscomp.SourceFile sourceFile93 = builder90.buildFromCode("hi!", "");
        java.io.Reader reader94 = sourceFile93.getCodeReader();
        node52.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile) sourceFile93);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(inputId73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(sourceFile93);
        org.junit.Assert.assertNotNull(reader94);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType1 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry4, node5, "hi!");
        java.lang.String str9 = unresolvedTypeExpression8.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        com.google.javascript.rhino.jstype.IndexedType indexedType19 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry3, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean20 = unresolvedTypeExpression8.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType21 = booleanType1.resolveInternal(errorReporter2, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) unresolvedTypeExpression8);
        boolean boolean22 = unresolvedTypeExpression8.isStringValueType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = unresolvedTypeExpression8.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet24 = unresolvedTypeExpression8.getOwnPropertyNames();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int0 = com.google.javascript.rhino.Node.JSDOC_INFO_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number(100.0d);
        boolean boolean2 = node1.isFromExterns();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.sheq(node6, node8);
        boolean boolean10 = node9.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, node4, node9, node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.thisNode();
        node16.addChildrenToFront(node18);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId22 = node21.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean25 = node24.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression27 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry23, node24, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType28 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry20, node21, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression27);
        java.lang.String str29 = closureCodingConvention1.extractClassNameIfRequire(node18, node21);
        com.google.javascript.rhino.Node node30 = node18.getLastSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.google.javascript.jscomp.SourceAst sourceAst0 = null;
        com.google.javascript.rhino.InputId inputId1 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(sourceAst0, inputId1, true);
        com.google.javascript.jscomp.SourceAst sourceAst4 = compilerInput3.getAst();
        com.google.javascript.jscomp.SourceFile sourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerInput3.setSourceFile(sourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceAst4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.google.javascript.jscomp.SourceFile.Builder builder1 = com.google.javascript.jscomp.SourceFile.builder();
        com.google.javascript.jscomp.SourceFile sourceFile4 = builder1.buildFromCode("hi!", "");
        java.lang.String str5 = sourceFile4.toString();
        java.io.Reader reader6 = sourceFile4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("?", reader6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = indexedType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        java.lang.String str31 = unresolvedTypeExpression28.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = unresolvedTypeExpression28.getPossibleToBooleanOutcomes();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "?" + "'", str31, "?");
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Scope scope2 = compiler1.getTopScope();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.sheq(node5, node7);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType12 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError14 = com.google.javascript.jscomp.JSError.make("hi!", node7, checkLevel9, diagnosticType12, strArray13);
        java.lang.String str15 = jSError14.description;
        compiler1.report(jSError14);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile18 = com.google.javascript.jscomp.JSSourceFile.fromFile("./");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile20 = com.google.javascript.jscomp.JSSourceFile.fromFile("./");
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result22 = compiler1.compile(jSSourceFile18, jSSourceFile20, compilerOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(diagnosticType12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(jSError14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jSSourceFile18);
        org.junit.Assert.assertNotNull(jSSourceFile20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int0 = com.google.javascript.rhino.Node.FLAG_THIS_UNMODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        java.lang.String str28 = noType18.getReferenceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        com.google.javascript.jscomp.CodingConvention codingConvention88 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention89 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention88);
        java.lang.String str90 = closureCodingConvention89.getGlobalObject();
        java.lang.String str91 = closureCodingConvention89.getGlobalObject();
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean93 = node92.isQuotedString();
        com.google.javascript.rhino.Node node94 = com.google.javascript.rhino.IR.breakNode();
        java.lang.String str95 = closureCodingConvention89.extractClassNameIfProvide(node92, node94);
        boolean boolean96 = node92.isTry();
        com.google.javascript.rhino.jstype.JSType jSType97 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType99 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry1, node92, jSType97, false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "goog.global" + "'", str90, "goog.global");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "goog.global" + "'", str91, "goog.global");
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.trueNode();
        boolean boolean1 = node0.isInc();
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromCode("hi!", "");
        java.lang.String str4 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry1.createAnonymousObjectType();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int0 = com.google.javascript.rhino.Node.FLAG_NO_THROWS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        com.google.javascript.rhino.jstype.IndexedType indexedType17 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean18 = indexedType17.matchesNumberContext();
        boolean boolean19 = indexedType17.isInterface();
        boolean boolean21 = indexedType17.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        boolean boolean32 = unresolvedTypeExpression26.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) indexedType17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention36 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention35);
        java.lang.String str37 = closureCodingConvention36.getGlobalObject();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.sheq(node39, node41);
        boolean boolean43 = node42.isInc();
        boolean boolean44 = node42.isAnd();
        node42.setOptionalArg(false);
        java.util.List<java.lang.String> strList47 = closureCodingConvention36.identifyTypeDeclarationCall(node42);
        java.lang.String str48 = closureCodingConvention36.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = jSTypeRegistry50.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType53 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry50);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType55 = null;
        closureCodingConvention36.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType53, functionType54, subclassType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = jSTypeRegistry58.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType61 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry58);
        boolean boolean62 = noType53.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType63 = unresolvedTypeExpression31.resolveInternal(errorReporter34, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) noType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(strList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "goog.abstractMethod" + "'", str48, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.google.javascript.rhino.ScriptRuntime.escapeString("?", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpected quote char:4");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean19 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType18);
        boolean boolean20 = arrowType8.isNullType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = arrowType29.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId33 = node32.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType39 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry31, node32, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        boolean boolean40 = arrowType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType39);
        boolean boolean41 = arrowType29.isNullType();
        boolean boolean42 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType29);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean51 = node50.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression53 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry49, node50, "hi!");
        java.lang.String str54 = unresolvedTypeExpression53.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId57 = node56.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean60 = node59.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression62 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry58, node59, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType63 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry55, node56, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        com.google.javascript.rhino.jstype.IndexedType indexedType64 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry48, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression53, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        boolean boolean65 = indexedType64.matchesNumberContext();
        boolean boolean66 = indexedType64.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType68 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry46, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType64, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType69 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry44, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType64);
        boolean boolean70 = arrowType29.isSubtype((com.google.javascript.rhino.jstype.JSType) prototypeObjectType69);
        boolean boolean72 = prototypeObjectType69.isPropertyInExterns("hi!");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "?" + "'", str54, "?");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node1.isAdd();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.sheq(node9, node11);
        boolean boolean13 = node12.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean16 = node15.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry14, node15, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, node7, node12, node15, node19);
        com.google.javascript.rhino.Node node21 = node1.srcref(node19);
        boolean boolean22 = node21.isLocalResultCall();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.sheq(node24, node26);
        node24.setLineno(36);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.sheq(node31, node33);
        boolean boolean35 = node34.isInc();
        boolean boolean36 = node34.isAnd();
        node34.setOptionalArg(false);
        com.google.javascript.rhino.Node node39 = node24.srcrefTree(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node34);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.IR.sheq(node42, node44);
        node42.setLineno(36);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.sheq(node49, node51);
        boolean boolean53 = node52.isInc();
        boolean boolean54 = node52.isAnd();
        node52.setOptionalArg(false);
        com.google.javascript.rhino.Node node57 = node42.srcrefTree(node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node52);
        node34.addChildrenToBack(node52);
        // The following exception was thrown during execution in test generation
        try {
            node21.addChildToFront(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        com.google.javascript.jscomp.CodingConvention codingConvention2 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention3 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention2);
        java.lang.String str4 = closureCodingConvention3.getGlobalObject();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.sheq(node6, node8);
        boolean boolean10 = node9.isInc();
        boolean boolean11 = node9.isAnd();
        node9.setOptionalArg(false);
        java.util.List<java.lang.String> strList14 = closureCodingConvention3.identifyTypeDeclarationCall(node9);
        java.lang.String str15 = closureCodingConvention3.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry17.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType20 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry17);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = null;
        closureCodingConvention3.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType20, functionType21, subclassType22);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention25 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention24);
        java.lang.String str26 = closureCodingConvention25.getGlobalObject();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.sheq(node28, node30);
        boolean boolean32 = node31.isInc();
        boolean boolean33 = node31.isAnd();
        node31.setOptionalArg(false);
        java.util.List<java.lang.String> strList36 = closureCodingConvention25.identifyTypeDeclarationCall(node31);
        java.lang.String str37 = closureCodingConvention25.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = jSTypeRegistry39.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType42 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry39);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType44 = null;
        closureCodingConvention25.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType42, functionType43, subclassType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = jSTypeRegistry47.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType50 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry47);
        boolean boolean51 = noType42.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType50);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean55 = node54.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression57 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry53, node54, "hi!");
        java.lang.String str58 = unresolvedTypeExpression57.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId61 = node60.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean64 = node63.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression66 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry62, node63, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType67 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry59, node60, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression66);
        com.google.javascript.rhino.jstype.IndexedType indexedType68 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry52, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression57, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = unresolvedTypeExpression57.getConstructor();
        unresolvedTypeExpression57.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean74 = node73.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression76 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry72, node73, "hi!");
        java.lang.String str77 = unresolvedTypeExpression76.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId80 = node79.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean83 = node82.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression85 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry81, node82, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType86 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry78, node79, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression85);
        com.google.javascript.rhino.jstype.IndexedType indexedType87 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry71, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression76, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression85);
        boolean boolean88 = indexedType87.matchesNumberContext();
        boolean boolean89 = unresolvedTypeExpression57.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType87);
        com.google.javascript.rhino.Node node91 = indexedType87.getPropertyNode("hi!");
        java.lang.String str92 = indexedType87.getReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention1.applySingletonGetter(functionType21, (com.google.javascript.rhino.jstype.FunctionType) noType42, (com.google.javascript.rhino.jstype.ObjectType) indexedType87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.global" + "'", str4, "goog.global");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.global" + "'", str26, "goog.global");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.abstractMethod" + "'", str37, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "?" + "'", str58, "?");
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "?" + "'", str77, "?");
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(inputId80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "?" + "'", str92, "?");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = arrowType8.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean19 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType18);
        boolean boolean20 = arrowType8.isNullType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = arrowType29.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId33 = node32.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean36 = node35.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression38 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry34, node35, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType39 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry31, node32, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression38);
        boolean boolean40 = arrowType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType39);
        boolean boolean41 = arrowType29.isNullType();
        boolean boolean42 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) arrowType29);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean51 = node50.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression53 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry49, node50, "hi!");
        java.lang.String str54 = unresolvedTypeExpression53.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId57 = node56.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean60 = node59.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression62 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry58, node59, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType63 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry55, node56, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        com.google.javascript.rhino.jstype.IndexedType indexedType64 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry48, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression53, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        boolean boolean65 = indexedType64.matchesNumberContext();
        boolean boolean66 = indexedType64.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType68 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry46, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType64, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType69 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry44, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType64);
        boolean boolean70 = arrowType29.isSubtype((com.google.javascript.rhino.jstype.JSType) prototypeObjectType69);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = prototypeObjectType69.getParentScope();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "?" + "'", str54, "?");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectType71);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node1.isAdd();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.sheq(node9, node11);
        boolean boolean13 = node12.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean16 = node15.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry14, node15, "hi!");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, node7, node12, node15, node19);
        com.google.javascript.rhino.Node node21 = node1.srcref(node19);
        boolean boolean23 = node21.getBooleanProp(48);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable3 = jSTypeRegistry1.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType4 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry1);
        jSTypeRegistry1.forwardDeclareType("NUMBER 10.0");
        org.junit.Assert.assertNotNull(objectTypeIterable3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = unresolvedTypeExpression41.registry;
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNull(jSTypeRegistry55);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        java.lang.String str3 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean5 = node4.isQuotedString();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.breakNode();
        java.lang.String str7 = closureCodingConvention1.extractClassNameIfProvide(node4, node6);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.sheq(node11, node13);
        boolean boolean15 = node14.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean18 = node17.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression20 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry16, node17, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 0, node9, node14, node17, node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        node21.addChildrenToFront(node23);
        boolean boolean25 = node23.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.getprop(node6, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.BooleanType booleanType2 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        boolean boolean28 = noType18.isString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean19 = indexedType16.hasProperty("./");
        int int20 = indexedType16.getPropertiesCount();
        boolean boolean22 = indexedType16.removeProperty("./");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = prototypeObjectType26.toMaybeFunctionType();
        boolean boolean28 = prototypeObjectType26.matchesNumberContext();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        com.google.javascript.rhino.jstype.IndexedType indexedType17 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean18 = indexedType17.matchesNumberContext();
        boolean boolean19 = indexedType17.isInterface();
        boolean boolean21 = indexedType17.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        boolean boolean32 = unresolvedTypeExpression26.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) indexedType17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        java.lang.String str34 = parameterizedType33.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{proxy:{proxy:{2144042507}}}" + "'", str34, "{proxy:{proxy:{2144042507}}}");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        boolean boolean6 = node2.isAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.sheq(node10, node12);
        boolean boolean14 = node13.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, node8, node13, node16, node20);
        com.google.javascript.rhino.Node node22 = node2.srcref(node20);
        boolean boolean23 = node2.isQuotedString();
        boolean boolean24 = node2.isWith();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId28 = node27.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType34 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry26, node27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.JSType jSType35 = node27.getJSType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) 'a', node2, node25, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSType35);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        com.google.javascript.rhino.jstype.IndexedType indexedType17 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean18 = indexedType17.matchesNumberContext();
        boolean boolean19 = indexedType17.isInterface();
        boolean boolean21 = indexedType17.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        boolean boolean32 = unresolvedTypeExpression26.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) indexedType17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        java.lang.String str34 = indexedType17.getNormalizedReferenceName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "?" + "'", str34, "?");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        com.google.javascript.jscomp.CheckLevel checkLevel12 = diagnosticType9.level;
        com.google.javascript.jscomp.CheckLevel checkLevel13 = diagnosticType9.defaultLevel;
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        java.lang.String str35 = unresolvedTypeExpression34.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId38 = node37.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType44 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry36, node37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.IndexedType indexedType45 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry29, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        boolean boolean46 = indexedType45.matchesNumberContext();
        boolean boolean47 = indexedType45.isInterface();
        boolean boolean49 = indexedType45.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean52 = node51.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression54 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry50, node51, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean57 = node56.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression59 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry55, node56, "hi!");
        boolean boolean60 = unresolvedTypeExpression54.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry28, (com.google.javascript.rhino.jstype.ObjectType) indexedType45, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType61.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getParameterType();
        boolean boolean64 = noType18.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        boolean boolean65 = noType18.isOrdinaryFunction();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "?" + "'", str35, "?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode1 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3;
        com.google.javascript.jscomp.parsing.Config config3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, languageMode1, true);
        org.junit.Assert.assertTrue("'" + languageMode1 + "' != '" + com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3 + "'", languageMode1.equals(com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(config3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = null;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig1 = new com.google.javascript.jscomp.DefaultPassConfig(compilerOptions0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean58 = node57.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression60 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry56, node57, "hi!");
        java.lang.String str61 = unresolvedTypeExpression60.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId64 = node63.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean67 = node66.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression69 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry65, node66, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType70 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry62, node63, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression69);
        com.google.javascript.rhino.jstype.IndexedType indexedType71 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry55, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression60, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = unresolvedTypeExpression60.getConstructor();
        unresolvedTypeExpression60.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean77 = node76.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression79 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry75, node76, "hi!");
        java.lang.String str80 = unresolvedTypeExpression79.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId83 = node82.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = null;
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean86 = node85.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression88 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry84, node85, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType89 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry81, node82, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression88);
        com.google.javascript.rhino.jstype.IndexedType indexedType90 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry74, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression79, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression88);
        boolean boolean91 = indexedType90.matchesNumberContext();
        boolean boolean92 = unresolvedTypeExpression60.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType90);
        com.google.javascript.rhino.Node node94 = indexedType90.getPropertyNode("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = indexedType90.getJSDocInfo();
        boolean boolean96 = indexedType90.hasCachedValues();
        java.lang.String str97 = indexedType90.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType98 = null;
        com.google.javascript.rhino.jstype.IndexedType indexedType99 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) indexedType90, jSType98);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "?" + "'", str61, "?");
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(inputId64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "?" + "'", str80, "?");
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(inputId83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(node94);
        org.junit.Assert.assertNull(jSDocInfo95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "?" + "'", str97, "?");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        java.lang.String str16 = unresolvedTypeExpression15.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId19 = node18.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry20, node21, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType25 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry17, node18, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression24);
        com.google.javascript.rhino.jstype.IndexedType indexedType26 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry10, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression15, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression24);
        boolean boolean27 = indexedType26.matchesNumberContext();
        boolean boolean28 = indexedType26.isInterface();
        boolean boolean30 = indexedType26.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean33 = node32.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression35 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry31, node32, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean38 = node37.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression40 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry36, node37, "hi!");
        boolean boolean41 = unresolvedTypeExpression35.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression40);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType42 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) indexedType26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression40);
        boolean boolean43 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) indexedType26);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "?" + "'", str16, "?");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(inputId19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.sheq(node3, node5);
        boolean boolean7 = node6.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean10 = node9.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry8, node9, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, node1, node6, node9, node13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.Node node20 = node13.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.sheq(node23, node25);
        com.google.javascript.jscomp.CheckLevel checkLevel27 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType30 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray31 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError32 = com.google.javascript.jscomp.JSError.make("hi!", node25, checkLevel27, diagnosticType30, strArray31);
        boolean boolean33 = node25.isCatch();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.sheq(node36, node38);
        node36.setLineno(36);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.sheq(node43, node45);
        boolean boolean47 = node46.isInc();
        boolean boolean48 = node46.isAnd();
        node46.setOptionalArg(false);
        com.google.javascript.rhino.Node node51 = node36.srcrefTree(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node46);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.sheq(node54, node56);
        node54.setLineno(36);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.IR.sheq(node61, node63);
        boolean boolean65 = node64.isInc();
        boolean boolean66 = node64.isAnd();
        node64.setOptionalArg(false);
        com.google.javascript.rhino.Node node69 = node54.srcrefTree(node64);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node64);
        node46.addChildrenToBack(node64);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.IR.sheq(node75, node77);
        boolean boolean79 = node78.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean82 = node81.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression84 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry80, node81, "hi!");
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((int) (short) 0, node73, node78, node81, node85);
        boolean boolean87 = node73.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind88 = new com.google.javascript.jscomp.CodingConvention.Bind(node34, node64, node73);
        com.google.javascript.rhino.Node node89 = node25.useSourceInfoIfMissingFrom(node73);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.IR.getelem(node13, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(diagnosticType30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(jSError32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node89);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        indexedType16.clearCachedValues();
        boolean boolean19 = indexedType16.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        java.lang.String str27 = unresolvedTypeExpression26.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId30 = node29.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean33 = node32.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression35 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry31, node32, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType36 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry28, node29, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression35);
        com.google.javascript.rhino.jstype.IndexedType indexedType37 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry21, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = unresolvedTypeExpression26.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType39 = indexedType16.resolveInternal(errorReporter20, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "?" + "'", str27, "?");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(inputId30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(functionType38);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSType jSType9 = unresolvedTypeExpression7.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType11 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry10);
        boolean boolean12 = booleanType11.matchesStringContext();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanType11.getPossibleToBooleanOutcomes();
        boolean boolean14 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(jSType9, (com.google.javascript.rhino.jstype.JSType) booleanType11);
        boolean boolean15 = booleanType11.hasDisplayName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number(100.0d);
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node3 = node1.srcrefTree(node2);
        boolean boolean4 = node2.isSwitch();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        boolean boolean88 = enumElementType87.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType89 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = enumElementType87.isSubtype(jSType89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        java.lang.String str8 = unresolvedTypeExpression7.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId11 = node10.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType17 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry9, node10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        com.google.javascript.rhino.jstype.IndexedType indexedType18 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry2, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression7, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression16);
        boolean boolean19 = indexedType18.matchesNumberContext();
        boolean boolean20 = indexedType18.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType22 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry0, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType18, true);
        com.google.javascript.rhino.jstype.ObjectType.Property property24 = indexedType18.getSlot("NUMBER 10.0\n");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "?" + "'", str8, "?");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(property24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSType jSType9 = unresolvedTypeExpression7.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        java.lang.String str20 = unresolvedTypeExpression19.toAnnotationString();
        boolean boolean22 = unresolvedTypeExpression19.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType23 = unresolvedTypeExpression19.getIndexType();
        boolean boolean24 = unresolvedTypeExpression14.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean25 = unresolvedTypeExpression7.canAssignTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        java.lang.String str32 = unresolvedTypeExpression31.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId35 = node34.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean38 = node37.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression40 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry36, node37, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType41 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry33, node34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression40);
        com.google.javascript.rhino.jstype.IndexedType indexedType42 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry26, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression31, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression40);
        boolean boolean43 = indexedType42.matchesNumberContext();
        boolean boolean44 = indexedType42.isInterface();
        boolean boolean46 = indexedType42.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = unresolvedTypeExpression14.testForEquality((com.google.javascript.rhino.jstype.JSType) indexedType42);
        boolean boolean48 = unresolvedTypeExpression14.isObject();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "?" + "'", str20, "?");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "?" + "'", str32, "?");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        noType18.setPrettyPrint(false);
        java.lang.Iterable iterable30 = noType18.getCtorExtendedInterfaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterable30);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.NullType nullType1 = new com.google.javascript.rhino.jstype.NullType(jSTypeRegistry0);
        boolean boolean2 = nullType1.isNullType();
        boolean boolean3 = nullType1.isNullType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = indexedType16.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = unresolvedTypeExpression28.isEmptyType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType18 = indexedType16.getIndexType();
        int int19 = indexedType16.getPropertiesCount();
        boolean boolean20 = indexedType16.isNoResolvedType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeCollection1 = priorityLinkedDirectedGraph0.getNodes();
        priorityLinkedDirectedGraph0.clearNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority3 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        java.lang.String[] strArray17 = new java.lang.String[] { "Unknown", "null", "boolean", "module$", "NUMBER 10.0\n", "goog.abstractMethod", "NUMBER 10.0\n", "SHEQ", "SHEQ", "module$", "goog.exportProperty", "goog.abstractMethod", "{proxy:{proxy:{2144042507}}}" };
        java.util.HashSet<java.lang.String> strSet18 = new java.util.HashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        com.google.javascript.jscomp.WarningsGuard.Priority priority20 = null;
        // The following exception was thrown during execution in test generation
        try {
            priorityLinkedDirectedGraph0.connectIfNotFound(priority3, strSet18, priority20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUPPRESS_DOC does not exist in graph");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(priorityGraphNodeCollection1);
        org.junit.Assert.assertTrue("'" + priority3 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC + "'", priority3.equals(com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        java.lang.String str35 = unresolvedTypeExpression34.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId38 = node37.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType44 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry36, node37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.IndexedType indexedType45 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry29, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        boolean boolean46 = indexedType45.matchesNumberContext();
        boolean boolean47 = indexedType45.isInterface();
        boolean boolean49 = indexedType45.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean52 = node51.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression54 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry50, node51, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean57 = node56.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression59 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry55, node56, "hi!");
        boolean boolean60 = unresolvedTypeExpression54.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry28, (com.google.javascript.rhino.jstype.ObjectType) indexedType45, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType61.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getParameterType();
        boolean boolean64 = noType18.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = noType18.getAllExtendedInterfaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "?" + "'", str35, "?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId18 = node17.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType24 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry16, node17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.IndexedType indexedType25 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression14, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = unresolvedTypeExpression7.testForEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean28 = unresolvedTypeExpression7.isPropertyTypeDeclared("boolean");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        java.lang.Iterable iterable28 = noType18.getCtorImplementedInterfaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterable28);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = unresolvedTypeExpression5.getConstructor();
        unresolvedTypeExpression5.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry20, node21, "hi!");
        java.lang.String str25 = unresolvedTypeExpression24.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId28 = node27.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType34 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry26, node27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.IndexedType indexedType35 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry19, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression24, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        boolean boolean36 = indexedType35.matchesNumberContext();
        boolean boolean37 = unresolvedTypeExpression5.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType35);
        com.google.javascript.rhino.Node node39 = indexedType35.getPropertyNode("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = indexedType35.getJSDocInfo();
        boolean boolean41 = indexedType35.hasCachedValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = indexedType35.isGlobalThisType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "?" + "'", str25, "?");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        java.lang.String str44 = unresolvedTypeExpression43.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean50 = node49.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression52 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry48, node49, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType53 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry45, node46, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        com.google.javascript.rhino.jstype.IndexedType indexedType54 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry38, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression43, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        boolean boolean55 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        java.lang.String str56 = unresolvedTypeExpression43.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType58 = unresolvedTypeExpression43.getPropertyType("goog.exportProperty");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "?" + "'", str44, "?");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "?" + "'", str56, "?");
        org.junit.Assert.assertNotNull(jSType58);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection1 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(strCollection1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention28);
        java.lang.String str30 = closureCodingConvention29.getGlobalObject();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.sheq(node32, node34);
        boolean boolean36 = node35.isInc();
        boolean boolean37 = node35.isAnd();
        node35.setOptionalArg(false);
        java.util.List<java.lang.String> strList40 = closureCodingConvention29.identifyTypeDeclarationCall(node35);
        java.lang.String str41 = closureCodingConvention29.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = jSTypeRegistry43.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType46 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry43);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType48 = null;
        closureCodingConvention29.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType46, functionType47, subclassType48);
        noType26.setOwnerFunction(functionType47);
        boolean boolean51 = noType26.isNoObjectType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.global" + "'", str30, "goog.global");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(strList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.abstractMethod" + "'", str41, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = unresolvedTypeExpression5.getConstructor();
        unresolvedTypeExpression5.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean22 = node21.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry20, node21, "hi!");
        java.lang.String str25 = unresolvedTypeExpression24.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId28 = node27.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType34 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry26, node27, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.IndexedType indexedType35 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry19, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression24, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        boolean boolean36 = indexedType35.matchesNumberContext();
        boolean boolean37 = unresolvedTypeExpression5.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType35);
        boolean boolean38 = indexedType35.isInterface();
        boolean boolean39 = indexedType35.detectImplicitPrototypeCycle();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "?" + "'", str25, "?");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean20 = indexedType16.isObject();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean6 = node5.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression8 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry4, node5, "hi!");
        java.lang.String str9 = unresolvedTypeExpression8.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId12 = node11.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean15 = node14.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry13, node14, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType18 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry10, node11, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        com.google.javascript.rhino.jstype.IndexedType indexedType19 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry3, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression17);
        boolean boolean20 = indexedType19.matchesNumberContext();
        boolean boolean21 = indexedType19.isInterface();
        boolean boolean23 = indexedType19.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean31 = node30.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression33 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry29, node30, "hi!");
        boolean boolean34 = unresolvedTypeExpression28.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType35 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry2, (com.google.javascript.rhino.jstype.ObjectType) indexedType19, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression33);
        com.google.javascript.rhino.jstype.JSType jSType36 = parameterizedType35.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType37 = parameterizedType35.getParameterType();
        boolean boolean38 = parameterizedType35.matchesNumberContext();
        boolean boolean39 = inputId1.equals((java.lang.Object) parameterizedType35);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType40 = parameterizedType35.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(enumElementType40);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        com.google.javascript.rhino.jstype.FunctionType functionType2 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType3 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType4 = null;
        closureCodingConvention1.applySubclassRelationship(functionType2, functionType3, subclassType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean14 = node13.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry12, node13, "hi!");
        java.lang.String str17 = unresolvedTypeExpression16.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId20 = node19.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean23 = node22.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression25 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry21, node22, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType26 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry18, node19, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        com.google.javascript.rhino.jstype.IndexedType indexedType27 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry11, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression25);
        boolean boolean28 = indexedType27.matchesNumberContext();
        boolean boolean29 = indexedType27.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType31 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry9, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType27, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType32 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry7, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType27);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId35 = node34.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean38 = node37.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression40 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry36, node37, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType41 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry33, node34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression40);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean45 = node44.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression47 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry43, node44, "hi!");
        java.lang.String str48 = unresolvedTypeExpression47.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId51 = node50.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean54 = node53.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression56 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry52, node53, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType57 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry49, node50, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression56);
        com.google.javascript.rhino.jstype.IndexedType indexedType58 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry42, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression47, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression56);
        boolean boolean59 = unresolvedTypeExpression47.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry7.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression40, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression47);
        com.google.javascript.rhino.jstype.RecordTypeBuilder recordTypeBuilder61 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(jSTypeRegistry7);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.IR.sheq(node67, node69);
        boolean boolean71 = node70.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean74 = node73.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression76 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry72, node73, "hi!");
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 0, node65, node70, node73, node77);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean81 = node80.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression83 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry79, node80, "hi!");
        com.google.javascript.rhino.Node node84 = node77.useSourceInfoIfMissingFrom(node80);
        com.google.javascript.rhino.jstype.RecordTypeBuilder recordTypeBuilder85 = recordTypeBuilder61.addProperty("SHEQ", jSType63, node77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = closureCodingConvention1.getSingletonGetterClassName(node77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "?" + "'", str48, "?");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(recordTypeBuilder85);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean4 = node3.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression6 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry2, node3, "hi!");
        java.lang.String str7 = unresolvedTypeExpression6.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId10 = node9.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType16 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry8, node9, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        com.google.javascript.rhino.jstype.IndexedType indexedType17 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression6, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression15);
        boolean boolean18 = indexedType17.matchesNumberContext();
        boolean boolean19 = indexedType17.isInterface();
        boolean boolean21 = indexedType17.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean29 = node28.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry27, node28, "hi!");
        boolean boolean32 = unresolvedTypeExpression26.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType33 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) indexedType17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression31);
        com.google.javascript.rhino.jstype.JSType jSType34 = parameterizedType33.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType35 = parameterizedType33.getParameterType();
        boolean boolean37 = parameterizedType33.isPropertyTypeDeclared("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?" + "'", str7, "?");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean1 = node0.isQuotedString();
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = node0.clonePropsFrom(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeCollection1 = priorityLinkedDirectedGraph0.getNodes();
        priorityLinkedDirectedGraph0.clearNodeAnnotations();
        priorityLinkedDirectedGraph0.clearNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority4 = com.google.javascript.jscomp.WarningsGuard.Priority.MAX;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityDiGraphNodeList5 = priorityLinkedDirectedGraph0.getDirectedPredNodes(priority4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(priorityGraphNodeCollection1);
        org.junit.Assert.assertTrue("'" + priority4 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.MAX + "'", priority4.equals(com.google.javascript.jscomp.WarningsGuard.Priority.MAX));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        boolean boolean88 = enumElementType87.matchesObjectContext();
        boolean boolean90 = enumElementType87.isPropertyTypeInferred("{proxy:{proxy:{2144042507}}}");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId18 = node17.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType24 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry16, node17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.IndexedType indexedType25 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression14, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = unresolvedTypeExpression7.testForEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = unresolvedTypeExpression7.isString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ternaryValue26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention1.getAssertionFunctions();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention1.isOptionalParameter(node3);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean1 = node0.isNot();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId4 = node3.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression9 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry5, node6, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType10 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry2, node3, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression9);
        com.google.javascript.rhino.Node node11 = node3.cloneNode();
        boolean boolean12 = node0.isEquivalentTo(node11);
        boolean boolean13 = node0.isNE();
        boolean boolean14 = node0.isFromExterns();
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = indexedType16.getOwnPropertyJSDocInfo("NUMBER 10.0");
        boolean boolean19 = indexedType16.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId23 = node22.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean26 = node25.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression28 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry24, node25, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType29 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry21, node22, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression28);
        boolean boolean30 = arrowType29.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair31 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType20, (com.google.javascript.rhino.jstype.JSType) arrowType29);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean35 = node34.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression37 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry33, node34, "hi!");
        java.lang.String str38 = unresolvedTypeExpression37.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId41 = node40.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean44 = node43.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression46 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry42, node43, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType47 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry39, node40, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression46);
        com.google.javascript.rhino.jstype.IndexedType indexedType48 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry32, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression46);
        boolean boolean49 = indexedType48.matchesNumberContext();
        boolean boolean50 = indexedType48.isInterface();
        boolean boolean51 = indexedType48.detectImplicitPrototypeCycle();
        boolean boolean53 = indexedType48.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean56 = node55.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression58 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry54, node55, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode60 = null;
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        com.google.javascript.jscomp.parsing.Config config66 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode60, false, (java.util.Set<java.lang.String>) strSet64);
        unresolvedTypeExpression58.collectPropertyNames((java.util.Set<java.lang.String>) strSet64);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = unresolvedTypeExpression58.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair69 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType48, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression58);
        java.lang.String str71 = unresolvedTypeExpression58.toStringHelper(true);
        java.lang.String str72 = unresolvedTypeExpression58.getDisplayName();
        boolean boolean73 = arrowType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression58);
        boolean boolean74 = indexedType16.differsFrom((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression58);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "?" + "'", str38, "?");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(config66);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "?" + "'", str71, "?");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Unknown" + "'", str72, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        boolean boolean6 = node2.isAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.sheq(node10, node12);
        boolean boolean14 = node13.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, node8, node13, node16, node20);
        com.google.javascript.rhino.Node node22 = node2.srcref(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.sheq(node24, node26);
        boolean boolean28 = node27.isOptionalArg();
        boolean boolean29 = node22.hasChild(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, 100, 44);
        boolean boolean33 = node27.isWhile();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.sheq(node6, node8);
        boolean boolean10 = node9.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean13 = node12.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry11, node12, "hi!");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, node4, node9, node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.thisNode();
        node16.addChildrenToFront(node18);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId22 = node21.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean25 = node24.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression27 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry23, node24, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType28 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry20, node21, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression27);
        java.lang.String str29 = closureCodingConvention1.extractClassNameIfRequire(node18, node21);
        boolean boolean30 = node18.isHook();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        com.google.javascript.rhino.jstype.RecordTypeBuilder recordTypeBuilder55 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(jSTypeRegistry1);
        boolean boolean57 = jSTypeRegistry1.isForwardDeclaredType("{proxy:{proxy:{2144042507}}}");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getExtendedInterfaces();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        boolean boolean22 = noType18.hasCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.rhino.jstype.NullType nullType25 = new com.google.javascript.rhino.jstype.NullType(jSTypeRegistry24);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean28 = node27.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression30 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry26, node27, "hi!");
        java.lang.String str31 = unresolvedTypeExpression30.toAnnotationString();
        boolean boolean32 = unresolvedTypeExpression30.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = nullType25.testForEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression30);
        com.google.javascript.rhino.jstype.JSType jSType35 = unresolvedTypeExpression30.getPropertyType("NUMBER 10.0");
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.number((double) (short) 10);
        boolean boolean39 = noType18.defineProperty("boolean", jSType35, false, node38);
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = noType18.getSubTypes();
        boolean boolean41 = noType18.isNoType();
        java.util.Set<java.lang.String> strSet42 = noType18.getOwnPropertyNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "?" + "'", str31, "?");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable3 = jSTypeRegistry1.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType4 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry1);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("SHEQ");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable8 = jSTypeRegistry1.getTypesWithProperty("{proxy:{proxy:{2144042507}}}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable10 = jSTypeRegistry1.getEachReferenceTypeWithProperty("goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable8);
        org.junit.Assert.assertNotNull(objectTypeIterable10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        boolean boolean27 = indexedType21.isNullable();
        com.google.javascript.rhino.Node node28 = indexedType21.getRootNode();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType21 = indexedType16.getParameterType();
        boolean boolean22 = indexedType16.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder1 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean3 = node2.isNot();
        com.google.javascript.rhino.Node node4 = functionParamBuilder1.newParameterFromNode(node2);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType22 = unresolvedTypeExpression10.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId25 = node24.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean28 = node27.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression30 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry26, node27, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType31 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry23, node24, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression30);
        com.google.javascript.rhino.jstype.JSType jSType32 = unresolvedTypeExpression30.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.rhino.jstype.BooleanType booleanType34 = new com.google.javascript.rhino.jstype.BooleanType(jSTypeRegistry33);
        boolean boolean35 = booleanType34.matchesStringContext();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = booleanType34.getPossibleToBooleanOutcomes();
        boolean boolean37 = com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(jSType32, (com.google.javascript.rhino.jstype.JSType) booleanType34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] { unresolvedTypeExpression10, jSType32 };
        boolean boolean39 = functionParamBuilder1.addRequiredParams(jSTypeArray38);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(enumElementType22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(inputId25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType18 = indexedType16.getIndexType();
        int int19 = indexedType16.getPropertiesCount();
        java.lang.String str21 = indexedType16.toStringHelper(true);
        java.lang.String str22 = indexedType16.toString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "?" + "'", str21, "?");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "?" + "'", str22, "?");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        java.lang.String str2 = stringPosition0.getItem();
        stringPosition0.setItem("{proxy:{proxy:{2144042507}}}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean20 = indexedType16.isNativeObjectType();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention22);
        java.lang.String str24 = closureCodingConvention23.getGlobalObject();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.sheq(node26, node28);
        boolean boolean30 = node29.isInc();
        boolean boolean31 = node29.isAnd();
        node29.setOptionalArg(false);
        java.util.List<java.lang.String> strList34 = closureCodingConvention23.identifyTypeDeclarationCall(node29);
        java.lang.String str35 = closureCodingConvention23.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = jSTypeRegistry37.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType40 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry37);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention23.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType40, functionType41, subclassType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = jSTypeRegistry45.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType48 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry45);
        boolean boolean49 = noType40.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean54 = node53.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression56 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry52, node53, "hi!");
        java.lang.String str57 = unresolvedTypeExpression56.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId60 = node59.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean63 = node62.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression65 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry61, node62, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType66 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry58, node59, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression65);
        com.google.javascript.rhino.jstype.IndexedType indexedType67 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry51, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression56, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression65);
        boolean boolean68 = indexedType67.matchesNumberContext();
        boolean boolean69 = indexedType67.isInterface();
        boolean boolean71 = indexedType67.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean74 = node73.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression76 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry72, node73, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean79 = node78.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression81 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry77, node78, "hi!");
        boolean boolean82 = unresolvedTypeExpression76.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression81);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry50, (com.google.javascript.rhino.jstype.ObjectType) indexedType67, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression81);
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType83.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType83.getParameterType();
        boolean boolean86 = noType40.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = new com.google.javascript.rhino.JSDocInfo();
        noType40.setPropertyJSDocInfo("./", jSDocInfo88);
        indexedType16.setPropertyJSDocInfo("NUMBER 10.0", jSDocInfo88);
        boolean boolean91 = jSDocInfo88.containsDeclaration();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.abstractMethod" + "'", str35, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "?" + "'", str57, "?");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        java.lang.String str24 = unresolvedTypeExpression23.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId27 = node26.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean30 = node29.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression32 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry28, node29, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType33 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry25, node26, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.IndexedType indexedType34 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry18, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression23, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression32);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = unresolvedTypeExpression23.toMaybeEnumElementType();
        boolean boolean37 = unresolvedTypeExpression23.hasProperty("goog.global");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.sheq(node41, node43);
        com.google.javascript.jscomp.CheckLevel checkLevel45 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType48 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError50 = com.google.javascript.jscomp.JSError.make("hi!", node43, checkLevel45, diagnosticType48, strArray49);
        boolean boolean51 = node43.isCatch();
        boolean boolean52 = unresolvedTypeExpression5.defineProperty("", (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23, false, node43);
        boolean boolean53 = node43.isArrayLit();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "?" + "'", str24, "?");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(diagnosticType48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(jSError50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.NodeTraversal.Callback callback1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler0, callback1);
        java.lang.String str3 = nodeTraversal2.getSourceName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.sheq(node6, node8);
        com.google.javascript.jscomp.CheckLevel checkLevel10 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType13 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray14 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError15 = com.google.javascript.jscomp.JSError.make("hi!", node8, checkLevel10, diagnosticType13, strArray14);
        boolean boolean16 = node8.isCatch();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.sheq(node19, node21);
        node19.setLineno(36);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.sheq(node26, node28);
        boolean boolean30 = node29.isInc();
        boolean boolean31 = node29.isAnd();
        node29.setOptionalArg(false);
        com.google.javascript.rhino.Node node34 = node19.srcrefTree(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node29);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.sheq(node37, node39);
        node37.setLineno(36);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.sheq(node44, node46);
        boolean boolean48 = node47.isInc();
        boolean boolean49 = node47.isAnd();
        node47.setOptionalArg(false);
        com.google.javascript.rhino.Node node52 = node37.srcrefTree(node47);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node47);
        node29.addChildrenToBack(node47);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.sheq(node58, node60);
        boolean boolean62 = node61.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean65 = node64.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression67 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry63, node64, "hi!");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 0, node56, node61, node64, node68);
        boolean boolean70 = node56.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind71 = new com.google.javascript.jscomp.CodingConvention.Bind(node17, node47, node56);
        com.google.javascript.rhino.Node node72 = node8.useSourceInfoIfMissingFrom(node56);
        boolean boolean73 = node56.isVoid();
        boolean boolean74 = node56.isNumber();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId77 = node76.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean80 = node79.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression82 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry78, node79, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType83 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry75, node76, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression82);
        com.google.javascript.rhino.Node node84 = node76.cloneNode();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.IR.sheq(node86, node88);
        node86.setLineno(36);
        boolean boolean92 = node86.isFor();
        node56.addChildAfter(node76, node86);
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal2.traverse(node86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(diagnosticType13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(jSError15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(inputId77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        boolean boolean22 = noType18.hasCachedValues();
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode24 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        com.google.javascript.jscomp.parsing.Config config30 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode24, false, (java.util.Set<java.lang.String>) strSet28);
        noType18.collectPropertyNames((java.util.Set<java.lang.String>) strSet28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(config30);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = arrowType8.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = arrowType8.getPossibleToBooleanOutcomes();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.sheq(node2, node4);
        com.google.javascript.jscomp.CheckLevel checkLevel6 = null;
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.DiagnosticType.disabled("", "hi!");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("hi!", node4, checkLevel6, diagnosticType9, strArray10);
        boolean boolean12 = node4.isCatch();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.sheq(node15, node17);
        node15.setLineno(36);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.sheq(node22, node24);
        boolean boolean26 = node25.isInc();
        boolean boolean27 = node25.isAnd();
        node25.setOptionalArg(false);
        com.google.javascript.rhino.Node node30 = node15.srcrefTree(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.IR.sheq(node33, node35);
        node33.setLineno(36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.sheq(node40, node42);
        boolean boolean44 = node43.isInc();
        boolean boolean45 = node43.isAnd();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node48 = node33.srcrefTree(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node43);
        node25.addChildrenToBack(node43);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.IR.sheq(node54, node56);
        boolean boolean58 = node57.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean61 = node60.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression63 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry59, node60, "hi!");
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 0, node52, node57, node60, node64);
        boolean boolean66 = node52.isSwitch();
        com.google.javascript.jscomp.CodingConvention.Bind bind67 = new com.google.javascript.jscomp.CodingConvention.Bind(node13, node43, node52);
        com.google.javascript.rhino.Node node68 = node4.useSourceInfoIfMissingFrom(node52);
        boolean boolean69 = node52.isVoid();
        boolean boolean70 = node52.isNumber();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId73 = node72.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean76 = node75.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression78 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry74, node75, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType79 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry71, node72, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression78);
        com.google.javascript.rhino.Node node80 = node72.cloneNode();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.IR.sheq(node82, node84);
        node82.setLineno(36);
        boolean boolean88 = node82.isFor();
        node52.addChildAfter(node72, node82);
        node52.setIsSyntheticBlock(true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(inputId73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node4.isInc();
        boolean boolean6 = node4.isAnd();
        node4.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.regexp(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType18 = indexedType16.getIndexType();
        int int19 = indexedType16.getPropertiesCount();
        boolean boolean20 = indexedType16.hasReferenceName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        boolean boolean9 = unresolvedTypeExpression7.isNativeObjectType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        boolean boolean88 = enumElementType87.matchesNumberContext();
        boolean boolean89 = enumElementType87.matchesStringContext();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.falseNode();
        boolean boolean1 = node0.isNot();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable2 = node0.getAncestors();
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(ancestorIterable2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType21 = indexedType16.getParameterType();
        indexedType16.clearCachedValues();
        boolean boolean23 = indexedType16.isNoResolvedType();
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode25 = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5;
        java.lang.String[] strArray36 = new java.lang.String[] { "SHEQ", "NUMBER 10.0", "null", "", "./", "module$", "goog.exportProperty", "goog.abstractMethod", "./" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        com.google.javascript.jscomp.parsing.Config config39 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode25, false, (java.util.Set<java.lang.String>) strSet37);
        indexedType16.collectPropertyNames((java.util.Set<java.lang.String>) strSet37);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + languageMode25 + "' != '" + com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5 + "'", languageMode25.equals(com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(config39);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.google.javascript.jscomp.ErrorManager errorManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(errorManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        java.lang.String str44 = unresolvedTypeExpression43.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId47 = node46.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean50 = node49.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression52 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry48, node49, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType53 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry45, node46, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        com.google.javascript.rhino.jstype.IndexedType indexedType54 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry38, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression43, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression52);
        boolean boolean55 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean60 = node59.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression62 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry58, node59, "hi!");
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType64 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry56, "hi!", (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression62, false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = indexedType16.testForEquality((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "?" + "'", str44, "?");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(ternaryValue65);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromFile("NUMBER 10.0\n", charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader3 = jSSourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: NUMBER 10.0? (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFile2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean20 = indexedType16.isNativeObjectType();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention23 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention22);
        java.lang.String str24 = closureCodingConvention23.getGlobalObject();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.sheq(node26, node28);
        boolean boolean30 = node29.isInc();
        boolean boolean31 = node29.isAnd();
        node29.setOptionalArg(false);
        java.util.List<java.lang.String> strList34 = closureCodingConvention23.identifyTypeDeclarationCall(node29);
        java.lang.String str35 = closureCodingConvention23.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = jSTypeRegistry37.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType40 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry37);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention23.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType40, functionType41, subclassType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = jSTypeRegistry45.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType48 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry45);
        boolean boolean49 = noType40.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType48);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean54 = node53.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression56 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry52, node53, "hi!");
        java.lang.String str57 = unresolvedTypeExpression56.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId60 = node59.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean63 = node62.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression65 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry61, node62, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType66 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry58, node59, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression65);
        com.google.javascript.rhino.jstype.IndexedType indexedType67 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry51, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression56, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression65);
        boolean boolean68 = indexedType67.matchesNumberContext();
        boolean boolean69 = indexedType67.isInterface();
        boolean boolean71 = indexedType67.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean74 = node73.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression76 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry72, node73, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean79 = node78.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression81 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry77, node78, "hi!");
        boolean boolean82 = unresolvedTypeExpression76.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression81);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType83 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry50, (com.google.javascript.rhino.jstype.ObjectType) indexedType67, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression81);
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType83.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType85 = parameterizedType83.getParameterType();
        boolean boolean86 = noType40.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType83);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = new com.google.javascript.rhino.JSDocInfo();
        noType40.setPropertyJSDocInfo("./", jSDocInfo88);
        indexedType16.setPropertyJSDocInfo("NUMBER 10.0", jSDocInfo88);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList91 = jSDocInfo88.getExtendedInterfaces();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.abstractMethod" + "'", str35, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "?" + "'", str57, "?");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList91);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        boolean boolean29 = noType18.isSubtype(jSType28);
        int int30 = noType18.getMaxArguments();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        jSTypeRegistry1.forwardDeclareType("?");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative18 = com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType19 = indexedType16.getNativeType(jSTypeNative18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + jSTypeNative18 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS + "'", jSTypeNative18.equals(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry1.createNamedType("./", "NUMBER 10.0", 39, (int) (byte) 1);
        boolean boolean63 = jSTypeRegistry1.isForwardDeclaredType("null");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative64 = com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative64);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.jstype.InstanceObjectType cannot be cast to com.google.javascript.rhino.jstype.FunctionType");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + jSTypeNative64 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE + "'", jSTypeNative64.equals(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable3 = jSTypeRegistry1.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType4 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry1);
        boolean boolean6 = jSTypeRegistry1.hasNamespace("SHEQ");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.NullType nullType8 = new com.google.javascript.rhino.jstype.NullType(jSTypeRegistry1);
        org.junit.Assert.assertNotNull(objectTypeIterable3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean20 = indexedType16.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType21 = indexedType16.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType22 = jSType21.restrictByNotNullOrUndefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.sheq(node4, node6);
        boolean boolean8 = node7.isInc();
        boolean boolean9 = node7.isAnd();
        node7.setOptionalArg(false);
        java.util.List<java.lang.String> strList12 = closureCodingConvention1.identifyTypeDeclarationCall(node7);
        java.lang.String str13 = closureCodingConvention1.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry15.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType18 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry15);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention1.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType18, functionType19, subclassType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry23.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType26 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry23);
        boolean boolean27 = noType18.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        java.lang.String str35 = unresolvedTypeExpression34.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId38 = node37.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType44 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry36, node37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.IndexedType indexedType45 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry29, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        boolean boolean46 = indexedType45.matchesNumberContext();
        boolean boolean47 = indexedType45.isInterface();
        boolean boolean49 = indexedType45.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean52 = node51.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression54 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry50, node51, "hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean57 = node56.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression59 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry55, node56, "hi!");
        boolean boolean60 = unresolvedTypeExpression54.isSubtype((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType61 = new com.google.javascript.rhino.jstype.ParameterizedType(jSTypeRegistry28, (com.google.javascript.rhino.jstype.ObjectType) indexedType45, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression59);
        com.google.javascript.rhino.jstype.JSType jSType62 = parameterizedType61.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType63 = parameterizedType61.getParameterType();
        boolean boolean64 = noType18.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) parameterizedType61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        noType18.setPropertyJSDocInfo("./", jSDocInfo66);
        boolean boolean69 = jSDocInfo66.hasDescriptionForParameter("SHEQ");
        boolean boolean70 = jSDocInfo66.hasModifies();
        java.util.Set<java.lang.String> strSet71 = jSDocInfo66.getParameterNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "?" + "'", str35, "?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet71);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType17 = unresolvedTypeExpression5.toMaybeEnumElementType();
        boolean boolean19 = unresolvedTypeExpression5.hasProperty("goog.global");
        boolean boolean20 = unresolvedTypeExpression5.isConstructor();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(enumElementType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        java.lang.String str2 = compiler1.getAstDotGraph();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = com.google.javascript.jscomp.JSSourceFile.fromCode("hi!", "");
        com.google.javascript.jscomp.CompilerInput compilerInput7 = new com.google.javascript.jscomp.CompilerInput(jSSourceFile6);
        java.io.Reader reader8 = jSSourceFile6.getCodeReader();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler1.compile(jSSourceFile3, jSSourceFile6, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(jSSourceFile6);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId29 = node28.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType35 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry27, node28, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean39 = node38.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression41 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry37, node38, "hi!");
        java.lang.String str42 = unresolvedTypeExpression41.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId45 = node44.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean48 = node47.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression50 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry46, node47, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType51 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry43, node44, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        com.google.javascript.rhino.jstype.IndexedType indexedType52 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry36, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression50);
        boolean boolean53 = unresolvedTypeExpression41.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry1.findCommonSuperObject((com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression41);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId59 = node58.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean62 = node61.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression64 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry60, node61, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType65 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry57, node58, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression64);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean69 = node68.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression71 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry67, node68, "hi!");
        java.lang.String str72 = unresolvedTypeExpression71.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId75 = node74.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean78 = node77.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression80 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry76, node77, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType81 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry73, node74, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.IndexedType indexedType82 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry66, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression71, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = unresolvedTypeExpression71.getConstructor();
        boolean boolean84 = arrowType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = arrowType65.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType87 = new com.google.javascript.rhino.jstype.EnumElementType(jSTypeRegistry1, (com.google.javascript.rhino.jstype.JSType) arrowType65, "boolean");
        boolean boolean88 = enumElementType87.matchesNumberContext();
        boolean boolean89 = enumElementType87.matchesObjectContext();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "?" + "'", str42, "?");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(inputId59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "?" + "'", str72, "?");
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("hi!", "");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(jSSourceFile2);
        com.google.javascript.rhino.InputId inputId4 = compilerInput3.getInputId();
        com.google.javascript.jscomp.SourceAst sourceAst5 = compilerInput3.getAst();
        org.junit.Assert.assertNotNull(jSSourceFile2);
        org.junit.Assert.assertNotNull(inputId4);
        org.junit.Assert.assertNotNull(sourceAst5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = unresolvedTypeExpression14.isNoType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean8 = node7.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression10 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry6, node7, "hi!");
        java.lang.String str11 = unresolvedTypeExpression10.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId14 = node13.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean17 = node16.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression19 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry15, node16, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType20 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry12, node13, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        com.google.javascript.rhino.jstype.IndexedType indexedType21 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry5, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression10, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression19);
        boolean boolean22 = indexedType21.matchesNumberContext();
        boolean boolean23 = indexedType21.isInterface();
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType25 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry3, "null", (com.google.javascript.rhino.jstype.ObjectType) indexedType21, true);
        com.google.javascript.rhino.jstype.PrototypeObjectType prototypeObjectType26 = new com.google.javascript.rhino.jstype.PrototypeObjectType(jSTypeRegistry1, "SHEQ", (com.google.javascript.rhino.jstype.ObjectType) indexedType21);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = prototypeObjectType26.toMaybeFunctionType();
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention28);
        java.lang.String str30 = closureCodingConvention29.getGlobalObject();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.sheq(node32, node34);
        boolean boolean36 = node35.isInc();
        boolean boolean37 = node35.isAnd();
        node35.setOptionalArg(false);
        java.util.List<java.lang.String> strList40 = closureCodingConvention29.identifyTypeDeclarationCall(node35);
        java.lang.String str41 = closureCodingConvention29.getAbstractMethodName();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = jSTypeRegistry43.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType46 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry43);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType48 = null;
        closureCodingConvention29.applySubclassRelationship((com.google.javascript.rhino.jstype.FunctionType) noType46, functionType47, subclassType48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = jSTypeRegistry51.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.NoType noType54 = new com.google.javascript.rhino.jstype.NoType(jSTypeRegistry51);
        boolean boolean55 = noType46.hasEqualCallType((com.google.javascript.rhino.jstype.FunctionType) noType54);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = noType54.getExtendedInterfaces();
        prototypeObjectType26.setOwnerFunction((com.google.javascript.rhino.jstype.FunctionType) noType54);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(inputId14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(functionType27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.global" + "'", str30, "goog.global");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(strList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.abstractMethod" + "'", str41, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority1 = null;
        com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityGraphNode2 = priorityLinkedDirectedGraph0.createNode(priority1);
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph3 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority4 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityDiGraphNode5 = priorityLinkedDirectedGraph3.createDirectedGraphNode(priority4);
        com.google.javascript.jscomp.WarningsGuard.Priority priority6 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        java.util.List<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeList7 = priorityLinkedDirectedGraph3.getNeighborNodes(priority6);
        com.google.javascript.jscomp.WarningsGuard.Priority priority8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = priorityLinkedDirectedGraph0.isConnected(priority6, priority8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SUPPRESS_DOC does not exist in graph");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(priorityGraphNode2);
        org.junit.Assert.assertNotNull(priorityLinkedDirectedGraph3);
        org.junit.Assert.assertTrue("'" + priority4 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC + "'", priority4.equals(com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC));
        org.junit.Assert.assertNotNull(priorityDiGraphNode5);
        org.junit.Assert.assertTrue("'" + priority6 + "' != '" + com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC + "'", priority6.equals(com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC));
        org.junit.Assert.assertNotNull(priorityGraphNodeList7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.sheq(node1, node3);
        boolean boolean5 = node4.isInc();
        boolean boolean6 = node4.isAnd();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.JSType jSType16 = node8.getJSType();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.sheq(node20, node22);
        boolean boolean24 = node23.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean27 = node26.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression29 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry25, node26, "hi!");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 0, node18, node23, node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.thisNode();
        node30.addChildrenToFront(node32);
        boolean boolean34 = node32.isArrayLit();
        boolean boolean35 = node32.isTry();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.sheq(node37, node39);
        boolean boolean41 = node37.isAdd();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.IR.trueNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.number((double) (short) 10);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.IR.sheq(node45, node47);
        boolean boolean49 = node48.isInc();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean52 = node51.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression54 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry50, node51, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 0, node43, node48, node51, node55);
        com.google.javascript.rhino.Node node57 = node37.srcref(node55);
        com.google.javascript.rhino.Node node58 = node32.srcref(node57);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.function(node4, node8, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean3 = node2.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression5 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry1, node2, "hi!");
        java.lang.String str6 = unresolvedTypeExpression5.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId9 = node8.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType15 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry7, node8, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        com.google.javascript.rhino.jstype.IndexedType indexedType16 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry0, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression5, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression14);
        boolean boolean17 = indexedType16.matchesNumberContext();
        boolean boolean18 = indexedType16.isInterface();
        boolean boolean19 = indexedType16.detectImplicitPrototypeCycle();
        boolean boolean21 = indexedType16.isPropertyInExterns("NUMBER 10.0");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean24 = node23.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry22, node23, "hi!");
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode28 = null;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        com.google.javascript.jscomp.parsing.Config config34 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, languageMode28, false, (java.util.Set<java.lang.String>) strSet32);
        unresolvedTypeExpression26.collectPropertyNames((java.util.Set<java.lang.String>) strSet32);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = unresolvedTypeExpression26.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) indexedType16, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression26);
        java.lang.String str39 = unresolvedTypeExpression26.toStringHelper(true);
        boolean boolean40 = unresolvedTypeExpression26.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "?" + "'", str6, "?");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(config34);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "?" + "'", str39, "?");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromCode("hi!", "");
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable3 = jSTypeRegistry1.getEachReferenceTypeWithProperty("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSType jSType5 = jSTypeRegistry1.getNativeType(jSTypeNative4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative6 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry1.getNativeObjectType(jSTypeNative6);
        org.junit.Assert.assertNotNull(objectTypeIterable3);
        org.junit.Assert.assertTrue("'" + jSTypeNative4 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE + "'", jSTypeNative4.equals(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE));
        org.junit.Assert.assertNotNull(jSType5);
        org.junit.Assert.assertTrue("'" + jSTypeNative6 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE + "'", jSTypeNative6.equals(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE));
        org.junit.Assert.assertNotNull(objectType7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention1 = new com.google.javascript.jscomp.ClosureCodingConvention(codingConvention0);
        java.lang.String str2 = closureCodingConvention1.getGlobalObject();
        java.lang.String str3 = closureCodingConvention1.getGlobalObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = closureCodingConvention1.getDelegateSuperclassName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId2 = node1.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression7 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry3, node4, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType8 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression7);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean12 = node11.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry10, node11, "hi!");
        java.lang.String str15 = unresolvedTypeExpression14.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId18 = node17.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean21 = node20.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression23 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry19, node20, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType24 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry16, node17, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.IndexedType indexedType25 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry9, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression14, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression23);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = unresolvedTypeExpression14.getConstructor();
        boolean boolean27 = arrowType8.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = arrowType8.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean32 = node31.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression34 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry30, node31, "hi!");
        java.lang.String str35 = unresolvedTypeExpression34.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId38 = node37.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean41 = node40.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression43 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry39, node40, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType44 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry36, node37, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.IndexedType indexedType45 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry29, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression34, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression43);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = unresolvedTypeExpression34.getConstructor();
        unresolvedTypeExpression34.clearCachedValues();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean51 = node50.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression53 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry49, node50, "hi!");
        java.lang.String str54 = unresolvedTypeExpression53.toAnnotationString();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.IR.thisNode();
        com.google.javascript.rhino.InputId inputId57 = node56.getInputId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.IR.thisNode();
        boolean boolean60 = node59.isOr();
        com.google.javascript.rhino.jstype.UnresolvedTypeExpression unresolvedTypeExpression62 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(jSTypeRegistry58, node59, "hi!");
        com.google.javascript.rhino.jstype.ArrowType arrowType63 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry55, node56, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        com.google.javascript.rhino.jstype.IndexedType indexedType64 = new com.google.javascript.rhino.jstype.IndexedType(jSTypeRegistry48, (com.google.javascript.rhino.jstype.ObjectType) unresolvedTypeExpression53, (com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression62);
        boolean boolean65 = indexedType64.matchesNumberContext();
        boolean boolean66 = unresolvedTypeExpression34.differsFrom((com.google.javascript.rhino.jstype.JSType) indexedType64);
        boolean boolean68 = unresolvedTypeExpression34.hasOwnProperty("goog.global");
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = null;
        unresolvedTypeExpression34.setJSDocInfo(jSDocInfo69);
        boolean boolean71 = arrowType8.canAssignTo((com.google.javascript.rhino.jstype.JSType) unresolvedTypeExpression34);
        boolean boolean72 = unresolvedTypeExpression34.isNumberValueType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(inputId2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "?" + "'", str35, "?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(functionType46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "?" + "'", str54, "?");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }
}
