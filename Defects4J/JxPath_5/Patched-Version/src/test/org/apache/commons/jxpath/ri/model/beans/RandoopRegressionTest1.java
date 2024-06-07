package org.apache.commons.jxpath.ri.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext5 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = precedingOrFollowingContext5.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext9 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext5, false, nodeTest8);
        org.apache.commons.jxpath.NodeSet nodeSet10 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext11 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext9, nodeSet10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = ancestorContext9.getCurrentNodePointer();
        ancestorContext9.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = ancestorContext9.getCurrentNodePointer();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.ri.QName qName5 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer6 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables2, qName5);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables9 = jXPathContext8.getVariables();
        org.apache.commons.jxpath.Pointer pointer11 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext8, (java.lang.Object) (byte) 100, pointer11);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale14);
        java.lang.Object obj16 = jDOMNodePointer15.clone();
        java.lang.Object obj17 = jDOMNodePointer15.getImmediateNode();
        java.util.Locale locale18 = jDOMNodePointer15.getLocale();
        boolean boolean19 = jDOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = variablePointer6.createPath(jXPathContext8, (java.lang.Object) boolean19);
        int int21 = variablePointer6.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = variablePointer6.getImmediateValuePointer();
        java.lang.Object obj23 = variablePointer6.getBaseValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = variablePointer6.createPath(jXPathContext24);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNotNull(jXPathContext8);
        org.junit.Assert.assertNotNull(variables9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNotNull(nodePointer25);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.Pointer pointer4 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl5 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext1, (java.lang.Object) (byte) 100, pointer4);
        org.apache.commons.jxpath.AbstractFactory abstractFactory6 = null;
        jXPathContextReferenceImpl5.setFactory(abstractFactory6);
        java.io.Reader reader8 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream9 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader8);
        char[] charArray11 = simpleCharStream9.GetSuffix(56);
        org.apache.commons.jxpath.Pointer pointer12 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl5, (java.lang.Object) 56, pointer12);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = jXPathContextReferenceImpl13.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables17 = jXPathContext16.getVariables();
        jXPathContextReferenceImpl13.setVariables(variables17);
        org.apache.commons.jxpath.IdentityManager identityManager19 = jXPathContextReferenceImpl13.getIdentityManager();
        java.text.DecimalFormatSymbols decimalFormatSymbols21 = null;
        jXPathContextReferenceImpl13.setDecimalFormatSymbols("", decimalFormatSymbols21);
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables25 = jXPathContext24.getVariables();
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer29 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables25, qName28);
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables32 = jXPathContext31.getVariables();
        org.apache.commons.jxpath.Pointer pointer34 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl35 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext31, (java.lang.Object) (byte) 100, pointer34);
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale37);
        java.lang.Object obj39 = jDOMNodePointer38.clone();
        java.lang.Object obj40 = jDOMNodePointer38.getImmediateNode();
        java.util.Locale locale41 = jDOMNodePointer38.getLocale();
        boolean boolean42 = jDOMNodePointer38.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = variablePointer29.createPath(jXPathContext31, (java.lang.Object) boolean42);
        variablePointer29.setIndex(74);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = variablePointer29.namespaceIterator();
        boolean boolean47 = variablePointer29.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = jXPathContextReferenceImpl13.getRelativeContext((org.apache.commons.jxpath.Pointer) variablePointer29);
        org.apache.commons.jxpath.ri.parser.Token token50 = new org.apache.commons.jxpath.ri.parser.Token();
        int int51 = token50.beginLine;
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        int[][] intArray58 = new int[][] { intArray52, intArray53, intArray54, intArray55, intArray56, intArray57 };
        java.lang.String[] strArray64 = new java.lang.String[] { "", "", "", "", "hi!" };
        org.apache.commons.jxpath.ri.parser.ParseException parseException65 = new org.apache.commons.jxpath.ri.parser.ParseException(token50, intArray58, strArray64);
        org.apache.commons.jxpath.ri.parser.Token token66 = parseException65.currentToken;
        java.lang.Class<?> wildcardClass67 = parseException65.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = jXPathContext48.getValue("org.apache.commons.jxpath.JXPathContextFactory", (java.lang.Class) wildcardClass67);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathNotFoundException; message: No value for xpath: org.apache.commons.jxpath.JXPathContextFactory");
        } catch (org.apache.commons.jxpath.JXPathNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(namespaceResolver14);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(variables17);
        org.junit.Assert.assertNull(identityManager19);
        org.junit.Assert.assertNotNull(jXPathContext24);
        org.junit.Assert.assertNotNull(variables25);
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertNotNull(variables32);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0f + "'", obj40, 10.0f);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNull(nodeIterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jXPathContext48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.clone();
        java.lang.Object obj5 = jDOMNodePointer3.getImmediateNode();
        java.util.Locale locale6 = jDOMNodePointer3.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer3.getParent();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer9 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer7, locale8);
        int int10 = collectionPointer9.getLength();
        java.lang.Object obj11 = collectionPointer9.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer9, "{}");
        org.apache.commons.jxpath.ri.QName qName14 = namespacePointer13.getName();
        java.io.Reader reader15 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream16 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader15);
        char[] charArray18 = simpleCharStream16.GetSuffix(56);
        simpleCharStream16.adjustBeginLineColumn(78, (int) 'a');
        simpleCharStream16.backup((int) '#');
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(nodePointer0, qName14, (java.lang.Object) '#', jXPathBeanInfo24);
        boolean boolean26 = beanPointer25.isDynamicPropertyDeclarationSupported();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        char[] charArray3 = simpleCharStream1.GetSuffix(56);
        java.io.Reader reader4 = null;
        simpleCharStream1.ReInit(reader4, 700, 7);
        simpleCharStream1.Done();
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleCharStream1.ReInit(inputStream9, 45, 4, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName0, locale1);
        java.lang.Object obj3 = nullPointer2.getRootNode();
        nullPointer2.setIndex((int) '#');
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer6 = nullPointer2.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer7 = nullPointer2.getPropertyPointer();
        propertyPointer7.setPropertyName("$hi!:hi!");
        boolean boolean10 = propertyPointer7.isActual();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(propertyPointer6);
        org.junit.Assert.assertNotNull(propertyPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.clone();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        boolean boolean6 = jDOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName9, locale10);
        java.lang.Object obj12 = nullPointer11.getRootNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer2.childIterator(nodeTest7, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11);
        java.lang.Object obj14 = nullPointer11.getImmediateNode();
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale16);
        java.lang.Object obj18 = jDOMNodePointer17.clone();
        java.lang.Object obj19 = jDOMNodePointer17.getImmediateNode();
        java.util.Locale locale20 = jDOMNodePointer17.getLocale();
        boolean boolean21 = jDOMNodePointer17.isActual();
        boolean boolean22 = jDOMNodePointer17.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer17.namespacePointer("");
        boolean boolean25 = nullPointer11.equals((java.lang.Object) jDOMNodePointer17);
        boolean boolean26 = jDOMNodePointer17.isLeaf();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(nodeIterator13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.jxpath.PackageFunctions packageFunctions2 = new org.apache.commons.jxpath.PackageFunctions("[]", "hi!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError1 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError("hi!");
        java.lang.Exception exception2 = jXPathContextFactoryConfigurationError1.getException();
        java.lang.Exception exception3 = jXPathContextFactoryConfigurationError1.getException();
        org.junit.Assert.assertNull(exception2);
        org.junit.Assert.assertNull(exception3);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        int int3 = dOMNodePointer2.getLength();
        int int4 = dOMNodePointer2.getLength();
        org.apache.commons.jxpath.Container container5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer7 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container5, locale6);
        boolean boolean8 = containerPointer7.isLeaf();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = containerPointer7.namespaceIterator();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.clone();
        java.lang.Object obj14 = jDOMNodePointer12.getImmediateNode();
        java.util.Locale locale15 = jDOMNodePointer12.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.getParent();
        java.lang.String str18 = jDOMNodePointer12.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer20 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, (java.lang.Object) "");
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.NodeSet nodeSet22 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext23 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext21, nodeSet22);
        org.apache.commons.jxpath.NodeSet nodeSet24 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext25 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext23, nodeSet24);
        boolean boolean26 = collectionPointer20.equals((java.lang.Object) nodeSet24);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        org.apache.commons.beanutils.DynaBean dynaBean28 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer29 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer20, qName27, dynaBean28);
        int int30 = dOMNodePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer7, (org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer29);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables33 = jXPathContext32.getVariables();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer37 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables33, qName36);
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables40 = jXPathContext39.getVariables();
        org.apache.commons.jxpath.Pointer pointer42 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl43 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext39, (java.lang.Object) (byte) 100, pointer42);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale45);
        java.lang.Object obj47 = jDOMNodePointer46.clone();
        java.lang.Object obj48 = jDOMNodePointer46.getImmediateNode();
        java.util.Locale locale49 = jDOMNodePointer46.getLocale();
        boolean boolean50 = jDOMNodePointer46.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = variablePointer37.createPath(jXPathContext39, (java.lang.Object) boolean50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = null;
        org.apache.commons.jxpath.ri.QName qName53 = null;
        org.apache.commons.beanutils.DynaBean dynaBean54 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer55 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer52, qName53, dynaBean54);
        dynaBeanPointer55.setIndex(0);
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale59);
        java.lang.Object obj61 = jDOMNodePointer60.getImmediateNode();
        dynaBeanPointer55.parent = jDOMNodePointer60;
        java.lang.Object obj63 = jDOMNodePointer60.getRootNode();
        java.lang.Object obj64 = jDOMNodePointer60.getBaseValue();
        nodePointer51.setValue((java.lang.Object) jDOMNodePointer60);
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.NodeSet nodeSet67 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext68 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext66, nodeSet67);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext71 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext68, nodeTest69, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = precedingOrFollowingContext71.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext75 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext71, false, nodeTest74);
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer76 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer(nodePointer51, (java.lang.Object) ancestorContext75);
        org.apache.commons.jxpath.ri.EvalContext evalContext77 = null;
        org.apache.commons.jxpath.NodeSet nodeSet78 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext79 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext77, nodeSet78);
        org.apache.commons.jxpath.ri.EvalContext evalContext80 = null;
        org.apache.commons.jxpath.NodeSet nodeSet81 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext82 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext80, nodeSet81);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest83 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext85 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext82, nodeTest83, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = precedingOrFollowingContext85.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray87 = new org.apache.commons.jxpath.ri.EvalContext[] { precedingOrFollowingContext85 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext79, evalContextArray87);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext89 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext75, evalContextArray87);
        boolean boolean90 = dOMNodePointer2.equals((java.lang.Object) unionContext89);
        unionContext89.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(nodeIterator9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(jXPathContext32);
        org.junit.Assert.assertNotNull(variables33);
        org.junit.Assert.assertNotNull(jXPathContext39);
        org.junit.Assert.assertNotNull(variables40);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10.0f + "'", obj48, 10.0f);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0f + "'", obj61, 10.0f);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 10.0f + "'", obj63, 10.0f);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 10.0f + "'", obj64, 10.0f);
        org.junit.Assert.assertNull(nodePointer72);
        org.junit.Assert.assertNull(nodePointer86);
        org.junit.Assert.assertNotNull(evalContextArray87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        java.io.Reader reader2 = null;
        simpleCharStream1.ReInit(reader2, 4, (int) (byte) 0);
        int int6 = simpleCharStream1.getBeginColumn();
        int int7 = simpleCharStream1.getBeginColumn();
        char[] charArray9 = simpleCharStream1.GetSuffix(73);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.Pointer pointer3 = jXPathContext1.getNamespaceContextPointer();
        org.apache.commons.jxpath.Functions functions4 = jXPathContext1.getFunctions();
        org.apache.commons.jxpath.KeyManager keyManager5 = jXPathContext1.getKeyManager();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNotNull(pointer3);
        org.junit.Assert.assertNotNull(functions4);
        org.junit.Assert.assertNull(keyManager5);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        int int3 = dOMNodePointer2.getLength();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName5, locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale9);
        java.lang.Object obj11 = jDOMNodePointer10.clone();
        java.lang.Object obj12 = jDOMNodePointer10.getImmediateNode();
        java.util.Locale locale13 = jDOMNodePointer10.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = jDOMNodePointer10.getParent();
        int int15 = jDOMNodePointer10.getLength();
        org.apache.commons.jxpath.ri.QName qName16 = jDOMNodePointer10.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = nullPointer7.attributeIterator(qName16);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest19 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName16, "$hi!:hi!");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName16, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dOMNodePointer2.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(qName16);
        org.junit.Assert.assertNotNull(nodeIterator17);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.ri.QName qName5 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer6 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables2, qName5);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables9 = jXPathContext8.getVariables();
        org.apache.commons.jxpath.Pointer pointer11 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext8, (java.lang.Object) (byte) 100, pointer11);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale14);
        java.lang.Object obj16 = jDOMNodePointer15.clone();
        java.lang.Object obj17 = jDOMNodePointer15.getImmediateNode();
        java.util.Locale locale18 = jDOMNodePointer15.getLocale();
        boolean boolean19 = jDOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = variablePointer6.createPath(jXPathContext8, (java.lang.Object) boolean19);
        boolean boolean21 = variablePointer6.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = variablePointer6.namespacePointer("|null");
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables26 = jXPathContext25.getVariables();
        org.apache.commons.jxpath.Pointer pointer28 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext25, (java.lang.Object) (byte) 100, pointer28);
        org.apache.commons.jxpath.AbstractFactory abstractFactory30 = null;
        jXPathContextReferenceImpl29.setFactory(abstractFactory30);
        java.io.Reader reader32 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream33 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader32);
        char[] charArray35 = simpleCharStream33.GetSuffix(56);
        org.apache.commons.jxpath.Pointer pointer36 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl37 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl29, (java.lang.Object) 56, pointer36);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver38 = jXPathContextReferenceImpl37.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables41 = jXPathContext40.getVariables();
        jXPathContextReferenceImpl37.setVariables(variables41);
        java.lang.String str44 = jXPathContextReferenceImpl37.getPrefix("/");
        variablePointer6.findVariables((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl37);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNotNull(jXPathContext8);
        org.junit.Assert.assertNotNull(variables9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(jXPathContext25);
        org.junit.Assert.assertNotNull(variables26);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(namespaceResolver38);
        org.junit.Assert.assertNotNull(jXPathContext40);
        org.junit.Assert.assertNotNull(variables41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.clone();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.getParent();
        java.lang.String str8 = jDOMNodePointer2.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) "");
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeSet14);
        boolean boolean16 = collectionPointer10.equals((java.lang.Object) nodeSet14);
        org.apache.commons.jxpath.ri.QName qName17 = collectionPointer10.getName();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(qName17);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer0, qName1, dynaBean2);
        java.lang.Object obj4 = dynaBeanPointer3.getImmediateNode();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler0.qname("org.apache.commons.jxpath.JXPathContextFactory", "org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.NodeSet nodeSet6 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext7 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext5, nodeSet6);
        boolean boolean9 = nodeSetContext7.setPosition((int) (short) -1);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.clone();
        java.lang.Object obj14 = jDOMNodePointer12.getImmediateNode();
        java.util.Locale locale15 = jDOMNodePointer12.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.getParent();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer18 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer16, locale17);
        int int19 = collectionPointer18.getLength();
        java.lang.Object obj20 = collectionPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer22 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer18, "{}");
        org.apache.commons.jxpath.ri.QName qName23 = namespacePointer22.getName();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) nodeSetContext7, qName23, locale24);
        java.lang.Object obj26 = treeCompiler0.equal(obj4, (java.lang.Object) locale24);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray27 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreOperationUnion coreOperationUnion28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationUnion(expressionArray27);
        java.lang.Object obj29 = treeCompiler0.or((java.lang.Object[]) expressionArray27);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler30 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj32 = treeCompiler30.nodeTypeTest((int) (short) -1);
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer35 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName33, locale34);
        java.lang.Object obj36 = nullPointer35.getRootNode();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer37 = nullPointer35.getPropertyPointer();
        boolean boolean38 = propertyPointer37.isLeaf();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale40);
        java.lang.Object obj42 = jDOMNodePointer41.clone();
        java.lang.Object obj43 = jDOMNodePointer41.getImmediateNode();
        java.util.Locale locale44 = jDOMNodePointer41.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer41.getParent();
        int int46 = jDOMNodePointer41.getLength();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer47 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer37, (java.lang.Object) int46);
        org.apache.commons.jxpath.ri.QName qName48 = propertyPointer37.getName();
        java.lang.String[] strArray49 = propertyPointer37.getPropertyNames();
        java.lang.Object obj50 = treeCompiler30.union((java.lang.Object[]) strArray49);
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale52);
        java.lang.String str54 = jDOMNodePointer53.getNamespaceURI();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver55 = jDOMNodePointer53.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.Step step57 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray58 = new org.apache.commons.jxpath.ri.compiler.Step[] { step57 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath59 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray58);
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray60 = locationPath59.getSteps();
        java.lang.Object obj61 = treeCompiler30.function((java.lang.Object) namespaceResolver55, (java.lang.Object[]) stepArray60);
        java.lang.Object obj62 = treeCompiler0.union((java.lang.Object[]) stepArray60);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(expressionArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "UNKNOWN()");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(propertyPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0f + "'", obj43, 10.0f);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(qName48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(namespaceResolver55);
        org.junit.Assert.assertNotNull(stepArray58);
        org.junit.Assert.assertNotNull(stepArray60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "null(null)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "null(null)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "null(null)");
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.ri.QName qName5 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer6 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables2, qName5);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables9 = jXPathContext8.getVariables();
        org.apache.commons.jxpath.Pointer pointer11 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext8, (java.lang.Object) (byte) 100, pointer11);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale14);
        java.lang.Object obj16 = jDOMNodePointer15.clone();
        java.lang.Object obj17 = jDOMNodePointer15.getImmediateNode();
        java.util.Locale locale18 = jDOMNodePointer15.getLocale();
        boolean boolean19 = jDOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = variablePointer6.createPath(jXPathContext8, (java.lang.Object) boolean19);
        int int21 = variablePointer6.getLength();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver22 = variablePointer6.getNamespaceResolver();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNotNull(jXPathContext8);
        org.junit.Assert.assertNotNull(variables9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0f + "'", obj17, 10.0f);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(namespaceResolver22);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler0.qname("org.apache.commons.jxpath.JXPathContextFactory", "org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.NodeSet nodeSet6 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext7 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext5, nodeSet6);
        boolean boolean9 = nodeSetContext7.setPosition((int) (short) -1);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.clone();
        java.lang.Object obj14 = jDOMNodePointer12.getImmediateNode();
        java.util.Locale locale15 = jDOMNodePointer12.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.getParent();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer18 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer16, locale17);
        int int19 = collectionPointer18.getLength();
        java.lang.Object obj20 = collectionPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer22 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer18, "{}");
        org.apache.commons.jxpath.ri.QName qName23 = namespacePointer22.getName();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) nodeSetContext7, qName23, locale24);
        java.lang.Object obj26 = treeCompiler0.equal(obj4, (java.lang.Object) locale24);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray27 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreOperationUnion coreOperationUnion28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationUnion(expressionArray27);
        java.lang.Object obj29 = treeCompiler0.or((java.lang.Object[]) expressionArray27);
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray31 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath32 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray31);
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray33 = locationPath32.getSteps();
        java.lang.Object obj34 = treeCompiler0.and((java.lang.Object[]) stepArray33);
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables37 = jXPathContext36.getVariables();
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer41 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables37, qName40);
        org.apache.commons.jxpath.JXPathContext jXPathContext43 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables44 = jXPathContext43.getVariables();
        org.apache.commons.jxpath.Pointer pointer46 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl47 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext43, (java.lang.Object) (byte) 100, pointer46);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale49);
        java.lang.Object obj51 = jDOMNodePointer50.clone();
        java.lang.Object obj52 = jDOMNodePointer50.getImmediateNode();
        java.util.Locale locale53 = jDOMNodePointer50.getLocale();
        boolean boolean54 = jDOMNodePointer50.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = variablePointer41.createPath(jXPathContext43, (java.lang.Object) boolean54);
        variablePointer41.setIndex(74);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = variablePointer41.namespaceIterator();
        boolean boolean59 = variablePointer41.isContainer();
        int int60 = variablePointer41.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = variablePointer41.namespacePointer("org.apache.commons.jxpath.JXPathContextFactory");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = treeCompiler0.nodeNameTest((java.lang.Object) "org.apache.commons.jxpath.JXPathContextFactory");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.commons.jxpath.ri.QName");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(expressionArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(stepArray31);
        org.junit.Assert.assertNotNull(stepArray33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(variables37);
        org.junit.Assert.assertNotNull(jXPathContext43);
        org.junit.Assert.assertNotNull(variables44);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0f + "'", obj52, 10.0f);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertNull(nodeIterator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(nodePointer62);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj2 = treeCompiler0.nodeTypeTest((int) (short) -1);
        java.lang.Object obj3 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables6 = jXPathContext5.getVariables();
        org.apache.commons.jxpath.Pointer pointer8 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl9 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext5, (java.lang.Object) (byte) 100, pointer8);
        org.apache.commons.jxpath.AbstractFactory abstractFactory10 = null;
        jXPathContextReferenceImpl9.setFactory(abstractFactory10);
        java.io.Reader reader12 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream13 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader12);
        char[] charArray15 = simpleCharStream13.GetSuffix(56);
        org.apache.commons.jxpath.Pointer pointer16 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl9, (java.lang.Object) 56, pointer16);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver18 = jXPathContextReferenceImpl17.getNamespaceResolver();
        org.apache.commons.jxpath.Pointer pointer19 = jXPathContextReferenceImpl17.getContextPointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = treeCompiler0.minus(obj3, (java.lang.Object) pointer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "UNKNOWN()");
        org.junit.Assert.assertNotNull(jXPathContext5);
        org.junit.Assert.assertNotNull(variables6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(namespaceResolver18);
        org.junit.Assert.assertNotNull(pointer19);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName0, locale1);
        java.lang.Object obj3 = nullPointer2.getRootNode();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer4 = nullPointer2.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = propertyPointer4.getImmediateValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = propertyPointer4.isLanguage("http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(propertyPointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        int int3 = dOMNodePointer2.getLength();
        int int4 = dOMNodePointer2.getLength();
        org.apache.commons.jxpath.Container container5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer7 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container5, locale6);
        boolean boolean8 = containerPointer7.isLeaf();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = containerPointer7.namespaceIterator();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.clone();
        java.lang.Object obj14 = jDOMNodePointer12.getImmediateNode();
        java.util.Locale locale15 = jDOMNodePointer12.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.getParent();
        java.lang.String str18 = jDOMNodePointer12.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer20 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, (java.lang.Object) "");
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.NodeSet nodeSet22 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext23 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext21, nodeSet22);
        org.apache.commons.jxpath.NodeSet nodeSet24 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext25 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext23, nodeSet24);
        boolean boolean26 = collectionPointer20.equals((java.lang.Object) nodeSet24);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        org.apache.commons.beanutils.DynaBean dynaBean28 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer29 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer20, qName27, dynaBean28);
        int int30 = dOMNodePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer7, (org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer29);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables33 = jXPathContext32.getVariables();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer37 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables33, qName36);
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables40 = jXPathContext39.getVariables();
        org.apache.commons.jxpath.Pointer pointer42 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl43 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext39, (java.lang.Object) (byte) 100, pointer42);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale45);
        java.lang.Object obj47 = jDOMNodePointer46.clone();
        java.lang.Object obj48 = jDOMNodePointer46.getImmediateNode();
        java.util.Locale locale49 = jDOMNodePointer46.getLocale();
        boolean boolean50 = jDOMNodePointer46.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = variablePointer37.createPath(jXPathContext39, (java.lang.Object) boolean50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = null;
        org.apache.commons.jxpath.ri.QName qName53 = null;
        org.apache.commons.beanutils.DynaBean dynaBean54 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer55 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer52, qName53, dynaBean54);
        dynaBeanPointer55.setIndex(0);
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale59);
        java.lang.Object obj61 = jDOMNodePointer60.getImmediateNode();
        dynaBeanPointer55.parent = jDOMNodePointer60;
        java.lang.Object obj63 = jDOMNodePointer60.getRootNode();
        java.lang.Object obj64 = jDOMNodePointer60.getBaseValue();
        nodePointer51.setValue((java.lang.Object) jDOMNodePointer60);
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.NodeSet nodeSet67 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext68 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext66, nodeSet67);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext71 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext68, nodeTest69, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = precedingOrFollowingContext71.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext75 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext71, false, nodeTest74);
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer76 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer(nodePointer51, (java.lang.Object) ancestorContext75);
        org.apache.commons.jxpath.ri.EvalContext evalContext77 = null;
        org.apache.commons.jxpath.NodeSet nodeSet78 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext79 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext77, nodeSet78);
        org.apache.commons.jxpath.ri.EvalContext evalContext80 = null;
        org.apache.commons.jxpath.NodeSet nodeSet81 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext82 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext80, nodeSet81);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest83 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext85 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext82, nodeTest83, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = precedingOrFollowingContext85.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray87 = new org.apache.commons.jxpath.ri.EvalContext[] { precedingOrFollowingContext85 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext79, evalContextArray87);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext89 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext75, evalContextArray87);
        boolean boolean90 = dOMNodePointer2.equals((java.lang.Object) unionContext89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = unionContext89.setPosition(29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(nodeIterator9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(jXPathContext32);
        org.junit.Assert.assertNotNull(variables33);
        org.junit.Assert.assertNotNull(jXPathContext39);
        org.junit.Assert.assertNotNull(variables40);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10.0f + "'", obj48, 10.0f);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0f + "'", obj61, 10.0f);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 10.0f + "'", obj63, 10.0f);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 10.0f + "'", obj64, 10.0f);
        org.junit.Assert.assertNull(nodePointer72);
        org.junit.Assert.assertNull(nodePointer86);
        org.junit.Assert.assertNotNull(evalContextArray87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        int int0 = org.apache.commons.jxpath.ri.Compiler.FUNCTION_NORMALIZE_SPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler0.qname("org.apache.commons.jxpath.JXPathContextFactory", "org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.NodeSet nodeSet6 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext7 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext5, nodeSet6);
        boolean boolean9 = nodeSetContext7.setPosition((int) (short) -1);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.clone();
        java.lang.Object obj14 = jDOMNodePointer12.getImmediateNode();
        java.util.Locale locale15 = jDOMNodePointer12.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.getParent();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer18 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer16, locale17);
        int int19 = collectionPointer18.getLength();
        java.lang.Object obj20 = collectionPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer22 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer18, "{}");
        org.apache.commons.jxpath.ri.QName qName23 = namespacePointer22.getName();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) nodeSetContext7, qName23, locale24);
        java.lang.Object obj26 = treeCompiler0.equal(obj4, (java.lang.Object) locale24);
        org.apache.commons.jxpath.PackageFunctions packageFunctions30 = new org.apache.commons.jxpath.PackageFunctions("", "");
        java.lang.String[] strArray33 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        org.apache.commons.jxpath.Function function34 = packageFunctions30.getFunction("hi!", "", (java.lang.Object[]) strArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = treeCompiler0.locationPath(true, (java.lang.Object[]) strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Step");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "org.apache.commons.jxpath.JXPathContextFactory:org.apache.commons.jxpath.JXPathAbstractFactoryException: hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(qName23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(function34);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "/");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables5 = jXPathContext4.getVariables();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nullPointer2.createPath(jXPathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(/)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext4);
        org.junit.Assert.assertNotNull(variables5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.jxpath.CompiledExpression compiledExpression1 = org.apache.commons.jxpath.JXPathContext.compile("UNKNOWN");
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables4 = jXPathContext3.getVariables();
        org.apache.commons.jxpath.Pointer pointer6 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl7 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext3, (java.lang.Object) (byte) 100, pointer6);
        java.text.DecimalFormatSymbols decimalFormatSymbols9 = jXPathContextReferenceImpl7.getDecimalFormatSymbols("");
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables12 = jXPathContext11.getVariables();
        org.apache.commons.jxpath.Pointer pointer14 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext11, (java.lang.Object) (byte) 100, pointer14);
        org.apache.commons.jxpath.AbstractFactory abstractFactory16 = null;
        jXPathContextReferenceImpl15.setFactory(abstractFactory16);
        java.io.Reader reader18 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream19 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader18);
        char[] charArray21 = simpleCharStream19.GetSuffix(56);
        org.apache.commons.jxpath.Pointer pointer22 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl23 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl15, (java.lang.Object) 56, pointer22);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver24 = jXPathContextReferenceImpl23.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables27 = jXPathContext26.getVariables();
        jXPathContextReferenceImpl23.setVariables(variables27);
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale30);
        java.lang.Object obj32 = jDOMNodePointer31.clone();
        java.lang.Object obj33 = jDOMNodePointer31.getImmediateNode();
        java.util.Locale locale34 = jDOMNodePointer31.getLocale();
        boolean boolean35 = jDOMNodePointer31.isActual();
        jDOMNodePointer31.setAttribute(false);
        boolean boolean38 = jDOMNodePointer31.isActual();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl39 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl7, (java.lang.Object) jXPathContextReferenceImpl23, (org.apache.commons.jxpath.Pointer) jDOMNodePointer31);
        org.apache.commons.jxpath.JXPathContext jXPathContext41 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables42 = jXPathContext41.getVariables();
        org.apache.commons.jxpath.ri.QName qName45 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer46 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables42, qName45);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale49);
        java.lang.Object obj51 = jDOMNodePointer50.clone();
        java.lang.Object obj52 = jDOMNodePointer50.getImmediateNode();
        java.util.Locale locale53 = jDOMNodePointer50.getLocale();
        boolean boolean54 = jDOMNodePointer50.isActual();
        boolean boolean55 = jDOMNodePointer50.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = jDOMNodePointer50.namespacePointer("");
        variables42.declareVariable("", (java.lang.Object) jDOMNodePointer50);
        jXPathContextReferenceImpl39.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNodePointer50);
        org.apache.commons.jxpath.ri.EvalContext evalContext60 = jXPathContextReferenceImpl39.getAbsoluteRootContext();
        java.util.Iterator iterator61 = compiledExpression1.iteratePointers((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl39);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale63);
        java.lang.Object obj65 = jDOMNodePointer64.clone();
        java.lang.Object obj66 = jDOMNodePointer64.getImmediateNode();
        java.util.Locale locale67 = jDOMNodePointer64.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMNodePointer64.getParent();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer70 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer68, locale69);
        int int71 = collectionPointer70.getLength();
        java.lang.Object obj72 = collectionPointer70.getImmediateNode();
        java.lang.String str73 = collectionPointer70.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables76 = jXPathContext75.getVariables();
        org.apache.commons.jxpath.Pointer pointer78 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl79 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext75, (java.lang.Object) (byte) 100, pointer78);
        java.text.DecimalFormatSymbols decimalFormatSymbols81 = jXPathContextReferenceImpl79.getDecimalFormatSymbols("");
        jXPathContextReferenceImpl79.registerNamespace("org.apache.commons.jxpath.JXPathFunctionNotFoundException: hi!", "hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer85 = collectionPointer70.createPath((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl79);
        org.apache.commons.jxpath.Pointer pointer86 = jXPathContextReferenceImpl79.getContextPointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer87 = compiledExpression1.createPath((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: 100/UNKNOWN");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compiledExpression1);
        org.junit.Assert.assertNotNull(jXPathContext3);
        org.junit.Assert.assertNotNull(variables4);
        org.junit.Assert.assertNull(decimalFormatSymbols9);
        org.junit.Assert.assertNotNull(jXPathContext11);
        org.junit.Assert.assertNotNull(variables12);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(namespaceResolver24);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(variables27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0f + "'", obj33, 10.0f);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jXPathContext41);
        org.junit.Assert.assertNotNull(variables42);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0f + "'", obj52, 10.0f);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertNotNull(evalContext60);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 10.0f + "'", obj66, 10.0f);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNull(nodePointer68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "/" + "'", str73, "/");
        org.junit.Assert.assertNotNull(jXPathContext75);
        org.junit.Assert.assertNotNull(variables76);
        org.junit.Assert.assertNull(decimalFormatSymbols81);
        org.junit.Assert.assertNotNull(nodePointer85);
        org.junit.Assert.assertNotNull(pointer86);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        boolean boolean4 = nodeSetContext2.setPosition((int) (short) -1);
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale6);
        java.lang.Object obj8 = jDOMNodePointer7.clone();
        java.lang.Object obj9 = jDOMNodePointer7.getImmediateNode();
        java.util.Locale locale10 = jDOMNodePointer7.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer7.getParent();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer13 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nodePointer11, locale12);
        int int14 = collectionPointer13.getLength();
        java.lang.Object obj15 = collectionPointer13.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer17 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer13, "{}");
        org.apache.commons.jxpath.ri.QName qName18 = namespacePointer17.getName();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) nodeSetContext2, qName18, locale19);
        boolean boolean21 = nodeSetContext2.nextNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(qName18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext5 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = precedingOrFollowingContext5.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext9 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext5, false, nodeTest8);
        org.apache.commons.jxpath.NodeSet nodeSet10 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext11 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext9, nodeSet10);
        int int12 = nodeSetContext11.getCurrentPosition();
        int int13 = nodeSetContext11.getDocumentOrder();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.jxpath.ri.compiler.Step step1 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray2 = new org.apache.commons.jxpath.ri.compiler.Step[] { step1 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath3 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray2);
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables6 = jXPathContext5.getVariables();
        org.apache.commons.jxpath.Pointer pointer8 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl9 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext5, (java.lang.Object) (byte) 100, pointer8);
        java.text.DecimalFormatSymbols decimalFormatSymbols11 = jXPathContextReferenceImpl9.getDecimalFormatSymbols("");
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables14 = jXPathContext13.getVariables();
        org.apache.commons.jxpath.Pointer pointer16 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext13, (java.lang.Object) (byte) 100, pointer16);
        org.apache.commons.jxpath.AbstractFactory abstractFactory18 = null;
        jXPathContextReferenceImpl17.setFactory(abstractFactory18);
        java.io.Reader reader20 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream21 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader20);
        char[] charArray23 = simpleCharStream21.GetSuffix(56);
        org.apache.commons.jxpath.Pointer pointer24 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl25 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl17, (java.lang.Object) 56, pointer24);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = jXPathContextReferenceImpl25.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables29 = jXPathContext28.getVariables();
        jXPathContextReferenceImpl25.setVariables(variables29);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale32);
        java.lang.Object obj34 = jDOMNodePointer33.clone();
        java.lang.Object obj35 = jDOMNodePointer33.getImmediateNode();
        java.util.Locale locale36 = jDOMNodePointer33.getLocale();
        boolean boolean37 = jDOMNodePointer33.isActual();
        jDOMNodePointer33.setAttribute(false);
        boolean boolean40 = jDOMNodePointer33.isActual();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl41 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl9, (java.lang.Object) jXPathContextReferenceImpl25, (org.apache.commons.jxpath.Pointer) jDOMNodePointer33);
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray44 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath45 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray44);
        org.apache.commons.jxpath.Pointer pointer46 = jXPathContextReferenceImpl9.createPath("$hi!:hi!", (org.apache.commons.jxpath.ri.compiler.Expression) locationPath45);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) locationPath3, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath45);
        org.apache.commons.jxpath.ri.EvalContext evalContext48 = null;
        org.apache.commons.jxpath.NodeSet nodeSet49 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext50 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext48, nodeSet49);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext53 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext50, nodeTest51, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = precedingOrFollowingContext53.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext57 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext53, false, nodeTest56);
        int int58 = precedingOrFollowingContext53.getDocumentOrder();
        int int59 = precedingOrFollowingContext53.getDocumentOrder();
        int int60 = precedingOrFollowingContext53.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = coreOperationEqual47.compute((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepArray2);
        org.junit.Assert.assertNotNull(jXPathContext5);
        org.junit.Assert.assertNotNull(variables6);
        org.junit.Assert.assertNull(decimalFormatSymbols11);
        org.junit.Assert.assertNotNull(jXPathContext13);
        org.junit.Assert.assertNotNull(variables14);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(namespaceResolver26);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(variables29);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0f + "'", obj35, 10.0f);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stepArray44);
        org.junit.Assert.assertNotNull(pointer46);
        org.junit.Assert.assertNull(nodePointer54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 55, 13, 100);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.jxpath.ri.compiler.Step step1 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray2 = new org.apache.commons.jxpath.ri.compiler.Step[] { step1 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath3 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray2);
        org.apache.commons.jxpath.ri.compiler.Step step5 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray6 = new org.apache.commons.jxpath.ri.compiler.Step[] { step5 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath7 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray6);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) locationPath3, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath7);
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual8, expression9);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables13 = jXPathContext12.getVariables();
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("hi!", "hi!");
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer17 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables13, qName16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables20 = jXPathContext19.getVariables();
        org.apache.commons.jxpath.Pointer pointer22 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl23 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext19, (java.lang.Object) (byte) 100, pointer22);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale25);
        java.lang.Object obj27 = jDOMNodePointer26.clone();
        java.lang.Object obj28 = jDOMNodePointer26.getImmediateNode();
        java.util.Locale locale29 = jDOMNodePointer26.getLocale();
        boolean boolean30 = jDOMNodePointer26.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = variablePointer17.createPath(jXPathContext19, (java.lang.Object) boolean30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.beanutils.DynaBean dynaBean34 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer35 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer32, qName33, dynaBean34);
        dynaBeanPointer35.setIndex(0);
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale39);
        java.lang.Object obj41 = jDOMNodePointer40.getImmediateNode();
        dynaBeanPointer35.parent = jDOMNodePointer40;
        java.lang.Object obj43 = jDOMNodePointer40.getRootNode();
        java.lang.Object obj44 = jDOMNodePointer40.getBaseValue();
        nodePointer31.setValue((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.NodeSet nodeSet47 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext48 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext46, nodeSet47);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext51 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext48, nodeTest49, false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = precedingOrFollowingContext51.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext55 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext51, false, nodeTest54);
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer56 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer(nodePointer31, (java.lang.Object) ancestorContext55);
        int int57 = ancestorContext55.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Step step60 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray61 = new org.apache.commons.jxpath.ri.compiler.Step[] { step60 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath62 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray61);
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath63 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray61);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray64 = new org.apache.commons.jxpath.ri.compiler.Expression[] { locationPath63 };
        org.apache.commons.jxpath.ri.compiler.CoreOperationUnion coreOperationUnion65 = new org.apache.commons.jxpath.ri.compiler.CoreOperationUnion(expressionArray64);
        org.apache.commons.jxpath.ri.compiler.CoreOperationUnion coreOperationUnion66 = new org.apache.commons.jxpath.ri.compiler.CoreOperationUnion(expressionArray64);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext67 = new org.apache.commons.jxpath.ri.axes.PredicateContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext55, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationUnion66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = coreOperationEqual8.compute((org.apache.commons.jxpath.ri.EvalContext) predicateContext67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepArray2);
        org.junit.Assert.assertNotNull(stepArray6);
        org.junit.Assert.assertNotNull(jXPathContext12);
        org.junit.Assert.assertNotNull(variables13);
        org.junit.Assert.assertNotNull(jXPathContext19);
        org.junit.Assert.assertNotNull(variables20);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10.0f + "'", obj41, 10.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0f + "'", obj43, 10.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10.0f + "'", obj44, 10.0f);
        org.junit.Assert.assertNull(nodePointer52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(stepArray61);
        org.junit.Assert.assertNotNull(expressionArray64);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int1 = dynaBeanPointerFactory0.getOrder();
        int int2 = dynaBeanPointerFactory0.getOrder();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.addNodePointerFactory((org.apache.commons.jxpath.ri.model.NodePointerFactory) dynaBeanPointerFactory0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 700 + "'", int2 == 700);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) (-1.0f));
        org.apache.commons.jxpath.Variables variables2 = jXPathContext1.getVariables();
        org.apache.commons.jxpath.Pointer pointer4 = null;
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl5 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext1, (java.lang.Object) (byte) 100, pointer4);
        java.lang.String str7 = jXPathContextReferenceImpl5.getNamespaceURI("UNKNOWN");
        java.lang.Object obj8 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = org.apache.commons.jxpath.JXPathContext.newContext((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl5, obj8);
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray12 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath13 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray12);
        java.util.Iterator iterator14 = jXPathContextReferenceImpl5.iterate("org.apache.commons.jxpath.JXPathFunctionNotFoundException: hi!", (org.apache.commons.jxpath.ri.compiler.Expression) locationPath13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator16 = jXPathContextReferenceImpl5.iterate("/namespace::{}");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: '/namespace::{}'. Invalid symbol '{' after: '/namespace::'");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(variables2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jXPathContext9);
        org.junit.Assert.assertNotNull(stepArray12);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.clone();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.getParent();
        java.lang.String str8 = jDOMNodePointer2.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) "");
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeSet14);
        boolean boolean16 = collectionPointer10.equals((java.lang.Object) nodeSet14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = collectionPointer10.parent;
        java.lang.String str18 = collectionPointer10.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = collectionPointer10.namespacePointer("null");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(nodePointer20);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.clone();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.getParent();
        java.lang.String str8 = jDOMNodePointer2.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) "");
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeSet14);
        boolean boolean16 = collectionPointer10.equals((java.lang.Object) nodeSet14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = collectionPointer10.parent;
        java.lang.Object obj18 = nodePointer17.getRootNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.NodeSet nodeSet20 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext21 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext19, nodeSet20);
        org.apache.commons.jxpath.NodeSet nodeSet22 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext23 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, nodeSet22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer26 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName24, locale25);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale28);
        java.lang.Object obj30 = jDOMNodePointer29.clone();
        java.lang.Object obj31 = jDOMNodePointer29.getImmediateNode();
        java.util.Locale locale32 = jDOMNodePointer29.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer29.getParent();
        int int34 = jDOMNodePointer29.getLength();
        org.apache.commons.jxpath.ri.QName qName35 = jDOMNodePointer29.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = nullPointer26.attributeIterator(qName35);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest38 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName35, "$hi!:hi!");
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator40 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) nodeSetContext23, qName35, locale39);
        org.apache.commons.jxpath.Container container41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer43 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container41, locale42);
        java.lang.String str44 = containerPointer43.asPath();
        containerPointer43.remove();
        org.apache.commons.jxpath.ri.QName qName46 = containerPointer43.getName();
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer49 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName47, locale48);
        java.lang.Object obj50 = nullPointer49.getRootNode();
        nullPointer49.setIndex((int) '#');
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer53 = nullPointer49.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer54 = nullPointer49.getPropertyPointer();
        propertyPointer54.setPropertyName("$hi!:hi!");
        containerPointer43.parent = propertyPointer54;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler58 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer59 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer17, qName35, (java.lang.Object) propertyPointer54, dynamicPropertyHandler58);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0f + "'", obj31, 10.0f);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "/" + "'", str44, "/");
        org.junit.Assert.assertNull(qName46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(propertyPointer53);
        org.junit.Assert.assertNotNull(propertyPointer54);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName0, locale1);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer3 = nullPointer2.getPropertyPointer();
        nullPointer2.setAttribute(true);
        boolean boolean6 = nullPointer2.isLeaf();
        org.junit.Assert.assertNotNull(propertyPointer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer0, qName1, dynaBean2);
        dynaBeanPointer3.setIndex(0);
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10.0f, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getImmediateNode();
        dynaBeanPointer3.parent = jDOMNodePointer8;
        java.lang.Object obj11 = jDOMNodePointer8.getRootNode();
        java.lang.Object obj12 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer8.namespaceIterator();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertNotNull(nodeIterator13);
    }
}

