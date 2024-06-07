package com.google.javascript.rhino.jstype;

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
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("hi!", "");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(jSSourceFile2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.String> strCollection4 = compilerInput3.getProvides();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = com.google.javascript.jscomp.JSSourceFile.fromCode("hi!", "");
        com.google.javascript.jscomp.CompilerInput compilerInput3 = new com.google.javascript.jscomp.CompilerInput(jSSourceFile2);
        com.google.javascript.rhino.InputId inputId4 = compilerInput3.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compilerInput3.removeRequire("./");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node0 = com.google.javascript.rhino.IR.falseNode();
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
        boolean boolean18 = node12.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node0.removeChild(node12);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
        com.google.javascript.jscomp.WarningsGuard.Priority priority1 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>> priorityDiGraphNode2 = priorityLinkedDirectedGraph0.createDirectedGraphNode(priority1);
        com.google.javascript.jscomp.WarningsGuard.Priority priority3 = com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC;
        java.util.List<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.WarningsGuard.Priority, java.util.HashSet<java.lang.String>>> priorityGraphNodeList4 = priorityLinkedDirectedGraph0.getNeighborNodes(priority3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        priorityLinkedDirectedGraph0.popNodeAnnotations();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = compiler0.getTypeRegistry();
    }
}

