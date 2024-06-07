package org.apache.commons.jxpath.ri.model.jdom;

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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = null;
        boolean boolean3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer0, (java.lang.Object) (byte) -1, nodeTest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.apache.commons.jxpath.ri.Compiler.FUNCTION_NOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.AXIS_NAMESPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        boolean boolean16 = nullPointer2.isCollection();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale3, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        boolean boolean8 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer5, (java.lang.Object) 2, nodeTest7);
        int int9 = nullPointer5.getIndex();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = nullPointer5.attributeIterator(qName12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer0, nodeTest1, true, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, obj4, jXPathBeanInfo5, locale6);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = beanPointer7.getPropertyPointer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, (java.lang.Object) 2, nodeTest13);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str20 = qName19.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = beanPointerFactory15.createNodePointer(nodePointer16, qName19, (java.lang.Object) 10);
        org.w3c.dom.Node node23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node23, locale24, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = dOMNodePointer26.getNamespaceResolver();
        nodePointer22.setNamespaceResolver(namespaceResolver27);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = propertyPointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, nodePointer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":UNKNOWN" + "'", str20, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(namespaceResolver27);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        org.apache.commons.jxpath.ri.QName qName16 = nullPointer2.getName();
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale18, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        boolean boolean23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer20, (java.lang.Object) 2, nodeTest22);
        int int24 = nullPointer20.getIndex();
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        java.lang.Object obj29 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName27, obj29, jXPathBeanInfo30, locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = nullPointer20.attributeIterator(qName27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nullPointer2.createChild(jXPathContext17, qName27, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(UNKNOWN)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator33);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dOMNodePointer3.isLanguage(":UNKNOWN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dOMNodePointer3.createAttribute(jXPathContext6, qName9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('UNKNOWN')/@:UNKNOWN, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str9 = qName8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dOMNodePointer3.createChild(jXPathContext5, qName8, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":UNKNOWN" + "'", str9, ":UNKNOWN");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest5 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName3, ":UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        java.beans.PropertyDescriptor propertyDescriptor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.jxpath.util.ValueUtils.getValue(obj6, propertyDescriptor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = org.apache.commons.jxpath.ri.Compiler.AXIS_PRECEDING_SIBLING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dOMNodePointer3.isLanguage("http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver1 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        org.jdom.Namespace namespace3 = null;
        java.lang.String str4 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute((java.lang.Object) namespaceResolver0, "JDOM", namespace3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.FUNCTION_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 56 + "'", int0 == 56);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        boolean boolean6 = selfContext4.setPosition(25);
        org.jdom.Namespace namespace8 = null;
        java.lang.String str9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute((java.lang.Object) boolean6, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", namespace8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str23 = qName22.toString();
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer27 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName22, obj24, jXPathBeanInfo25, locale26);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest29 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = dOMNodePointer3.attributeIterator(qName22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":UNKNOWN" + "'", str23, ":UNKNOWN");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = null;
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager1 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream0);
        java.io.PrintStream printStream2 = null;
        xPathParserTokenManager1.debugStream = printStream2;
        java.io.PrintStream printStream4 = xPathParserTokenManager1.debugStream;
        org.junit.Assert.assertNull(printStream4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = org.apache.commons.jxpath.ri.Compiler.FUNCTION_STRING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        nullPointer2.printPointerChain();
        boolean boolean8 = nullPointer2.isActual();
        java.lang.String str9 = nullPointer2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "id(UNKNOWN)" + "'", str9, "id(UNKNOWN)");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale2, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer4, (java.lang.Object) 2, nodeTest6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = jXPathContext1.getRelativeContext((org.apache.commons.jxpath.Pointer) nullPointer4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create a relative context for a non-existent node: id(UNKNOWN)");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        boolean boolean4 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer3, "", "hi!");
        java.lang.String str8 = jDOMNamespacePointer7.asPath();
        java.lang.String str9 = jDOMNamespacePointer7.asPath();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.NodeSet nodeSet11 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext12 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext10, nodeSet11);
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        java.lang.Object obj32 = nullPointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dOMNodePointer17.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        boolean boolean35 = jDOMNamespacePointer7.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0/namespace::" + "'", str8, "0/namespace::");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0/namespace::" + "'", str9, "0/namespace::");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName11, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str20 = qName19.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = beanPointerFactory15.createNodePointer(nodePointer16, qName19, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest13, false, nodePointer16);
        int int24 = jDOMNodeIterator23.getPosition();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":UNKNOWN" + "'", str20, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName11, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str20 = qName19.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = beanPointerFactory15.createNodePointer(nodePointer16, qName19, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest13, false, nodePointer16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodeIterator23.getNodePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":UNKNOWN" + "'", str20, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNull(nodePointer24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = descendantContext24.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet8 = precedingOrFollowingContext7.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        namespaceResolver6.registerNamespace("", "http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertNotNull(namespaceResolver4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (java.lang.Object) 2, nodeTest9);
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str14 = qName13.toString();
        java.lang.Object obj15 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer18 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName13, obj15, jXPathBeanInfo16, locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = nullPointer7.attributeIterator(qName13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nullPointer2.createChild(jXPathContext4, qName13, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(UNKNOWN)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":UNKNOWN" + "'", str14, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        java.lang.String str8 = qName4.getName();
        java.lang.String str9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) str8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UNKNOWN" + "'", str8, "UNKNOWN");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.createPath(jXPathContext4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodePointer3.setValue(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        selfContext4.reset();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.CompiledExpression compiledExpression5 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj8 = compiledExpression5.getValue(jXPathContext7);
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str12 = qName11.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer16 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName11, (java.lang.Object) (short) 100, dynamicPropertyHandler14, locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer3.createAttribute(jXPathContext7, qName11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('UNKNOWN')/@:UNKNOWN, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compiledExpression5);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":UNKNOWN" + "'", str12, ":UNKNOWN");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.NodeSet nodeSet26 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext27 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext25, nodeSet26);
        org.w3c.dom.Node node29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node29, locale30, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = dOMNodePointer32.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName37, ":UNKNOWN");
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale41, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (java.lang.Object) 2, nodeTest45);
        java.lang.Object obj47 = nullPointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer32.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext49 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext25, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext50 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        java.lang.String str51 = nodeNameTest39.getNamespaceURI();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":UNKNOWN" + "'", str51, ":UNKNOWN");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 0, 2, 6);
        simpleCharStream4.bufpos = 100;
        simpleCharStream4.adjustBeginLineColumn(0, (int) 'a');
        simpleCharStream4.backup(2);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager12 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream4);
        simpleCharStream4.adjustBeginLineColumn(66, 75);
        int int16 = simpleCharStream4.getBeginLine();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 82 + "'", int16 == 82);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream3 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(inputStream0, (int) (short) 10, 75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions6 = jXPathContext5.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols8 = null;
        jXPathContext5.setDecimalFormatSymbols("/", decimalFormatSymbols8);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory10 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 0.0d, locale13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer14.createPath(jXPathContext15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str20 = qName19.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer24 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName19, (java.lang.Object) (short) 100, dynamicPropertyHandler22, locale23);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions27 = jXPathContext26.getFunctions();
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer29 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext26, locale28);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = dynaBeanPointerFactory10.createNodePointer(nodePointer14, qName19, (java.lang.Object) jXPathContext26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = dOMNodePointer3.createChild(jXPathContext5, qName19, 69);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: id('UNKNOWN')");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext5);
        org.junit.Assert.assertNotNull(functions6);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":UNKNOWN" + "'", str20, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(functions27);
        org.junit.Assert.assertNull(nodePointer30);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        java.lang.Object obj16 = nullPointer2.getBaseValue();
        java.lang.String str17 = nullPointer2.toString();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = nullPointer2.attributeIterator(qName18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id(UNKNOWN)" + "'", str17, "id(UNKNOWN)");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        precedingOrFollowingContext7.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) precedingOrFollowingContext7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = valueIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        boolean boolean4 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer3, "", "hi!");
        org.apache.commons.jxpath.ri.QName qName10 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str11 = qName10.toString();
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer15 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName10, obj12, jXPathBeanInfo13, locale14);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer16 = beanPointer15.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 0.0d, locale19);
        nodePointer20.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer20, nodeTest22, true, nodePointer24);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer26 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer20);
        java.util.Iterator iterator27 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer26);
        java.lang.Object obj28 = nullPropertyPointer26.getImmediateNode();
        java.lang.Object obj29 = nullPropertyPointer26.getBaseValue();
        int int30 = jDOMNamespacePointer7.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer15, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer26);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":UNKNOWN" + "'", str11, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer16);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = dOMNodePointer3.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(nodePointer25);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = dOMNodePointer3.getDefaultNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = dOMNodePointer3.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        org.jdom.Namespace namespace2 = null;
        java.lang.String str3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(obj0, "0/namespace::", namespace2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = descendantContext24.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.jxpath.ri.axes.SimplePathInterpreter simplePathInterpreter0 = new org.apache.commons.jxpath.ri.axes.SimplePathInterpreter();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 0.0d, locale10);
        nodePointer11.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer11, nodeTest13, true, nodePointer15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName19, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory23 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = beanPointerFactory23.createNodePointer(nodePointer24, qName27, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer11, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21, false, nodePointer24);
        boolean boolean32 = namespacePointer7.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            jXPathContext1.removeAll(":UNKNOWN");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: ':UNKNOWN'. Syntax error at the beginning of the expression");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str9 = qName8.toString();
        java.lang.Object obj10 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName8, obj10, jXPathBeanInfo11, locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = nullPointer2.attributeIterator(qName8);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer20 = nullPointer2.getPointerByKey(jXPathContext16, "0/*", "0/*");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot find an element by key - no KeyManager has been specified");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":UNKNOWN" + "'", str9, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = parentContext7.getCurrentNodePointer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, (java.lang.Object) 2, nodeTest13);
        java.lang.Object obj15 = nullPointer11.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.createNullPointer((org.apache.commons.jxpath.ri.EvalContext) parentContext7, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, stepArray16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        java.lang.String str9 = dynamicPointer7.getNamespaceURI();
        int int10 = dynamicPointer7.getLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        java.lang.String str8 = namespaceResolver6.getPrefix("org.apache.commons.jxpath.ri.parser.ParseException");
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int1 = dynaBeanPointerFactory0.getOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodeIterator8.getNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodeIterator8.getNodePointer();
        nodePointer10.setIndex(74);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        boolean boolean8 = dOMNodePointer3.equals((java.lang.Object) "");
        java.lang.String str9 = dOMNodePointer3.getDefaultNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName10 = dOMNodePointer3.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        boolean boolean22 = dOMNodePointer3.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 0.0d, locale9);
        nodePointer10.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, nodeTest12, true, nodePointer14);
        org.apache.commons.jxpath.ri.QName qName18 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest20 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName18, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest20, false, nodePointer23);
        int int31 = nullPointer2.compareTo((java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nullPointer2.getValuePointer();
        boolean boolean33 = nullPointer2.isActual();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        boolean boolean12 = nullPropertyPointer9.isCollection();
        boolean boolean13 = nullPropertyPointer9.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        boolean boolean22 = dOMNodePointer3.isActual();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.Step step2 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray3 = new org.apache.commons.jxpath.ri.compiler.Step[] { step2 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath4 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray3);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext5 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext0, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = predicateContext5.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepArray3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.jxpath.ri.Compiler compiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.jxpath.ri.Parser.parseExpression("<<unknown namespace>>", compiler1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: '<<unknown namespace>>'. Syntax error at the beginning of the expression");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        dynamicPointer7.setIndex((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        java.lang.String str30 = qName26.getName();
        boolean boolean31 = jDOMNodePointer21.equals((java.lang.Object) str30);
        boolean boolean32 = jDOMNodePointer21.isLeaf();
        org.apache.commons.jxpath.ri.QName qName35 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str36 = qName35.toString();
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer40 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName35, obj37, jXPathBeanInfo38, locale39);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest42 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName35, ":UNKNOWN");
        java.lang.String str43 = nodeNameTest42.toString();
        org.w3c.dom.Node node45 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer48 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale46, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver49 = dOMNodePointer48.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver50 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver49);
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions53 = jXPathContext52.getFunctions();
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer55 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext52, locale54);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer58 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale56, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        boolean boolean61 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer58, (java.lang.Object) 2, nodeTest60);
        int int62 = nullPointer58.getIndex();
        org.apache.commons.jxpath.ri.QName qName65 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str66 = qName65.toString();
        java.lang.Object obj67 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo68 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer70 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName65, obj67, jXPathBeanInfo68, locale69);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = nullPointer58.attributeIterator(qName65);
        org.apache.commons.jxpath.ri.QName qName72 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName72, (java.lang.Object) 0.0d, locale74);
        boolean boolean76 = nodePointer75.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer75, "", "hi!");
        java.lang.Object obj80 = jDOMNamespacePointer79.getImmediateNode();
        int int81 = collectionPointer55.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer58, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer79);
        namespaceResolver49.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer55);
        org.apache.commons.jxpath.ri.QName qName85 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str86 = qName85.toString();
        java.lang.Object obj87 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo88 = null;
        java.util.Locale locale89 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer90 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName85, obj87, jXPathBeanInfo88, locale89);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator91 = collectionPointer55.attributeIterator(qName85);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator92 = jDOMNodePointer21.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest42, false, (org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UNKNOWN" + "'", str30, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":UNKNOWN" + "'", str36, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":UNKNOWN" + "'", str43, ":UNKNOWN");
        org.junit.Assert.assertNotNull(namespaceResolver49);
        org.junit.Assert.assertNotNull(jXPathContext52);
        org.junit.Assert.assertNotNull(functions53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-2147483648) + "'", int62 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + ":UNKNOWN" + "'", str66, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator71);
        org.junit.Assert.assertNotNull(nodePointer75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + "hi!" + "'", obj80, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + ":UNKNOWN" + "'", str86, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator91);
        org.junit.Assert.assertNotNull(nodeIterator92);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 0, 2, 6);
        simpleCharStream4.bufpos = 100;
        simpleCharStream4.Done();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = simpleCharStream4.getBeginColumn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer14 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName9, (java.lang.Object) (short) 100, dynamicPropertyHandler12, locale13);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext16, locale18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = dynaBeanPointerFactory0.createNodePointer(nodePointer4, qName9, (java.lang.Object) jXPathContext16);
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str24 = qName23.toString();
        java.lang.Object obj25 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer28 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName23, obj25, jXPathBeanInfo26, locale27);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer29 = beanPointer28.getPropertyPointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions32 = jXPathContext31.getFunctions();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer34 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext31, locale33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str38 = qName37.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer42 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName37, (java.lang.Object) (short) 100, dynamicPropertyHandler40, locale41);
        int int43 = dynamicPointer42.getLength();
        dynamicPointer42.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory46 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = null;
        org.apache.commons.jxpath.ri.QName qName50 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str51 = qName50.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = beanPointerFactory46.createNodePointer(nodePointer47, qName50, (java.lang.Object) 10);
        boolean boolean54 = dynamicPointer42.isValidProperty(qName50);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = collectionPointer34.attributeIterator(qName50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = dynaBeanPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer29, qName50, (java.lang.Object) 56);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer60 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale58, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        boolean boolean63 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer60, (java.lang.Object) 2, nodeTest62);
        int int64 = nullPointer60.getIndex();
        org.apache.commons.jxpath.ri.QName qName67 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str68 = qName67.toString();
        java.lang.Object obj69 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo70 = null;
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer72 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName67, obj69, jXPathBeanInfo70, locale71);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = nullPointer60.attributeIterator(qName67);
        org.apache.commons.jxpath.ri.QName qName74 = nullPointer60.getName();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer75 = nullPointer60.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory76 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer77 = null;
        org.apache.commons.jxpath.ri.QName qName80 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str81 = qName80.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = beanPointerFactory76.createNodePointer(nodePointer77, qName80, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer85 = dynaBeanPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer60, qName80, (java.lang.Object) 99);
        boolean boolean86 = nullPointer60.isCollection();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":UNKNOWN" + "'", str24, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer29);
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertNotNull(functions32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":UNKNOWN" + "'", str38, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":UNKNOWN" + "'", str51, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertNull(nodePointer57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-2147483648) + "'", int64 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + ":UNKNOWN" + "'", str68, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertNull(qName74);
        org.junit.Assert.assertNotNull(propertyPointer75);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + ":UNKNOWN" + "'", str81, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer83);
        org.junit.Assert.assertNull(nodePointer85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 0, 2, 6);
        simpleCharStream4.bufpos = 100;
        simpleCharStream4.adjustBeginLineColumn(0, (int) 'a');
        simpleCharStream4.backup(2);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager12 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream4);
        java.io.Reader reader13 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream17 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader13, 0, 2, 6);
        simpleCharStream17.bufpos = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            xPathParserTokenManager12.ReInit(simpleCharStream17, 77);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.ri.parser.TokenMgrError; message: Error: Ignoring invalid lexical state : 77. State unchanged.");
        } catch (org.apache.commons.jxpath.ri.parser.TokenMgrError e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        boolean boolean25 = dOMNodePointer3.isRoot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = beanPointerFactory16.createNodePointer(nodePointer17, qName20, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, nodePointer17);
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext26 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext(evalContext0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = precedingOrFollowingContext26.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.String str12 = nullPropertyPointer9.getPropertyName();
        nullPropertyPointer9.setPropertyIndex((-1));
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        org.apache.commons.jxpath.Pointer pointer18 = jXPathContext16.getContextPointer();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer21 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale19, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        boolean boolean24 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer21, (java.lang.Object) 2, nodeTest23);
        int int25 = nullPointer21.getIndex();
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str29 = qName28.toString();
        java.lang.Object obj30 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer33 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName28, obj30, jXPathBeanInfo31, locale32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = nullPointer21.attributeIterator(qName28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nullPropertyPointer9.createChild(jXPathContext16, qName28, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: 0/*");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
        org.junit.Assert.assertNotNull(pointer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":UNKNOWN" + "'", str29, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        java.util.Iterator iterator1 = org.apache.commons.jxpath.util.ValueUtils.iterate(obj0);
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        java.lang.String str22 = jDOMNodePointer21.getNamespaceURI();
        org.apache.commons.jxpath.CompiledExpression compiledExpression24 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj27 = compiledExpression24.getValue(jXPathContext26);
        org.apache.commons.jxpath.CompiledExpression compiledExpression29 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj32 = compiledExpression29.getValue(jXPathContext31);
        org.apache.commons.jxpath.Pointer pointer33 = compiledExpression24.createPath(jXPathContext31);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) 0.0d, locale37);
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer38.createPath(jXPathContext39);
        org.apache.commons.jxpath.ri.QName qName43 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str44 = qName43.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer48 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName43, (java.lang.Object) (short) 100, dynamicPropertyHandler46, locale47);
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions51 = jXPathContext50.getFunctions();
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer53 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext50, locale52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = dynaBeanPointerFactory34.createNodePointer(nodePointer38, qName43, (java.lang.Object) jXPathContext50);
        org.apache.commons.jxpath.ri.QName qName57 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str58 = qName57.toString();
        java.lang.Object obj59 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer62 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName57, obj59, jXPathBeanInfo60, locale61);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer63 = beanPointer62.getPropertyPointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext65 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions66 = jXPathContext65.getFunctions();
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer68 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext65, locale67);
        org.apache.commons.jxpath.ri.QName qName71 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str72 = qName71.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler74 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer76 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName71, (java.lang.Object) (short) 100, dynamicPropertyHandler74, locale75);
        int int77 = dynamicPointer76.getLength();
        dynamicPointer76.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory80 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = null;
        org.apache.commons.jxpath.ri.QName qName84 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str85 = qName84.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer87 = beanPointerFactory80.createNodePointer(nodePointer81, qName84, (java.lang.Object) 10);
        boolean boolean88 = dynamicPointer76.isValidProperty(qName84);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator89 = collectionPointer68.attributeIterator(qName84);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = dynaBeanPointerFactory34.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer63, qName84, (java.lang.Object) 56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer92 = jDOMNodePointer21.createAttribute(jXPathContext31, qName84);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id(UNKNOWN)/@:UNKNOWN, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(compiledExpression24);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertNotNull(compiledExpression29);
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNotNull(pointer33);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ":UNKNOWN" + "'", str44, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext50);
        org.junit.Assert.assertNotNull(functions51);
        org.junit.Assert.assertNull(nodePointer54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ":UNKNOWN" + "'", str58, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer63);
        org.junit.Assert.assertNotNull(jXPathContext65);
        org.junit.Assert.assertNotNull(functions66);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + ":UNKNOWN" + "'", str72, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + ":UNKNOWN" + "'", str85, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(nodeIterator89);
        org.junit.Assert.assertNull(nodePointer91);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int0 = org.apache.commons.jxpath.ri.Compiler.FUNCTION_LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer0, "http://www.w3.org/2000/xmlns/", ":UNKNOWN");
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        boolean boolean10 = dOMNodePointer7.isActual();
        boolean boolean11 = jDOMNamespacePointer3.equals((java.lang.Object) dOMNodePointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        boolean boolean6 = dOMNodePointer3.isActual();
        java.lang.Object obj7 = dOMNodePointer3.getImmediateNode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer14 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName9, (java.lang.Object) (short) 100, dynamicPropertyHandler12, locale13);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext16, locale18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = dynaBeanPointerFactory0.createNodePointer(nodePointer4, qName9, (java.lang.Object) jXPathContext16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = jXPathContext16.selectSingleNode("UNKNOWN");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathNotFoundException; message: No pointer for xpath: UNKNOWN");
        } catch (org.apache.commons.jxpath.JXPathNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
        org.junit.Assert.assertNull(nodePointer20);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        precedingOrFollowingContext7.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) precedingOrFollowingContext7);
        java.lang.String str13 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) valueIterator12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = dOMNodePointer3.getDefaultNamespaceURI();
        boolean boolean9 = dOMNodePointer3.isActual();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.CompiledExpression compiledExpression23 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj26 = compiledExpression23.getValue(jXPathContext25);
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions29 = jXPathContext28.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols31 = null;
        jXPathContext28.setDecimalFormatSymbols("", decimalFormatSymbols31);
        java.lang.Class class33 = null;
        java.lang.Object obj34 = compiledExpression23.getValue(jXPathContext28, class33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str38 = qName37.toString();
        java.lang.Object obj39 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer42 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName37, obj39, jXPathBeanInfo40, locale41);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest44 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName37, ":UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer21.createAttribute(jXPathContext28, qName37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id(UNKNOWN)/@:UNKNOWN, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(compiledExpression23);
        org.junit.Assert.assertNotNull(jXPathContext25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(functions29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":UNKNOWN" + "'", str38, ":UNKNOWN");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        boolean boolean10 = nullPropertyPointer9.isCollection();
        java.lang.String str11 = nullPropertyPointer9.asPath();
        boolean boolean12 = nullPropertyPointer9.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer16, (java.lang.Object) 2, nodeTest18);
        java.lang.Object obj20 = nullPointer16.getImmediateNode();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = nullPropertyPointer9.compareChildNodePointers(nodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0/*" + "'", str11, "0/*");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str20 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) nullPointer14);
        boolean boolean21 = nullPointer14.isCollection();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, obj4, jXPathBeanInfo5, locale6);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = beanPointer7.getPropertyPointer();
        java.lang.Object obj9 = beanPointer7.getNode();
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 0.0d, locale12);
        nodePointer13.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer13, nodeTest15, true, nodePointer17);
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = null;
        org.apache.commons.jxpath.ri.QName qName29 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str30 = qName29.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = beanPointerFactory25.createNodePointer(nodePointer26, qName29, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer13, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23, false, nodePointer26);
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer41 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName36, obj38, jXPathBeanInfo39, locale40);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer42 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(nodePointer13, qName36);
        boolean boolean43 = beanPointer7.equals((java.lang.Object) nodePointer13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":UNKNOWN" + "'", str30, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer22 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "", "null()");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.Object obj12 = nullPropertyPointer9.getBaseValue();
        java.lang.Object obj13 = nullPropertyPointer9.getImmediateNode();
        boolean boolean14 = nullPropertyPointer9.isLeaf();
        org.apache.commons.jxpath.ri.QName qName15 = nullPropertyPointer9.getName();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(qName15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        boolean boolean10 = nullPropertyPointer9.isCollection();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer14.testNode(nodeTest15);
        java.lang.String str17 = dOMNodePointer14.asPath();
        // The following exception was thrown during execution in test generation
        try {
            nullPropertyPointer9.setValue((java.lang.Object) str17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidAccessException; message: Cannot set property 0/*, path does not match a changeable location");
        } catch (org.apache.commons.jxpath.JXPathInvalidAccessException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id('UNKNOWN')" + "'", str17, "id('UNKNOWN')");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        boolean boolean9 = namespacePointer7.isLeaf();
        int int10 = namespacePointer7.getLength();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer14.testNode(nodeTest15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName19, ":UNKNOWN");
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale23, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        boolean boolean28 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer25, (java.lang.Object) 2, nodeTest27);
        java.lang.Object obj29 = nullPointer25.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = dOMNodePointer14.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer25);
        boolean boolean31 = namespacePointer7.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        boolean boolean32 = namespacePointer7.isLeaf();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError7 = new org.apache.commons.jxpath.ri.parser.TokenMgrError(false, (int) (byte) 100, 28, 47, "/", 'a', (int) (short) -1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "org.apache.commons.jxpath.JXPathFunctionNotFoundException: :UNKNOWN");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int0 = org.apache.commons.jxpath.ri.Compiler.FUNCTION_SUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.NodeSet nodeSet26 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext27 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext25, nodeSet26);
        org.w3c.dom.Node node29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node29, locale30, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = dOMNodePointer32.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName37, ":UNKNOWN");
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale41, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (java.lang.Object) 2, nodeTest45);
        java.lang.Object obj47 = nullPointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer32.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext49 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext25, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext50 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = descendantContext24.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeIterator48);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        int int11 = nullPropertyPointer9.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9, 38);
        boolean boolean14 = nullElementPointer13.isActual();
        int int15 = nullElementPointer13.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.Pointer pointer5 = jXPathContext1.getNamespaceContextPointer();
        org.apache.commons.jxpath.JXPathTypeConversionException jXPathTypeConversionException8 = new org.apache.commons.jxpath.JXPathTypeConversionException("org.apache.commons.jxpath.ri.parser.ParseException");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = jXPathContext1.getNodeSetByKey("0/*", (java.lang.Object) "org.apache.commons.jxpath.ri.parser.ParseException");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot find an element by key - no KeyManager has been specified");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(pointer5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        java.lang.String str6 = dOMNodePointer3.asPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName7 = dOMNodePointer3.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "id('UNKNOWN')" + "'", str6, "id('UNKNOWN')");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        boolean boolean8 = dOMNodePointer3.equals((java.lang.Object) "");
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext9, (java.lang.Object) qName12);
        org.apache.commons.jxpath.ri.QName qName18 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str19 = qName18.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer23 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName18, (java.lang.Object) (short) 100, dynamicPropertyHandler21, locale22);
        java.lang.Object obj24 = dynamicPointer23.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName25 = dynamicPointer23.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = dOMNodePointer3.createChild(jXPathContext15, qName25, 700);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: id('UNKNOWN')");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jXPathContext15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ":UNKNOWN" + "'", str19, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertNotNull(qName25);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        boolean boolean11 = dynamicPointer7.isDynamicPropertyDeclarationSupported();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer12 = dynamicPointer7.getPropertyPointer();
        propertyPointer12.setPropertyName("0/*");
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols19 = null;
        jXPathContext16.setDecimalFormatSymbols("", decimalFormatSymbols19);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.QName qName25 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str26 = qName25.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = beanPointerFactory21.createNodePointer(nodePointer22, qName25, (java.lang.Object) 10);
        java.lang.Object obj29 = null;
        boolean boolean30 = qName25.equals(obj29);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale32, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer34, (java.lang.Object) 2, nodeTest36);
        int int38 = nullPointer34.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = propertyPointer12.createChild(jXPathContext16, qName25, 39, (java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(propertyPointer12);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":UNKNOWN" + "'", str26, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2147483648) + "'", int38 == (-2147483648));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (java.lang.Object) 2, nodeTest9);
        int int11 = nullPointer7.getIndex();
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str15 = qName14.toString();
        java.lang.Object obj16 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName14, obj16, jXPathBeanInfo17, locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = nullPointer7.attributeIterator(qName14);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 0.0d, locale23);
        boolean boolean25 = nodePointer24.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer24, "", "hi!");
        java.lang.Object obj29 = jDOMNamespacePointer28.getImmediateNode();
        int int30 = collectionPointer4.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer28);
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            jDOMNamespacePointer28.setValue(obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot modify a namespace");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2147483648) + "'", int11 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":UNKNOWN" + "'", str15, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale2, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer4, (java.lang.Object) 2, nodeTest6);
        int int8 = nullPointer4.getIndex();
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str12 = qName11.toString();
        java.lang.Object obj13 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName11, obj13, jXPathBeanInfo14, locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = nullPointer4.attributeIterator(qName11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeCompiler0.minus((java.lang.Object) 58, (java.lang.Object) nodeIterator17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":UNKNOWN" + "'", str12, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        java.lang.String str22 = jDOMNodePointer21.asPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "id(UNKNOWN)" + "'", str22, "id(UNKNOWN)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str8 = qName7.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer12 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName7, (java.lang.Object) (short) 100, dynamicPropertyHandler10, locale11);
        int int13 = dynamicPointer12.getLength();
        dynamicPointer12.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = beanPointerFactory16.createNodePointer(nodePointer17, qName20, (java.lang.Object) 10);
        boolean boolean24 = dynamicPointer12.isValidProperty(qName20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = collectionPointer4.attributeIterator(qName20);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) collectionPointer4);
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext26, (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":UNKNOWN" + "'", str8, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(jXPathContext28);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str15 = qName14.toString();
        java.lang.Object obj16 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName14, obj16, jXPathBeanInfo17, locale18);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName14, ":UNKNOWN");
        java.lang.String str22 = nodeNameTest21.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext23 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        int int24 = ancestorContext23.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.NodeSet nodeSet27 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext28 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext26, nodeSet27);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext30 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext28, nodeTest29);
        int int31 = nodeSetContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext28, nodeTest32);
        int int34 = parentContext33.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.NodeSet nodeSet37 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext38 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext36, nodeSet37);
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        boolean boolean45 = dOMNodePointer43.testNode(nodeTest44);
        org.apache.commons.jxpath.ri.QName qName48 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest50 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName48, ":UNKNOWN");
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer54 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale52, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        boolean boolean57 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer54, (java.lang.Object) 2, nodeTest56);
        java.lang.Object obj58 = nullPointer54.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = dOMNodePointer43.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest50, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer54);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext60 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext36, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest50);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext61 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext33, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest50);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext62 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext23, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = ancestorContext23.setPosition(20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":UNKNOWN" + "'", str15, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":UNKNOWN" + "'", str22, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(nodeIterator59);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 0, 2, 6);
        simpleCharStream4.bufpos = 100;
        simpleCharStream4.Done();
        simpleCharStream4.bufpos = 71;
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        java.lang.Object obj8 = dynamicPointer7.getImmediateNode();
        java.lang.String str9 = dynamicPointer7.asPath();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dynamicPointer7, locale10, "0/*");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jDOMNodePointer12.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getValue();
        java.lang.Object obj12 = nullPropertyPointer9.getImmediateNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        boolean boolean11 = dOMNodePointer9.testNode(nodeTest10);
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName14, ":UNKNOWN");
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale18, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        boolean boolean23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer20, (java.lang.Object) 2, nodeTest22);
        java.lang.Object obj24 = nullPointer20.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = dOMNodePointer9.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest16, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer20);
        boolean boolean26 = collectionPointer4.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest16);
        int int27 = collectionPointer4.getLength();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int0 = org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory.DYNA_BEAN_POINTER_FACTORY_ORDER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 700 + "'", int0 == 700);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        boolean boolean12 = nullPropertyPointer9.isCollection();
        org.apache.commons.jxpath.ri.QName qName13 = nullPropertyPointer9.getName();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(qName13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory dynamicPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer4.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName9, ":UNKNOWN");
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale13, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer15, (java.lang.Object) 2, nodeTest17);
        java.lang.Object obj19 = nullPointer15.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = dOMNodePointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest11, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer15);
        java.lang.String str22 = dOMNodePointer4.getNamespaceURI("UNKNOWN");
        boolean boolean23 = dOMNodePointer4.isCollection();
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 0.0d, locale26);
        nodePointer27.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer27, nodeTest29, true, nodePointer31);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer27);
        java.util.Iterator iterator34 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer33);
        java.lang.Object obj35 = nullPropertyPointer33.getImmediateNode();
        boolean boolean36 = nullPropertyPointer33.isCollection();
        boolean boolean37 = nullPropertyPointer33.isActual();
        org.apache.commons.jxpath.ri.QName qName38 = nullPropertyPointer33.getName();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) 0.0d, locale41);
        nodePointer42.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer42, nodeTest44, true, nodePointer46);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer48 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer42);
        java.util.Iterator iterator49 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer48);
        java.lang.Object obj50 = nullPropertyPointer48.getValue();
        int int51 = nullPropertyPointer48.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = dynamicPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName38, (java.lang.Object) nullPropertyPointer48);
        org.apache.commons.jxpath.ri.QName qName53 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName53, (java.lang.Object) 0.0d, locale55);
        boolean boolean57 = nodePointer56.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer56, "", "hi!");
        java.lang.String str61 = jDOMNamespacePointer60.asPath();
        org.apache.commons.jxpath.ri.QName qName62 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = dynamicPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer60, qName62, (java.lang.Object) 75);
        org.apache.commons.jxpath.ri.EvalContext evalContext65 = null;
        org.apache.commons.jxpath.ri.compiler.Step step67 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray68 = new org.apache.commons.jxpath.ri.compiler.Step[] { step67 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath69 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray68);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext70 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext65, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath69);
        org.apache.commons.jxpath.ri.EvalContext evalContext71 = null;
        org.apache.commons.jxpath.ri.compiler.Step step73 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray74 = new org.apache.commons.jxpath.ri.compiler.Step[] { step73 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath75 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray74);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext76 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext71, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath75);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest77 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) locationPath69, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath75);
        // The following exception was thrown during execution in test generation
        try {
            jDOMNamespacePointer60.setValue((java.lang.Object) nameAttributeTest77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot modify a namespace");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(nodePointer52);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "0/namespace::" + "'", str61, "0/namespace::");
        org.junit.Assert.assertNull(nodePointer64);
        org.junit.Assert.assertNotNull(stepArray68);
        org.junit.Assert.assertNotNull(stepArray74);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int0 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.FUNCTION_TRANSLATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65 + "'", int0 == 65);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.NodeSet nodeSet26 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext27 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext25, nodeSet26);
        org.w3c.dom.Node node29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node29, locale30, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = dOMNodePointer32.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName37, ":UNKNOWN");
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale41, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (java.lang.Object) 2, nodeTest45);
        java.lang.Object obj47 = nullPointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer32.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext49 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext25, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext50 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer51 = descendantContext24.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeIterator48);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer21.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        boolean boolean5 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 0.0d, locale8);
        nodePointer9.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer9, nodeTest11, true, nodePointer13);
        org.w3c.dom.Node node15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node15, locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = dOMNodePointer18.getNamespaceResolver();
        boolean boolean20 = namespaceResolver19.isSealed();
        nodePointer9.setNamespaceResolver(namespaceResolver19);
        nodePointer3.setNamespaceResolver(namespaceResolver19);
        boolean boolean23 = org.apache.commons.jxpath.util.ValueUtils.isCollection((java.lang.Object) nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(namespaceResolver19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getValue();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        int int18 = nullPointer14.getIndex();
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str22 = qName21.toString();
        java.lang.Object obj23 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer26 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName21, obj23, jXPathBeanInfo24, locale25);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = nullPointer14.attributeIterator(qName21);
        java.lang.Object obj28 = nullPointer14.getBaseValue();
        java.lang.String str29 = nullPointer14.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions32 = jXPathContext31.getFunctions();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer34 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext31, locale33);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = collectionPointer34.testNode(nodeTest35);
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions39 = jXPathContext38.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols41 = null;
        jXPathContext38.setDecimalFormatSymbols("/", decimalFormatSymbols41);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = collectionPointer34.createPath(jXPathContext38);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = nullPropertyPointer9.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, nodePointer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":UNKNOWN" + "'", str22, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "id(UNKNOWN)" + "'", str29, "id(UNKNOWN)");
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertNotNull(functions32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jXPathContext38);
        org.junit.Assert.assertNotNull(functions39);
        org.junit.Assert.assertNotNull(nodePointer43);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        boolean boolean17 = dOMNodePointer9.isActual();
        int int18 = dOMNodePointer9.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.NodeSet nodeSet20 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext21 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext19, nodeSet20);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext23 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, nodeTest22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext26 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, nodeTest24, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext29 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext26, true, nodeTest28);
        org.apache.commons.jxpath.ri.QName qName33 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str34 = qName33.toString();
        java.lang.Object obj35 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer38 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName33, obj35, jXPathBeanInfo36, locale37);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest40 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName33, ":UNKNOWN");
        java.lang.String str41 = nodeNameTest40.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext42 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext26, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest40);
        org.w3c.dom.Node node44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer47 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node44, locale45, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver48 = dOMNodePointer47.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer51 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer47, "UNKNOWN", "0/*");
        java.lang.String str52 = namespacePointer51.toString();
        boolean boolean53 = namespacePointer51.isLeaf();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = dOMNodePointer9.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest40, true, (org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":UNKNOWN" + "'", str34, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(namespaceResolver48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str52, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        boolean boolean6 = selfContext4.setPosition(25);
        selfContext4.reset();
        int int8 = selfContext4.getPosition();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        int int4 = nodePointer3.getLength();
        org.w3c.dom.Node node5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node5, locale6, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = dOMNodePointer8.testNode(nodeTest9);
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest15 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName13, ":UNKNOWN");
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale17, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19, (java.lang.Object) 2, nodeTest21);
        java.lang.Object obj23 = nullPointer19.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = dOMNodePointer8.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19);
        org.w3c.dom.Node node26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node26, locale27, "UNKNOWN");
        java.lang.Object obj30 = dOMNodePointer29.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = nodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer29);
        java.lang.Object obj32 = dOMNodePointer29.getBaseValue();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.w3c.dom.Node node35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node35, locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver39 = dOMNodePointer38.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer42 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38, "UNKNOWN", "0/*");
        java.lang.String str43 = namespacePointer42.toString();
        boolean boolean44 = namespacePointer42.isLeaf();
        int int45 = namespacePointer42.getLength();
        org.w3c.dom.Node node46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer49 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node46, locale47, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        boolean boolean51 = dOMNodePointer49.testNode(nodeTest50);
        org.apache.commons.jxpath.ri.QName qName54 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest56 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName54, ":UNKNOWN");
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer60 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale58, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        boolean boolean63 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer60, (java.lang.Object) 2, nodeTest62);
        java.lang.Object obj64 = nullPointer60.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = dOMNodePointer49.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest56, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer60);
        boolean boolean66 = namespacePointer42.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest56);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext67 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext33, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest56);
        org.apache.commons.jxpath.ri.QName qName71 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str72 = qName71.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler74 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer76 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName71, (java.lang.Object) (short) 100, dynamicPropertyHandler74, locale75);
        int int77 = dynamicPointer76.getLength();
        java.lang.String str78 = dynamicPointer76.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName79 = dynamicPointer76.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator80 = dOMNodePointer29.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest56, false, (org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer76);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(nodeIterator31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(namespaceResolver39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str43, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + ":UNKNOWN" + "'", str72, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(qName79);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        int int8 = parentContext7.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.NodeSet nodeSet11 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext12 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext10, nodeSet11);
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        java.lang.Object obj32 = nullPointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dOMNodePointer17.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext35 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = ancestorContext35.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodeIterator33);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        boolean boolean17 = dOMNodePointer9.isActual();
        org.apache.commons.jxpath.ri.parser.ParseException parseException19 = new org.apache.commons.jxpath.ri.parser.ParseException();
        int[][] intArray20 = parseException19.expectedTokenSequences;
        org.apache.commons.jxpath.ri.parser.ParseException parseException21 = new org.apache.commons.jxpath.ri.parser.ParseException();
        java.lang.String[] strArray22 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        parseException21.tokenImage = strArray22;
        parseException19.tokenImage = strArray22;
        org.apache.commons.jxpath.JXPathInvalidSyntaxException jXPathInvalidSyntaxException26 = new org.apache.commons.jxpath.JXPathInvalidSyntaxException("");
        org.apache.commons.jxpath.ri.parser.ParseException parseException28 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        org.apache.commons.jxpath.ri.parser.Token token29 = null;
        parseException28.currentToken = token29;
        jXPathInvalidSyntaxException26.addSuppressed((java.lang.Throwable) parseException28);
        parseException19.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.jxpath.JXPathException jXPathException33 = new org.apache.commons.jxpath.JXPathException("org.apache.commons.jxpath.JXPathContextFactory", (java.lang.Throwable) parseException19);
        java.lang.String[] strArray34 = parseException19.tokenImage;
        org.apache.commons.jxpath.ri.parser.Token token35 = null;
        int[][] intArray36 = new int[][] {};
        java.lang.String[] strArray37 = null;
        org.apache.commons.jxpath.ri.parser.ParseException parseException38 = new org.apache.commons.jxpath.ri.parser.ParseException(token35, intArray36, strArray37);
        parseException19.expectedTokenSequences = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer9.setValue((java.lang.Object) intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName(obj0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("0/*", "<<unknown namespace>>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.beanutils.DynaBean dynaBean4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer6 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean4, locale5);
        org.apache.commons.jxpath.ri.compiler.Constant constant8 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 69);
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest10 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant8, expression9);
        boolean boolean11 = constant8.computeContextDependent();
        boolean boolean12 = dynaBeanPointer6.equals((java.lang.Object) constant8);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext13, nodeSet14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext17 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext20 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest18, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.NodeSet nodeSet22 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext23 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext21, nodeSet22);
        org.w3c.dom.Node node25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node25, locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = dOMNodePointer28.testNode(nodeTest29);
        org.apache.commons.jxpath.ri.QName qName33 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest35 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName33, ":UNKNOWN");
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer39 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale37, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer39, (java.lang.Object) 2, nodeTest41);
        java.lang.Object obj43 = nullPointer39.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = dOMNodePointer28.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest35, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer39);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext45 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext21, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest35);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext46 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest35);
        java.lang.Object obj47 = constant8.compute((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 69 + "'", obj47, 69);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer14 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName9, (java.lang.Object) (short) 100, dynamicPropertyHandler12, locale13);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions17 = jXPathContext16.getFunctions();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext16, locale18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = dynaBeanPointerFactory0.createNodePointer(nodePointer4, qName9, (java.lang.Object) jXPathContext16);
        java.util.Iterator iterator22 = jXPathContext16.iterate("/");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(functions17);
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.beanutils.DynaBean dynaBean4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer6 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean4, locale5);
        int int7 = dynaBeanPointer6.getLength();
        java.lang.Object obj8 = dynaBeanPointer6.getImmediateNode();
        org.apache.commons.jxpath.ri.parser.ParseException parseException9 = new org.apache.commons.jxpath.ri.parser.ParseException();
        java.lang.String[] strArray10 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        parseException9.tokenImage = strArray10;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        nullPointer14.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        boolean boolean25 = nullPointer14.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        boolean boolean26 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer6, (java.lang.Object) parseException9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodeIterator8.getNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodeIterator8.getNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver17 = dOMNodePointer16.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer20 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer16, "UNKNOWN", "0/*");
        java.lang.String str21 = namespacePointer20.toString();
        boolean boolean22 = namespacePointer20.isLeaf();
        int int23 = namespacePointer20.getLength();
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        boolean boolean44 = namespacePointer20.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext45 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext11, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, (java.lang.Object) 0.0d, locale49);
        nodePointer50.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer50, nodeTest52, true, nodePointer54);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer56 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer50);
        java.util.Iterator iterator57 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer56);
        java.lang.Object obj58 = nullPropertyPointer56.getValue();
        java.lang.Object obj59 = nullPropertyPointer56.getImmediateNode();
        java.lang.Object obj60 = nullPropertyPointer56.getBean();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer56);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(namespaceResolver17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str21, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0.0d + "'", obj60, 0.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.reflect.Method method0 = null;
        java.lang.reflect.Method method1 = org.apache.commons.jxpath.util.ValueUtils.getAccessibleMethod(method0);
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.jxpath.ri.compiler.Step step1 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray2 = new org.apache.commons.jxpath.ri.compiler.Step[] { step1 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath3 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.NodeSet nodeSet5 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext6 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext4, nodeSet5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext8 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext6, nodeTest7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext11 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext6, nodeTest9, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext14 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext11, true, nodeTest13);
        descendantContext14.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.NodeSet nodeSet17 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext18 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext16, nodeSet17);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext20 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext18, nodeTest19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext23 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext18, nodeTest21, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.NodeSet nodeSet25 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext26 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext24, nodeSet25);
        org.w3c.dom.Node node28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node28, locale29, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = dOMNodePointer31.testNode(nodeTest32);
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest38 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName36, ":UNKNOWN");
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer42 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale40, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        boolean boolean45 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer42, (java.lang.Object) 2, nodeTest44);
        java.lang.Object obj46 = nullPointer42.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = dOMNodePointer31.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest38, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer42);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext48 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext24, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest38);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext49 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext18, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest38);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext50 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = locationPath3.compute((org.apache.commons.jxpath.ri.EvalContext) descendantContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepArray2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(nodeIterator47);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        boolean boolean5 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 0.0d, locale8);
        nodePointer9.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer9, nodeTest11, true, nodePointer13);
        org.w3c.dom.Node node15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node15, locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = dOMNodePointer18.getNamespaceResolver();
        boolean boolean20 = namespaceResolver19.isSealed();
        nodePointer9.setNamespaceResolver(namespaceResolver19);
        nodePointer3.setNamespaceResolver(namespaceResolver19);
        java.lang.Object obj23 = namespaceResolver19.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(namespaceResolver19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        precedingOrFollowingContext7.reset();
        org.apache.commons.jxpath.ri.QName qName15 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str16 = qName15.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer20 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName15, (java.lang.Object) (short) 100, dynamicPropertyHandler18, locale19);
        java.lang.Object obj21 = dynamicPointer20.getImmediateNode();
        java.lang.String str22 = dynamicPointer20.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = dynamicPointer20.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.NodeSet nodeSet25 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext26 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext24, nodeSet25);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext28 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest27);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext31 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest29, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, nodeTest33);
        org.apache.commons.jxpath.ri.QName qName38 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str39 = qName38.toString();
        java.lang.Object obj40 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer43 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName38, obj40, jXPathBeanInfo41, locale42);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest45 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38, ":UNKNOWN");
        java.lang.String str46 = nodeNameTest45.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext47 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45);
        boolean boolean48 = nodeNameTest45.isWildcard();
        org.w3c.dom.Node node50 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer53 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node50, locale51, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        boolean boolean55 = dOMNodePointer53.testNode(nodeTest54);
        org.apache.commons.jxpath.ri.QName qName58 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest60 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName58, ":UNKNOWN");
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer64 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale62, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest66 = null;
        boolean boolean67 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer64, (java.lang.Object) 2, nodeTest66);
        java.lang.Object obj68 = nullPointer64.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = dOMNodePointer53.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest60, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer64);
        java.lang.Object obj70 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer64, obj70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = dynamicPointer20.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer64);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext73 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45);
        descendantContext73.reset();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":UNKNOWN" + "'", str16, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/" + "'", str22, "/");
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":UNKNOWN" + "'", str39, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":UNKNOWN" + "'", str46, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertNull(nodeIterator72);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        int int11 = nullPropertyPointer9.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9, 38);
        int int14 = nullPropertyPointer9.getPropertyCount();
        nullPropertyPointer9.setPropertyIndex(15);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer3.namespacePointer("org.apache.commons.jxpath.JXPathFunctionNotFoundException: :UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3);
        org.apache.commons.jxpath.CompiledExpression compiledExpression24 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj27 = compiledExpression24.getValue(jXPathContext26);
        org.apache.commons.jxpath.JXPathContext jXPathContext29 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions30 = jXPathContext29.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols32 = null;
        jXPathContext29.setDecimalFormatSymbols("", decimalFormatSymbols32);
        java.lang.Class class34 = null;
        java.lang.Object obj35 = compiledExpression24.getValue(jXPathContext29, class34);
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions38 = jXPathContext37.getFunctions();
        org.apache.commons.jxpath.Pointer pointer40 = compiledExpression24.getPointer(jXPathContext37, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer42 = dOMNodePointer3.getPointerByID(jXPathContext37, "id(UNKNOWN)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(compiledExpression24);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext29);
        org.junit.Assert.assertNotNull(functions30);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext37);
        org.junit.Assert.assertNotNull(functions38);
        org.junit.Assert.assertNotNull(pointer40);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.w3c.dom.Node node3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node3, locale4, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = dOMNodePointer6.getNamespaceResolver();
        boolean boolean8 = namespaceResolver7.isSealed();
        org.w3c.dom.Node node9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node9, locale10, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = dOMNodePointer12.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer16 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer12, "UNKNOWN", "0/*");
        namespaceResolver7.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = dOMNodePointer12.namespacePointer("null()");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError27 = new org.apache.commons.jxpath.ri.parser.TokenMgrError(false, 22, 0, (int) (byte) 100, "", ' ', 0);
        java.lang.Throwable[] throwableArray28 = tokenMgrError27.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeCompiler0.function((java.lang.Object) nodePointer19, (java.lang.Object[]) throwableArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.dom.NamespacePointer cannot be cast to org.apache.commons.jxpath.ri.QName");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(namespaceResolver7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(namespaceResolver13);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError0 = new org.apache.commons.jxpath.ri.parser.TokenMgrError();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.w3c.dom.Node node2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node2, locale3, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = dOMNodePointer5.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer9 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer5, "UNKNOWN", "0/*");
        java.lang.String str10 = namespacePointer9.toString();
        boolean boolean11 = namespacePointer9.isLeaf();
        int int12 = namespacePointer9.getLength();
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = dOMNodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21, ":UNKNOWN");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27, (java.lang.Object) 2, nodeTest29);
        java.lang.Object obj31 = nullPointer27.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = dOMNodePointer16.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27);
        boolean boolean33 = namespacePointer9.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext34 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext0, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        int int35 = ancestorContext34.getDocumentOrder();
        ancestorContext34.reset();
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str10, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = dOMNodePointer11.getNamespaceResolver();
        nodePointer7.setNamespaceResolver(namespaceResolver12);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver12);
        namespaceResolver12.registerNamespace("http://www.w3.org/XML/1998/namespace", "null()");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(namespaceResolver12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        boolean boolean10 = nullPropertyPointer9.isCollection();
        nullPropertyPointer9.remove();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dOMNodePointer9.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer3.namespacePointer("org.apache.commons.jxpath.JXPathFunctionNotFoundException: :UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) 0.0d, locale25);
        nodePointer26.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer26, nodeTest28, true, nodePointer30);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer32 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer26);
        java.util.Iterator iterator33 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer32);
        int int34 = nullPropertyPointer32.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer36 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer32, 38);
        boolean boolean37 = nullElementPointer36.isActual();
        int int38 = nullElementPointer36.getLength();
        int int39 = nullElementPointer36.getLength();
        org.apache.commons.jxpath.ri.QName qName42 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str43 = qName42.toString();
        java.lang.Object obj44 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo45 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer47 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName42, obj44, jXPathBeanInfo45, locale46);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest49 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName42, ":UNKNOWN");
        java.lang.String str50 = nodeNameTest49.toString();
        boolean boolean51 = nullElementPointer36.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = dOMNodePointer3.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":UNKNOWN" + "'", str43, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":UNKNOWN" + "'", str50, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        boolean boolean4 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer3, "", "hi!");
        java.lang.Object obj8 = jDOMNamespacePointer7.getImmediateNode();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, (java.lang.Object) 2, nodeTest13);
        int int15 = nullPointer11.getIndex();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer19, nodeTest21, true, nodePointer23);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer19);
        int int26 = jDOMNamespacePointer7.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, nodePointer19);
        java.lang.String str27 = jDOMNamespacePointer7.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        descendantContext10.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.NodeSet nodeSet21 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext22 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext20, nodeSet21);
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext20, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext45 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        attributeContext46.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator48 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext46);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream4 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 0, 2, 6);
        simpleCharStream4.bufpos = 100;
        simpleCharStream4.Done();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = simpleCharStream4.GetImage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.jxpath.xml.DOMParser dOMParser0 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean1 = dOMParser0.isExpandEntityReferences();
        boolean boolean2 = dOMParser0.isExpandEntityReferences();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler3 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray4 = null;
        java.lang.Object obj5 = treeCompiler3.or(objArray4);
        org.apache.commons.jxpath.ri.compiler.Step step7 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray8 = new org.apache.commons.jxpath.ri.compiler.Step[] { step7 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath9 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray8);
        java.lang.Object obj10 = treeCompiler3.or((java.lang.Object[]) stepArray8);
        java.lang.Object obj11 = treeCompiler0.or((java.lang.Object[]) stepArray8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer14.attributeIterator(qName20);
        boolean boolean28 = qName20.equals((java.lang.Object) 78);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer31 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale29, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer31, (java.lang.Object) 2, nodeTest33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str38 = qName37.toString();
        java.lang.Object obj39 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer42 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName37, obj39, jXPathBeanInfo40, locale41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = nullPointer31.attributeIterator(qName37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = treeCompiler0.mod((java.lang.Object) boolean28, (java.lang.Object) qName37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(stepArray8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":UNKNOWN" + "'", str38, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator43);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        int int8 = parentContext7.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.NodeSet nodeSet11 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext12 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext10, nodeSet11);
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        java.lang.Object obj32 = nullPointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dOMNodePointer17.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext35 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        boolean boolean36 = parentContext7.isChildOrderingRequired();
        boolean boolean38 = parentContext7.setPosition((int) (byte) -1);
        boolean boolean40 = parentContext7.setPosition(59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getValue();
        java.lang.Object obj12 = nullPropertyPointer9.getImmediateNode();
        org.apache.commons.jxpath.CompiledExpression compiledExpression14 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj17 = compiledExpression14.getValue(jXPathContext16);
        java.lang.String str19 = jXPathContext16.getPrefix("id('UNKNOWN')/namespace::UNKNOWN");
        jXPathContext16.setLenient(true);
        org.apache.commons.jxpath.PackageFunctions packageFunctions24 = new org.apache.commons.jxpath.PackageFunctions("", ":UNKNOWN");
        java.util.Set set25 = packageFunctions24.getUsedNamespaces();
        java.util.Set set26 = packageFunctions24.getUsedNamespaces();
        java.util.Set set27 = packageFunctions24.getUsedNamespaces();
        jXPathContext16.setFunctions((org.apache.commons.jxpath.Functions) packageFunctions24);
        org.apache.commons.jxpath.ri.QName qName31 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nullPropertyPointer9.createChild(jXPathContext16, qName31, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: 0/*");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(compiledExpression14);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale8, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer10, (java.lang.Object) 2, nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str17 = qName16.toString();
        java.lang.Object obj18 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName16, obj18, jXPathBeanInfo19, locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = nullPointer10.attributeIterator(qName16);
        boolean boolean24 = qName16.equals((java.lang.Object) 78);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = dynamicPointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer41 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName36, obj38, jXPathBeanInfo39, locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = dynamicPointer32.attributeIterator(qName36);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = beanPointerFactory0.createNodePointer(qName16, (java.lang.Object) dynamicPointer32, locale43);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer45 = dynamicPointer32.getPropertyPointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = null;
        org.apache.commons.jxpath.ri.QName qName49 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str50 = qName49.toString();
        java.lang.Object obj51 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo52 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer54 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName49, obj51, jXPathBeanInfo52, locale53);
        boolean boolean56 = qName49.equals((java.lang.Object) (-1));
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.w3c.dom.Node node60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer63 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node60, locale61, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver64 = dOMNodePointer63.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer67 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer63, "UNKNOWN", "0/*");
        java.lang.String str68 = namespacePointer67.toString();
        boolean boolean69 = namespacePointer67.isLeaf();
        int int70 = namespacePointer67.getLength();
        org.w3c.dom.Node node71 = null;
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer74 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node71, locale72, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest75 = null;
        boolean boolean76 = dOMNodePointer74.testNode(nodeTest75);
        org.apache.commons.jxpath.ri.QName qName79 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest81 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName79, ":UNKNOWN");
        java.util.Locale locale83 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer85 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale83, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest87 = null;
        boolean boolean88 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer85, (java.lang.Object) 2, nodeTest87);
        java.lang.Object obj89 = nullPointer85.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator90 = dOMNodePointer74.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest81, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer85);
        boolean boolean91 = namespacePointer67.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest81);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext92 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext58, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest81);
        int int93 = ancestorContext92.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer94 = propertyPointer45.createChild(jXPathContext46, qName49, 0, (java.lang.Object) int93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":UNKNOWN" + "'", str17, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(propertyPointer45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ":UNKNOWN" + "'", str50, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(namespaceResolver64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str68, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(nodeIterator90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        boolean boolean12 = nullPropertyPointer9.isCollection();
        boolean boolean13 = nullPropertyPointer9.isActual();
        org.apache.commons.jxpath.ri.QName qName14 = nullPropertyPointer9.getName();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nullPropertyPointer9.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, "id('UNKNOWN')/namespace::UNKNOWN", "id(UNKNOWN)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int int0 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.FUNCTION_NOT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 67 + "'", int0 == 67);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        java.lang.Class<?> wildcardClass25 = jDOMNamespacePointer24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler26 = org.apache.commons.jxpath.util.ValueUtils.getDynamicPropertyHandler((java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot allocate dynamic property handler of class org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer; org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int0 = org.apache.commons.jxpath.ri.model.VariablePointerFactory.VARIABLE_POINTER_FACTORY_ORDER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 890 + "'", int0 == 890);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        java.lang.Object obj8 = dynamicPointer7.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName9 = dynamicPointer7.getName();
        org.w3c.dom.Node node10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = dOMNodePointer13.getNamespaceResolver();
        boolean boolean15 = namespaceResolver14.isSealed();
        org.w3c.dom.Node node16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node16, locale17, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver20 = dOMNodePointer19.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19, "UNKNOWN", "0/*");
        namespaceResolver14.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = dOMNodePointer19.namespacePointer("null()");
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) dOMNodePointer19, locale27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(namespaceResolver14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(namespaceResolver20);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(nodePointer28);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        boolean boolean12 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer9, (java.lang.Object) 2, nodeTest11);
        java.lang.Object obj13 = nullPointer9.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 0.0d, locale16);
        nodePointer17.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer17, nodeTest19, true, nodePointer21);
        org.apache.commons.jxpath.ri.QName qName25 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest27 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName25, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory29 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = null;
        org.apache.commons.jxpath.ri.QName qName33 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str34 = qName33.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = beanPointerFactory29.createNodePointer(nodePointer30, qName33, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest27, false, nodePointer30);
        int int38 = nullPointer9.compareTo((java.lang.Object) nodePointer17);
        namespaceResolver6.setNamespaceContextPointer(nodePointer17);
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":UNKNOWN" + "'", str34, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("", "0/namespace::");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer21.attributeIterator(qName24);
        java.lang.String str26 = jDOMNodePointer21.asPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "id(UNKNOWN)" + "'", str26, "id(UNKNOWN)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        boolean boolean4 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer3, "", "hi!");
        java.lang.Object obj8 = jDOMNamespacePointer7.getImmediateNode();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, (java.lang.Object) 2, nodeTest13);
        int int15 = nullPointer11.getIndex();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer19, nodeTest21, true, nodePointer23);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer19);
        int int26 = jDOMNamespacePointer7.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer11, nodePointer19);
        org.apache.commons.jxpath.ri.QName qName27 = nullPointer11.getName();
        java.lang.String str28 = nullPointer11.asPath();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(qName27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "id(UNKNOWN)" + "'", str28, "id(UNKNOWN)");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols10 = null;
        jXPathContext7.setDecimalFormatSymbols("", decimalFormatSymbols10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.Variables variables13 = jXPathContext7.getVariables();
        java.lang.Object obj15 = null;
        variables13.declareVariable("id(UNKNOWN)", obj15);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(variables13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.Pointer pointer5 = jXPathContext1.getNamespaceContextPointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.NodeSet nodeSet8 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext9 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext7, nodeSet8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext11 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext9, nodeTest10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext14 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext9, nodeTest12, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext17 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext14, true, nodeTest16);
        descendantContext17.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.NodeSet nodeSet20 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext21 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext19, nodeSet20);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext23 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, nodeTest22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext26 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, nodeTest24, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.NodeSet nodeSet28 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext29 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext27, nodeSet28);
        org.w3c.dom.Node node31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node31, locale32, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = dOMNodePointer34.testNode(nodeTest35);
        org.apache.commons.jxpath.ri.QName qName39 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest41 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName39, ":UNKNOWN");
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale43, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        boolean boolean48 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer45, (java.lang.Object) 2, nodeTest47);
        java.lang.Object obj49 = nullPointer45.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = dOMNodePointer34.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer45);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext51 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext27, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext52 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext21, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext53 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41);
        // The following exception was thrown during execution in test generation
        try {
            jXPathContext1.setValue(":UNKNOWN", (java.lang.Object) nodeNameTest41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: ':UNKNOWN'. Syntax error at the beginning of the expression");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(nodeIterator50);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols10 = null;
        jXPathContext7.setDecimalFormatSymbols("", decimalFormatSymbols10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.CompiledExpression compiledExpression14 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj17 = compiledExpression14.getValue(jXPathContext16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions20 = jXPathContext19.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols22 = null;
        jXPathContext19.setDecimalFormatSymbols("", decimalFormatSymbols22);
        java.lang.Class class24 = null;
        java.lang.Object obj25 = compiledExpression14.getValue(jXPathContext19, class24);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        int int32 = nullPointer28.getIndex();
        org.apache.commons.jxpath.ri.QName qName35 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str36 = qName35.toString();
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer40 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName35, obj37, jXPathBeanInfo38, locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = nullPointer28.attributeIterator(qName35);
        java.lang.String str42 = qName35.toString();
        java.lang.String str43 = qName35.getPrefix();
        java.lang.Object obj45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = collectionPointer4.createChild(jXPathContext19, qName35, 7, obj45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot turn org.apache.commons.jxpath.ri.JXPathContextReferenceImpl into a collection of size 8");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(compiledExpression14);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext19);
        org.junit.Assert.assertNotNull(functions20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2147483648) + "'", int32 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":UNKNOWN" + "'", str36, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ":UNKNOWN" + "'", str42, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str20 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) nullPointer14);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory23 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = beanPointerFactory23.createNodePointer(nodePointer24, qName27, (java.lang.Object) 10);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale31, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer33, (java.lang.Object) 2, nodeTest35);
        org.apache.commons.jxpath.ri.QName qName39 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str40 = qName39.toString();
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo42 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer44 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName39, obj41, jXPathBeanInfo42, locale43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = nullPointer33.attributeIterator(qName39);
        boolean boolean47 = qName39.equals((java.lang.Object) 78);
        org.apache.commons.jxpath.ri.QName qName50 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str51 = qName50.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer55 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName50, (java.lang.Object) (short) 100, dynamicPropertyHandler53, locale54);
        java.lang.Object obj56 = dynamicPointer55.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName59 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str60 = qName59.toString();
        java.lang.Object obj61 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo62 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer64 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName59, obj61, jXPathBeanInfo62, locale63);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = dynamicPointer55.attributeIterator(qName59);
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = beanPointerFactory23.createNodePointer(qName39, (java.lang.Object) dynamicPointer55, locale66);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer68 = dynamicPointer55.getPropertyPointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = nullPointer14.createNodeIterator("/", false, (org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ":UNKNOWN" + "'", str40, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ":UNKNOWN" + "'", str51, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (short) 100 + "'", obj56, (short) 100);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ":UNKNOWN" + "'", str60, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertNotNull(propertyPointer68);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, "JDOM", "*");
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, 29);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 0.0d, locale12);
        nodePointer13.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer13, nodeTest15, true, nodePointer17);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer13);
        boolean boolean20 = nullPropertyPointer19.isCollection();
        boolean boolean22 = nullPropertyPointer19.equals((java.lang.Object) 1);
        boolean boolean23 = nullPropertyPointer19.isLeaf();
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver28 = dOMNodePointer27.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer31 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27, "UNKNOWN", "0/*");
        java.lang.String str32 = namespacePointer31.toString();
        boolean boolean33 = namespacePointer31.isLeaf();
        int int34 = collectionPointer4.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer19, (org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer31);
        org.apache.commons.jxpath.ri.compiler.NodeTypeTest nodeTypeTest36 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest(15);
        boolean boolean37 = namespacePointer31.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeTypeTest36);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(namespaceResolver28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str32, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        int int11 = nullPropertyPointer9.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9, 38);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler14 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray15 = null;
        java.lang.Object obj16 = treeCompiler14.or(objArray15);
        org.apache.commons.jxpath.ri.compiler.Step step18 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray19 = new org.apache.commons.jxpath.ri.compiler.Step[] { step18 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath20 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray19);
        java.lang.Object obj21 = treeCompiler14.or((java.lang.Object[]) stepArray19);
        // The following exception was thrown during execution in test generation
        try {
            nullElementPointer13.setValue((java.lang.Object) stepArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Collection element does not exist: 0/*[39]");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(stepArray19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        boolean boolean10 = nullPropertyPointer9.isCollection();
        org.apache.commons.jxpath.CompiledExpression compiledExpression12 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj15 = compiledExpression12.getValue(jXPathContext14);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions18 = jXPathContext17.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols20 = null;
        jXPathContext17.setDecimalFormatSymbols("", decimalFormatSymbols20);
        java.lang.Class class22 = null;
        java.lang.Object obj23 = compiledExpression12.getValue(jXPathContext17, class22);
        java.util.Locale locale24 = null;
        jXPathContext17.setLocale(locale24);
        org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper variableContextWrapper26 = org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(jXPathContext17);
        org.apache.commons.jxpath.ri.QName qName29 = new org.apache.commons.jxpath.ri.QName("JDOM", "");
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale31, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer33, (java.lang.Object) 2, nodeTest35);
        int int37 = nullPointer33.getIndex();
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = nullPointer33.attributeIterator(qName40);
        org.apache.commons.jxpath.ri.QName qName47 = nullPointer33.getName();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer48 = nullPointer33.getPropertyPointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = nullPropertyPointer9.createChild(jXPathContext17, qName29, (int) (short) 0, (java.lang.Object) nullPointer33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: 0/*");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compiledExpression12);
        org.junit.Assert.assertNotNull(jXPathContext14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(functions18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertNotNull(variableContextWrapper26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2147483648) + "'", int37 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNull(qName47);
        org.junit.Assert.assertNotNull(propertyPointer48);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("", "0/namespace::");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer21.attributeIterator(qName24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jDOMNodePointer21.isLanguage("null()");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator25);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        boolean boolean17 = dOMNodePointer9.isActual();
        int int18 = dOMNodePointer9.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions21 = jXPathContext20.getFunctions();
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContext20.getContextPointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer24 = dOMNodePointer9.getPointerByID(jXPathContext20, "Empty expression context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(functions21);
        org.junit.Assert.assertNotNull(pointer22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext7, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (java.lang.Object) 2, nodeTest15);
        int int17 = nullPointer13.getIndex();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer13.attributeIterator(qName20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        boolean boolean31 = nodePointer30.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer30, "", "hi!");
        java.lang.Object obj35 = jDOMNamespacePointer34.getImmediateNode();
        int int36 = collectionPointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer34);
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer10);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = collectionPointer10.attributeIterator(qName40);
        java.lang.String str47 = qName40.toString();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":UNKNOWN" + "'", str47, ":UNKNOWN");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.jxpath.Variables variables0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str4 = qName3.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer8 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName3, (java.lang.Object) (short) 100, dynamicPropertyHandler6, locale7);
        java.lang.Object obj9 = dynamicPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynamicPointer8.attributeIterator(qName12);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer19 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables0, qName12);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str23 = qName22.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = variablePointer19.attributeIterator(qName22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":UNKNOWN" + "'", str4, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":UNKNOWN" + "'", str23, ":UNKNOWN");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale8, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer10, (java.lang.Object) 2, nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str17 = qName16.toString();
        java.lang.Object obj18 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName16, obj18, jXPathBeanInfo19, locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = nullPointer10.attributeIterator(qName16);
        boolean boolean24 = qName16.equals((java.lang.Object) 78);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = dynamicPointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer41 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName36, obj38, jXPathBeanInfo39, locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = dynamicPointer32.attributeIterator(qName36);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = beanPointerFactory0.createNodePointer(qName16, (java.lang.Object) dynamicPointer32, locale43);
        java.lang.Object obj45 = nodePointer44.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":UNKNOWN" + "'", str17, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "/");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions18 = jXPathContext17.getFunctions();
        org.apache.commons.jxpath.Pointer pointer19 = jXPathContext17.getContextPointer();
        org.w3c.dom.Node node20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer23 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node20, locale21, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = dOMNodePointer23.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28, ":UNKNOWN");
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale32, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer34, (java.lang.Object) 2, nodeTest36);
        java.lang.Object obj38 = nullPointer34.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = dOMNodePointer23.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer34);
        java.lang.String str41 = dOMNodePointer23.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer23, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = nullPointer2.createPath(jXPathContext17, (java.lang.Object) "id(UNKNOWN)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(UNKNOWN)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(functions18);
        org.junit.Assert.assertNotNull(pointer19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        java.lang.String str5 = dOMNodePointer3.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName9, ":UNKNOWN");
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext6, (java.lang.Object) qName9);
        org.apache.commons.jxpath.ri.QName qName15 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str16 = qName15.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer20 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName15, (java.lang.Object) (short) 100, dynamicPropertyHandler18, locale19);
        java.lang.Object obj21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, obj21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = dOMNodePointer3.createAttribute(jXPathContext6, qName15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('UNKNOWN')/@:UNKNOWN, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "id('UNKNOWN')" + "'", str5, "id('UNKNOWN')");
        org.junit.Assert.assertNotNull(jXPathContext12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":UNKNOWN" + "'", str16, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer23);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        boolean boolean9 = namespacePointer7.isLeaf();
        java.lang.String str10 = namespacePointer7.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = null;
        org.w3c.dom.Node node12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node12, locale13, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer15.testNode(nodeTest16);
        int int18 = namespacePointer7.compareChildNodePointers(nodePointer11, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName19 = dOMNodePointer15.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str10, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.String str12 = nullPropertyPointer9.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, "JDOM", "*");
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, 29);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 0.0d, locale12);
        nodePointer13.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer13, nodeTest15, true, nodePointer17);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer13);
        boolean boolean20 = nullPropertyPointer19.isCollection();
        boolean boolean22 = nullPropertyPointer19.equals((java.lang.Object) 1);
        boolean boolean23 = nullPropertyPointer19.isLeaf();
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver28 = dOMNodePointer27.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer31 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27, "UNKNOWN", "0/*");
        java.lang.String str32 = namespacePointer31.toString();
        boolean boolean33 = namespacePointer31.isLeaf();
        int int34 = collectionPointer4.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer19, (org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer31);
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions37 = jXPathContext36.getFunctions();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer39 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext36, locale38);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = collectionPointer39.testNode(nodeTest40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = collectionPointer39.namespacePointer("http://www.w3.org/XML/1998/namespace");
        boolean boolean44 = collectionPointer4.equals((java.lang.Object) nodePointer43);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(namespaceResolver28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str32, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(functions37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(nodePointer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.NodeSet nodeSet2 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext3 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext1, nodeSet2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext5 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, nodeTest4);
        int int6 = nodeSetContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext8 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, nodeTest7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext11 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, nodeTest9, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext22 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext19, true, nodeTest21);
        boolean boolean23 = descendantContext22.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.NodeSet nodeSet25 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext26 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext24, nodeSet25);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext28 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest27);
        int int29 = nodeSetContext26.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext31 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest30);
        int int32 = parentContext31.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = parentContext31.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] { descendantContext22, parentContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, evalContextArray34);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = unionContext36.setPosition(99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertNotNull(evalContextArray34);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = nullPointer14.getValue();
        java.lang.String str21 = nullPointer14.toString();
        org.apache.commons.jxpath.ri.parser.ParseException parseException22 = new org.apache.commons.jxpath.ri.parser.ParseException();
        int[][] intArray23 = parseException22.expectedTokenSequences;
        org.apache.commons.jxpath.ri.parser.ParseException parseException24 = new org.apache.commons.jxpath.ri.parser.ParseException();
        java.lang.String[] strArray25 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        parseException24.tokenImage = strArray25;
        parseException22.tokenImage = strArray25;
        boolean boolean28 = nullPointer14.equals((java.lang.Object) strArray25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "id(UNKNOWN)" + "'", str21, "id(UNKNOWN)");
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer3.namespacePointer("org.apache.commons.jxpath.JXPathFunctionNotFoundException: :UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3);
        boolean boolean23 = nullPropertyPointer22.isContainer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.Step step4 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray5 = new org.apache.commons.jxpath.ri.compiler.Step[] { step4 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath6 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray5);
        java.lang.Object obj7 = treeCompiler0.or((java.lang.Object[]) stepArray5);
        java.lang.Object obj9 = treeCompiler0.nodeTypeTest(58);
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer12 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale10, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        boolean boolean15 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer12, (java.lang.Object) 2, nodeTest14);
        java.lang.Object obj16 = nullPointer12.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 0.0d, locale19);
        nodePointer20.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer20, nodeTest22, true, nodePointer24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = null;
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = beanPointerFactory32.createNodePointer(nodePointer33, qName36, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer20, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30, false, nodePointer33);
        int int41 = nullPointer12.compareTo((java.lang.Object) nodePointer20);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer12.getPropertyPointer();
        java.util.Locale locale43 = propertyPointer42.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = treeCompiler0.variableReference((java.lang.Object) propertyPointer42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer cannot be cast to org.apache.commons.jxpath.ri.QName");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(stepArray5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "UNKNOWN()");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNull(locale43);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler3 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray4 = null;
        java.lang.Object obj5 = treeCompiler3.or(objArray4);
        org.apache.commons.jxpath.ri.compiler.Step step7 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray8 = new org.apache.commons.jxpath.ri.compiler.Step[] { step7 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath9 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray8);
        java.lang.Object obj10 = treeCompiler3.or((java.lang.Object[]) stepArray8);
        java.lang.Object obj11 = treeCompiler0.or((java.lang.Object[]) stepArray8);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 0.0d, locale14);
        nodePointer15.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer15, nodeTest17, true, nodePointer19);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer21 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer15);
        java.util.Iterator iterator22 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer21);
        int int23 = nullPropertyPointer21.getLength();
        nullPropertyPointer21.setPropertyName("0/namespace::");
        org.w3c.dom.Node node26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node26, locale27, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver30 = dOMNodePointer29.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver31 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeCompiler0.lessThanOrEqual((java.lang.Object) nullPropertyPointer21, (java.lang.Object) namespaceResolver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(stepArray8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        java.lang.Object obj8 = dynamicPointer7.getImmediateNode();
        java.lang.String str9 = dynamicPointer7.asPath();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dynamicPointer7, locale10, "0/*");
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer12.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.Step step4 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray5 = new org.apache.commons.jxpath.ri.compiler.Step[] { step4 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath6 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray5);
        java.lang.Object obj7 = treeCompiler0.or((java.lang.Object[]) stepArray5);
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = dOMNodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.ri.QName qName15 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        boolean boolean16 = dOMNodePointer11.equals((java.lang.Object) "");
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeCompiler0.lessThan((java.lang.Object) dOMNodePointer11, obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.dom.DOMNodePointer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(stepArray5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(namespaceResolver12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (java.lang.Object) 2, nodeTest9);
        int int11 = nullPointer7.getIndex();
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str15 = qName14.toString();
        java.lang.Object obj16 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName14, obj16, jXPathBeanInfo17, locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = nullPointer7.attributeIterator(qName14);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 0.0d, locale23);
        boolean boolean25 = nodePointer24.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer24, "", "hi!");
        java.lang.Object obj29 = jDOMNamespacePointer28.getImmediateNode();
        int int30 = collectionPointer4.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer28);
        boolean boolean31 = jDOMNamespacePointer28.isLeaf();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2147483648) + "'", int11 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":UNKNOWN" + "'", str15, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.jxpath.ri.parser.ParseException parseException1 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        org.apache.commons.jxpath.JXPathException jXPathException2 = new org.apache.commons.jxpath.JXPathException((java.lang.Throwable) parseException1);
        org.apache.commons.jxpath.ri.parser.ParseException parseException4 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.jxpath.ri.parser.Token token6 = parseException1.currentToken;
        org.jdom.Namespace namespace8 = null;
        java.lang.String str9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute((java.lang.Object) parseException1, "", namespace8);
        org.junit.Assert.assertNull(token6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        descendantContext10.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.NodeSet nodeSet21 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext22 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext20, nodeSet21);
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext20, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext45 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        attributeContext46.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = attributeContext46.setPosition((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        boolean boolean17 = dOMNodePointer9.isActual();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dOMNodePointer9.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dOMNodePointer3.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        java.lang.String str11 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer7, "hi!");
        boolean boolean14 = dynamicPointer7.isLeaf();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        java.lang.Object obj8 = dynamicPointer7.getImmediateNode();
        java.lang.String str9 = dynamicPointer7.asPath();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dynamicPointer7, locale10, "0/*");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str18 = qName17.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = beanPointerFactory13.createNodePointer(nodePointer14, qName17, (java.lang.Object) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = qName17.equals(obj21);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dynamicPointer7.attributeIterator(qName17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":UNKNOWN" + "'", str18, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeIterator23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (java.lang.Object) 2, nodeTest9);
        int int11 = nullPointer7.getIndex();
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str15 = qName14.toString();
        java.lang.Object obj16 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName14, obj16, jXPathBeanInfo17, locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = nullPointer7.attributeIterator(qName14);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 0.0d, locale23);
        boolean boolean25 = nodePointer24.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer24, "", "hi!");
        java.lang.Object obj29 = jDOMNamespacePointer28.getImmediateNode();
        int int30 = collectionPointer4.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer7, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer28);
        boolean boolean31 = collectionPointer4.isCollection();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2147483648) + "'", int11 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":UNKNOWN" + "'", str15, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext10 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest8, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext15 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext18 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest16, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext21 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext18, true, nodeTest20);
        boolean boolean22 = descendantContext21.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.NodeSet nodeSet24 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext25 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext23, nodeSet24);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext27 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest26);
        int int28 = nodeSetContext25.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext30 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest29);
        int int31 = parentContext30.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = parentContext30.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { descendantContext21, parentContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, evalContextArray33);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) evalContextArray33, locale35, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver38 = jDOMNodePointer37.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions41 = jXPathContext40.getFunctions();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer43 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext40, locale42);
        java.lang.Object obj44 = collectionPointer43.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions47 = jXPathContext46.getFunctions();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = collectionPointer43.createPath(jXPathContext46);
        org.apache.commons.jxpath.ri.QName qName49 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName49, (java.lang.Object) 0.0d, locale51);
        nodePointer52.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer52, nodeTest54, true, nodePointer56);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer58 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer52);
        java.util.Iterator iterator59 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer58);
        java.lang.Object obj60 = nullPropertyPointer58.getImmediateNode();
        java.lang.String str61 = nullPropertyPointer58.getPropertyName();
        nullPropertyPointer58.setPropertyIndex((-1));
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer65 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nullPropertyPointer58, locale64);
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions68 = jXPathContext67.getFunctions();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer70 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext67, locale69);
        org.apache.commons.jxpath.Pointer pointer71 = jXPathContext67.getNamespaceContextPointer();
        java.lang.String str73 = jXPathContext67.getPrefix("id(UNKNOWN)");
        org.apache.commons.jxpath.ri.QName qName76 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str77 = qName76.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler79 = null;
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer81 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName76, (java.lang.Object) (short) 100, dynamicPropertyHandler79, locale80);
        java.lang.Object obj82 = null;
        java.util.Locale locale83 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName76, obj82, locale83);
        org.apache.commons.jxpath.ri.EvalContext evalContext86 = null;
        org.apache.commons.jxpath.NodeSet nodeSet87 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext88 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext86, nodeSet87);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = collectionPointer65.createChild(jXPathContext67, qName76, 0, (java.lang.Object) nodeSetContext88);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = jDOMNodePointer37.createChild(jXPathContext46, qName76, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: id('http://www.w3.org/XML/1998/namespace')");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertNotNull(namespaceResolver38);
        org.junit.Assert.assertNotNull(jXPathContext40);
        org.junit.Assert.assertNotNull(functions41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "/");
        org.junit.Assert.assertNotNull(jXPathContext46);
        org.junit.Assert.assertNotNull(functions47);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "*" + "'", str61, "*");
        org.junit.Assert.assertNotNull(jXPathContext67);
        org.junit.Assert.assertNotNull(functions68);
        org.junit.Assert.assertNotNull(pointer71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ":UNKNOWN" + "'", str77, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer84);
        org.junit.Assert.assertNotNull(nodePointer89);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = dOMNodePointer3.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer11 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "", "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions14 = jXPathContext13.getFunctions();
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer16 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext13, locale15);
        boolean boolean17 = collectionPointer16.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions20 = jXPathContext19.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols22 = null;
        jXPathContext19.setDecimalFormatSymbols("", decimalFormatSymbols22);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = collectionPointer16.createPath(jXPathContext19);
        org.apache.commons.jxpath.Variables variables25 = jXPathContext19.getVariables();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = dOMNodePointer3.createPath(jXPathContext19);
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jXPathContext13);
        org.junit.Assert.assertNotNull(functions14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jXPathContext19);
        org.junit.Assert.assertNotNull(functions20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(variables25);
        org.junit.Assert.assertNotNull(nodePointer26);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer4);
        java.util.Iterator iterator11 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer10);
        java.lang.Object obj12 = nullPropertyPointer10.getValue();
        int int13 = nullPropertyPointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer18, nodeTest20, true, nodePointer22);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        java.util.Iterator iterator25 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer24);
        int int26 = nullPropertyPointer24.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer24, 38);
        int int29 = nullPropertyPointer24.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodePointer14, (org.apache.commons.jxpath.Pointer) nullPropertyPointer24);
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator33 = jXPathContextReferenceImpl30.iterate("/", expression32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.String str12 = nullPropertyPointer9.getPropertyName();
        java.lang.Object obj13 = nullPropertyPointer9.getImmediateNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer4);
        java.util.Iterator iterator11 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer10);
        java.lang.Object obj12 = nullPropertyPointer10.getValue();
        int int13 = nullPropertyPointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer18, nodeTest20, true, nodePointer22);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        java.util.Iterator iterator25 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer24);
        int int26 = nullPropertyPointer24.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer24, 38);
        int int29 = nullPropertyPointer24.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodePointer14, (org.apache.commons.jxpath.Pointer) nullPropertyPointer24);
        org.w3c.dom.Node node31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node31, locale32, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = dOMNodePointer34.testNode(nodeTest35);
        org.apache.commons.jxpath.ri.QName qName39 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest41 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName39, ":UNKNOWN");
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale43, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        boolean boolean48 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer45, (java.lang.Object) 2, nodeTest47);
        java.lang.Object obj49 = nullPointer45.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = dOMNodePointer34.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer45);
        java.lang.String str52 = dOMNodePointer34.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer34, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext0, (java.lang.Object) "id(UNKNOWN)");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(jXPathContext56);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getValue();
        java.lang.Object obj12 = nullPropertyPointer9.getImmediateNode();
        int int13 = nullPropertyPointer9.getPropertyCount();
        org.w3c.dom.Node node15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node15, locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = dOMNodePointer18.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer22 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18, "UNKNOWN", "0/*");
        java.lang.String str23 = namespacePointer22.toString();
        boolean boolean24 = namespacePointer22.isLeaf();
        int int25 = namespacePointer22.getLength();
        org.w3c.dom.Node node26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node26, locale27, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = dOMNodePointer29.testNode(nodeTest30);
        org.apache.commons.jxpath.ri.QName qName34 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest36 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName34, ":UNKNOWN");
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer40 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale38, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer40, (java.lang.Object) 2, nodeTest42);
        java.lang.Object obj44 = nullPointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = dOMNodePointer29.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer40);
        boolean boolean46 = namespacePointer22.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36);
        boolean boolean47 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9, (java.lang.Object) 54, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = nullPropertyPointer9.getImmediateParentPointer();
        java.lang.Object obj49 = nullPropertyPointer9.getImmediateNode();
        int int50 = nullPropertyPointer9.getPropertyCount();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str23, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError2 = new org.apache.commons.jxpath.ri.parser.TokenMgrError("id('UNKNOWN')/namespace::UNKNOWN", (int) (byte) 0);
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError10 = new org.apache.commons.jxpath.ri.parser.TokenMgrError(false, 22, 0, (int) (byte) 100, "", ' ', 0);
        int int11 = tokenMgrError10.getPosition();
        tokenMgrError2.addSuppressed((java.lang.Throwable) tokenMgrError10);
        int int13 = tokenMgrError10.getPosition();
        org.apache.commons.jxpath.ri.parser.ParseException parseException15 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        org.apache.commons.jxpath.JXPathException jXPathException16 = new org.apache.commons.jxpath.JXPathException((java.lang.Throwable) parseException15);
        org.apache.commons.jxpath.ri.parser.ParseException parseException18 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        tokenMgrError10.addSuppressed((java.lang.Throwable) parseException15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer4);
        java.util.Iterator iterator11 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer10);
        java.lang.Object obj12 = nullPropertyPointer10.getValue();
        int int13 = nullPropertyPointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer18, nodeTest20, true, nodePointer22);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        java.util.Iterator iterator25 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer24);
        int int26 = nullPropertyPointer24.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer24, 38);
        int int29 = nullPropertyPointer24.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodePointer14, (org.apache.commons.jxpath.Pointer) nullPropertyPointer24);
        org.w3c.dom.Node node32 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node32, locale33, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = dOMNodePointer35.testNode(nodeTest36);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest42 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName40, ":UNKNOWN");
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer46 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale44, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        boolean boolean49 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer46, (java.lang.Object) 2, nodeTest48);
        java.lang.Object obj50 = nullPointer46.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = dOMNodePointer35.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest42, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer46);
        java.lang.String str53 = dOMNodePointer35.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer35, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        // The following exception was thrown during execution in test generation
        try {
            jXPathContextReferenceImpl30.setValue("JDOM", (java.lang.Object) jDOMNamespacePointer56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Exception trying to set value with xpath JDOM; Cannot set property 0/*/JDOM, path does not match a changeable location");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.String str21 = dOMNodePointer3.getNamespaceURI("UNKNOWN");
        java.lang.Object obj22 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions25 = jXPathContext24.getFunctions();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer27 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext24, locale26);
        org.apache.commons.jxpath.Pointer pointer28 = jXPathContext24.getNamespaceContextPointer();
        org.apache.commons.jxpath.PackageFunctions packageFunctions31 = new org.apache.commons.jxpath.PackageFunctions("", ":UNKNOWN");
        java.util.Set set32 = packageFunctions31.getUsedNamespaces();
        java.util.Set set33 = packageFunctions31.getUsedNamespaces();
        jXPathContext24.setFunctions((org.apache.commons.jxpath.Functions) packageFunctions31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer36 = dOMNodePointer3.getPointerByID(jXPathContext24, "org.apache.commons.jxpath.JXPathFunctionNotFoundException: :UNKNOWN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(jXPathContext24);
        org.junit.Assert.assertNotNull(functions25);
        org.junit.Assert.assertNotNull(pointer28);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale8, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer10, (java.lang.Object) 2, nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str17 = qName16.toString();
        java.lang.Object obj18 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName16, obj18, jXPathBeanInfo19, locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = nullPointer10.attributeIterator(qName16);
        boolean boolean24 = qName16.equals((java.lang.Object) 78);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = dynamicPointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer41 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName36, obj38, jXPathBeanInfo39, locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = dynamicPointer32.attributeIterator(qName36);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = beanPointerFactory0.createNodePointer(qName16, (java.lang.Object) dynamicPointer32, locale43);
        java.lang.Object obj45 = dynamicPointer32.getRootNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":UNKNOWN" + "'", str17, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) 100 + "'", obj45, (short) 100);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        boolean boolean9 = namespacePointer7.isLeaf();
        int int10 = namespacePointer7.getLength();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer14.testNode(nodeTest15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName19, ":UNKNOWN");
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale23, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        boolean boolean28 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer25, (java.lang.Object) 2, nodeTest27);
        java.lang.Object obj29 = nullPointer25.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = dOMNodePointer14.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer25);
        boolean boolean31 = namespacePointer7.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        java.lang.String str32 = namespacePointer7.asPath();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str32, "id('UNKNOWN')/namespace::UNKNOWN");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        boolean boolean9 = namespacePointer7.isLeaf();
        int int10 = namespacePointer7.getLength();
        java.lang.String str11 = namespacePointer7.asPath();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = namespacePointer7.namespaceIterator();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str11, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertNull(nodeIterator12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        int int4 = nodePointer3.getLength();
        org.w3c.dom.Node node5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node5, locale6, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = dOMNodePointer8.testNode(nodeTest9);
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest15 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName13, ":UNKNOWN");
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale17, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19, (java.lang.Object) 2, nodeTest21);
        java.lang.Object obj23 = nullPointer19.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = dOMNodePointer8.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19);
        org.w3c.dom.Node node26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node26, locale27, "UNKNOWN");
        java.lang.Object obj30 = dOMNodePointer29.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = nodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer29);
        java.lang.Object obj32 = dOMNodePointer29.getBaseValue();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer29, locale33, "org.apache.commons.jxpath.JXPathContextFactory");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(nodeIterator31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        int int9 = jDOMNodeIterator8.getPosition();
        int int10 = jDOMNodeIterator8.getPosition();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream3 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, (int) (byte) 10, 41);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        java.lang.String str11 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer7, "hi!");
        java.lang.Object obj14 = namespacePointer13.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str18 = qName17.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer22 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName17, (java.lang.Object) (short) 100, dynamicPropertyHandler20, locale21);
        int int23 = dynamicPointer22.getLength();
        dynamicPointer22.setIndex(1);
        boolean boolean26 = dynamicPointer22.isDynamicPropertyDeclarationSupported();
        boolean boolean27 = dynamicPointer22.isCollection();
        org.apache.commons.jxpath.ri.QName qName30 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str31 = qName30.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer35 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName30, (java.lang.Object) (short) 100, dynamicPropertyHandler33, locale34);
        java.lang.Object obj36 = dynamicPointer35.getImmediateNode();
        int int37 = namespacePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer22, (org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer35);
        org.w3c.dom.Node node38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale39, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = dOMNodePointer41.testNode(nodeTest42);
        org.apache.commons.jxpath.ri.QName qName46 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest48 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName46, ":UNKNOWN");
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer52 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale50, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        boolean boolean55 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52, (java.lang.Object) 2, nodeTest54);
        java.lang.Object obj56 = nullPointer52.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = dOMNodePointer41.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest48, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52);
        java.lang.Object obj58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52, obj58);
        boolean boolean60 = nullPointer52.isDynamicPropertyDeclarationSupported();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer61 = nullPointer52.getPropertyPointer();
        boolean boolean62 = namespacePointer13.equals((java.lang.Object) nullPointer52);
        boolean boolean63 = nullPointer52.isNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":UNKNOWN" + "'", str18, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":UNKNOWN" + "'", str31, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(propertyPointer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.jxpath.ri.compiler.Constant constant1 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 69);
        org.apache.commons.jxpath.ri.EvalContext evalContext2 = null;
        java.lang.Object obj3 = constant1.computeValue(evalContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.NodeSet nodeSet5 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext6 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext4, nodeSet5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext8 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext6, nodeTest7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext11 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext6, nodeTest9, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext14 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext11, true, nodeTest13);
        precedingOrFollowingContext11.reset();
        java.lang.Object obj16 = constant1.computeValue((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext11);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 69 + "'", obj3, 69);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 69 + "'", obj16, 69);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, obj4, jXPathBeanInfo5, locale6);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = beanPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName9 = beanPointer7.getName();
        boolean boolean10 = beanPointer7.isCollection();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer4);
        java.util.Iterator iterator11 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer10);
        java.lang.Object obj12 = nullPropertyPointer10.getValue();
        int int13 = nullPropertyPointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer18, nodeTest20, true, nodePointer22);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        java.util.Iterator iterator25 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer24);
        int int26 = nullPropertyPointer24.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer24, 38);
        int int29 = nullPropertyPointer24.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodePointer14, (org.apache.commons.jxpath.Pointer) nullPropertyPointer24);
        org.apache.commons.jxpath.ri.compiler.Constant constant33 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 69);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest35 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant33, expression34);
        boolean boolean36 = constant33.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.NodeSet nodeSet38 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext39 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext37, nodeSet38);
        org.w3c.dom.Node node41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer44 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node41, locale42, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = dOMNodePointer44.testNode(nodeTest45);
        org.apache.commons.jxpath.ri.QName qName49 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest51 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName49, ":UNKNOWN");
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer55 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale53, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        boolean boolean58 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer55, (java.lang.Object) 2, nodeTest57);
        java.lang.Object obj59 = nullPointer55.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = dOMNodePointer44.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest51, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer55);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext61 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext37, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest51);
        org.apache.commons.jxpath.ri.EvalContext evalContext62 = null;
        org.apache.commons.jxpath.NodeSet nodeSet63 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext64 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext62, nodeSet63);
        org.w3c.dom.Node node66 = null;
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer69 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node66, locale67, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest70 = null;
        boolean boolean71 = dOMNodePointer69.testNode(nodeTest70);
        org.apache.commons.jxpath.ri.QName qName74 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest76 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName74, ":UNKNOWN");
        java.util.Locale locale78 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer80 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale78, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        boolean boolean83 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer80, (java.lang.Object) 2, nodeTest82);
        java.lang.Object obj84 = nullPointer80.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator85 = dOMNodePointer69.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer80);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext86 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext62, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext87 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext61, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer88 = jXPathContextReferenceImpl30.createPathAndSetValue("UNKNOWN", (org.apache.commons.jxpath.ri.compiler.Expression) constant33, (java.lang.Object) nodeNameTest76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Exception trying to create xpath UNKNOWN; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(nodeIterator85);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols10 = null;
        jXPathContext7.setDecimalFormatSymbols("", decimalFormatSymbols10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext13, nodeSet14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext17 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext20 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest18, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext23 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, nodeTest22);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        java.lang.Object obj29 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName27, obj29, jXPathBeanInfo30, locale31);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName27, ":UNKNOWN");
        java.lang.String str35 = nodeNameTest34.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext36 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        int int37 = ancestorContext36.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.NodeSet nodeSet40 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext41 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext39, nodeSet40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext43 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest42);
        int int44 = nodeSetContext41.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext46 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest45);
        int int47 = parentContext46.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        org.apache.commons.jxpath.NodeSet nodeSet50 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext51 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext49, nodeSet50);
        org.w3c.dom.Node node53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale54, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        boolean boolean58 = dOMNodePointer56.testNode(nodeTest57);
        org.apache.commons.jxpath.ri.QName qName61 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest63 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName61, ":UNKNOWN");
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer67 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale65, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67, (java.lang.Object) 2, nodeTest69);
        java.lang.Object obj71 = nullPointer67.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = dOMNodePointer56.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext73 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext49, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext74 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext46, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext75 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext36, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.QName qName77 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName77, (java.lang.Object) 0.0d, locale79);
        nodePointer80.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer80, nodeTest82, true, nodePointer84);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer86 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer80);
        java.util.Iterator iterator87 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer86);
        int int88 = nullPropertyPointer86.getLength();
        java.lang.String[] strArray89 = nullPropertyPointer86.getPropertyNames();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator90 = collectionPointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer86);
        boolean boolean91 = nodeNameTest63.isWildcard();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":UNKNOWN" + "'", str35, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertNotNull(nodePointer80);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(nodeIterator90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        java.lang.String str11 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer7, "hi!");
        java.lang.Object obj14 = namespacePointer13.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str18 = qName17.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer22 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName17, (java.lang.Object) (short) 100, dynamicPropertyHandler20, locale21);
        int int23 = dynamicPointer22.getLength();
        dynamicPointer22.setIndex(1);
        boolean boolean26 = dynamicPointer22.isDynamicPropertyDeclarationSupported();
        boolean boolean27 = dynamicPointer22.isCollection();
        org.apache.commons.jxpath.ri.QName qName30 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str31 = qName30.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer35 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName30, (java.lang.Object) (short) 100, dynamicPropertyHandler33, locale34);
        java.lang.Object obj36 = dynamicPointer35.getImmediateNode();
        int int37 = namespacePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer22, (org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer35);
        org.apache.commons.jxpath.ri.compiler.NodeTypeTest nodeTypeTest39 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest(10);
        int int40 = nodeTypeTest39.getNodeType();
        boolean boolean41 = dynamicPointer35.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeTypeTest39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":UNKNOWN" + "'", str18, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":UNKNOWN" + "'", str31, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.jxpath.Variables variables0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str4 = qName3.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer8 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName3, (java.lang.Object) (short) 100, dynamicPropertyHandler6, locale7);
        java.lang.Object obj9 = dynamicPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynamicPointer8.attributeIterator(qName12);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer19 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables0, qName12);
        org.apache.commons.jxpath.ri.QName qName20 = variablePointer19.getName();
        org.w3c.dom.Node node21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node21, locale22, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        boolean boolean26 = dOMNodePointer24.testNode(nodeTest25);
        org.apache.commons.jxpath.ri.QName qName29 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest31 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName29, ":UNKNOWN");
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer35 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale33, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer35, (java.lang.Object) 2, nodeTest37);
        java.lang.Object obj39 = nullPointer35.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = dOMNodePointer24.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest31, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer35);
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer35, obj41);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory43 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = null;
        org.apache.commons.jxpath.ri.QName qName47 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str48 = qName47.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = beanPointerFactory43.createNodePointer(nodePointer44, qName47, (java.lang.Object) 10);
        java.lang.String str51 = qName47.getName();
        boolean boolean52 = jDOMNodePointer42.equals((java.lang.Object) str51);
        // The following exception was thrown during execution in test generation
        try {
            variablePointer19.setValue((java.lang.Object) jDOMNodePointer42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":UNKNOWN" + "'", str4, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":UNKNOWN" + "'", str48, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UNKNOWN" + "'", str51, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.w3c.dom.Node node9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node9, locale10, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = dOMNodePointer12.getNamespaceResolver();
        boolean boolean14 = namespaceResolver13.isSealed();
        nodePointer3.setNamespaceResolver(namespaceResolver13);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions18 = jXPathContext17.getFunctions();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer20 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext17, locale19);
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str24 = qName23.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer28 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName23, (java.lang.Object) (short) 100, dynamicPropertyHandler26, locale27);
        int int29 = dynamicPointer28.getLength();
        dynamicPointer28.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = null;
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = beanPointerFactory32.createNodePointer(nodePointer33, qName36, (java.lang.Object) 10);
        boolean boolean40 = dynamicPointer28.isValidProperty(qName36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = collectionPointer20.attributeIterator(qName36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = nodePointer3.attributeIterator(qName36);
        org.apache.commons.jxpath.ri.QName qName43 = nodePointer3.getName();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(namespaceResolver13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(functions18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ":UNKNOWN" + "'", str24, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNull(qName43);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.String str12 = nullPropertyPointer9.getPropertyName();
        nullPropertyPointer9.setPropertyIndex((-1));
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer16 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nullPropertyPointer9, locale15);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions19 = jXPathContext18.getFunctions();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer21 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext18, locale20);
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContext18.getNamespaceContextPointer();
        java.lang.String str24 = jXPathContext18.getPrefix("id(UNKNOWN)");
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, obj33, locale34);
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.NodeSet nodeSet38 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext39 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext37, nodeSet38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = collectionPointer16.createChild(jXPathContext18, qName27, 0, (java.lang.Object) nodeSetContext39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list42 = jXPathContext18.selectNodes("/[30]");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: '/[30]'. Syntax error after: '/'");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertNotNull(jXPathContext18);
        org.junit.Assert.assertNotNull(functions19);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory dynamicPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer4.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName9, ":UNKNOWN");
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale13, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer15, (java.lang.Object) 2, nodeTest17);
        java.lang.Object obj19 = nullPointer15.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = dOMNodePointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest11, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer15);
        java.lang.String str22 = dOMNodePointer4.getNamespaceURI("UNKNOWN");
        boolean boolean23 = dOMNodePointer4.isCollection();
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 0.0d, locale26);
        nodePointer27.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer27, nodeTest29, true, nodePointer31);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer27);
        java.util.Iterator iterator34 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer33);
        java.lang.Object obj35 = nullPropertyPointer33.getImmediateNode();
        boolean boolean36 = nullPropertyPointer33.isCollection();
        boolean boolean37 = nullPropertyPointer33.isActual();
        org.apache.commons.jxpath.ri.QName qName38 = nullPropertyPointer33.getName();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) 0.0d, locale41);
        nodePointer42.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer42, nodeTest44, true, nodePointer46);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer48 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer42);
        java.util.Iterator iterator49 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer48);
        java.lang.Object obj50 = nullPropertyPointer48.getValue();
        int int51 = nullPropertyPointer48.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = dynamicPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName38, (java.lang.Object) nullPropertyPointer48);
        int int53 = dynamicPointerFactory0.getOrder();
        org.apache.commons.jxpath.ri.QName qName56 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str57 = qName56.toString();
        java.lang.Object obj58 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo59 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer61 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName56, obj58, jXPathBeanInfo59, locale60);
        java.io.Reader reader62 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream66 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader62, 0, 2, 6);
        simpleCharStream66.bufpos = 100;
        simpleCharStream66.adjustBeginLineColumn(0, (int) 'a');
        simpleCharStream66.backup(2);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo74 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer76 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName56, (java.lang.Object) 2, jXPathBeanInfo74, locale75);
        org.apache.commons.jxpath.ri.QName qName79 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str80 = qName79.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler82 = null;
        java.util.Locale locale83 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer84 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName79, (java.lang.Object) (short) 100, dynamicPropertyHandler82, locale83);
        int int85 = dynamicPointer84.getLength();
        java.lang.String str86 = dynamicPointer84.getNamespaceURI();
        org.w3c.dom.Node node87 = null;
        java.util.Locale locale88 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer90 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node87, locale88, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver91 = dOMNodePointer90.getNamespaceResolver();
        boolean boolean92 = namespaceResolver91.isSealed();
        dynamicPointer84.setNamespaceResolver(namespaceResolver91);
        java.util.Locale locale94 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer95 = dynamicPointerFactory0.createNodePointer(qName56, (java.lang.Object) namespaceResolver91, locale94);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest96 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName56);
        java.lang.String str97 = qName56.getPrefix();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(nodePointer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 800 + "'", int53 == 800);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ":UNKNOWN" + "'", str57, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + ":UNKNOWN" + "'", str80, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(namespaceResolver91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(nodePointer95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.lang.Object obj5 = collectionPointer4.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper variableContextWrapper10 = org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(jXPathContext7);
        // The following exception was thrown during execution in test generation
        try {
            jXPathContext7.removePath("/");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Exception trying to remove xpath /; Cannot remove an object that is not some other object's property or a collection element");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "/");
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(variableContextWrapper10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 0.0d, locale9);
        nodePointer10.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, nodeTest12, true, nodePointer14);
        org.apache.commons.jxpath.ri.QName qName18 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest20 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName18, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest20, false, nodePointer23);
        int int31 = nullPointer2.compareTo((java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nullPointer2.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName33 = nullPointer2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNull(qName33);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.w3c.dom.Node node9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node9, locale10, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = dOMNodePointer12.getNamespaceResolver();
        boolean boolean14 = namespaceResolver13.isSealed();
        nodePointer3.setNamespaceResolver(namespaceResolver13);
        org.w3c.dom.Node node16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node16, locale17, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = dOMNodePointer19.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest26 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName24, ":UNKNOWN");
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer30 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale28, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer30, (java.lang.Object) 2, nodeTest32);
        java.lang.Object obj34 = nullPointer30.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = dOMNodePointer19.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest26, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer30);
        java.lang.Object obj36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer30, obj36);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory38 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = null;
        org.apache.commons.jxpath.ri.QName qName42 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str43 = qName42.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = beanPointerFactory38.createNodePointer(nodePointer39, qName42, (java.lang.Object) 10);
        java.lang.String str46 = qName42.getName();
        boolean boolean47 = jDOMNodePointer37.equals((java.lang.Object) str46);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = jDOMNodePointer37.namespacePointer("org.apache.commons.jxpath.ri.parser.ParseException");
        namespaceResolver13.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37);
        org.apache.commons.jxpath.ri.QName qName51 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName51, (java.lang.Object) 0.0d, locale53);
        nodePointer54.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer54, nodeTest56, true, nodePointer58);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer60 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer54);
        java.util.Iterator iterator61 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer60);
        java.lang.Object obj62 = nullPropertyPointer60.getValue();
        int int63 = nullPropertyPointer60.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = nullPropertyPointer60.getImmediateValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer37.setValue((java.lang.Object) nullPropertyPointer60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(namespaceResolver13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":UNKNOWN" + "'", str43, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UNKNOWN" + "'", str46, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(nodePointer64);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        boolean boolean6 = dOMNodePointer3.isActual();
        org.apache.commons.jxpath.CompiledExpression compiledExpression8 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj11 = compiledExpression8.getValue(jXPathContext10);
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions14 = jXPathContext13.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols16 = null;
        jXPathContext13.setDecimalFormatSymbols("", decimalFormatSymbols16);
        java.lang.Class class18 = null;
        java.lang.Object obj19 = compiledExpression8.getValue(jXPathContext13, class18);
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions22 = jXPathContext21.getFunctions();
        org.apache.commons.jxpath.Pointer pointer24 = compiledExpression8.getPointer(jXPathContext21, "");
        org.apache.commons.jxpath.Pointer pointer25 = jXPathContext21.getContextPointer();
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = dOMNodePointer3.createChild(jXPathContext21, qName28, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: id('UNKNOWN')");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(compiledExpression8);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext13);
        org.junit.Assert.assertNotNull(functions14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext21);
        org.junit.Assert.assertNotNull(functions22);
        org.junit.Assert.assertNotNull(pointer24);
        org.junit.Assert.assertNotNull(pointer25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        java.lang.Object obj22 = jDOMNodePointer21.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = jDOMNodePointer21.getImmediateValuePointer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodePointer23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        java.lang.String str30 = qName26.getName();
        boolean boolean31 = jDOMNodePointer21.equals((java.lang.Object) str30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer21.namespacePointer("org.apache.commons.jxpath.ri.parser.ParseException");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer21.namespacePointer("*");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UNKNOWN" + "'", str30, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer35);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.jxpath.ri.parser.Token token1 = org.apache.commons.jxpath.ri.parser.Token.newToken(0);
        token1.endLine = 12;
        org.apache.commons.jxpath.ri.parser.Token token5 = org.apache.commons.jxpath.ri.parser.Token.newToken(0);
        int int6 = token5.kind;
        token1.specialToken = token5;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        java.lang.String str22 = jDOMNodePointer21.getNamespaceURI();
        int int23 = jDOMNodePointer21.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.NodeSet nodeSet25 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext26 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext24, nodeSet25);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext28 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest27);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext31 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest29, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, nodeTest33);
        org.apache.commons.jxpath.ri.QName qName38 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str39 = qName38.toString();
        java.lang.Object obj40 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer43 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName38, obj40, jXPathBeanInfo41, locale42);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest45 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38, ":UNKNOWN");
        java.lang.String str46 = nodeNameTest45.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext47 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45);
        int int48 = ancestorContext47.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.NodeSet nodeSet51 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext52 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext50, nodeSet51);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext54 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext52, nodeTest53);
        int int55 = nodeSetContext52.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext57 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext52, nodeTest56);
        int int58 = parentContext57.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext60 = null;
        org.apache.commons.jxpath.NodeSet nodeSet61 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext62 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext60, nodeSet61);
        org.w3c.dom.Node node64 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node64, locale65, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest68 = null;
        boolean boolean69 = dOMNodePointer67.testNode(nodeTest68);
        org.apache.commons.jxpath.ri.QName qName72 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest74 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName72, ":UNKNOWN");
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer78 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale76, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest80 = null;
        boolean boolean81 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer78, (java.lang.Object) 2, nodeTest80);
        java.lang.Object obj82 = nullPointer78.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = dOMNodePointer67.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer78);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext84 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext60, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext85 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext57, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext86 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext47, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        boolean boolean87 = jDOMNodePointer21.equals((java.lang.Object) descendantContext86);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer88 = descendantContext86.getCurrentNodePointer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":UNKNOWN" + "'", str39, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":UNKNOWN" + "'", str46, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(nodePointer88);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        java.lang.String str11 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer7, "hi!");
        boolean boolean14 = dynamicPointer7.isLeaf();
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory15 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer19.createPath(jXPathContext20);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str25 = qName24.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer29 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName24, (java.lang.Object) (short) 100, dynamicPropertyHandler27, locale28);
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions32 = jXPathContext31.getFunctions();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer34 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext31, locale33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dynaBeanPointerFactory15.createNodePointer(nodePointer19, qName24, (java.lang.Object) jXPathContext31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = dynamicPointer7.attributeIterator(qName24);
        org.apache.commons.jxpath.ri.parser.ParseException parseException37 = new org.apache.commons.jxpath.ri.parser.ParseException();
        int[][] intArray38 = parseException37.expectedTokenSequences;
        org.apache.commons.jxpath.ri.parser.ParseException parseException39 = new org.apache.commons.jxpath.ri.parser.ParseException();
        java.lang.String[] strArray40 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        parseException39.tokenImage = strArray40;
        parseException37.tokenImage = strArray40;
        org.apache.commons.jxpath.JXPathInvalidSyntaxException jXPathInvalidSyntaxException44 = new org.apache.commons.jxpath.JXPathInvalidSyntaxException("");
        org.apache.commons.jxpath.ri.parser.ParseException parseException46 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        org.apache.commons.jxpath.ri.parser.Token token47 = null;
        parseException46.currentToken = token47;
        jXPathInvalidSyntaxException44.addSuppressed((java.lang.Throwable) parseException46);
        parseException37.addSuppressed((java.lang.Throwable) parseException46);
        boolean boolean51 = dynamicPointer7.equals((java.lang.Object) parseException46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ":UNKNOWN" + "'", str25, ":UNKNOWN");
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertNotNull(functions32);
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        java.lang.String str6 = dOMNodePointer3.asPath();
        java.lang.String str7 = dOMNodePointer3.getDefaultNamespaceURI();
        boolean boolean8 = dOMNodePointer3.isRoot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "id('UNKNOWN')" + "'", str6, "id('UNKNOWN')");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.jxpath.xml.JDOMParser jDOMParser0 = new org.apache.commons.jxpath.xml.JDOMParser();
        boolean boolean1 = jDOMParser0.isIgnoringElementContentWhitespace();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols10 = null;
        jXPathContext7.setDecimalFormatSymbols("", decimalFormatSymbols10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext13, nodeSet14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext17 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext20 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest18, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext23 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, nodeTest22);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        java.lang.Object obj29 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName27, obj29, jXPathBeanInfo30, locale31);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName27, ":UNKNOWN");
        java.lang.String str35 = nodeNameTest34.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext36 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        int int37 = ancestorContext36.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.NodeSet nodeSet40 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext41 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext39, nodeSet40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext43 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest42);
        int int44 = nodeSetContext41.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext46 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest45);
        int int47 = parentContext46.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        org.apache.commons.jxpath.NodeSet nodeSet50 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext51 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext49, nodeSet50);
        org.w3c.dom.Node node53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale54, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        boolean boolean58 = dOMNodePointer56.testNode(nodeTest57);
        org.apache.commons.jxpath.ri.QName qName61 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest63 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName61, ":UNKNOWN");
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer67 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale65, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67, (java.lang.Object) 2, nodeTest69);
        java.lang.Object obj71 = nullPointer67.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = dOMNodePointer56.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext73 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext49, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext74 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext46, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext75 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext36, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.QName qName77 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName77, (java.lang.Object) 0.0d, locale79);
        nodePointer80.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer80, nodeTest82, true, nodePointer84);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer86 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer80);
        java.util.Iterator iterator87 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer86);
        int int88 = nullPropertyPointer86.getLength();
        java.lang.String[] strArray89 = nullPropertyPointer86.getPropertyNames();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator90 = collectionPointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer86);
        java.lang.Object obj91 = collectionPointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName92 = collectionPointer4.getName();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":UNKNOWN" + "'", str35, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertNotNull(nodePointer80);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(nodeIterator90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNull(qName92);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler1 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler1.nodeTypeTest(23);
        java.lang.Object obj4 = org.apache.commons.jxpath.ri.Parser.parseExpression("id('UNKNOWN')", (org.apache.commons.jxpath.ri.Compiler) treeCompiler1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "UNKNOWN()");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('UNKNOWN')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('UNKNOWN')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('UNKNOWN')");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        java.lang.String str22 = jDOMNodePointer21.getNamespaceURI();
        int int23 = jDOMNodePointer21.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.NodeSet nodeSet25 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext26 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext24, nodeSet25);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext28 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest27);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext31 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext26, nodeTest29, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, nodeTest33);
        org.apache.commons.jxpath.ri.QName qName38 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str39 = qName38.toString();
        java.lang.Object obj40 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer43 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName38, obj40, jXPathBeanInfo41, locale42);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest45 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38, ":UNKNOWN");
        java.lang.String str46 = nodeNameTest45.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext47 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext31, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45);
        int int48 = ancestorContext47.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.NodeSet nodeSet51 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext52 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext50, nodeSet51);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext54 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext52, nodeTest53);
        int int55 = nodeSetContext52.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext57 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext52, nodeTest56);
        int int58 = parentContext57.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext60 = null;
        org.apache.commons.jxpath.NodeSet nodeSet61 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext62 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext60, nodeSet61);
        org.w3c.dom.Node node64 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node64, locale65, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest68 = null;
        boolean boolean69 = dOMNodePointer67.testNode(nodeTest68);
        org.apache.commons.jxpath.ri.QName qName72 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest74 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName72, ":UNKNOWN");
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer78 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale76, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest80 = null;
        boolean boolean81 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer78, (java.lang.Object) 2, nodeTest80);
        java.lang.Object obj82 = nullPointer78.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = dOMNodePointer67.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer78);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext84 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext60, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext85 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext57, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext86 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext47, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest74);
        boolean boolean87 = jDOMNodePointer21.equals((java.lang.Object) descendantContext86);
        int int88 = descendantContext86.getDocumentOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":UNKNOWN" + "'", str39, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":UNKNOWN" + "'", str46, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.String str12 = nullPropertyPointer9.getPropertyName();
        nullPropertyPointer9.setPropertyIndex((-1));
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer16 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) nullPropertyPointer9, locale15);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions19 = jXPathContext18.getFunctions();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer21 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext18, locale20);
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContext18.getNamespaceContextPointer();
        java.lang.String str24 = jXPathContext18.getPrefix("id(UNKNOWN)");
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, obj33, locale34);
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.NodeSet nodeSet38 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext39 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext37, nodeSet38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = collectionPointer16.createChild(jXPathContext18, qName27, 0, (java.lang.Object) nodeSetContext39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = nodeSetContext39.setPosition(54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertNotNull(jXPathContext18);
        org.junit.Assert.assertNotNull(functions19);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        boolean boolean9 = namespacePointer7.isLeaf();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer17 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName12, (java.lang.Object) (short) 100, dynamicPropertyHandler15, locale16);
        int int18 = dynamicPointer17.getLength();
        dynamicPointer17.setIndex(1);
        java.lang.String str21 = dynamicPointer17.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer17, "hi!");
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 0.0d, locale26);
        boolean boolean28 = nodePointer27.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer27, "", "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = nodePointer27.getNamespaceResolver();
        java.lang.Object obj33 = nodePointer27.getNodeValue();
        int int34 = namespacePointer7.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer17, nodePointer27);
        java.lang.String str35 = nodePointer27.toString();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(namespaceResolver32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str15 = qName14.toString();
        java.lang.Object obj16 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName14, obj16, jXPathBeanInfo17, locale18);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName14, ":UNKNOWN");
        java.lang.String str22 = nodeNameTest21.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext23 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        java.lang.String str24 = ancestorContext23.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext25 = ancestorContext23.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ":UNKNOWN" + "'", str15, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":UNKNOWN" + "'", str22, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Empty expression context" + "'", str24, "Empty expression context");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.jxpath.xml.DOMParser dOMParser0 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean1 = dOMParser0.isExpandEntityReferences();
        boolean boolean2 = dOMParser0.isValidating();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMParser0.parseXML(inputStream3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: DOM parser error; InputStream cannot be null");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        int int8 = parentContext7.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.NodeSet nodeSet11 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext12 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext10, nodeSet11);
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        java.lang.Object obj32 = nullPointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dOMNodePointer17.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext35 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        java.lang.String str36 = ancestorContext35.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = ancestorContext35.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Empty expression context" + "'", str36, "Empty expression context");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext7, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (java.lang.Object) 2, nodeTest15);
        int int17 = nullPointer13.getIndex();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer13.attributeIterator(qName20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        boolean boolean31 = nodePointer30.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer30, "", "hi!");
        java.lang.Object obj35 = jDOMNamespacePointer34.getImmediateNode();
        int int36 = collectionPointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer34);
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer10);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = collectionPointer10.attributeIterator(qName40);
        org.apache.commons.jxpath.ri.QName qName47 = collectionPointer10.getName();
        org.apache.commons.jxpath.ri.QName qName48 = collectionPointer10.getName();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNull(qName47);
        org.junit.Assert.assertNull(qName48);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.jxpath.ri.compiler.NodeTypeTest nodeTypeTest1 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest(12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        boolean boolean5 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 0.0d, locale8);
        nodePointer9.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer9, nodeTest11, true, nodePointer13);
        org.w3c.dom.Node node15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node15, locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = dOMNodePointer18.getNamespaceResolver();
        boolean boolean20 = namespaceResolver19.isSealed();
        nodePointer9.setNamespaceResolver(namespaceResolver19);
        nodePointer3.setNamespaceResolver(namespaceResolver19);
        namespaceResolver19.registerNamespace("", "0/namespace::");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(namespaceResolver19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.Object obj12 = nullPropertyPointer9.getBaseValue();
        java.lang.Object obj13 = nullPropertyPointer9.getImmediateNode();
        int int14 = nullPropertyPointer9.getPropertyIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        boolean boolean17 = dOMNodePointer9.isActual();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = dOMNodePointer9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions22 = jXPathContext21.getFunctions();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer24 = dOMNodePointer3.getPointerByID(jXPathContext21, "org.apache.commons.jxpath.JXPathContextFactory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(jXPathContext21);
        org.junit.Assert.assertNotNull(functions22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer4, nodeTest6, true, nodePointer8);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer4);
        java.util.Iterator iterator11 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer10);
        java.lang.Object obj12 = nullPropertyPointer10.getValue();
        int int13 = nullPropertyPointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer18, nodeTest20, true, nodePointer22);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        java.util.Iterator iterator25 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer24);
        int int26 = nullPropertyPointer24.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer24, 38);
        int int29 = nullPropertyPointer24.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodePointer14, (org.apache.commons.jxpath.Pointer) nullPropertyPointer24);
        jXPathContextReferenceImpl30.registerNamespace("id(UNKNOWN)", "id('UNKNOWN')");
        org.w3c.dom.Node node35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node35, locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest39 = null;
        boolean boolean40 = dOMNodePointer38.testNode(nodeTest39);
        org.apache.commons.jxpath.ri.QName qName43 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest45 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName43, ":UNKNOWN");
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer49 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale47, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        boolean boolean52 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer49, (java.lang.Object) 2, nodeTest51);
        java.lang.Object obj53 = nullPointer49.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = dOMNodePointer38.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer49);
        java.lang.String str56 = dOMNodePointer38.getNamespaceURI("UNKNOWN");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38, "org.apache.commons.jxpath.ri.parser.ParseException: hi!", "id(UNKNOWN)");
        java.lang.Class<?> wildcardClass60 = jDOMNamespacePointer59.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = jXPathContextReferenceImpl30.getValue(":UNKNOWN", (java.lang.Class) wildcardClass60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: ':UNKNOWN'. Syntax error at the beginning of the expression");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext7, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (java.lang.Object) 2, nodeTest15);
        int int17 = nullPointer13.getIndex();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer13.attributeIterator(qName20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        boolean boolean31 = nodePointer30.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer30, "", "hi!");
        java.lang.Object obj35 = jDOMNamespacePointer34.getImmediateNode();
        int int36 = collectionPointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer34);
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer10);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = collectionPointer10.attributeIterator(qName40);
        org.apache.commons.jxpath.ri.QName qName47 = collectionPointer10.getName();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = collectionPointer10.getValuePointer();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNull(qName47);
        org.junit.Assert.assertNotNull(nodePointer48);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str8 = qName7.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer12 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName7, (java.lang.Object) (short) 100, dynamicPropertyHandler10, locale11);
        int int13 = dynamicPointer12.getLength();
        dynamicPointer12.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = beanPointerFactory16.createNodePointer(nodePointer17, qName20, (java.lang.Object) 10);
        boolean boolean24 = dynamicPointer12.isValidProperty(qName20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = collectionPointer4.attributeIterator(qName20);
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions28 = jXPathContext27.getFunctions();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext27, locale29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = collectionPointer4.createPath(jXPathContext27);
        org.apache.commons.jxpath.Variables variables32 = jXPathContext27.getVariables();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":UNKNOWN" + "'", str8, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(functions28);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(variables32);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        int int11 = nullPropertyPointer9.getLength();
        nullPropertyPointer9.setPropertyName("0/namespace::");
        org.apache.commons.jxpath.CompiledExpression compiledExpression15 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj18 = compiledExpression15.getValue(jXPathContext17);
        org.apache.commons.jxpath.CompiledExpression compiledExpression20 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj23 = compiledExpression20.getValue(jXPathContext22);
        org.apache.commons.jxpath.Pointer pointer24 = compiledExpression15.createPath(jXPathContext22);
        org.apache.commons.jxpath.CompiledExpression compiledExpression26 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj29 = compiledExpression26.getValue(jXPathContext28);
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions32 = jXPathContext31.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols34 = null;
        jXPathContext31.setDecimalFormatSymbols("", decimalFormatSymbols34);
        java.lang.Class class36 = null;
        java.lang.Object obj37 = compiledExpression26.getValue(jXPathContext31, class36);
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions40 = jXPathContext39.getFunctions();
        org.apache.commons.jxpath.Pointer pointer42 = compiledExpression26.getPointer(jXPathContext39, "");
        java.lang.Object obj43 = compiledExpression15.getValue(jXPathContext39);
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer46 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale44, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        boolean boolean49 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer46, (java.lang.Object) 2, nodeTest48);
        int int50 = nullPointer46.getIndex();
        org.apache.commons.jxpath.ri.QName qName53 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str54 = qName53.toString();
        java.lang.Object obj55 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo56 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer58 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName53, obj55, jXPathBeanInfo56, locale57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = nullPointer46.attributeIterator(qName53);
        org.apache.commons.jxpath.util.ValueUtils valueUtils61 = new org.apache.commons.jxpath.util.ValueUtils();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = nullPropertyPointer9.createChild(jXPathContext39, qName53, 51, (java.lang.Object) valueUtils61);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: 0/0/namespace::");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(compiledExpression15);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNotNull(compiledExpression20);
        org.junit.Assert.assertNotNull(jXPathContext22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertNotNull(pointer24);
        org.junit.Assert.assertNotNull(compiledExpression26);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext31);
        org.junit.Assert.assertNotNull(functions32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0f + "'", obj37, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext39);
        org.junit.Assert.assertNotNull(functions40);
        org.junit.Assert.assertNotNull(pointer42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2147483648) + "'", int50 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ":UNKNOWN" + "'", str54, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator59);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        descendantContext10.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.NodeSet nodeSet21 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext22 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext20, nodeSet21);
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext20, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext45 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = descendantContext10.getCurrentNodePointer();
        java.lang.String str48 = descendantContext10.toString();
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(nodePointer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Empty expression context" + "'", str48, "Empty expression context");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.Step step4 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray5 = new org.apache.commons.jxpath.ri.compiler.Step[] { step4 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath6 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray5);
        java.lang.Object obj7 = treeCompiler0.or((java.lang.Object[]) stepArray5);
        java.lang.Object[] objArray8 = null;
        java.lang.Object obj9 = treeCompiler0.union(objArray8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) objArray8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(stepArray5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.jxpath.Variables variables0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str4 = qName3.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer8 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName3, (java.lang.Object) (short) 100, dynamicPropertyHandler6, locale7);
        java.lang.Object obj9 = dynamicPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynamicPointer8.attributeIterator(qName12);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer19 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables0, qName12);
        org.apache.commons.jxpath.ri.QName qName20 = variablePointer19.getName();
        java.lang.String str21 = variablePointer19.asPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":UNKNOWN" + "'", str4, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$:UNKNOWN" + "'", str21, "$:UNKNOWN");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        java.lang.Object obj8 = dynamicPointer7.getImmediateNode();
        java.lang.String str9 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dynamicPointer7.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext15 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext18 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest16, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext21 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext18, true, nodeTest20);
        org.apache.commons.jxpath.ri.QName qName25 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str26 = qName25.toString();
        java.lang.Object obj27 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer30 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName25, obj27, jXPathBeanInfo28, locale29);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName25, ":UNKNOWN");
        java.lang.String str33 = nodeNameTest32.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext34 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext18, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        boolean boolean35 = nodeNameTest32.isWildcard();
        org.w3c.dom.Node node37 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node37, locale38, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = dOMNodePointer40.testNode(nodeTest41);
        org.apache.commons.jxpath.ri.QName qName45 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest47 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45, ":UNKNOWN");
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer51 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale49, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        boolean boolean54 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51, (java.lang.Object) 2, nodeTest53);
        java.lang.Object obj55 = nullPointer51.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator56 = dOMNodePointer40.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest47, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51);
        java.lang.Object obj57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51, obj57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = dynamicPointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32, true, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51);
        boolean boolean60 = nullPointer51.isDynamicPropertyDeclarationSupported();
        org.apache.commons.jxpath.JXPathContext jXPathContext62 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions63 = jXPathContext62.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols65 = null;
        jXPathContext62.setDecimalFormatSymbols("", decimalFormatSymbols65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = nullPointer51.createPath(jXPathContext62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(UNKNOWN)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ":UNKNOWN" + "'", str26, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ":UNKNOWN" + "'", str33, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jXPathContext62);
        org.junit.Assert.assertNotNull(functions63);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError2 = new org.apache.commons.jxpath.ri.parser.TokenMgrError("id('UNKNOWN')/namespace::UNKNOWN", (int) (byte) 0);
        org.apache.commons.jxpath.Container container3 = null;
        org.apache.commons.jxpath.ri.QName qName6 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str7 = qName6.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer11 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName6, (java.lang.Object) (short) 100, dynamicPropertyHandler9, locale10);
        java.lang.Object obj12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, obj12, locale13);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.NodeSet nodeSet16 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext17 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext15, nodeSet16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext19 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext17, nodeTest18);
        boolean boolean21 = selfContext19.setPosition(25);
        selfContext19.reset();
        int int23 = selfContext19.getPosition();
        org.apache.commons.jxpath.CompiledExpression compiledExpression25 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj28 = compiledExpression25.getValue(jXPathContext27);
        java.lang.String str30 = jXPathContext27.getPrefix("id('UNKNOWN')/namespace::UNKNOWN");
        jXPathContext27.setLenient(true);
        java.util.Locale locale33 = jXPathContext27.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) selfContext19, locale33);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer35 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container3, locale33);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) tokenMgrError2, locale33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":UNKNOWN" + "'", str7, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(compiledExpression25);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer34);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, "JDOM", "*");
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer4, 29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nullElementPointer9.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 0.0d, locale14);
        nodePointer15.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer15, nodeTest17, true, nodePointer19);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer21 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer15);
        java.util.Iterator iterator22 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer21);
        java.lang.Object obj23 = nullPropertyPointer21.getValue();
        int int24 = nullPropertyPointer21.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nullPropertyPointer21.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 0.0d, locale28);
        nodePointer29.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer29, nodeTest31, true, nodePointer33);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer35 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer29);
        java.util.Iterator iterator36 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer35);
        int int37 = nullPropertyPointer35.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer39 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer35, 38);
        int int40 = nullPropertyPointer35.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl41 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext11, (java.lang.Object) nodePointer25, (org.apache.commons.jxpath.Pointer) nullPropertyPointer35);
        jXPathContextReferenceImpl41.registerNamespace("id(UNKNOWN)", "id('UNKNOWN')");
        org.apache.commons.jxpath.ri.QName qName45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nullElementPointer9.createChild((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl41, qName45, 0);
        boolean boolean48 = nullElementPointer9.isLeaf();
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        java.lang.String str30 = qName26.getName();
        boolean boolean31 = jDOMNodePointer21.equals((java.lang.Object) str30);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = jDOMNodePointer21.testNode(nodeTest32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UNKNOWN" + "'", str30, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str8 = qName7.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer12 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName7, (java.lang.Object) (short) 100, dynamicPropertyHandler10, locale11);
        int int13 = dynamicPointer12.getLength();
        dynamicPointer12.setIndex(1);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory16 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = beanPointerFactory16.createNodePointer(nodePointer17, qName20, (java.lang.Object) 10);
        boolean boolean24 = dynamicPointer12.isValidProperty(qName20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = collectionPointer4.attributeIterator(qName20);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) collectionPointer4);
        org.apache.commons.jxpath.CompiledExpression compiledExpression28 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj31 = compiledExpression28.getValue(jXPathContext30);
        java.lang.String str33 = jXPathContext30.getPrefix("id('UNKNOWN')/namespace::UNKNOWN");
        jXPathContext30.setLenient(true);
        java.util.Locale locale36 = jXPathContext30.getLocale();
        jXPathContext26.setLocale(locale36);
        java.lang.String str39 = jXPathContext26.getNamespaceURI("null = null");
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":UNKNOWN" + "'", str8, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(compiledExpression28);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.jxpath.Variables variables0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str4 = qName3.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer8 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName3, (java.lang.Object) (short) 100, dynamicPropertyHandler6, locale7);
        java.lang.Object obj9 = dynamicPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynamicPointer8.attributeIterator(qName12);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer19 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables0, qName12);
        org.apache.commons.jxpath.ri.QName qName20 = variablePointer19.getName();
        boolean boolean21 = variablePointer19.isActual();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":UNKNOWN" + "'", str4, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, obj4, jXPathBeanInfo5, locale6);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = beanPointer7.getPropertyPointer();
        boolean boolean9 = beanPointer7.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        boolean boolean12 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer7, (java.lang.Object) 30, nodeTest11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        java.lang.Object obj16 = nullPointer2.getBaseValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 0.0d, locale20);
        nodePointer21.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer21, nodeTest23, true, nodePointer25);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer21);
        java.util.Iterator iterator28 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer27);
        java.lang.Object obj29 = nullPropertyPointer27.getValue();
        int int30 = nullPropertyPointer27.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nullPropertyPointer27.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 0.0d, locale34);
        nodePointer35.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer35, nodeTest37, true, nodePointer39);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer35);
        java.util.Iterator iterator42 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer41);
        int int43 = nullPropertyPointer41.getLength();
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer41, 38);
        int int46 = nullPropertyPointer41.getPropertyCount();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl47 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext17, (java.lang.Object) nodePointer31, (org.apache.commons.jxpath.Pointer) nullPropertyPointer41);
        jXPathContextReferenceImpl47.registerNamespace("http://www.w3.org/2000/xmlns/", "Empty expression context");
        org.apache.commons.jxpath.CompiledExpression compiledExpression52 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext54 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj55 = compiledExpression52.getValue(jXPathContext54);
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions58 = jXPathContext57.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols60 = null;
        jXPathContext57.setDecimalFormatSymbols("", decimalFormatSymbols60);
        java.lang.Class class62 = null;
        java.lang.Object obj63 = compiledExpression52.getValue(jXPathContext57, class62);
        java.util.Locale locale64 = null;
        jXPathContext57.setLocale(locale64);
        org.apache.commons.jxpath.ri.model.VariablePointerFactory.VariableContextWrapper variableContextWrapper66 = org.apache.commons.jxpath.ri.model.VariablePointerFactory.contextWrapper(jXPathContext57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = nullPointer2.createPath((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl47, (java.lang.Object) jXPathContext57);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id(UNKNOWN)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(compiledExpression52);
        org.junit.Assert.assertNotNull(jXPathContext54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext57);
        org.junit.Assert.assertNotNull(functions58);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0f + "'", obj63, 100.0f);
        org.junit.Assert.assertNotNull(variableContextWrapper66);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        java.lang.Object obj16 = nullPointer2.getBaseValue();
        java.lang.String str17 = nullPointer2.toString();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer18 = nullPointer2.getPropertyPointer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id(UNKNOWN)" + "'", str17, "id(UNKNOWN)");
        org.junit.Assert.assertNotNull(propertyPointer18);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        org.apache.commons.jxpath.ri.QName qName16 = nullPointer2.getName();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer2.getPropertyPointer();
        java.lang.Object obj18 = nullPointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer19 = nullPointer2.getPropertyPointer();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(propertyPointer19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        java.lang.String str30 = qName26.getName();
        boolean boolean31 = jDOMNodePointer21.equals((java.lang.Object) str30);
        boolean boolean32 = jDOMNodePointer21.isLeaf();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 0.0d, locale35);
        nodePointer36.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer36, nodeTest38, true, nodePointer40);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer42 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer36);
        boolean boolean43 = nullPropertyPointer42.isCollection();
        java.lang.String str44 = nullPropertyPointer42.asPath();
        boolean boolean45 = jDOMNodePointer21.equals((java.lang.Object) str44);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer21.namespacePointer("id('UNKNOWN')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = jDOMNodePointer21.namespacePointer("/[30]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UNKNOWN" + "'", str30, "UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0/*" + "'", str44, "0/*");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(nodePointer49);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.lang.Object obj5 = collectionPointer4.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = collectionPointer4.createPath(jXPathContext7);
        collectionPointer4.setIndex(6);
        org.apache.commons.jxpath.JXPathTypeConversionException jXPathTypeConversionException13 = new org.apache.commons.jxpath.JXPathTypeConversionException("org.apache.commons.jxpath.ri.parser.ParseException: hi!");
        org.apache.commons.jxpath.JXPathTypeConversionException jXPathTypeConversionException15 = new org.apache.commons.jxpath.JXPathTypeConversionException("org.apache.commons.jxpath.ri.parser.ParseException: hi!");
        jXPathTypeConversionException13.addSuppressed((java.lang.Throwable) jXPathTypeConversionException15);
        boolean boolean17 = collectionPointer4.equals((java.lang.Object) jXPathTypeConversionException15);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "/");
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.NodeSet nodeSet2 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext3 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext1, nodeSet2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext5 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, nodeTest4);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext8 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext3, nodeTest6, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext11 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext8, true, nodeTest10);
        org.apache.commons.jxpath.ri.QName qName15 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str16 = qName15.toString();
        java.lang.Object obj17 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer20 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName15, obj17, jXPathBeanInfo18, locale19);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest22 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName15, ":UNKNOWN");
        java.lang.String str23 = nodeNameTest22.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext24 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext8, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ":UNKNOWN" + "'", str16, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ":UNKNOWN" + "'", str23, ":UNKNOWN");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer7 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "UNKNOWN", "0/*");
        java.lang.String str8 = namespacePointer7.toString();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer10 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer7, "0");
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str8, "id('UNKNOWN')/namespace::UNKNOWN");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.jxpath.util.ValueUtils.getLength(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = dOMNodePointer7.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, ":UNKNOWN");
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale16, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18, (java.lang.Object) 2, nodeTest20);
        java.lang.Object obj22 = nullPointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = dOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer18);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext24 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.NodeSet nodeSet26 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext27 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext25, nodeSet26);
        org.w3c.dom.Node node29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node29, locale30, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = dOMNodePointer32.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName37, ":UNKNOWN");
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale41, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (java.lang.Object) 2, nodeTest45);
        java.lang.Object obj47 = nullPointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer32.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext49 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext25, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext50 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        boolean boolean52 = parentContext50.setPosition(19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.beans.PropertyDescriptor propertyDescriptor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.jxpath.util.ValueUtils.getValue((java.lang.Object) (byte) 0, propertyDescriptor1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 0.0d, locale9);
        nodePointer10.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, nodeTest12, true, nodePointer14);
        org.apache.commons.jxpath.ri.QName qName18 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest20 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName18, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory22 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = null;
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str27 = qName26.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = beanPointerFactory22.createNodePointer(nodePointer23, qName26, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest20, false, nodePointer23);
        int int31 = nullPointer2.compareTo((java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer32 = nullPointer2.getPropertyPointer();
        org.w3c.dom.Node node33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer32, node33);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ":UNKNOWN" + "'", str27, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(propertyPointer32);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        int int4 = nodePointer3.getLength();
        org.w3c.dom.Node node5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node5, locale6, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = dOMNodePointer8.testNode(nodeTest9);
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest15 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName13, ":UNKNOWN");
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale17, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19, (java.lang.Object) 2, nodeTest21);
        java.lang.Object obj23 = nullPointer19.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = dOMNodePointer8.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer19);
        org.w3c.dom.Node node26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node26, locale27, "UNKNOWN");
        java.lang.Object obj30 = dOMNodePointer29.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = nodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest15, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = dOMNodePointer29.namespacePointer("*");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodePointer33);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.jxpath.ri.parser.ParseException parseException1 = new org.apache.commons.jxpath.ri.parser.ParseException();
        int[][] intArray2 = parseException1.expectedTokenSequences;
        org.apache.commons.jxpath.ri.parser.ParseException parseException3 = new org.apache.commons.jxpath.ri.parser.ParseException();
        java.lang.String[] strArray4 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.lexStateNames;
        parseException3.tokenImage = strArray4;
        parseException1.tokenImage = strArray4;
        org.apache.commons.jxpath.JXPathInvalidSyntaxException jXPathInvalidSyntaxException8 = new org.apache.commons.jxpath.JXPathInvalidSyntaxException("");
        org.apache.commons.jxpath.ri.parser.ParseException parseException10 = new org.apache.commons.jxpath.ri.parser.ParseException("hi!");
        org.apache.commons.jxpath.ri.parser.Token token11 = null;
        parseException10.currentToken = token11;
        jXPathInvalidSyntaxException8.addSuppressed((java.lang.Throwable) parseException10);
        parseException1.addSuppressed((java.lang.Throwable) parseException10);
        org.apache.commons.jxpath.JXPathException jXPathException15 = new org.apache.commons.jxpath.JXPathException("org.apache.commons.jxpath.JXPathContextFactory", (java.lang.Throwable) parseException1);
        java.lang.String[] strArray16 = parseException1.tokenImage;
        org.apache.commons.jxpath.ri.parser.Token token17 = null;
        int[][] intArray18 = new int[][] {};
        java.lang.String[] strArray19 = null;
        org.apache.commons.jxpath.ri.parser.ParseException parseException20 = new org.apache.commons.jxpath.ri.parser.ParseException(token17, intArray18, strArray19);
        parseException1.expectedTokenSequences = intArray18;
        org.apache.commons.jxpath.ri.parser.Token token22 = parseException1.currentToken;
        org.apache.commons.jxpath.ri.parser.Token token24 = org.apache.commons.jxpath.ri.parser.Token.newToken(0);
        token24.endLine = 12;
        parseException1.currentToken = token24;
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNull(token22);
        org.junit.Assert.assertNotNull(token24);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 0.0d, locale3);
        int int5 = nodePointer4.getLength();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        boolean boolean11 = dOMNodePointer9.testNode(nodeTest10);
        org.apache.commons.jxpath.ri.QName qName14 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest16 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName14, ":UNKNOWN");
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale18, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        boolean boolean23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer20, (java.lang.Object) 2, nodeTest22);
        java.lang.Object obj24 = nullPointer20.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = dOMNodePointer9.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest16, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer20);
        org.w3c.dom.Node node27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node27, locale28, "UNKNOWN");
        java.lang.Object obj31 = dOMNodePointer30.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = nodePointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest16, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(nodeIterator32);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext7, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (java.lang.Object) 2, nodeTest15);
        int int17 = nullPointer13.getIndex();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer13.attributeIterator(qName20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        boolean boolean31 = nodePointer30.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer30, "", "hi!");
        java.lang.Object obj35 = jDOMNamespacePointer34.getImmediateNode();
        int int36 = collectionPointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer34);
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer10);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = collectionPointer10.attributeIterator(qName40);
        org.apache.commons.jxpath.ri.QName qName47 = collectionPointer10.getName();
        collectionPointer10.setIndex(50);
        org.apache.commons.jxpath.CompiledExpression compiledExpression51 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext53 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj54 = compiledExpression51.getValue(jXPathContext53);
        org.apache.commons.jxpath.CompiledExpression compiledExpression56 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext58 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj59 = compiledExpression56.getValue(jXPathContext58);
        org.apache.commons.jxpath.Pointer pointer60 = compiledExpression51.createPath(jXPathContext58);
        org.apache.commons.jxpath.CompiledExpression compiledExpression62 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext64 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj65 = compiledExpression62.getValue(jXPathContext64);
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions68 = jXPathContext67.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols70 = null;
        jXPathContext67.setDecimalFormatSymbols("", decimalFormatSymbols70);
        java.lang.Class class72 = null;
        java.lang.Object obj73 = compiledExpression62.getValue(jXPathContext67, class72);
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions76 = jXPathContext75.getFunctions();
        org.apache.commons.jxpath.Pointer pointer78 = compiledExpression62.getPointer(jXPathContext75, "");
        java.lang.Object obj79 = compiledExpression51.getValue(jXPathContext75);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = collectionPointer10.createPath(jXPathContext75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot turn org.apache.commons.jxpath.ri.JXPathContextReferenceImpl into a collection of size 51");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNull(qName47);
        org.junit.Assert.assertNotNull(compiledExpression51);
        org.junit.Assert.assertNotNull(jXPathContext53);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertNotNull(compiledExpression56);
        org.junit.Assert.assertNotNull(jXPathContext58);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0f + "'", obj59, 100.0f);
        org.junit.Assert.assertNotNull(pointer60);
        org.junit.Assert.assertNotNull(compiledExpression62);
        org.junit.Assert.assertNotNull(jXPathContext64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0f + "'", obj65, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext67);
        org.junit.Assert.assertNotNull(functions68);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0f + "'", obj73, 100.0f);
        org.junit.Assert.assertNotNull(jXPathContext75);
        org.junit.Assert.assertNotNull(functions76);
        org.junit.Assert.assertNotNull(pointer78);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0f + "'", obj79, 100.0f);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        descendantContext10.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.NodeSet nodeSet21 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext22 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext20, nodeSet21);
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext20, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext45 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = descendantContext10.getCurrentNodePointer();
        boolean boolean48 = descendantContext10.nextNode();
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        boolean boolean12 = nullPropertyPointer9.isCollection();
        boolean boolean13 = nullPropertyPointer9.isActual();
        org.apache.commons.jxpath.ri.QName qName14 = nullPropertyPointer9.getName();
        boolean boolean15 = nullPropertyPointer9.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(qName14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.w3c.dom.Node node2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node2, locale3, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = dOMNodePointer5.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer9 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer5, "UNKNOWN", "0/*");
        java.lang.String str10 = namespacePointer9.toString();
        boolean boolean11 = namespacePointer9.isLeaf();
        int int12 = namespacePointer9.getLength();
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = dOMNodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21, ":UNKNOWN");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27, (java.lang.Object) 2, nodeTest29);
        java.lang.Object obj31 = nullPointer27.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = dOMNodePointer16.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27);
        boolean boolean33 = namespacePointer9.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext34 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext0, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        ancestorContext34.reset();
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str10, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean5 = namespaceResolver4.isSealed();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = dOMNodePointer9.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, "UNKNOWN", "0/*");
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer9.namespacePointer("null()");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = dOMNodePointer9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namespaceResolver10);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.or(objArray1);
        org.apache.commons.jxpath.ri.compiler.Step step4 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray5 = new org.apache.commons.jxpath.ri.compiler.Step[] { step4 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath6 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray5);
        java.lang.Object obj7 = treeCompiler0.or((java.lang.Object[]) stepArray5);
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError15 = new org.apache.commons.jxpath.ri.parser.TokenMgrError(false, 22, 0, (int) (byte) 100, "", ' ', 0);
        java.lang.Throwable[] throwableArray16 = tokenMgrError15.getSuppressed();
        org.w3c.dom.Node node17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node17, locale18, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = dOMNodePointer20.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer24 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer20, "UNKNOWN", "0/*");
        java.lang.String str25 = namespacePointer24.toString();
        boolean boolean26 = namespacePointer24.isLeaf();
        java.lang.String str27 = namespacePointer24.asPath();
        boolean boolean28 = namespacePointer24.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeCompiler0.divide((java.lang.Object) throwableArray16, (java.lang.Object) namespacePointer24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Throwable; cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(stepArray5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(namespaceResolver21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str25, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str27, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext7 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest5, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext10 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext7, true, nodeTest9);
        descendantContext10.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.NodeSet nodeSet13 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext14 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext12, nodeSet13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext16 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext19 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, nodeTest17, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.NodeSet nodeSet21 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext22 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext20, nodeSet21);
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer27.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, ":UNKNOWN");
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38, (java.lang.Object) 2, nodeTest40);
        java.lang.Object obj42 = nullPointer38.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dOMNodePointer27.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer38);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext20, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext45 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        attributeContext46.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = attributeContext46.setPosition(1649);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodeIterator43);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        java.lang.Object obj5 = collectionPointer4.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = collectionPointer4.createPath(jXPathContext7);
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer12 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale10, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        boolean boolean15 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer12, (java.lang.Object) 2, nodeTest14);
        java.lang.Object obj16 = nullPointer12.getImmediateNode();
        nullPointer12.printPointerChain();
        boolean boolean18 = nullPointer12.isActual();
        java.lang.String str19 = nullPointer12.asPath();
        jXPathContext7.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) nullPointer12);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "/");
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "id(UNKNOWN)" + "'", str19, "id(UNKNOWN)");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.QName qName4 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str5 = qName4.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = beanPointerFactory0.createNodePointer(nodePointer1, qName4, (java.lang.Object) 10);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale8, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer10, (java.lang.Object) 2, nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str17 = qName16.toString();
        java.lang.Object obj18 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer21 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName16, obj18, jXPathBeanInfo19, locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = nullPointer10.attributeIterator(qName16);
        boolean boolean24 = qName16.equals((java.lang.Object) 78);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer32 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName27, (java.lang.Object) (short) 100, dynamicPropertyHandler30, locale31);
        java.lang.Object obj33 = dynamicPointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str37 = qName36.toString();
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer41 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName36, obj38, jXPathBeanInfo39, locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = dynamicPointer32.attributeIterator(qName36);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = beanPointerFactory0.createNodePointer(qName16, (java.lang.Object) dynamicPointer32, locale43);
        java.lang.String str45 = qName16.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":UNKNOWN" + "'", str5, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ":UNKNOWN" + "'", str17, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":UNKNOWN" + "'", str37, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":UNKNOWN" + "'", str45, ":UNKNOWN");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        java.lang.String str9 = dynamicPointer7.getNamespaceURI();
        org.w3c.dom.Node node10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = dOMNodePointer13.getNamespaceResolver();
        boolean boolean15 = namespaceResolver14.isSealed();
        dynamicPointer7.setNamespaceResolver(namespaceResolver14);
        java.lang.Object obj18 = org.apache.commons.jxpath.util.ValueUtils.getValue((java.lang.Object) namespaceResolver14, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(namespaceResolver14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        boolean boolean6 = selfContext4.setPosition(25);
        selfContext4.reset();
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = dOMNodePointer11.testNode(nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest18 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName16, ":UNKNOWN");
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale20, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer22, (java.lang.Object) 2, nodeTest24);
        java.lang.Object obj26 = nullPointer22.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = dOMNodePointer11.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest18, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer22);
        boolean boolean28 = nodeNameTest18.isWildcard();
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext29 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) selfContext4, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer7 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, obj4, jXPathBeanInfo5, locale6);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = beanPointer7.getPropertyPointer();
        boolean boolean9 = beanPointer7.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = beanPointer7.getValuePointer();
        java.lang.String str11 = beanPointer7.asPath();
        org.apache.commons.jxpath.ri.QName qName12 = beanPointer7.getName();
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = dOMNodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21, ":UNKNOWN");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27, (java.lang.Object) 2, nodeTest29);
        java.lang.Object obj31 = nullPointer27.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = dOMNodePointer16.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27, obj33);
        java.lang.String str35 = jDOMNodePointer34.getNamespaceURI();
        int int36 = jDOMNodePointer34.getLength();
        boolean boolean37 = qName12.equals((java.lang.Object) jDOMNodePointer34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null()" + "'", str11, "null()");
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        int int8 = parentContext7.getCurrentPosition();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 0.0d, locale11);
        nodePointer12.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer12, nodeTest14, true, nodePointer16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest22 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20, ":UNKNOWN");
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory24 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str29 = qName28.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = beanPointerFactory24.createNodePointer(nodePointer25, qName28, (java.lang.Object) 10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer12, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22, false, nodePointer25);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory34 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = null;
        org.apache.commons.jxpath.ri.QName qName38 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str39 = qName38.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = beanPointerFactory34.createNodePointer(nodePointer35, qName38, (java.lang.Object) 10);
        java.lang.Object obj42 = null;
        boolean boolean43 = qName38.equals(obj42);
        org.apache.commons.jxpath.Container container44 = null;
        org.apache.commons.jxpath.ri.QName qName47 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str48 = qName47.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler50 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer52 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName47, (java.lang.Object) (short) 100, dynamicPropertyHandler50, locale51);
        java.lang.Object obj53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, obj53, locale54);
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.NodeSet nodeSet57 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext58 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext56, nodeSet57);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext60 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext58, nodeTest59);
        boolean boolean62 = selfContext60.setPosition(25);
        selfContext60.reset();
        int int64 = selfContext60.getPosition();
        org.apache.commons.jxpath.CompiledExpression compiledExpression66 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext68 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj69 = compiledExpression66.getValue(jXPathContext68);
        java.lang.String str71 = jXPathContext68.getPrefix("id('UNKNOWN')/namespace::UNKNOWN");
        jXPathContext68.setLenient(true);
        java.util.Locale locale74 = jXPathContext68.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, (java.lang.Object) selfContext60, locale74);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer76 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container44, locale74);
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator77 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) parentContext33, qName38, locale74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ":UNKNOWN" + "'", str29, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ":UNKNOWN" + "'", str39, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":UNKNOWN" + "'", str48, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(compiledExpression66);
        org.junit.Assert.assertNotNull(jXPathContext68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0f + "'", obj69, 100.0f);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer75);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer10 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext7, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer13 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale11, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (java.lang.Object) 2, nodeTest15);
        int int17 = nullPointer13.getIndex();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str21 = qName20.toString();
        java.lang.Object obj22 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer25 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, obj22, jXPathBeanInfo23, locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = nullPointer13.attributeIterator(qName20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        boolean boolean31 = nodePointer30.isRoot();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer30, "", "hi!");
        java.lang.Object obj35 = jDOMNamespacePointer34.getImmediateNode();
        int int36 = collectionPointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer34);
        namespaceResolver4.setNamespaceContextPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer10);
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str41 = qName40.toString();
        java.lang.Object obj42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer45 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName40, obj42, jXPathBeanInfo43, locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = collectionPointer10.attributeIterator(qName40);
        org.apache.commons.jxpath.ri.EvalContext evalContext47 = null;
        org.apache.commons.jxpath.NodeSet nodeSet48 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext49 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext47, nodeSet48);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext51 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext49, nodeTest50);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext54 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext49, nodeTest52, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext57 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext54, true, nodeTest56);
        org.apache.commons.jxpath.ri.QName qName61 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str62 = qName61.toString();
        java.lang.Object obj63 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo64 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer66 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName61, obj63, jXPathBeanInfo64, locale65);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest68 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName61, ":UNKNOWN");
        java.lang.String str69 = nodeNameTest68.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext70 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext54, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest68);
        org.w3c.dom.Node node72 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer75 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node72, locale73, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest76 = null;
        boolean boolean77 = dOMNodePointer75.testNode(nodeTest76);
        org.apache.commons.jxpath.ri.QName qName80 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest82 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName80, ":UNKNOWN");
        java.util.Locale locale84 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer86 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale84, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest88 = null;
        boolean boolean89 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer86, (java.lang.Object) 2, nodeTest88);
        java.lang.Object obj90 = nullPointer86.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator91 = dOMNodePointer75.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest82, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer86);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator92 = collectionPointer10.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest68, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer86);
        boolean boolean93 = nullPointer86.isActual();
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ":UNKNOWN" + "'", str21, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":UNKNOWN" + "'", str41, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ":UNKNOWN" + "'", str62, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + ":UNKNOWN" + "'", str69, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(nodeIterator91);
        org.junit.Assert.assertNotNull(nodeIterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        int int6 = nullPointer2.getIndex();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str10 = qName9.toString();
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer14 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, obj11, jXPathBeanInfo12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.attributeIterator(qName9);
        java.lang.Object obj16 = nullPointer2.getBaseValue();
        java.lang.String str17 = nullPointer2.asPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":UNKNOWN" + "'", str10, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id(UNKNOWN)" + "'", str17, "id(UNKNOWN)");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (java.lang.Object) 2, nodeTest4);
        java.lang.Object obj6 = nullPointer2.getImmediateNode();
        nullPointer2.printPointerChain();
        boolean boolean8 = nullPointer2.isActual();
        java.lang.String str9 = nullPointer2.asPath();
        nullPointer2.setIndex(37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "id(UNKNOWN)" + "'", str9, "id(UNKNOWN)");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = dOMNodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.QName qName8 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest10 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName8, ":UNKNOWN");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer14 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale12, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, (java.lang.Object) 2, nodeTest16);
        java.lang.Object obj18 = nullPointer14.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest10, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14);
        java.lang.Object obj20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer14, obj20);
        boolean boolean22 = nullPointer14.isDynamicPropertyDeclarationSupported();
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver28 = dOMNodePointer27.getNamespaceResolver();
        org.apache.commons.jxpath.util.ValueUtils.setValue((java.lang.Object) nullPointer14, 23, (java.lang.Object) dOMNodePointer27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namespaceResolver28);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.jxpath.Variables variables0 = null;
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str4 = qName3.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer8 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName3, (java.lang.Object) (short) 100, dynamicPropertyHandler6, locale7);
        java.lang.Object obj9 = dynamicPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName12, obj14, jXPathBeanInfo15, locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynamicPointer8.attributeIterator(qName12);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer19 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables0, qName12);
        java.lang.Object obj20 = null;
        boolean boolean21 = variablePointer19.equals(obj20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = variablePointer19.getBaseValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":UNKNOWN" + "'", str4, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext10 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest8, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext15 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext18 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest16, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext21 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext18, true, nodeTest20);
        boolean boolean22 = descendantContext21.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.NodeSet nodeSet24 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext25 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext23, nodeSet24);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext27 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest26);
        int int28 = nodeSetContext25.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext30 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest29);
        int int31 = parentContext30.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = parentContext30.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { descendantContext21, parentContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, evalContextArray33);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) evalContextArray33, locale35, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver38 = jDOMNodePointer37.getNamespaceResolver();
        java.lang.Object obj39 = jDOMNodePointer37.getImmediateNode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertNotNull(namespaceResolver38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer3, nodeTest5, true, nodePointer7);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.util.Iterator iterator10 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer9);
        java.lang.Object obj11 = nullPropertyPointer9.getImmediateNode();
        java.lang.Object obj12 = nullPropertyPointer9.getBaseValue();
        java.lang.Object obj13 = nullPropertyPointer9.getImmediateNode();
        java.lang.Object obj14 = nullPropertyPointer9.getBaseValue();
        nullPropertyPointer9.setPropertyIndex((-1));
        nullPropertyPointer9.setNameAttributeValue("JDOM");
        java.lang.Object obj19 = nullPropertyPointer9.getImmediateNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) 1649);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.ri.QName qName6 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str7 = qName6.toString();
        org.apache.commons.beanutils.DynaBean dynaBean8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer10 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName6, dynaBean8, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = dOMNodePointer3.attributeIterator(qName6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":UNKNOWN" + "'", str7, ":UNKNOWN");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.Container container9 = null;
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str13 = qName12.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer17 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName12, (java.lang.Object) (short) 100, dynamicPropertyHandler15, locale16);
        java.lang.Object obj18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, obj18, locale19);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.NodeSet nodeSet22 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext23 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext21, nodeSet22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext25 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext23, nodeTest24);
        boolean boolean27 = selfContext25.setPosition(25);
        selfContext25.reset();
        int int29 = selfContext25.getPosition();
        org.apache.commons.jxpath.CompiledExpression compiledExpression31 = org.apache.commons.jxpath.JXPathContext.compile("/");
        org.apache.commons.jxpath.JXPathContext jXPathContext33 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        java.lang.Object obj34 = compiledExpression31.getValue(jXPathContext33);
        java.lang.String str36 = jXPathContext33.getPrefix("id('UNKNOWN')/namespace::UNKNOWN");
        jXPathContext33.setLenient(true);
        java.util.Locale locale39 = jXPathContext33.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) selfContext25, locale39);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer41 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container9, locale39);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale39);
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer43 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) dynamicPropertyHandler5, locale39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":UNKNOWN" + "'", str13, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(compiledExpression31);
        org.junit.Assert.assertNotNull(jXPathContext33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int0 = org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory.COLLECTION_POINTER_FACTORY_ORDER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext10 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest8, true);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.NodeSet nodeSet12 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext13 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext11, nodeSet12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext15 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext18 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext13, nodeTest16, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext21 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext18, true, nodeTest20);
        boolean boolean22 = descendantContext21.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.NodeSet nodeSet24 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext25 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext23, nodeSet24);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext27 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest26);
        int int28 = nodeSetContext25.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext30 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext25, nodeTest29);
        int int31 = parentContext30.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = parentContext30.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { descendantContext21, parentContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, evalContextArray33);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) evalContextArray33, locale35, "http://www.w3.org/XML/1998/namespace");
        org.w3c.dom.Node node38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale39, "UNKNOWN");
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName45 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str46 = qName45.toString();
        org.apache.commons.beanutils.DynaBean dynaBean47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer49 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName45, dynaBean47, locale48);
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer51 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName45, locale50);
        int int52 = jDOMNodePointer37.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51);
        boolean boolean53 = dOMNodePointer41.isCollection();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ":UNKNOWN" + "'", str46, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj2 = treeCompiler0.nodeTypeTest(23);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName3, (java.lang.Object) 0.0d, locale5);
        nodePointer6.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer6, nodeTest8, true, nodePointer10);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer12 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer6);
        java.util.Iterator iterator13 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer12);
        int int14 = nullPropertyPointer12.getLength();
        java.lang.String[] strArray15 = nullPropertyPointer12.getPropertyNames();
        java.lang.Object obj16 = treeCompiler0.union((java.lang.Object[]) strArray15);
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory17 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = null;
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str22 = qName21.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = beanPointerFactory17.createNodePointer(nodePointer18, qName21, (java.lang.Object) 10);
        java.lang.Object obj25 = null;
        boolean boolean26 = qName21.equals(obj25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = treeCompiler0.equal((java.lang.Object) boolean26, (java.lang.Object) 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "UNKNOWN()");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":UNKNOWN" + "'", str22, ":UNKNOWN");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        int int8 = parentContext7.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.NodeSet nodeSet11 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext12 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext10, nodeSet11);
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest24 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName22, ":UNKNOWN");
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, (java.lang.Object) 2, nodeTest30);
        java.lang.Object obj32 = nullPointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dOMNodePointer17.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext35 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest24);
        boolean boolean36 = parentContext7.isChildOrderingRequired();
        boolean boolean38 = parentContext7.setPosition((int) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = null;
        org.apache.commons.jxpath.ri.QName qName42 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str43 = qName42.toString();
        org.apache.commons.beanutils.DynaBean dynaBean44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer46 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName42, dynaBean44, locale45);
        org.apache.commons.jxpath.ri.compiler.Constant constant48 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 69);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest50 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant48, expression49);
        boolean boolean51 = constant48.computeContextDependent();
        boolean boolean52 = dynaBeanPointer46.equals((java.lang.Object) constant48);
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.compiler.Step step55 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray56 = new org.apache.commons.jxpath.ri.compiler.Step[] { step55 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath57 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray56);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext58 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext53, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath57);
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.compiler.Step step61 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray62 = new org.apache.commons.jxpath.ri.compiler.Step[] { step61 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath63 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray62);
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext64 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext59, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath63);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest65 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) locationPath57, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath63);
        java.lang.String str66 = locationPath57.toString();
        org.apache.commons.jxpath.ri.compiler.Expression expression67 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual68 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) locationPath57, expression67);
        org.apache.commons.jxpath.ri.compiler.Step step70 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray71 = new org.apache.commons.jxpath.ri.compiler.Step[] { step70 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath72 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray71);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray73 = new org.apache.commons.jxpath.ri.compiler.Expression[] { constant48, coreOperationEqual68, locationPath72 };
        org.apache.commons.jxpath.ri.compiler.Step step74 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray75 = new org.apache.commons.jxpath.ri.compiler.Step[] { step74 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer76 = org.apache.commons.jxpath.ri.axes.SimplePathInterpreter.interpretSimpleExpressionPath((org.apache.commons.jxpath.ri.EvalContext) parentContext7, nodePointer39, expressionArray73, stepArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":UNKNOWN" + "'", str43, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stepArray56);
        org.junit.Assert.assertNotNull(stepArray62);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "null" + "'", str66, "null");
        org.junit.Assert.assertNotNull(stepArray71);
        org.junit.Assert.assertNotNull(expressionArray73);
        org.junit.Assert.assertNotNull(stepArray75);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.w3c.dom.Node node2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node2, locale3, "UNKNOWN");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = dOMNodePointer5.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer9 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer5, "UNKNOWN", "0/*");
        java.lang.String str10 = namespacePointer9.toString();
        boolean boolean11 = namespacePointer9.isLeaf();
        int int12 = namespacePointer9.getLength();
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = dOMNodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest23 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21, ":UNKNOWN");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27, (java.lang.Object) 2, nodeTest29);
        java.lang.Object obj31 = nullPointer27.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = dOMNodePointer16.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer27);
        boolean boolean33 = namespacePointer9.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext34 = new org.apache.commons.jxpath.ri.axes.AncestorContext(evalContext0, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest23);
        int int35 = ancestorContext34.getDocumentOrder();
        int int36 = ancestorContext34.getDocumentOrder();
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "id('UNKNOWN')/namespace::UNKNOWN" + "'", str10, "id('UNKNOWN')/namespace::UNKNOWN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str3 = qName2.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer7 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName2, (java.lang.Object) (short) 100, dynamicPropertyHandler5, locale6);
        int int8 = dynamicPointer7.getLength();
        dynamicPointer7.setIndex(1);
        java.lang.String str11 = dynamicPointer7.asPath();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer13 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer7, "hi!");
        java.lang.Object obj14 = namespacePointer13.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str18 = qName17.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer22 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName17, (java.lang.Object) (short) 100, dynamicPropertyHandler20, locale21);
        int int23 = dynamicPointer22.getLength();
        dynamicPointer22.setIndex(1);
        boolean boolean26 = dynamicPointer22.isDynamicPropertyDeclarationSupported();
        boolean boolean27 = dynamicPointer22.isCollection();
        org.apache.commons.jxpath.ri.QName qName30 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str31 = qName30.toString();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer35 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName30, (java.lang.Object) (short) 100, dynamicPropertyHandler33, locale34);
        java.lang.Object obj36 = dynamicPointer35.getImmediateNode();
        int int37 = namespacePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer22, (org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer35);
        org.w3c.dom.Node node38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale39, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = dOMNodePointer41.testNode(nodeTest42);
        org.apache.commons.jxpath.ri.QName qName46 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest48 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName46, ":UNKNOWN");
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer52 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale50, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        boolean boolean55 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52, (java.lang.Object) 2, nodeTest54);
        java.lang.Object obj56 = nullPointer52.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = dOMNodePointer41.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest48, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52);
        java.lang.Object obj58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer52, obj58);
        boolean boolean60 = nullPointer52.isDynamicPropertyDeclarationSupported();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer61 = nullPointer52.getPropertyPointer();
        boolean boolean62 = namespacePointer13.equals((java.lang.Object) nullPointer52);
        org.apache.commons.jxpath.ri.model.beans.LangAttributePointer langAttributePointer63 = new org.apache.commons.jxpath.ri.model.beans.LangAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer13);
        java.lang.String str64 = langAttributePointer63.getNamespaceURI();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":UNKNOWN" + "'", str3, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ":UNKNOWN" + "'", str18, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":UNKNOWN" + "'", str31, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(propertyPointer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.NodeSet nodeSet1 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext2 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext4 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest3);
        int int5 = nodeSetContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext7 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext2, nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = parentContext7.getCurrentNodePointer();
        parentContext7.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) parentContext7, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = unionContext11.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions2 = jXPathContext1.getFunctions();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer4 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) jXPathContext1, locale3);
        boolean boolean5 = collectionPointer4.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.Functions functions8 = jXPathContext7.getFunctions();
        java.text.DecimalFormatSymbols decimalFormatSymbols10 = null;
        jXPathContext7.setDecimalFormatSymbols("", decimalFormatSymbols10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = collectionPointer4.createPath(jXPathContext7);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.NodeSet nodeSet14 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext15 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext13, nodeSet14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext17 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext20 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext15, nodeTest18, true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext23 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, nodeTest22);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        java.lang.String str28 = qName27.toString();
        java.lang.Object obj29 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer32 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName27, obj29, jXPathBeanInfo30, locale31);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName27, ":UNKNOWN");
        java.lang.String str35 = nodeNameTest34.toString();
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext36 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext20, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        int int37 = ancestorContext36.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.NodeSet nodeSet40 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext41 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext39, nodeSet40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext43 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest42);
        int int44 = nodeSetContext41.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext46 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) nodeSetContext41, nodeTest45);
        int int47 = parentContext46.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        org.apache.commons.jxpath.NodeSet nodeSet50 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext51 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext49, nodeSet50);
        org.w3c.dom.Node node53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale54, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        boolean boolean58 = dOMNodePointer56.testNode(nodeTest57);
        org.apache.commons.jxpath.ri.QName qName61 = new org.apache.commons.jxpath.ri.QName("", "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest63 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName61, ":UNKNOWN");
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer67 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale65, "UNKNOWN");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67, (java.lang.Object) 2, nodeTest69);
        java.lang.Object obj71 = nullPointer67.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = dOMNodePointer56.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer67);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext73 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext49, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext74 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) parentContext46, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext75 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) ancestorContext36, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63);
        org.apache.commons.jxpath.ri.QName qName77 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName77, (java.lang.Object) 0.0d, locale79);
        nodePointer80.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator(nodePointer80, nodeTest82, true, nodePointer84);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer86 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer80);
        java.util.Iterator iterator87 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) nullPropertyPointer86);
        int int88 = nullPropertyPointer86.getLength();
        java.lang.String[] strArray89 = nullPropertyPointer86.getPropertyNames();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator90 = collectionPointer4.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest63, false, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer86);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = nodeIterator90.setPosition(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(functions2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(functions8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ":UNKNOWN" + "'", str28, ":UNKNOWN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":UNKNOWN" + "'", str35, ":UNKNOWN");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertNotNull(nodePointer80);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(nodeIterator90);
    }
}

