package org.jsoup.parser;

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
        java.util.List<org.jsoup.nodes.Node> nodeList2 = org.jsoup.parser.Parser.parseXmlFragment("", "");
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.safety.Whitelist whitelist2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.jsoup.Jsoup.clean(":gt(-1)", ":gt(-1)", whitelist2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        char[] charArray5 = new char[] { 'a', '#', '#' };
        startTag1.appendAttributeValue(charArray5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.safety.Whitelist whitelist2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.prettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jsoup.Jsoup.clean(":gt(-1)", "hi!", whitelist2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(":gt(-1)", "<html>\n <head></head>\n <body></body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("Doctype", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.safety.Whitelist whitelist2 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj5 = null;
        boolean boolean6 = document4.equals(obj5);
        boolean boolean8 = document4.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document10 = document4.outputSettings(outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.jsoup.Jsoup.clean("#root", ":containsOwn(hi!", whitelist2, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<:containsOwn(hi!>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.safety.Whitelist whitelist2 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj5 = null;
        boolean boolean6 = document4.equals(obj5);
        boolean boolean8 = document4.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document10 = document4.outputSettings(outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.jsoup.Jsoup.clean("#comment", ":gt(-1)", whitelist2, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(":containsOwn(hi!", "StartTag");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan8 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan10 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str14 = document13.data();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document13, "");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj19 = null;
        boolean boolean20 = document18.equals(obj19);
        java.lang.String str21 = document18.ownText();
        boolean boolean22 = indexGreaterThan10.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray23 = new org.jsoup.select.Evaluator.IndexGreaterThan[] { indexGreaterThan8, indexGreaterThan10 };
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray24 = parseErrorList1.toArray(indexGreaterThanArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) indexGreaterThanArray24, "Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Doctype");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(indexGreaterThanArray23);
        org.junit.Assert.assertNotNull(indexGreaterThanArray24);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj8 = null;
        boolean boolean9 = document7.equals(obj8);
        org.jsoup.nodes.Element element11 = document7.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode12 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document13 = document7.quirksMode(quirksMode12);
        org.jsoup.nodes.Document document14 = document2.quirksMode(quirksMode12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj27 = null;
        boolean boolean28 = document26.equals(obj27);
        boolean boolean30 = document26.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document32 = document26.outputSettings(outputSettings31);
        java.lang.String str33 = document26.location();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = document21.after((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        java.lang.String str5 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str9 = document8.data();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document8, "");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document8.quirksMode(quirksMode18);
        boolean boolean21 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document3.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        int int7 = parseErrorList1.size();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor8 = parseErrorList1.listIterator();
        java.lang.Object obj9 = parseErrorList1.clone();
        java.lang.String str11 = org.jsoup.helper.StringUtil.join((java.util.Collection) parseErrorList1, " data=\"\"");
        java.lang.Object[] objArray12 = parseErrorList1.toArray();
        boolean boolean13 = parseErrorList1.isEmpty();
        org.jsoup.nodes.Element element15 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList17 = org.jsoup.parser.Parser.parseFragment("#root", element15, "");
        boolean boolean18 = parseErrorList1.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList17);
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(parseErrorItor8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#text", "[]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.tagName = ":gt(-1)";
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.asStartTag();
        startTag4.appendAttributeName(":containsOwn(hi!");
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder8.getDocument();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        htmlTreeBuilder8.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag4, htmlTreeBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parseErrorList6.subList((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan8 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan10 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str14 = document13.data();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document13, "");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj19 = null;
        boolean boolean20 = document18.equals(obj19);
        java.lang.String str21 = document18.ownText();
        boolean boolean22 = indexGreaterThan10.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray23 = new org.jsoup.select.Evaluator.IndexGreaterThan[] { indexGreaterThan8, indexGreaterThan10 };
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray24 = parseErrorList1.toArray(indexGreaterThanArray23);
        parseErrorList1.clear();
        org.jsoup.parser.ParseError parseError27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError28 = parseErrorList1.set((int) '4', parseError27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(indexGreaterThanArray23);
        org.junit.Assert.assertNotNull(indexGreaterThanArray24);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        char[] charArray5 = new char[] { 'a', '#', '#' };
        startTag1.appendAttributeValue(charArray5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj10 = null;
        boolean boolean11 = document9.equals(obj10);
        boolean boolean13 = document9.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document15 = document9.outputSettings(outputSettings14);
        htmlTreeBuilder7.pushActiveFormattingElements((org.jsoup.nodes.Element) document9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #]");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("*");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan2 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str6 = document5.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document5, "");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj11 = null;
        boolean boolean12 = document10.equals(obj11);
        java.lang.String str13 = document10.ownText();
        boolean boolean14 = indexGreaterThan2.matches((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document10);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment("[<html>\n <head></head>\n <body></body>\n</html>^=#root]", (org.jsoup.nodes.Element) document5, "<:containsOwn(hi!>");
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = document5.getElementsMatchingOwnText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = document2.dataset();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan8 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan10 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str14 = document13.data();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document13, "");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj19 = null;
        boolean boolean20 = document18.equals(obj19);
        java.lang.String str21 = document18.ownText();
        boolean boolean22 = indexGreaterThan10.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray23 = new org.jsoup.select.Evaluator.IndexGreaterThan[] { indexGreaterThan8, indexGreaterThan10 };
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray24 = parseErrorList1.toArray(indexGreaterThanArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.parser.ParseError> parseErrorList27 = parseErrorList1.subList(8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(indexGreaterThanArray23);
        org.junit.Assert.assertNotNull(indexGreaterThanArray24);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(":empty", "[:gt(-1)$=starttag]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.ContainsText containsText65 = new org.jsoup.select.Evaluator.ContainsText("hi!");
        org.jsoup.nodes.Document document67 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj68 = null;
        boolean boolean69 = document67.equals(obj68);
        org.jsoup.nodes.Element element71 = document67.addClass("");
        org.jsoup.nodes.Document document73 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj74 = null;
        boolean boolean75 = document73.equals(obj74);
        java.util.List<org.jsoup.nodes.Node> nodeList76 = document73.siblingNodes();
        org.jsoup.nodes.Element element78 = document73.removeClass("");
        boolean boolean79 = containsText65.matches((org.jsoup.nodes.Element) document67, element78);
        boolean boolean80 = elementList60.add(element78);
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor53 = elementList49.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild66 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean67 = elementList9.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element68 = elementList9.remove();
        java.lang.Object obj69 = elementList9.clone();
        org.jsoup.select.Evaluator.AllElements allElements71 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str72 = allElements71.toString();
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj75 = null;
        boolean boolean76 = document74.equals(obj75);
        org.jsoup.select.Elements elements78 = document74.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList79 = document74.textNodes();
        document74.title("hi!");
        org.jsoup.nodes.Document document83 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag84 = document83.tag();
        boolean boolean85 = allElements71.matches((org.jsoup.nodes.Element) document74, (org.jsoup.nodes.Element) document83);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element86 = elementList9.set((int) (short) 10, (org.jsoup.nodes.Element) document74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "[]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "*" + "'", str72, "*");
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(textNodeList79);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj8 = null;
        boolean boolean9 = document7.equals(obj8);
        org.jsoup.nodes.Element element11 = document7.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode12 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document13 = document7.quirksMode(quirksMode12);
        org.jsoup.nodes.Document document14 = document2.quirksMode(quirksMode12);
        java.lang.String str15 = document14.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("*", "Doctype");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#text", ":empty");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document", "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode3 = document2.quirksMode();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + quirksMode3 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode3.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str5 = document4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document4, "");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj10 = null;
        boolean boolean11 = document9.equals(obj10);
        java.lang.String str12 = document9.ownText();
        boolean boolean13 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document9.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid(":containsOwn(hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        char[] charArray10 = new char[] { 'a', '#', '#' };
        startTag6.appendAttributeValue(charArray10);
        boolean boolean12 = startTag6.isSelfClosing();
        boolean boolean13 = document2.equals((java.lang.Object) boolean12);
        org.jsoup.nodes.Element element15 = document2.prepend(":only-child");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj2 = null;
        boolean boolean3 = document1.equals(obj2);
        org.jsoup.nodes.Element element5 = document1.addClass("");
        org.jsoup.nodes.Node node6 = element5.parent();
        org.jsoup.nodes.Element element8 = element5.prepend(":first-child");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((-1));
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.originalState();
        java.lang.String str5 = htmlTreeBuilder3.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int10 = parseErrorList9.getMaxSize();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder3.parse("StartTag", "#root", parseErrorList9);
        boolean boolean12 = indexEquals1.matches(element2, (org.jsoup.nodes.Element) document11);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        org.jsoup.select.Elements elements7 = document2.getElementsMatchingOwnText("#hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan4 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str5 = indexGreaterThan4.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str8 = document7.data();
        org.jsoup.nodes.Element element10 = document7.text(":first-of-type");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        boolean boolean17 = indexGreaterThan4.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element18 = document7.head();
        htmlTreeBuilder0.pushActiveFormattingElements(element18);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("Doctype", "");
        boolean boolean23 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document22);
        org.jsoup.nodes.Element element25 = document22.append("[]");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList26 = element25.textNodes();
        org.jsoup.select.Elements elements29 = element25.getElementsByAttributeValueStarting("#comment", ":empty");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element25.getElementsByAttributeValueStarting("[*]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(-1)" + "'", str5, ":gt(-1)");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(":only-of-type", "[]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(":last-of-type", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.select.Elements elements7 = document3.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document3.textNodes();
        document3.title("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        boolean boolean14 = allElements0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = allElements0.matches(element15, (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag26 = document25.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, ":gt(-1)");
        boolean boolean29 = allElements0.matches(element23, element28);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = element28.textNodes();
        boolean boolean32 = element28.hasClass(":first-of-type");
        org.jsoup.nodes.Element element33 = element28.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(textNodeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) ' ', (int) (byte) 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = null;
        xmlTreeBuilder3.doc = document4;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        xmlTreeBuilder3.initialiseParse("", "hi!", parseErrorList8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder3.initialiseParse("hi!", ":gt(-1)", parseErrorList12);
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder3.parseFragment("StartTag", ":gt(-1)", parseErrorList16);
        boolean boolean18 = parseErrorList2.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList17);
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList23 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList23, nodeArray22);
        boolean boolean25 = parseErrorList20.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList23);
        int int26 = parseErrorList20.size();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList20.listIterator();
        java.lang.Object obj28 = parseErrorList20.clone();
        java.lang.String str30 = org.jsoup.helper.StringUtil.join((java.util.Collection) parseErrorList20, " data=\"\"");
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj34 = null;
        boolean boolean35 = document33.equals(obj34);
        java.lang.String[] strArray43 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = document33.classNames((java.util.Set<java.lang.String>) strSet44);
        org.jsoup.nodes.Element element48 = document33.tagName(":empty");
        org.jsoup.nodes.Element element49 = element48.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = org.jsoup.parser.Parser.parseFragment("", element49, "[:gt(-1)$=starttag]");
        boolean boolean52 = parseErrorList20.retainAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList51);
        boolean boolean53 = parseErrorList2.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList51);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment(" data=\"\"");
        org.jsoup.select.Elements elements3 = document1.getElementsMatchingText("[:gt(-1)$=starttag]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj66 = null;
        boolean boolean67 = document65.equals(obj66);
        org.jsoup.nodes.Element element69 = document65.addClass("");
        java.lang.String str70 = document65.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList71 = document65.dataNodes();
        elementList60.addLast((org.jsoup.nodes.Element) document65);
        org.jsoup.nodes.Element element73 = elementList60.getLast();
        java.lang.Object[] objArray74 = elementList60.toArray();
        org.jsoup.nodes.Element element75 = elementList60.removeLast();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(dataNodeList71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertNotNull(element75);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding(":gt(-1)", "StartTag");
        java.lang.String str3 = attributeWithValueEnding2.toString();
        java.lang.String str4 = attributeWithValueEnding2.toString();
        org.jsoup.select.Evaluator.IsEmpty isEmpty5 = new org.jsoup.select.Evaluator.IsEmpty();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag8 = document7.tag();
        org.jsoup.nodes.Element element10 = document7.getElementById("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        org.jsoup.nodes.Element element15 = document12.appendText("");
        org.jsoup.select.Elements elements16 = element15.children();
        boolean boolean17 = isEmpty5.matches(element10, element15);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str21 = document20.data();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document20, "");
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj26 = null;
        boolean boolean27 = document25.equals(obj26);
        org.jsoup.nodes.Element element29 = document25.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document31 = document25.quirksMode(quirksMode30);
        org.jsoup.nodes.Document document32 = document20.quirksMode(quirksMode30);
        boolean boolean33 = attributeWithValueEnding2.matches(element15, (org.jsoup.nodes.Element) document32);
        java.lang.String str34 = attributeWithValueEnding2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:gt(-1)$=starttag]" + "'", str3, "[:gt(-1)$=starttag]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[:gt(-1)$=starttag]" + "'", str4, "[:gt(-1)$=starttag]");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[:gt(-1)$=starttag]" + "'", str34, "[:gt(-1)$=starttag]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder0.insert(comment25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element29 = htmlTreeBuilder0.getActiveFormattingElement("");
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        int int25 = document21.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = document21.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj66 = null;
        boolean boolean67 = document65.equals(obj66);
        org.jsoup.nodes.Element element69 = document65.addClass("");
        java.lang.String str70 = document65.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList71 = document65.dataNodes();
        elementList60.addLast((org.jsoup.nodes.Element) document65);
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag75 = document74.tag();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag75, ":gt(-1)");
        boolean boolean78 = tag75.isFormListed();
        boolean boolean79 = elementList60.removeLastOccurrence((java.lang.Object) boolean78);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor80 = elementList60.iterator();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(dataNodeList71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(elementItor80);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Document document27 = htmlTreeBuilder0.parse("[]", ":last-of-type");
        org.jsoup.nodes.FormElement formElement28 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(formElement28);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        java.lang.String str5 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str9 = document8.data();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document8, "");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document8.quirksMode(quirksMode18);
        boolean boolean21 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Element element23 = document3.appendText(":empty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] { 'a', '#', '#' };
        startTag27.appendAttributeValue(charArray31);
        boolean boolean33 = startTag27.isSelfClosing();
        startTag27.tagName = "";
        boolean boolean36 = startTag27.isComment();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = null;
        boolean boolean38 = htmlTreeBuilderState25.process((org.jsoup.parser.Token) startTag27, htmlTreeBuilder37);
        boolean boolean39 = startTag27.isDoctype();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, #]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment(":nth-last-child(100n+35)");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan2 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str6 = document5.data();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document5, "");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj11 = null;
        boolean boolean12 = document10.equals(obj11);
        java.lang.String str13 = document10.ownText();
        boolean boolean14 = indexGreaterThan2.matches((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document10);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment("[<html>\n <head></head>\n <body></body>\n</html>^=#root]", (org.jsoup.nodes.Element) document5, "<:containsOwn(hi!>");
        org.jsoup.nodes.Node node17 = document5.clone();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Document document27 = htmlTreeBuilder0.parse("[]", ":last-of-type");
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj30 = null;
        boolean boolean31 = document29.equals(obj30);
        boolean boolean33 = document29.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document35 = document29.outputSettings(outputSettings34);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings34.prettyPrint(false);
        org.jsoup.nodes.Document document40 = document27.outputSettings(outputSettings34);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(document40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList1.stream();
        boolean boolean4 = parseErrorList1.isEmpty();
        boolean boolean5 = parseErrorList1.isEmpty();
        org.jsoup.parser.ParseError[] parseErrorArray6 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList7 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7, parseErrorArray6);
        org.jsoup.nodes.Node[] nodeArray9 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList10 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList10, nodeArray9);
        boolean boolean12 = parseErrorList7.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList10);
        boolean boolean13 = parseErrorList1.equals((java.lang.Object) parseErrorList7);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator14 = parseErrorList7.spliterator();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str18 = document17.data();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document17, "");
        java.util.stream.Stream<org.jsoup.nodes.Node> nodeStream21 = nodeList20.parallelStream();
        boolean boolean22 = parseErrorList7.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList20);
        org.jsoup.parser.ParseError parseError24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError25 = parseErrorList7.set((int) (byte) 1, parseError24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parseErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(parseErrorSpliterator14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#comment");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        java.lang.String str5 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str9 = document8.data();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document8, "");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document8.quirksMode(quirksMode18);
        boolean boolean21 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document20);
        org.jsoup.select.Elements elements23 = document20.getElementsByTag(":");
        java.lang.String str24 = document20.title();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild66 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean67 = elementList9.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element68 = elementList9.remove();
        java.lang.Object obj69 = elementList9.clone();
        org.jsoup.nodes.Element element70 = elementList9.poll();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "[]");
        org.junit.Assert.assertNull(element70);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.select.Elements elements7 = document3.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document3.textNodes();
        document3.title("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        boolean boolean14 = allElements0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = allElements0.matches(element15, (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag26 = document25.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, ":gt(-1)");
        boolean boolean29 = allElements0.matches(element23, element28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element28.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str5 = document4.data();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document4, "");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj10 = null;
        boolean boolean11 = document9.equals(obj10);
        java.lang.String str12 = document9.ownText();
        boolean boolean13 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document9);
        java.lang.String str14 = document4.className();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(":first-of-type", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        java.lang.String str5 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str9 = document8.data();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document8, "");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document8.quirksMode(quirksMode18);
        boolean boolean21 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document20);
        java.lang.String str22 = isFirstChild0.toString();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag25 = document24.tag();
        org.jsoup.nodes.Element element27 = document24.appendText("");
        org.jsoup.nodes.Element element29 = document24.child((int) (byte) 0);
        org.jsoup.select.Elements elements30 = element29.parents();
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild31 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str32 = isFirstChild31.toString();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str35 = document34.data();
        java.lang.String str36 = document34.outerHtml();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str40 = document39.data();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document39, "");
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj45 = null;
        boolean boolean46 = document44.equals(obj45);
        org.jsoup.nodes.Element element48 = document44.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode49 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document50 = document44.quirksMode(quirksMode49);
        org.jsoup.nodes.Document document51 = document39.quirksMode(quirksMode49);
        boolean boolean52 = isFirstChild31.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document51);
        boolean boolean53 = isFirstChild0.matches(element29, (org.jsoup.nodes.Element) document34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ":first-child" + "'", str22, ":first-child");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":first-child" + "'", str32, ":first-child");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + quirksMode49 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode49.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.Token token27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = htmlTreeBuilder0.process(token27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html>\n <head></head>\n <body></body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader(":gt(-1)");
        boolean boolean30 = characterReader28.matchesIgnoreCase("");
        boolean boolean31 = characterReader28.isEmpty();
        int int33 = characterReader28.nextIndexOf((java.lang.CharSequence) "[<html>\n <head></head>\n <body></body>\n</html>^=#root]");
        htmlTreeBuilder0.reader = characterReader28;
        java.lang.String str35 = characterReader28.consumeLetterThenDigitSequence();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        java.lang.String str2 = matches1.toString();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.originalState();
        java.lang.String str5 = htmlTreeBuilder3.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int10 = parseErrorList9.getMaxSize();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder3.parse("StartTag", "#root", parseErrorList9);
        org.jsoup.select.Evaluator.AllElements allElements12 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str13 = allElements12.toString();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj16 = null;
        boolean boolean17 = document15.equals(obj16);
        org.jsoup.select.Elements elements19 = document15.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList20 = document15.textNodes();
        document15.title("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag25 = document24.tag();
        boolean boolean26 = allElements12.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        htmlTreeBuilder3.maybeSetBaseUri((org.jsoup.nodes.Element) document24);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder3.insert(comment28);
        org.jsoup.nodes.Element element30 = htmlTreeBuilder3.getHeadElement();
        org.jsoup.select.Evaluator.ContainsText containsText32 = new org.jsoup.select.Evaluator.ContainsText("hi!");
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        org.jsoup.nodes.Element element38 = document34.addClass("");
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj41 = null;
        boolean boolean42 = document40.equals(obj41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document40.siblingNodes();
        org.jsoup.nodes.Element element45 = document40.removeClass("");
        boolean boolean46 = containsText32.matches((org.jsoup.nodes.Element) document34, element45);
        java.lang.String str47 = element45.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = matches1.matches(element30, element45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matches(null" + "'", str2, ":matches(null");
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "*" + "'", str13, "*");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(textNodeList20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj2 = null;
        boolean boolean3 = document1.equals(obj2);
        org.jsoup.nodes.Element element5 = document1.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.nodes.Element element12 = document9.removeClass("hi!");
        boolean boolean14 = document9.hasAttr(" data=\"\"");
        org.jsoup.nodes.Element element15 = document7.prependChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element17 = element15.html("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.select.Evaluator.IsOnlyOfType isOnlyOfType0 = new org.jsoup.select.Evaluator.IsOnlyOfType();
        java.lang.String str1 = isOnlyOfType0.toString();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("#document", "hi!");
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = isOnlyOfType0.matches((org.jsoup.nodes.Element) document4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-of-type" + "'", str1, ":only-of-type");
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj2 = null;
        boolean boolean3 = document1.equals(obj2);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document1.siblingNodes();
        org.jsoup.nodes.Element element6 = document1.removeClass("");
        org.jsoup.select.Elements elements7 = element6.parents();
        java.lang.String str8 = element6.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element6.wrap(" data=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str8, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj29 = null;
        boolean boolean30 = document28.equals(obj29);
        java.lang.String[] strArray38 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = document28.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexEquals(0);
        org.jsoup.nodes.Element element45 = element41.removeClass("#comment");
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag48 = document47.tag();
        org.jsoup.nodes.Element element50 = document47.removeClass("hi!");
        org.jsoup.nodes.Element element52 = document47.appendText(":first-of-type");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element45, (org.jsoup.nodes.Element) document47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        java.lang.String str5 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str9 = document8.data();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document8, "");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document8.quirksMode(quirksMode18);
        boolean boolean21 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document20.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        java.lang.String[] strArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.inScope(strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        org.jsoup.nodes.Element element5 = document2.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment("", element5, "<:containsOwn(hi!>");
        org.jsoup.select.Evaluator.AllElements allElements8 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str9 = allElements8.toString();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj12 = null;
        boolean boolean13 = document11.equals(obj12);
        org.jsoup.select.Elements elements15 = document11.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document11.textNodes();
        document11.title("hi!");
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag21 = document20.tag();
        boolean boolean22 = allElements8.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str27 = document26.data();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document26, "");
        boolean boolean30 = allElements8.matches(element23, (org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Element element31 = null;
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag34 = document33.tag();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag34, ":gt(-1)");
        boolean boolean37 = allElements8.matches(element31, element36);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList38 = element36.textNodes();
        boolean boolean40 = element36.hasClass(":first-of-type");
        java.util.Set<java.lang.String> strSet41 = element36.classNames();
        org.jsoup.nodes.Element element42 = element5.classNames(strSet41);
        java.lang.String str43 = element5.ownText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "*" + "'", str9, "*");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("#comment", ":matches(null");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.removeClass("hi!");
        org.jsoup.nodes.Element element9 = document4.appendText(":first-of-type");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        org.jsoup.nodes.Element element12 = element9.appendText(":gt(-1)");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.originalState();
        java.lang.String str15 = htmlTreeBuilder13.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int20 = parseErrorList19.getMaxSize();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder13.parse("StartTag", "#root", parseErrorList19);
        org.jsoup.select.Evaluator.AllElements allElements22 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str23 = allElements22.toString();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj26 = null;
        boolean boolean27 = document25.equals(obj26);
        org.jsoup.select.Elements elements29 = document25.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = document25.textNodes();
        document25.title("hi!");
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag35 = document34.tag();
        boolean boolean36 = allElements22.matches((org.jsoup.nodes.Element) document25, (org.jsoup.nodes.Element) document34);
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder13.insert(comment38);
        org.jsoup.nodes.Element element40 = htmlTreeBuilder13.getHeadElement();
        boolean boolean41 = attributeWithValueContaining2.matches(element9, element40);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "*" + "'", str23, "*");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(textNodeList30);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("[*]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        int int52 = elementList49.size();
        elementList49.clear();
        java.lang.Object[] objArray54 = elementList49.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element56 = elementList49.get((int) ':');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 58, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.nodes.Element element65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element66 = elementList9.set((int) '\ufffd', element65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65533, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id("hi!");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute(":containsOwn(hi!");
        org.jsoup.parser.Tag tag6 = document3.tag();
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document3.getElementsByAttributeValueMatching("#document", pattern8);
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild10 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str11 = isFirstChild10.toString();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str14 = document13.data();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj24 = null;
        boolean boolean25 = document23.equals(obj24);
        org.jsoup.nodes.Element element27 = document23.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode28 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document29 = document23.quirksMode(quirksMode28);
        org.jsoup.nodes.Document document30 = document18.quirksMode(quirksMode28);
        boolean boolean31 = isFirstChild10.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document30);
        boolean boolean32 = id1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document13);
        document3.title(":last-of-type");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ":first-child" + "'", str11, ":first-child");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + quirksMode28 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode28.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.select.Evaluator.Class class3 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag6 = document5.tag();
        boolean boolean7 = tag6.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode11 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node13 = dataNode11.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes14 = dataNode11.attributes();
        org.jsoup.nodes.FormElement formElement15 = new org.jsoup.nodes.FormElement(tag6, ":empty", attributes14);
        org.jsoup.select.Elements elements17 = formElement15.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str21 = document20.data();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document20, "");
        boolean boolean24 = class3.matches((org.jsoup.nodes.Element) formElement15, (org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute(":containsOwn(hi!");
        org.jsoup.parser.Tag tag29 = document26.tag();
        java.util.regex.Pattern pattern31 = null;
        org.jsoup.select.Elements elements32 = document26.getElementsByAttributeValueMatching("#document", pattern31);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode7 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node9 = dataNode7.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes10 = dataNode7.attributes();
        org.jsoup.nodes.FormElement formElement11 = new org.jsoup.nodes.FormElement(tag2, ":empty", attributes10);
        attributes10.put("[:gt(-1)$=starttag]", "StartTag");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder15.originalState();
        java.lang.String str17 = htmlTreeBuilder15.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder15.parse("StartTag", "#root", parseErrorList21);
        org.jsoup.select.Evaluator.AllElements allElements24 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str25 = allElements24.toString();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.select.Elements elements31 = document27.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = document27.textNodes();
        document27.title("hi!");
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag37 = document36.tag();
        boolean boolean38 = allElements24.matches((org.jsoup.nodes.Element) document27, (org.jsoup.nodes.Element) document36);
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState40 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder15.error(htmlTreeBuilderState40);
        boolean boolean42 = attributes10.equals((java.lang.Object) htmlTreeBuilderState40);
        java.util.List<org.jsoup.nodes.Attribute> attributeList43 = attributes10.asList();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "*" + "'", str25, "*");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(textNodeList32);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributeList43);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element27 = null;
        htmlTreeBuilder0.removeFromActiveFormattingElements(element27);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.resetInsertionMode();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        int int52 = elementList49.size();
        elementList49.clear();
        org.jsoup.nodes.Element element54 = elementList49.pollFirst();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan56 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        boolean boolean57 = elementList49.removeLastOccurrence((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNull(element54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("data=\"\":last-of-type#root=\":first-of-type\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        int int52 = elementList49.size();
        elementList49.clear();
        org.jsoup.nodes.Element element54 = elementList49.pollFirst();
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag58 = document57.tag();
        org.jsoup.nodes.Element element60 = document57.removeClass("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList62 = org.jsoup.parser.Parser.parseFragment("", element60, " data=\"\"");
        elementList49.addLast(element60);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNull(element54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(nodeList62);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        document8.title("[^<:containsOwn(hi!>]");
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("*", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body></body>\n</html>", "[*]");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document2.textNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(textNodeList3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj2 = null;
        boolean boolean3 = document1.equals(obj2);
        org.jsoup.nodes.Element element5 = document1.addClass("");
        java.lang.String str6 = document1.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = document1.dataNodes();
        org.jsoup.nodes.Element element9 = document1.prepend(":empty");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueStarting("[^<:containsOwn(hi!>]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.Character[] characterArray1 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList2 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList2, characterArray1);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList2);
        org.jsoup.select.Evaluator.AllElements allElements5 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str6 = allElements5.toString();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj9 = null;
        boolean boolean10 = document8.equals(obj9);
        org.jsoup.select.Elements elements12 = document8.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = document8.textNodes();
        document8.title("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag18 = document17.tag();
        boolean boolean19 = allElements5.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Element element21 = document8.removeClass(":last-of-type");
        document8.title(":last-of-type");
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str27 = document26.data();
        org.jsoup.nodes.Element element29 = document26.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = org.jsoup.parser.Parser.parseFragment("", element29, "<:containsOwn(hi!>");
        org.jsoup.select.Evaluator.AllElements allElements32 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str33 = allElements32.toString();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj36 = null;
        boolean boolean37 = document35.equals(obj36);
        org.jsoup.select.Elements elements39 = document35.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = document35.textNodes();
        document35.title("hi!");
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag45 = document44.tag();
        boolean boolean46 = allElements32.matches((org.jsoup.nodes.Element) document35, (org.jsoup.nodes.Element) document44);
        org.jsoup.nodes.Element element47 = null;
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str51 = document50.data();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document50, "");
        boolean boolean54 = allElements32.matches(element47, (org.jsoup.nodes.Element) document50);
        org.jsoup.nodes.Element element55 = null;
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag58 = document57.tag();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag58, ":gt(-1)");
        boolean boolean61 = allElements32.matches(element55, element60);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList62 = element60.textNodes();
        boolean boolean64 = element60.hasClass(":first-of-type");
        java.util.Set<java.lang.String> strSet65 = element60.classNames();
        org.jsoup.nodes.Element element66 = element29.classNames(strSet65);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document8, element29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(characterArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "*" + "'", str6, "*");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "*" + "'", str33, "*");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(textNodeList40);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(textNodeList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.nodes.Document document66 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str67 = document66.data();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document66, "");
        elementList60.addFirst((org.jsoup.nodes.Element) document66);
        java.lang.Object obj71 = elementList60.clone();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType7 = new org.jsoup.select.Evaluator.IsLastOfType();
        boolean boolean8 = parseErrorList1.equals((java.lang.Object) isLastOfType7);
        java.lang.String str9 = isLastOfType7.toString();
        java.lang.String str10 = isLastOfType7.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        java.lang.String str17 = document12.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = document12.dataNodes();
        org.jsoup.helper.Validate.notNull((java.lang.Object) document12, "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode21 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document22 = document12.quirksMode(quirksMode21);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str26 = document25.data();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document25, "");
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj31 = null;
        boolean boolean32 = document30.equals(obj31);
        org.jsoup.nodes.Element element34 = document30.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode35 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document36 = document30.quirksMode(quirksMode35);
        org.jsoup.nodes.Document document37 = document25.quirksMode(quirksMode35);
        boolean boolean38 = isLastOfType7.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document25);
        java.lang.String str39 = document12.title();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":last-of-type" + "'", str9, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ":last-of-type" + "'", str10, ":last-of-type");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertTrue("'" + quirksMode21 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode21.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + quirksMode35 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode35.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("Doctype");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str5 = document4.data();
        org.jsoup.nodes.Element element7 = document4.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = org.jsoup.parser.Parser.parseFragment("", element7, "<:containsOwn(hi!>");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse(" data=\"\"", "");
        org.jsoup.nodes.Element element13 = document12.body();
        boolean boolean14 = containsText1.matches(element7, (org.jsoup.nodes.Element) document12);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan4 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str5 = indexGreaterThan4.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str8 = document7.data();
        org.jsoup.nodes.Element element10 = document7.text(":first-of-type");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        boolean boolean17 = indexGreaterThan4.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element18 = document7.head();
        htmlTreeBuilder0.pushActiveFormattingElements(element18);
        boolean boolean20 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str23 = document22.data();
        org.jsoup.nodes.Element element25 = document22.text(":first-of-type");
        java.lang.String str26 = document22.className();
        boolean boolean27 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = null;
        xmlTreeBuilder28.doc = document29;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder28.initialiseParse("", "hi!", parseErrorList33);
        org.jsoup.parser.Tokeniser tokeniser35 = xmlTreeBuilder28.tokeniser;
        org.jsoup.parser.Token token36 = xmlTreeBuilder28.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList37 = xmlTreeBuilder28.stack;
        org.jsoup.nodes.Element element38 = elementList37.element();
        htmlTreeBuilder0.stack = elementList37;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder40.originalState();
        java.lang.String str42 = htmlTreeBuilder40.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList46 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int47 = parseErrorList46.getMaxSize();
        org.jsoup.nodes.Document document48 = htmlTreeBuilder40.parse("StartTag", "#root", parseErrorList46);
        org.jsoup.select.Evaluator.AllElements allElements49 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str50 = allElements49.toString();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj53 = null;
        boolean boolean54 = document52.equals(obj53);
        org.jsoup.select.Elements elements56 = document52.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList57 = document52.textNodes();
        document52.title("hi!");
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag62 = document61.tag();
        boolean boolean63 = allElements49.matches((org.jsoup.nodes.Element) document52, (org.jsoup.nodes.Element) document61);
        htmlTreeBuilder40.maybeSetBaseUri((org.jsoup.nodes.Element) document61);
        org.jsoup.parser.Token.Comment comment65 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder40.insert(comment65);
        boolean boolean67 = elementList37.remove((java.lang.Object) comment65);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(-1)" + "'", str5, ":gt(-1)");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tokeniser35);
        org.junit.Assert.assertNull(token36);
        org.junit.Assert.assertNotNull(elementList37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "*" + "'", str50, "*");
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(textNodeList57);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        char[] charArray31 = new char[] { 'a', '#', '#' };
        startTag27.appendAttributeValue(charArray31);
        boolean boolean33 = startTag27.isSelfClosing();
        startTag27.tagName = "";
        boolean boolean36 = startTag27.isComment();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = null;
        boolean boolean38 = htmlTreeBuilderState25.process((org.jsoup.parser.Token) startTag27, htmlTreeBuilder37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = startTag27.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, #]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.nodes.Element element6 = document3.removeClass("hi!");
        org.jsoup.nodes.Element element8 = document3.appendText(":first-of-type");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.nodes.Element element11 = element8.appendText(":gt(-1)");
        org.jsoup.select.Evaluator.Class class13 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        boolean boolean17 = tag16.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode21 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node23 = dataNode21.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes24 = dataNode21.attributes();
        org.jsoup.nodes.FormElement formElement25 = new org.jsoup.nodes.FormElement(tag16, ":empty", attributes24);
        org.jsoup.select.Elements elements27 = formElement25.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str31 = document30.data();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document30, "");
        boolean boolean34 = class13.matches((org.jsoup.nodes.Element) formElement25, (org.jsoup.nodes.Element) document30);
        boolean boolean35 = attributeStarting1.matches(element11, (org.jsoup.nodes.Element) document30);
        java.lang.String str36 = document30.location();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        boolean boolean3 = tag2.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode7 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node9 = dataNode7.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes10 = dataNode7.attributes();
        org.jsoup.nodes.FormElement formElement11 = new org.jsoup.nodes.FormElement(tag2, ":empty", attributes10);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj14 = null;
        boolean boolean15 = document13.equals(obj14);
        org.jsoup.nodes.Element element17 = document13.addClass("");
        org.jsoup.nodes.FormElement formElement18 = formElement11.addElement((org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element20 = formElement11.append("[]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(formElement18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader(":gt(-1)");
        boolean boolean30 = characterReader28.matchesIgnoreCase("");
        boolean boolean31 = characterReader28.isEmpty();
        int int33 = characterReader28.nextIndexOf((java.lang.CharSequence) "[<html>\n <head></head>\n <body></body>\n</html>^=#root]");
        htmlTreeBuilder0.reader = characterReader28;
        java.util.List<org.jsoup.parser.Token.Character> characterList35 = htmlTreeBuilder0.getPendingTableCharacters();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(characterList35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Element element26 = htmlTreeBuilder0.getActiveFormattingElement("<:containsOwn(hi!>");
        org.jsoup.nodes.FormElement formElement27 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNull(formElement27);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(":contains(hi!", ":empty");
        org.jsoup.nodes.Element element4 = document2.toggleClass(":empty");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder2.originalState();
        java.lang.String str4 = htmlTreeBuilder2.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int9 = parseErrorList8.getMaxSize();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder2.parse("StartTag", "#root", parseErrorList8);
        org.jsoup.select.Evaluator.AllElements allElements11 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str12 = allElements11.toString();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj15 = null;
        boolean boolean16 = document14.equals(obj15);
        org.jsoup.select.Elements elements18 = document14.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = document14.textNodes();
        document14.title("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag24 = document23.tag();
        boolean boolean25 = allElements11.matches((org.jsoup.nodes.Element) document14, (org.jsoup.nodes.Element) document23);
        boolean boolean26 = isFirstChild0.matches((org.jsoup.nodes.Element) document10, (org.jsoup.nodes.Element) document14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "*" + "'", str12, "*");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(textNodeList19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("[*^=hi!]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body></body>\n</html>", "[*]");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.nodes.Element element6 = document3.removeClass("hi!");
        org.jsoup.nodes.Element element8 = document3.appendText(":first-of-type");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.nodes.Element element11 = element8.appendText(":gt(-1)");
        org.jsoup.select.Evaluator.Class class13 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        boolean boolean17 = tag16.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode21 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node23 = dataNode21.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes24 = dataNode21.attributes();
        org.jsoup.nodes.FormElement formElement25 = new org.jsoup.nodes.FormElement(tag16, ":empty", attributes24);
        org.jsoup.select.Elements elements27 = formElement25.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str31 = document30.data();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document30, "");
        boolean boolean34 = class13.matches((org.jsoup.nodes.Element) formElement25, (org.jsoup.nodes.Element) document30);
        boolean boolean35 = attributeStarting1.matches(element11, (org.jsoup.nodes.Element) document30);
        java.lang.String str36 = attributeStarting1.toString();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder37.originalState();
        java.lang.String str39 = htmlTreeBuilder37.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int44 = parseErrorList43.getMaxSize();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder37.parse("StartTag", "#root", parseErrorList43);
        org.jsoup.select.Evaluator.AllElements allElements46 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str47 = allElements46.toString();
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj50 = null;
        boolean boolean51 = document49.equals(obj50);
        org.jsoup.select.Elements elements53 = document49.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList54 = document49.textNodes();
        document49.title("hi!");
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag59 = document58.tag();
        boolean boolean60 = allElements46.matches((org.jsoup.nodes.Element) document49, (org.jsoup.nodes.Element) document58);
        htmlTreeBuilder37.maybeSetBaseUri((org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Document document64 = htmlTreeBuilder37.parse("[]", ":last-of-type");
        org.jsoup.select.Evaluator.AllElements allElements65 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str66 = allElements65.toString();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj69 = null;
        boolean boolean70 = document68.equals(obj69);
        org.jsoup.select.Elements elements72 = document68.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList73 = document68.textNodes();
        document68.title("hi!");
        org.jsoup.nodes.Document document77 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag78 = document77.tag();
        boolean boolean79 = allElements65.matches((org.jsoup.nodes.Element) document68, (org.jsoup.nodes.Element) document77);
        org.jsoup.nodes.Element element81 = document68.removeClass(":last-of-type");
        boolean boolean82 = attributeStarting1.matches((org.jsoup.nodes.Element) document64, (org.jsoup.nodes.Element) document68);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[^<:containsOwn(hi!>]" + "'", str36, "[^<:containsOwn(hi!>]");
        org.junit.Assert.assertNull(htmlTreeBuilderState38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "*" + "'", str47, "*");
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(textNodeList54);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "*" + "'", str66, "*");
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNotNull(textNodeList73);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder0.insert(comment25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj30 = null;
        boolean boolean31 = document29.equals(obj30);
        org.jsoup.nodes.Element element33 = document29.addClass("");
        org.jsoup.nodes.Document.QuirksMode quirksMode34 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document35 = document29.quirksMode(quirksMode34);
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag38 = document37.tag();
        org.jsoup.nodes.Element element40 = document37.removeClass("hi!");
        boolean boolean42 = document37.hasAttr(" data=\"\"");
        org.jsoup.nodes.Element element43 = document35.prependChild((org.jsoup.nodes.Node) document37);
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document35);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        char[] charArray49 = new char[] { 'a', '#', '#' };
        startTag45.appendAttributeValue(charArray49);
        boolean boolean51 = startTag45.isSelfClosing();
        startTag45.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + quirksMode34 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode34.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[a, #, #]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean27 = htmlTreeBuilder0.framesetOk();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder0.insert(comment25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Node node30 = element27.attr("\n<!--:first-of-type-->", "");
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild66 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean67 = elementList9.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element68 = elementList9.pollLast();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader(":gt(-1)");
        boolean boolean30 = characterReader28.matchesIgnoreCase("");
        boolean boolean31 = characterReader28.isEmpty();
        int int33 = characterReader28.nextIndexOf((java.lang.CharSequence) "[<html>\n <head></head>\n <body></body>\n</html>^=#root]");
        htmlTreeBuilder0.reader = characterReader28;
        boolean boolean35 = htmlTreeBuilder0.framesetOk();
        java.lang.String[] strArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = htmlTreeBuilder0.inScope(strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.tagName = ":gt(-1)";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj7 = null;
        boolean boolean8 = document6.equals(obj7);
        boolean boolean10 = document6.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document12 = document6.outputSettings(outputSettings11);
        htmlTreeBuilder4.pushActiveFormattingElements((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj16 = null;
        boolean boolean17 = document15.equals(obj16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document15.siblingNodes();
        org.jsoup.nodes.Element element20 = document15.removeClass("");
        boolean boolean21 = htmlTreeBuilder4.isInActiveFormattingElements(element20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(":first-child", "</<html>\n <head></head>\n <body></body>\n</html>>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState27);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.nodes.Element element6 = document3.removeClass("hi!");
        org.jsoup.nodes.Element element8 = document3.appendText(":first-of-type");
        org.jsoup.nodes.Node node9 = element8.previousSibling();
        org.jsoup.nodes.Element element11 = element8.appendText(":gt(-1)");
        org.jsoup.select.Evaluator.Class class13 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        boolean boolean17 = tag16.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode21 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node23 = dataNode21.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes24 = dataNode21.attributes();
        org.jsoup.nodes.FormElement formElement25 = new org.jsoup.nodes.FormElement(tag16, ":empty", attributes24);
        org.jsoup.select.Elements elements27 = formElement25.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str31 = document30.data();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document30, "");
        boolean boolean34 = class13.matches((org.jsoup.nodes.Element) formElement25, (org.jsoup.nodes.Element) document30);
        boolean boolean35 = attributeStarting1.matches(element11, (org.jsoup.nodes.Element) document30);
        org.jsoup.nodes.Element element36 = null;
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag39 = document38.tag();
        org.jsoup.nodes.Element element41 = document38.appendText("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList42 = element41.textNodes();
        org.jsoup.nodes.Element element43 = element41.clone();
        boolean boolean44 = attributeStarting1.matches(element36, element43);
        java.lang.String str45 = attributeStarting1.toString();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(textNodeList42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[^<:containsOwn(hi!>]" + "'", str45, "[^<:containsOwn(hi!>]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Tokeniser tokeniser8 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Tokeniser tokeniser9 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = null;
        xmlTreeBuilder10.doc = document11;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder10.initialiseParse("", "hi!", parseErrorList15);
        org.jsoup.parser.Tokeniser tokeniser17 = xmlTreeBuilder10.tokeniser;
        org.jsoup.parser.Token token18 = xmlTreeBuilder10.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList19 = xmlTreeBuilder10.stack;
        org.jsoup.nodes.Element element20 = elementList19.element();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str23 = document22.data();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag26 = document25.tag();
        org.jsoup.nodes.Element element28 = document25.appendText("");
        java.lang.String str29 = element28.baseUri();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str34 = document33.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj38 = null;
        boolean boolean39 = document37.equals(obj38);
        boolean boolean41 = document37.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document43 = document37.outputSettings(outputSettings42);
        htmlTreeBuilder35.pushActiveFormattingElements((org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj49 = null;
        boolean boolean50 = document48.equals(obj49);
        org.jsoup.nodes.Element element52 = document48.addClass("");
        java.lang.String str53 = document48.location();
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj56 = null;
        boolean boolean57 = document55.equals(obj56);
        java.lang.String[] strArray65 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.jsoup.nodes.Element element68 = document55.classNames((java.util.Set<java.lang.String>) strSet66);
        org.jsoup.nodes.Element[] elementArray69 = new org.jsoup.nodes.Element[] { document22, element28, document31, document33, document37, document46, document48, document55 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList70 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList70, elementArray69);
        java.lang.Object obj72 = elementList70.clone();
        int int73 = elementList19.indexOf((java.lang.Object) elementList70);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild76 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean77 = elementList19.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element78 = elementList19.remove();
        org.jsoup.nodes.Element element79 = elementList19.peekFirst();
        xmlTreeBuilder0.stack = elementList19;
        org.jsoup.nodes.Document document82 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj83 = null;
        boolean boolean84 = document82.equals(obj83);
        org.jsoup.nodes.Element element86 = document82.addClass("");
        org.jsoup.nodes.Node node87 = element86.parent();
        org.jsoup.nodes.Element element89 = element86.prepend(":first-child");
        boolean boolean90 = elementList19.offerFirst(element89);
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNotNull(tokeniser8);
        org.junit.Assert.assertNotNull(tokeniser9);
        org.junit.Assert.assertNotNull(tokeniser17);
        org.junit.Assert.assertNull(token18);
        org.junit.Assert.assertNotNull(elementList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elementArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNull(element79);
        org.junit.Assert.assertNotNull(document82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        boolean boolean7 = document3.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document9 = document3.outputSettings(outputSettings8);
        htmlTreeBuilder1.pushActiveFormattingElements((org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element12 = document3.val("[<html>\n <head></head>\n <body></body>\n</html>^=#root]");
        document3.title(":empty");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(" data=\"\" #root=\":first-of-type\"", (org.jsoup.nodes.Element) document3, "[]");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = document3.dataNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(dataNodeList17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str3 = document2.data();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document2, "");
        java.lang.String str6 = document2.title();
        org.jsoup.nodes.Document document7 = document2.ownerDocument();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.parser.ParseError[] parseErrorArray9 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList10 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10, parseErrorArray9);
        org.jsoup.nodes.Node[] nodeArray12 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList13 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList13, nodeArray12);
        boolean boolean15 = parseErrorList10.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList13);
        java.lang.Object[] objArray16 = parseErrorList10.toArray();
        java.lang.String str18 = org.jsoup.helper.StringUtil.join((java.util.Collection) parseErrorList10, ":first-of-type");
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj21 = null;
        boolean boolean22 = document20.equals(obj21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document20.siblingNodes();
        boolean boolean25 = parseErrorList10.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        boolean boolean26 = parseErrorList6.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList24);
        java.lang.Object[] objArray27 = parseErrorList6.toArray();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("[*^=hi!]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        java.util.List<org.jsoup.parser.Token.Character> characterList25 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder0.originalState();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(characterList25);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.select.Elements elements7 = document3.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document3.textNodes();
        document3.title("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        boolean boolean14 = allElements0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = allElements0.matches(element15, (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag26 = document25.tag();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag26, ":gt(-1)");
        boolean boolean29 = allElements0.matches(element23, element28);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = element28.textNodes();
        org.jsoup.helper.Validate.notNull((java.lang.Object) textNodeList30, "*");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(textNodeList30);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan4 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str5 = indexGreaterThan4.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str8 = document7.data();
        org.jsoup.nodes.Element element10 = document7.text(":first-of-type");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        boolean boolean17 = indexGreaterThan4.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element18 = document7.head();
        htmlTreeBuilder0.pushActiveFormattingElements(element18);
        boolean boolean20 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.select.Evaluator.IndexEquals indexEquals23 = new org.jsoup.select.Evaluator.IndexEquals((-1));
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan25 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str29 = document28.data();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document28, "");
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj34 = null;
        boolean boolean35 = document33.equals(obj34);
        java.lang.String str36 = document33.ownText();
        boolean boolean37 = indexGreaterThan25.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document33);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState39 = htmlTreeBuilder38.originalState();
        boolean boolean40 = htmlTreeBuilder38.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan42 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str43 = indexGreaterThan42.toString();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str46 = document45.data();
        org.jsoup.nodes.Element element48 = document45.text(":first-of-type");
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj51 = null;
        boolean boolean52 = document50.equals(obj51);
        org.jsoup.nodes.Element element54 = document50.addClass("");
        boolean boolean55 = indexGreaterThan42.matches((org.jsoup.nodes.Element) document45, (org.jsoup.nodes.Element) document50);
        org.jsoup.nodes.Element element56 = document45.head();
        htmlTreeBuilder38.pushActiveFormattingElements(element56);
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("Doctype", "");
        boolean boolean61 = htmlTreeBuilder38.isInActiveFormattingElements((org.jsoup.nodes.Element) document60);
        boolean boolean62 = indexEquals23.matches((org.jsoup.nodes.Element) document33, (org.jsoup.nodes.Element) document60);
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document60);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":gt(-1)" + "'", str5, ":gt(-1)");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ":gt(-1)" + "'", str43, ":gt(-1)");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.safety.Whitelist whitelist2 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.removeClass("hi!");
        org.jsoup.nodes.Element element9 = document4.appendText(":first-of-type");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document4.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.jsoup.Jsoup.clean("<html>\n <head></head>\n <body></body>\n</html>", "*", whitelist2, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        org.jsoup.nodes.Element element52 = elementList49.peek();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment(" data=\"\"");
        org.jsoup.nodes.Element element4 = document1.attr("*", ":first-of-type");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.select.Elements elements7 = document3.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document3.textNodes();
        document3.title("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        boolean boolean14 = allElements0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = allElements0.matches(element15, (org.jsoup.nodes.Element) document18);
        java.lang.String str23 = document18.className();
        java.lang.String str24 = document18.nodeName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        boolean boolean5 = tag4.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode9 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node11 = dataNode9.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes12 = dataNode9.attributes();
        org.jsoup.nodes.FormElement formElement13 = new org.jsoup.nodes.FormElement(tag4, ":empty", attributes12);
        org.jsoup.select.Elements elements15 = formElement13.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = class1.matches((org.jsoup.nodes.Element) formElement13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Elements elements23 = formElement13.elements();
        boolean boolean25 = formElement13.hasClass(":contains(hi!");
        org.jsoup.select.Elements elements26 = formElement13.elements();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        boolean boolean5 = tag4.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode9 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node11 = dataNode9.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes12 = dataNode9.attributes();
        org.jsoup.nodes.FormElement formElement13 = new org.jsoup.nodes.FormElement(tag4, ":empty", attributes12);
        org.jsoup.select.Elements elements15 = formElement13.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = class1.matches((org.jsoup.nodes.Element) formElement13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Elements elements23 = formElement13.elements();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj26 = null;
        boolean boolean27 = document25.equals(obj26);
        org.jsoup.nodes.Element element29 = document25.addClass("");
        java.lang.String str30 = document25.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList31 = document25.dataNodes();
        org.jsoup.nodes.Element element33 = document25.removeClass(":empty");
        boolean boolean34 = formElement13.equals((java.lang.Object) ":empty");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(dataNodeList31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.error(htmlTreeBuilderState25);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        htmlTreeBuilder0.error(htmlTreeBuilderState27);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        boolean boolean5 = tag4.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode9 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node11 = dataNode9.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes12 = dataNode9.attributes();
        org.jsoup.nodes.FormElement formElement13 = new org.jsoup.nodes.FormElement(tag4, ":empty", attributes12);
        org.jsoup.select.Elements elements15 = formElement13.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = class1.matches((org.jsoup.nodes.Element) formElement13, (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element24 = document18.text("</<html> <head></head> <body></body> </html>>");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.nodes.Node[] nodeArray3 = new org.jsoup.nodes.Node[] {};
        java.util.ArrayList<org.jsoup.nodes.Node> nodeList4 = new java.util.ArrayList<org.jsoup.nodes.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4, nodeArray3);
        boolean boolean6 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.nodes.Node>) nodeList4);
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan8 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan10 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str14 = document13.data();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document13, "");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj19 = null;
        boolean boolean20 = document18.equals(obj19);
        java.lang.String str21 = document18.ownText();
        boolean boolean22 = indexGreaterThan10.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray23 = new org.jsoup.select.Evaluator.IndexGreaterThan[] { indexGreaterThan8, indexGreaterThan10 };
        org.jsoup.select.Evaluator.IndexGreaterThan[] indexGreaterThanArray24 = parseErrorList1.toArray(indexGreaterThanArray23);
        parseErrorList1.clear();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.prettyPrint(true);
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings35.escapeMode(escapeMode36);
        boolean boolean38 = parseErrorList1.contains((java.lang.Object) outputSettings37);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator39 = parseErrorList1.spliterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(indexGreaterThanArray23);
        org.junit.Assert.assertNotNull(indexGreaterThanArray24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseErrorSpliterator39);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        java.util.List<org.jsoup.parser.Token.Character> characterList25 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState26);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(characterList25);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState26);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.select.Elements elements7 = document3.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document3.textNodes();
        document3.title("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag13 = document12.tag();
        boolean boolean14 = allElements0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = allElements0.matches(element15, (org.jsoup.nodes.Element) document18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = document18.getElementsByAttributeValueStarting("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str2 = indexGreaterThan1.toString();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str5 = document4.data();
        org.jsoup.nodes.Element element7 = document4.text(":first-of-type");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj10 = null;
        boolean boolean11 = document9.equals(obj10);
        org.jsoup.nodes.Element element13 = document9.addClass("");
        boolean boolean14 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = null;
        xmlTreeBuilder16.doc = document17;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder16.initialiseParse("", "hi!", parseErrorList21);
        org.jsoup.parser.Tokeniser tokeniser23 = xmlTreeBuilder16.tokeniser;
        org.jsoup.parser.Token token24 = xmlTreeBuilder16.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList25 = xmlTreeBuilder16.stack;
        org.jsoup.nodes.Element element26 = elementList25.element();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str29 = document28.data();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag32 = document31.tag();
        org.jsoup.nodes.Element element34 = document31.appendText("");
        java.lang.String str35 = element34.baseUri();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str40 = document39.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj44 = null;
        boolean boolean45 = document43.equals(obj44);
        boolean boolean47 = document43.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document49 = document43.outputSettings(outputSettings48);
        htmlTreeBuilder41.pushActiveFormattingElements((org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj55 = null;
        boolean boolean56 = document54.equals(obj55);
        org.jsoup.nodes.Element element58 = document54.addClass("");
        java.lang.String str59 = document54.location();
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj62 = null;
        boolean boolean63 = document61.equals(obj62);
        java.lang.String[] strArray71 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        org.jsoup.nodes.Element element74 = document61.classNames((java.util.Set<java.lang.String>) strSet72);
        org.jsoup.nodes.Element[] elementArray75 = new org.jsoup.nodes.Element[] { document28, element34, document37, document39, document43, document52, document54, document61 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList76 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList76, elementArray75);
        java.lang.Object obj78 = elementList76.clone();
        int int79 = elementList25.indexOf((java.lang.Object) elementList76);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild82 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean83 = elementList25.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element84 = elementList25.remove();
        java.util.List<org.jsoup.nodes.Node> nodeList85 = element84.childNodes();
        org.jsoup.nodes.Element element86 = document4.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Node>) nodeList85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(-1)" + "'", str2, ":gt(-1)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tokeniser23);
        org.junit.Assert.assertNull(token24);
        org.junit.Assert.assertNotNull(elementList25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(elementArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(nodeList85);
        org.junit.Assert.assertNotNull(element86);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Element element26 = htmlTreeBuilder0.getActiveFormattingElement("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag29 = document28.tag();
        org.jsoup.nodes.Element element31 = document28.removeClass("hi!");
        java.lang.String str32 = document28.html();
        boolean boolean33 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str32, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag4 = document3.tag();
        boolean boolean5 = tag4.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode9 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node11 = dataNode9.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes12 = dataNode9.attributes();
        org.jsoup.nodes.FormElement formElement13 = new org.jsoup.nodes.FormElement(tag4, ":empty", attributes12);
        org.jsoup.select.Elements elements15 = formElement13.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str19 = document18.data();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document18, "");
        boolean boolean22 = class1.matches((org.jsoup.nodes.Element) formElement13, (org.jsoup.nodes.Element) document18);
        org.jsoup.select.Elements elements24 = document18.getElementsMatchingText("[[<html>\n <head></head>\n <body></body>\n</html>^=#root]]");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.TreeBuilder treeBuilder1 = parser0.getTreeBuilder();
        org.jsoup.nodes.Document document4 = parser0.parseInput("Doctype", "[:gt(-1)$=starttag]");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(treeBuilder1);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType54 = new org.jsoup.select.Evaluator.IsNthOfType(2, 0);
        boolean boolean55 = elementList49.removeFirstOccurrence((java.lang.Object) isNthOfType54);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder0.insert(comment25);
        java.lang.String str27 = comment25.toString();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan(0);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        org.jsoup.nodes.Element element7 = document3.addClass("");
        org.jsoup.nodes.Node node8 = element7.parent();
        org.jsoup.nodes.Element element10 = element7.prepend(":first-child");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.nodes.Element element16 = document12.addClass("");
        org.jsoup.nodes.Element element18 = element16.appendText("");
        java.lang.String str19 = element18.ownText();
        boolean boolean20 = indexLessThan1.matches(element7, element18);
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting22 = new org.jsoup.select.Evaluator.AttributeStarting("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag25 = document24.tag();
        org.jsoup.nodes.Element element27 = document24.removeClass("hi!");
        org.jsoup.nodes.Element element29 = document24.appendText(":first-of-type");
        org.jsoup.nodes.Node node30 = element29.previousSibling();
        org.jsoup.nodes.Element element32 = element29.appendText(":gt(-1)");
        org.jsoup.select.Evaluator.Class class34 = new org.jsoup.select.Evaluator.Class("#comment");
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag37 = document36.tag();
        boolean boolean38 = tag37.preserveWhitespace();
        org.jsoup.nodes.DataNode dataNode42 = new org.jsoup.nodes.DataNode("", "");
        org.jsoup.nodes.Node node44 = dataNode42.removeAttr(":first-of-type");
        org.jsoup.nodes.Attributes attributes45 = dataNode42.attributes();
        org.jsoup.nodes.FormElement formElement46 = new org.jsoup.nodes.FormElement(tag37, ":empty", attributes45);
        org.jsoup.select.Elements elements48 = formElement46.getElementsByAttribute(":empty");
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str52 = document51.data();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = org.jsoup.parser.Parser.parseFragment(":gt(-1)", (org.jsoup.nodes.Element) document51, "");
        boolean boolean55 = class34.matches((org.jsoup.nodes.Element) formElement46, (org.jsoup.nodes.Element) document51);
        boolean boolean56 = attributeStarting22.matches(element32, (org.jsoup.nodes.Element) document51);
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj59 = null;
        boolean boolean60 = document58.equals(obj59);
        boolean boolean62 = document58.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document64 = document58.outputSettings(outputSettings63);
        java.lang.String str65 = document64.title();
        boolean boolean66 = indexLessThan1.matches(element32, (org.jsoup.nodes.Element) document64);
        java.lang.String str67 = indexLessThan1.toString();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + ":lt(0)" + "'", str67, ":lt(0)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        java.lang.String str1 = isOnlyChild0.toString();
        java.lang.String str2 = isOnlyChild0.toString();
        java.lang.String str3 = isOnlyChild0.toString();
        java.lang.String str4 = isOnlyChild0.toString();
        java.lang.String str5 = isOnlyChild0.toString();
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText7 = new org.jsoup.select.Evaluator.ContainsOwnText("hi!");
        java.lang.String str8 = containsOwnText7.toString();
        java.lang.String str9 = containsOwnText7.toString();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj12 = null;
        boolean boolean13 = document11.equals(obj12);
        org.jsoup.nodes.Element element15 = document11.addClass("");
        org.jsoup.nodes.Element element17 = element15.appendText("");
        java.lang.String str18 = element15.toString();
        org.jsoup.select.Evaluator.IsEmpty isEmpty19 = new org.jsoup.select.Evaluator.IsEmpty();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        org.jsoup.nodes.Element element24 = document21.getElementById("<:containsOwn(hi!>");
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag27 = document26.tag();
        org.jsoup.nodes.Element element29 = document26.appendText("");
        org.jsoup.select.Elements elements30 = element29.children();
        boolean boolean31 = isEmpty19.matches(element24, element29);
        boolean boolean32 = containsOwnText7.matches(element15, element29);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder33.originalState();
        boolean boolean35 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan37 = new org.jsoup.select.Evaluator.IndexGreaterThan((-1));
        java.lang.String str38 = indexGreaterThan37.toString();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str41 = document40.data();
        org.jsoup.nodes.Element element43 = document40.text(":first-of-type");
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        org.jsoup.nodes.Element element49 = document45.addClass("");
        boolean boolean50 = indexGreaterThan37.matches((org.jsoup.nodes.Element) document40, (org.jsoup.nodes.Element) document45);
        org.jsoup.nodes.Element element51 = document40.head();
        htmlTreeBuilder33.pushActiveFormattingElements(element51);
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("Doctype", "");
        boolean boolean56 = htmlTreeBuilder33.isInActiveFormattingElements((org.jsoup.nodes.Element) document55);
        org.jsoup.nodes.Element element58 = document55.append("[]");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList59 = element58.textNodes();
        org.jsoup.select.Elements elements62 = element58.getElementsByAttributeValueStarting("#comment", ":empty");
        boolean boolean63 = isOnlyChild0.matches(element15, element58);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-child" + "'", str2, ":only-child");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":only-child" + "'", str3, ":only-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":only-child" + "'", str4, ":only-child");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":only-child" + "'", str5, ":only-child");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":containsOwn(hi!" + "'", str8, ":containsOwn(hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ":containsOwn(hi!" + "'", str9, ":containsOwn(hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ":gt(-1)" + "'", str38, ":gt(-1)");
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(textNodeList59);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj4 = null;
        boolean boolean5 = document3.equals(obj4);
        boolean boolean7 = document3.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document9 = document3.outputSettings(outputSettings8);
        htmlTreeBuilder1.pushActiveFormattingElements((org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element12 = document3.val("[<html>\n <head></head>\n <body></body>\n</html>^=#root]");
        document3.title(":empty");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment(" data=\"\" #root=\":first-of-type\"", (org.jsoup.nodes.Element) document3, "[]");
        org.jsoup.nodes.Document document17 = document3.ownerDocument();
        org.jsoup.nodes.Element element18 = document17.body();
        org.jsoup.nodes.Node node20 = element18.after(":matches(null");
        org.jsoup.nodes.Element element22 = element18.val("#document");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild66 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean67 = elementList9.remove((java.lang.Object) ' ');
        org.jsoup.nodes.Element element68 = elementList9.remove();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor69 = elementList9.iterator();
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elementItor69);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild66 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (byte) -1, (int) ' ');
        boolean boolean67 = elementList9.remove((java.lang.Object) ' ');
        java.lang.Object[] objArray68 = elementList9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor70 = elementList9.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        java.lang.String str2 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking((int) '#');
        int int7 = parseErrorList6.getMaxSize();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.parse("StartTag", "#root", parseErrorList6);
        org.jsoup.select.Evaluator.AllElements allElements9 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str10 = allElements9.toString();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj13 = null;
        boolean boolean14 = document12.equals(obj13);
        org.jsoup.select.Elements elements16 = document12.getElementsByIndexEquals((int) ' ');
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document12.textNodes();
        document12.title("hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag22 = document21.tag();
        boolean boolean23 = allElements9.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document21);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document21);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        htmlTreeBuilder0.insert(comment25);
        org.jsoup.parser.CharacterReader characterReader28 = new org.jsoup.parser.CharacterReader(":gt(-1)");
        characterReader28.rewindToMark();
        boolean boolean30 = characterReader28.matchesLetter();
        java.lang.String str31 = characterReader28.consumeDigitSequence();
        int int32 = characterReader28.pos();
        htmlTreeBuilder0.reader = characterReader28;
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "*" + "'", str10, "*");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.nodes.Element element7 = document4.appendText("");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj17 = null;
        boolean boolean18 = document16.equals(obj17);
        boolean boolean20 = document16.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document22 = document16.outputSettings(outputSettings21);
        htmlTreeBuilder14.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        org.jsoup.nodes.Element element31 = document27.addClass("");
        java.lang.String str32 = document27.location();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj35 = null;
        boolean boolean36 = document34.equals(obj35);
        java.lang.String[] strArray44 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document34.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element[] elementArray48 = new org.jsoup.nodes.Element[] { document1, element7, document10, document12, document16, document25, document27, document34 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList49 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList49, elementArray48);
        java.lang.Object obj51 = elementList49.clone();
        int int52 = elementList49.size();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag55 = document54.tag();
        org.jsoup.nodes.Element element57 = document54.appendText("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList58 = element57.textNodes();
        boolean boolean59 = elementList49.contains((java.lang.Object) textNodeList58);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elementArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(textNodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = null;
        xmlTreeBuilder0.doc = document1;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList5);
        org.jsoup.parser.Tokeniser tokeniser7 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Token token8 = xmlTreeBuilder0.currentToken;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList9 = xmlTreeBuilder0.stack;
        org.jsoup.nodes.Element element10 = elementList9.element();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str13 = document12.data();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag16 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.appendText("");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str24 = document23.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj28 = null;
        boolean boolean29 = document27.equals(obj28);
        boolean boolean31 = document27.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document33 = document27.outputSettings(outputSettings32);
        htmlTreeBuilder25.pushActiveFormattingElements((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj39 = null;
        boolean boolean40 = document38.equals(obj39);
        org.jsoup.nodes.Element element42 = document38.addClass("");
        java.lang.String str43 = document38.location();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj46 = null;
        boolean boolean47 = document45.equals(obj46);
        java.lang.String[] strArray55 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.jsoup.nodes.Element element58 = document45.classNames((java.util.Set<java.lang.String>) strSet56);
        org.jsoup.nodes.Element[] elementArray59 = new org.jsoup.nodes.Element[] { document12, element18, document21, document23, document27, document36, document38, document45 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList60 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList60, elementArray59);
        java.lang.Object obj62 = elementList60.clone();
        int int63 = elementList9.indexOf((java.lang.Object) elementList60);
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj66 = null;
        boolean boolean67 = document65.equals(obj66);
        org.jsoup.nodes.Element element69 = document65.addClass("");
        java.lang.String str70 = document65.location();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList71 = document65.dataNodes();
        elementList60.addLast((org.jsoup.nodes.Element) document65);
        org.jsoup.nodes.Element element73 = elementList60.getLast();
        boolean boolean74 = element73.hasText();
        org.jsoup.select.Elements elements77 = element73.getElementsByAttributeValueStarting(":last-of-type", "#document");
        org.junit.Assert.assertNotNull(tokeniser7);
        org.junit.Assert.assertNull(token8);
        org.junit.Assert.assertNotNull(elementList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elementArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[<html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body>\n  [:gt(-1)$=starttag]\n </body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>, <html>\n <head></head>\n <body></body>\n</html>]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(dataNodeList71);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(elements77);
    }
}

