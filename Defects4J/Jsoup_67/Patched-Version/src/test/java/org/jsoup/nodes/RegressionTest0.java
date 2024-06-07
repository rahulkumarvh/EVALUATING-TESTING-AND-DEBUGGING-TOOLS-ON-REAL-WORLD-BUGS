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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = parser1.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements5 = document4.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.filter(nodeFilter0, elements5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.Token token11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.process(token11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.after("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements6.before("EndTag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements10 = elements8.append("#root");
        xmlTreeBuilder1.stack = elements10;
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder1.settings = parseSettings12;
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings12);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = parser14.parseInput(reader15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.select.Elements elements12 = document9.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements14 = elements12.append("#root");
        xmlTreeBuilder5.stack = elements14;
        org.jsoup.parser.ParseSettings parseSettings16 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder5.settings = parseSettings16;
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader1, "", parseErrorList3, parseSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        boolean boolean5 = xmlTreeBuilder0.processStartTag("#root");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Element element14 = document11.prepend("hi!");
        java.lang.String str15 = element14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document6.before((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.nextAll("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements4 = document3.children();
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = elements4.prevAll("<!---->");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<!---->': unexpected token at '<!---->'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        java.util.List<java.lang.String> strList10 = elements8.eachAttr("<!---->");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        boolean boolean8 = element7.hasParent();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        org.jsoup.select.Elements elements21 = element20.siblingElements();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node9 = document5.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element17 = document14.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild18 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean19 = element17.is((org.jsoup.select.Evaluator) isFirstChild18);
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueMatching("hi!", pattern21);
        org.jsoup.nodes.Element element24 = element17.toggleClass("EndTag");
        boolean boolean25 = element24.isBlock();
        boolean boolean26 = tagEndsWith1.matches((org.jsoup.nodes.Element) document5, element24);
        org.jsoup.nodes.Element element29 = element24.attr("oot", true);
        java.lang.Class<?> wildcardClass30 = element29.getClass();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings11 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str13 = parseSettings11.normalizeTag("");
        xmlTreeBuilder0.settings = parseSettings11;
        org.jsoup.parser.Token.Doctype doctype15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        xmlTreeBuilder0.reader = characterReader4;
        java.lang.String str6 = xmlTreeBuilder0.baseUri;
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("oot", "r");
        java.io.Reader reader10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "");
        org.jsoup.parser.CharacterReader characterReader16 = null;
        xmlTreeBuilder12.reader = characterReader16;
        org.jsoup.nodes.Attributes attributes19 = null;
        boolean boolean20 = xmlTreeBuilder12.processStartTag("#root", attributes19);
        org.jsoup.parser.Tokeniser tokeniser21 = null;
        xmlTreeBuilder12.tokeniser = tokeniser21;
        org.jsoup.parser.ParseErrorList parseErrorList27 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("", "");
        org.jsoup.parser.Tag tag33 = document32.tag();
        org.jsoup.select.Elements elements35 = document32.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements37 = elements35.append("#root");
        xmlTreeBuilder28.stack = elements37;
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder12.parseFragment("hi!", "#root", parseErrorList27, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document42 = xmlTreeBuilder0.parse(reader10, "", parseErrorList27, parseSettings41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jsoup.nodes.DocumentType documentType3 = new org.jsoup.nodes.DocumentType("hi!", "", "");
        boolean boolean5 = documentType3.hasAttr(":first-child");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "");
        org.jsoup.select.Elements elements11 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Element element13 = document10.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild14 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean15 = element13.is((org.jsoup.select.Evaluator) isFirstChild14);
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueMatching("hi!", pattern17);
        int int19 = element13.childNodeSize();
        java.lang.String str20 = element13.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType3.after((org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("<!---->", "#root");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith5 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.select.Elements elements12 = document9.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node13 = document9.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element21 = document18.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild22 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean23 = element21.is((org.jsoup.select.Evaluator) isFirstChild22);
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValueMatching("hi!", pattern25);
        org.jsoup.nodes.Element element28 = element21.toggleClass("EndTag");
        boolean boolean29 = element28.isBlock();
        boolean boolean30 = tagEndsWith5.matches((org.jsoup.nodes.Element) document9, element28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        java.nio.charset.Charset charset33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax35 = outputSettings31.syntax();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document document38 = document9.outputSettings(outputSettings37);
        org.jsoup.nodes.Document document39 = document3.outputSettings(outputSettings37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings37.charset("oot");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: oot");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + syntax35 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax35.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document39);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "");
        org.jsoup.select.Elements elements11 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Element element13 = document10.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild14 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean15 = element13.is((org.jsoup.select.Evaluator) isFirstChild14);
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueMatching("hi!", pattern17);
        int int19 = parseErrorList5.indexOf((java.lang.Object) "hi!");
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.parser.Tag tag26 = document25.tag();
        org.jsoup.select.Elements elements28 = document25.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements30 = elements28.append("#root");
        xmlTreeBuilder21.stack = elements30;
        org.jsoup.parser.ParseSettings parseSettings32 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder21.settings = parseSettings32;
        org.jsoup.parser.Parser parser34 = parser20.settings(parseSettings32);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("", "");
        org.jsoup.parser.CharacterReader characterReader39 = null;
        xmlTreeBuilder35.reader = characterReader39;
        org.jsoup.nodes.Attributes attributes42 = null;
        boolean boolean43 = xmlTreeBuilder35.processStartTag("#root", attributes42);
        org.jsoup.parser.Tokeniser tokeniser44 = null;
        xmlTreeBuilder35.tokeniser = tokeniser44;
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document55 = xmlTreeBuilder52.parse("", "");
        org.jsoup.parser.Tag tag56 = document55.tag();
        org.jsoup.select.Elements elements58 = document55.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements60 = elements58.append("#root");
        xmlTreeBuilder51.stack = elements60;
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder35.parseFragment("hi!", "#root", parseErrorList50, parseSettings62);
        org.jsoup.parser.Parser parser64 = parser34.settings(parseSettings62);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader1, "EndTag", parseErrorList5, parseSettings62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parser64);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Node node15 = document13.root();
        boolean boolean16 = elements6.remove((java.lang.Object) document13);
        org.jsoup.select.Elements elements18 = document13.getElementsByIndexLessThan((int) '#');
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node9 = document5.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element17 = document14.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild18 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean19 = element17.is((org.jsoup.select.Evaluator) isFirstChild18);
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueMatching("hi!", pattern21);
        org.jsoup.nodes.Element element24 = element17.toggleClass("EndTag");
        boolean boolean25 = element24.isBlock();
        boolean boolean26 = tagEndsWith1.matches((org.jsoup.nodes.Element) document5, element24);
        java.lang.String str27 = tagEndsWith1.toString();
        java.lang.String str28 = tagEndsWith1.toString();
        java.lang.Class<?> wildcardClass29 = tagEndsWith1.getClass();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.parser.CharacterReader characterReader8 = null;
        xmlTreeBuilder4.reader = characterReader8;
        org.jsoup.nodes.Attributes attributes11 = null;
        boolean boolean12 = xmlTreeBuilder4.processStartTag("#root", attributes11);
        org.jsoup.parser.Tokeniser tokeniser13 = null;
        xmlTreeBuilder4.tokeniser = tokeniser13;
        org.jsoup.parser.ParseErrorList parseErrorList19 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("", "");
        org.jsoup.parser.Tag tag25 = document24.tag();
        org.jsoup.select.Elements elements27 = document24.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements29 = elements27.append("#root");
        xmlTreeBuilder20.stack = elements29;
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder4.parseFragment("hi!", "#root", parseErrorList19, parseSettings31);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader1, "<EndTag></EndTag>", parseErrorList3, parseSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Element element8 = document5.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild9 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean10 = element8.is((org.jsoup.select.Evaluator) isFirstChild9);
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueMatching("hi!", pattern12);
        org.jsoup.nodes.Element element15 = element8.toggleClass("EndTag");
        org.jsoup.nodes.Element element17 = element15.selectFirst("#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("", "");
        java.lang.String str22 = document21.tagName();
        boolean boolean23 = document21.isBlock();
        org.jsoup.nodes.Element element25 = document21.appendText("");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element15, (org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Node node15 = document13.root();
        boolean boolean16 = elements6.remove((java.lang.Object) document13);
        int int17 = elements6.size();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node9 = document5.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element17 = document14.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild18 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean19 = element17.is((org.jsoup.select.Evaluator) isFirstChild18);
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueMatching("hi!", pattern21);
        org.jsoup.nodes.Element element24 = element17.toggleClass("EndTag");
        boolean boolean25 = element24.isBlock();
        boolean boolean26 = tagEndsWith1.matches((org.jsoup.nodes.Element) document5, element24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean28 = outputSettings27.prettyPrint();
        java.nio.charset.Charset charset29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings27.charset(charset29);
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax31 = outputSettings27.syntax();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = outputSettings27.prettyPrint(true);
        org.jsoup.nodes.Document document34 = document5.outputSettings(outputSettings33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings33.charset("r");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: r");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + syntax31 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax31.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings33);
        org.junit.Assert.assertNotNull(document34);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Node node7 = document5.clearAttributes();
        org.jsoup.nodes.Node node8 = document5.root();
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element17 = document14.prepend("hi!");
        org.jsoup.nodes.Element element18 = document5.appendTo(element17);
        org.jsoup.select.Elements elements21 = element17.getElementsByAttributeValueEnding("r", "SYSTEM");
        xmlTreeBuilder0.stack = elements21;
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings13 = new org.jsoup.parser.ParseSettings(true, true);
        xmlTreeBuilder0.settings = parseSettings13;
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.select.Elements elements12 = elements9.prev("EndTag");
        org.jsoup.select.Elements elements14 = elements9.html("#comment");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements51 = document34.getElementsByAttributeValueContaining("hi!", "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        boolean boolean21 = element17.isBlock();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        org.jsoup.nodes.Node node18 = element16.nextSibling();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements51 = document34.getElementsByAttributeValueMatching("org.jsoup.SerializationException", "EndTag");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        org.jsoup.select.Elements elements19 = document4.getElementsByTag("<!---->");
        java.lang.String str20 = document4.tagName();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("r", "SYSTEM");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = document2.outputSettings(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("");
        boolean boolean3 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document2);
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.aboveOnStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Element element4 = document3.empty();
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str7 = element4.id();
        boolean boolean8 = element4.isBlock();
        org.jsoup.nodes.Element element9 = element4.nextElementSibling();
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText11 = new org.jsoup.select.Evaluator.ContainsOwnText("");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild14 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "");
        org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Node node21 = document19.clearAttributes();
        org.jsoup.nodes.Node node22 = document19.root();
        org.jsoup.nodes.Element element23 = document19.empty();
        org.jsoup.nodes.Element element24 = document19.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "");
        org.jsoup.select.Elements elements30 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document29);
        org.jsoup.nodes.Node node31 = document29.clearAttributes();
        boolean boolean32 = isNthLastChild14.matches((org.jsoup.nodes.Element) document19, (org.jsoup.nodes.Element) document29);
        org.jsoup.select.Elements elements34 = document29.getElementsContainingText("oot");
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document38 = parser35.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements39 = document38.children();
        boolean boolean40 = containsOwnText11.matches((org.jsoup.nodes.Element) document29, (org.jsoup.nodes.Element) document38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = element9.is((org.jsoup.select.Evaluator) containsOwnText11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings11 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str13 = parseSettings11.normalizeTag("");
        xmlTreeBuilder0.settings = parseSettings11;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        xmlTreeBuilder0.currentToken = startTag15;
        boolean boolean17 = startTag15.isDoctype();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.TreeBuilder treeBuilder1 = parser0.getTreeBuilder();
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.TreeBuilder treeBuilder3 = parser2.getTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.parser.Tag tag9 = document8.tag();
        org.jsoup.select.Elements elements11 = document8.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements13 = elements11.append("#root");
        xmlTreeBuilder4.stack = elements13;
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings15);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attributes attributes18 = parseSettings15.normalizeAttributes(attributes17);
        treeBuilder1.settings = parseSettings15;
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(treeBuilder1);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(treeBuilder3);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.parser.Tag tag8 = document7.tag();
        org.jsoup.select.Elements elements10 = document7.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements12 = elements10.append("#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.root();
        boolean boolean20 = elements10.remove((java.lang.Object) document17);
        org.jsoup.nodes.Element[] elementArray21 = new org.jsoup.nodes.Element[] { document17 };
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements(elementArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = document1.insertChildren(1, (org.jsoup.nodes.Node[]) elementArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elementArray21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        java.lang.String str49 = document34.toString();
        org.jsoup.nodes.Node node50 = document34.clearAttributes();
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document9 = element7.ownerDocument();
        org.jsoup.nodes.Element element10 = element7.nextElementSibling();
        org.jsoup.nodes.Element element13 = element7.attr("oot", "SYSTEM");
        java.lang.String str14 = element7.data();
        org.jsoup.nodes.Element element16 = element7.prependText("");
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document9 = element7.ownerDocument();
        org.jsoup.nodes.Element element11 = element7.prependElement("[^r]");
        org.jsoup.nodes.Element element13 = element11.appendText("\n<!--<!---->-->");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.TreeBuilder treeBuilder1 = parser0.getTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "");
        org.jsoup.parser.Tag tag7 = document6.tag();
        org.jsoup.select.Elements elements9 = document6.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements11 = elements9.append("#root");
        xmlTreeBuilder2.stack = elements11;
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder2.defaultSettings();
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.parser.Parser parser16 = parser0.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser0.settings(parseSettings17);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(treeBuilder1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.TreeBuilder treeBuilder12 = parser11.getTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.parser.Tag tag18 = document17.tag();
        org.jsoup.select.Elements elements20 = document17.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements22 = elements20.append("#root");
        xmlTreeBuilder13.stack = elements22;
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.Parser parser25 = parser11.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.parser.Parser parser27 = parser11.settings(parseSettings26);
        xmlTreeBuilder0.settings = parseSettings26;
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(treeBuilder12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = parser0.parseInput(reader1, "\n<!--<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":first-child", ":first-child");
        java.lang.String str3 = attributeWithValueNot2.toString();
        org.jsoup.select.Evaluator.AllElements allElements4 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.parser.Tag tag9 = document8.tag();
        java.lang.String str10 = document8.id();
        boolean boolean11 = document8.updateMetaCharsetElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "");
        org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Node node18 = document16.clearAttributes();
        org.jsoup.nodes.Node node19 = document16.root();
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.nodes.Document document21 = document16.normalise();
        boolean boolean22 = allElements4.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("", "");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Node node29 = document27.clearAttributes();
        org.jsoup.nodes.Node node30 = document27.root();
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("", "");
        org.jsoup.select.Elements elements37 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document36);
        org.jsoup.nodes.Element element39 = document36.prepend("hi!");
        org.jsoup.nodes.Element element40 = document27.appendTo(element39);
        int int41 = element40.elementSiblingIndex();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document45 = xmlTreeBuilder42.parse("", "");
        java.lang.String str46 = document45.tagName();
        org.jsoup.nodes.Element element48 = document45.getElementById("hi!");
        org.jsoup.nodes.Element element50 = document45.val("EndTag");
        boolean boolean51 = allElements4.matches(element40, (org.jsoup.nodes.Element) document45);
        org.jsoup.nodes.Element element52 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) attributeWithValueNot2, (org.jsoup.nodes.Element) document45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:first-child!=:first-child]" + "'", str3, "[:first-child!=:first-child]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements50 = document34.getElementsMatchingOwnText(":root");
        org.jsoup.nodes.TextNode textNode53 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean55 = textNode53.hasAttr("#root");
        org.jsoup.nodes.Node node57 = textNode53.removeAttr("#document");
        document34.replaceWith((org.jsoup.nodes.Node) textNode53);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.parser.Tag tag5 = tag4.setSelfClosing();
        boolean boolean6 = tag4.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        endTag8.type = tokenType9;
        char[] charArray12 = new char[] { '\ufffd' };
        boolean boolean16 = org.jsoup.parser.CharacterReader.rangeEquals(charArray12, (int) (byte) 10, (int) '4', "hi!");
        endTag8.appendAttributeValue(charArray12);
        endTag8.newAttribute();
        endTag8.selfClosing = true;
        int[] intArray24 = new int[] { (byte) 10, (short) 1, (short) 1 };
        endTag8.appendAttributeValue(intArray24);
        org.jsoup.nodes.Attributes attributes26 = endTag8.attributes;
        org.jsoup.nodes.FormElement formElement27 = new org.jsoup.nodes.FormElement(tag4, "EndTag", attributes26);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList28 = formElement27.formData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = formElement27.submit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: EndTag");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\ufffd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\ufffd");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "\ufffd]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(keyValList28);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("", "");
        org.jsoup.parser.Tag tag25 = document24.tag();
        org.jsoup.select.Elements elements27 = document24.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element28 = document24.head();
        org.jsoup.nodes.Document document29 = document24.clone();
        org.jsoup.nodes.Node node30 = element17.before((org.jsoup.nodes.Node) document29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = document29.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        org.jsoup.nodes.Element element22 = element17.getElementById("#comment");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild4 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Node node11 = document9.clearAttributes();
        org.jsoup.nodes.Node node12 = document9.root();
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element14 = document9.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "");
        org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Node node21 = document19.clearAttributes();
        boolean boolean22 = isNthLastChild4.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsContainingText("oot");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document28 = parser25.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements29 = document28.children();
        boolean boolean30 = containsOwnText1.matches((org.jsoup.nodes.Element) document19, (org.jsoup.nodes.Element) document28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        java.lang.String str35 = document34.tagName();
        boolean boolean36 = document34.isBlock();
        org.jsoup.nodes.Element element38 = document34.appendText("");
        java.lang.String str39 = document34.toString();
        org.jsoup.nodes.Element element41 = document34.createElement("EndTag");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document45 = parser42.parseInput("<EndTag></EndTag>", "org.jsoup.SerializationException");
        boolean boolean46 = containsOwnText1.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document45);
        java.lang.String str47 = containsOwnText1.toString();
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ":containsOwn()" + "'", str47, ":containsOwn()");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild4 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Node node11 = document9.clearAttributes();
        org.jsoup.nodes.Node node12 = document9.root();
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element14 = document9.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "");
        org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Node node21 = document19.clearAttributes();
        boolean boolean22 = isNthLastChild4.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsContainingText("oot");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document28 = parser25.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements29 = document28.children();
        boolean boolean30 = containsOwnText1.matches((org.jsoup.nodes.Element) document19, (org.jsoup.nodes.Element) document28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        java.lang.String str35 = document34.tagName();
        boolean boolean36 = document34.isBlock();
        org.jsoup.nodes.Element element38 = document34.appendText("");
        java.lang.String str39 = document34.toString();
        org.jsoup.nodes.Element element41 = document34.createElement("EndTag");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document45 = parser42.parseInput("<EndTag></EndTag>", "org.jsoup.SerializationException");
        boolean boolean46 = containsOwnText1.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document45);
        java.lang.String str48 = document34.attr("#data");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("");
        boolean boolean3 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Element element11 = document8.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild12 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean13 = element11.is((org.jsoup.select.Evaluator) isFirstChild12);
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueMatching("hi!", pattern15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.isInActiveFormattingElements(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("r");
        org.jsoup.nodes.TextNode textNode3 = textNode1.text(":contains(hi!)");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText5 = new org.jsoup.select.Evaluator.ContainsOwnText("");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild8 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Node node15 = document13.clearAttributes();
        org.jsoup.nodes.Node node16 = document13.root();
        org.jsoup.nodes.Element element17 = document13.empty();
        org.jsoup.nodes.Element element18 = document13.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("", "");
        org.jsoup.select.Elements elements24 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document23);
        org.jsoup.nodes.Node node25 = document23.clearAttributes();
        boolean boolean26 = isNthLastChild8.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document23);
        org.jsoup.select.Elements elements28 = document23.getElementsContainingText("oot");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document32 = parser29.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements33 = document32.children();
        boolean boolean34 = containsOwnText5.matches((org.jsoup.nodes.Element) document23, (org.jsoup.nodes.Element) document32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = textNode3.after((org.jsoup.nodes.Node) document32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder49.parse("", "");
        java.lang.String str53 = document52.tagName();
        boolean boolean54 = document52.isBlock();
        org.jsoup.nodes.Element element56 = document52.appendText("");
        org.jsoup.select.Elements elements57 = org.jsoup.select.Collector.collect((org.jsoup.select.Evaluator) isNthLastChild2, (org.jsoup.nodes.Element) document52);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder59.parse("", "");
        org.jsoup.select.Elements elements63 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document62);
        org.jsoup.nodes.Element element66 = document62.attr("#root", false);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild69 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder71 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document74 = xmlTreeBuilder71.parse("", "");
        org.jsoup.select.Elements elements75 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document74);
        org.jsoup.nodes.Node node76 = document74.clearAttributes();
        org.jsoup.nodes.Node node77 = document74.root();
        org.jsoup.nodes.Element element78 = document74.empty();
        org.jsoup.nodes.Element element79 = document74.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document84 = xmlTreeBuilder81.parse("", "");
        org.jsoup.select.Elements elements85 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document84);
        org.jsoup.nodes.Node node86 = document84.clearAttributes();
        boolean boolean87 = isNthLastChild69.matches((org.jsoup.nodes.Element) document74, (org.jsoup.nodes.Element) document84);
        org.jsoup.select.Elements elements89 = document84.getElementsContainingText("oot");
        boolean boolean90 = isNthLastChild2.matches(element66, (org.jsoup.nodes.Element) document84);
        java.lang.String str91 = document84.className();
        java.lang.String str92 = document84.outerHtml();
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(elements89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("r", "SYSTEM");
        java.lang.String str3 = document2.location();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SYSTEM" + "'", str3, "SYSTEM");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.nameAttr("org.jsoup.SerializationException", attributes3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.insertForm(startTag1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document9 = element7.ownerDocument();
        org.jsoup.nodes.Element element10 = element7.nextElementSibling();
        org.jsoup.nodes.Element element13 = element7.attr("oot", "SYSTEM");
        org.jsoup.select.Elements elements15 = element7.getElementsMatchingOwnText("#doctype");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = elements15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("");
        boolean boolean3 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.settings;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.parser.Tokeniser tokeniser9 = null;
        xmlTreeBuilder5.tokeniser = tokeniser9;
        org.jsoup.parser.Parser parser11 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) xmlTreeBuilder5);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token13 = comment12.reset();
        boolean boolean14 = xmlTreeBuilder5.process(token13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.process(token13, htmlTreeBuilderState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(parseSettings4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document9 = element7.ownerDocument();
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild12 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        org.jsoup.nodes.Node node20 = document17.root();
        org.jsoup.nodes.Element element21 = document17.empty();
        org.jsoup.nodes.Element element22 = document17.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("", "");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Node node29 = document27.clearAttributes();
        boolean boolean30 = isNthLastChild12.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document27);
        org.jsoup.select.Elements elements32 = document27.getElementsContainingText("oot");
        org.jsoup.nodes.Element element33 = document9.appendChild((org.jsoup.nodes.Node) document27);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        org.jsoup.select.Elements elements19 = document4.getElementsByTag("<!---->");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder20.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder20.originalState();
        htmlTreeBuilder20.framesetOk(true);
        int int25 = elements19.indexOf((java.lang.Object) htmlTreeBuilder20);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        org.jsoup.nodes.Document document9 = element7.ownerDocument();
        org.jsoup.nodes.Element element10 = element7.nextElementSibling();
        org.jsoup.nodes.Element element13 = element7.attr("oot", "SYSTEM");
        java.lang.String str14 = element7.data();
        org.jsoup.nodes.Element element16 = element7.prependText("");
        org.jsoup.select.Elements elements18 = element7.getElementsByIndexLessThan(100);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings11 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder0.settings = parseSettings11;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "");
        org.jsoup.parser.Tag tag17 = document16.tag();
        org.jsoup.select.Elements elements19 = document16.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element20 = document16.head();
        org.jsoup.nodes.Document document21 = document16.clone();
        xmlTreeBuilder0.doc = document21;
        org.jsoup.parser.Tokeniser tokeniser23 = null;
        xmlTreeBuilder0.tokeniser = tokeniser23;
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element10 = document7.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild11 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean12 = element10.is((org.jsoup.select.Evaluator) isFirstChild11);
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueMatching("hi!", pattern14);
        int int16 = parseErrorList2.indexOf((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError18 = parseErrorList2.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements10 = elements8.append("#root");
        xmlTreeBuilder1.stack = elements10;
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder1.settings = parseSettings12;
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        xmlTreeBuilder15.reader = characterReader19;
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder15.processStartTag("#root", attributes22);
        org.jsoup.parser.Tokeniser tokeniser24 = null;
        xmlTreeBuilder15.tokeniser = tokeniser24;
        org.jsoup.parser.ParseErrorList parseErrorList30 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.parser.Tag tag36 = document35.tag();
        org.jsoup.select.Elements elements38 = document35.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements40 = elements38.append("#root");
        xmlTreeBuilder31.stack = elements40;
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder15.parseFragment("hi!", "#root", parseErrorList30, parseSettings42);
        org.jsoup.parser.Parser parser44 = parser14.settings(parseSettings42);
        org.jsoup.nodes.Document document47 = parser44.parseInput(":root=\"\"", "[system^=#root]");
        org.jsoup.nodes.Element element49 = document47.prepend("[^r]");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("<!---->", "#root");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith5 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.select.Elements elements12 = document9.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node13 = document9.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element21 = document18.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild22 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean23 = element21.is((org.jsoup.select.Evaluator) isFirstChild22);
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValueMatching("hi!", pattern25);
        org.jsoup.nodes.Element element28 = element21.toggleClass("EndTag");
        boolean boolean29 = element28.isBlock();
        boolean boolean30 = tagEndsWith5.matches((org.jsoup.nodes.Element) document9, element28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        java.nio.charset.Charset charset33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax35 = outputSettings31.syntax();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document document38 = document9.outputSettings(outputSettings37);
        org.jsoup.nodes.Document document39 = document3.outputSettings(outputSettings37);
        boolean boolean40 = outputSettings37.outline();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings37.escapeMode(escapeMode41);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + syntax35 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax35.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(outputSettings42);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("");
        boolean boolean3 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.settings;
        java.io.Reader reader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.ParseSettings parseSettings10 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str12 = parseSettings10.normalizeTag("[^r]");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "<EndTag></EndTag>", parseErrorList9, parseSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[^r]" + "'", str12, "[^r]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jsoup.select.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.select.Evaluator.AttributeWithValueEnding("hi!", "EndTag");
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Node node10 = document8.clearAttributes();
        org.jsoup.nodes.Node node11 = document8.root();
        org.jsoup.nodes.Element element12 = document8.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Element element20 = document17.prepend("hi!");
        org.jsoup.nodes.Element element21 = document8.appendTo(element20);
        boolean boolean22 = attributeWithValueEnding2.matches(element3, (org.jsoup.nodes.Element) document8);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.parser.Tag tag7 = tag6.setSelfClosing();
        boolean boolean8 = tag6.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        endTag10.type = tokenType11;
        char[] charArray14 = new char[] { '\ufffd' };
        boolean boolean18 = org.jsoup.parser.CharacterReader.rangeEquals(charArray14, (int) (byte) 10, (int) '4', "hi!");
        endTag10.appendAttributeValue(charArray14);
        endTag10.newAttribute();
        endTag10.selfClosing = true;
        int[] intArray26 = new int[] { (byte) 10, (short) 1, (short) 1 };
        endTag10.appendAttributeValue(intArray26);
        org.jsoup.nodes.Attributes attributes28 = endTag10.attributes;
        org.jsoup.nodes.FormElement formElement29 = new org.jsoup.nodes.FormElement(tag6, "EndTag", attributes28);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList30 = formElement29.formData();
        htmlTreeBuilder0.setFormElement(formElement29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection32 = formElement29.submit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: EndTag");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\ufffd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\ufffd");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "\ufffd]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(keyValList30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element17.getElementsByAttributeValueContaining("#comment", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Document document7 = document4.normalise();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document9.children();
        boolean boolean11 = elements10.hasText();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "");
        org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Element element19 = document16.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild20 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean21 = element19.is((org.jsoup.select.Evaluator) isFirstChild20);
        java.util.regex.Pattern pattern23 = null;
        org.jsoup.select.Elements elements24 = element19.getElementsByAttributeValueMatching("hi!", pattern23);
        int int25 = element19.childNodeSize();
        org.jsoup.nodes.Element element27 = element19.appendText("SYSTEM");
        int int28 = elements10.indexOf((java.lang.Object) element27);
        org.jsoup.nodes.Element element29 = document4.appendTo(element27);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element17.removeClass(":first-child");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("", "");
        org.jsoup.parser.Tag tag25 = document24.tag();
        org.jsoup.select.Elements elements27 = document24.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element28 = document24.head();
        org.jsoup.nodes.Document document29 = document24.clone();
        org.jsoup.nodes.Node node30 = element17.before((org.jsoup.nodes.Node) document29);
        boolean boolean31 = document29.updateMetaCharsetElement();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.lang.String str33 = attributes32.toString();
        boolean boolean34 = document29.equals((java.lang.Object) str33);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements50 = document34.getElementsMatchingOwnText(":root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element52 = elements50.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character13 = character11.data(":contains(hi!)");
        boolean boolean14 = character13.isDoctype();
        xmlTreeBuilder0.insert(character13);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(character13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("SYSTEM", "#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element10 = document7.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild11 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean12 = element10.is((org.jsoup.select.Evaluator) isFirstChild11);
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueMatching("hi!", pattern14);
        int int16 = element10.childNodeSize();
        java.lang.String str17 = element10.outerHtml();
        java.lang.String str18 = element10.baseUri();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("EndTag");
        org.jsoup.nodes.Element element22 = document20.toggleClass(":first-child");
        boolean boolean23 = attributeWithValueStarting2.matches(element10, element22);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Node node8 = document6.clearAttributes();
        org.jsoup.nodes.Node node9 = document6.root();
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.nodes.Document document11 = document6.normalise();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "");
        java.lang.String str16 = document15.tagName();
        boolean boolean17 = document15.isBlock();
        org.jsoup.nodes.Element element19 = document15.appendText("");
        java.lang.String str20 = document15.toString();
        org.jsoup.nodes.Element element22 = document15.createElement("EndTag");
        boolean boolean23 = containsText1.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "");
        org.jsoup.select.Elements elements30 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document29);
        org.jsoup.nodes.Node node31 = document29.clearAttributes();
        org.jsoup.nodes.Node node32 = document29.root();
        org.jsoup.nodes.Element element33 = document29.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("", "");
        org.jsoup.select.Elements elements39 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.Element element41 = document38.prepend("hi!");
        org.jsoup.nodes.Element element42 = document29.appendTo(element41);
        java.lang.String str43 = document29.nodeName();
        boolean boolean44 = containsText1.matches(element24, (org.jsoup.nodes.Element) document29);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#document" + "'", str43, "#document");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.parser.Tag tag12 = document11.tag();
        org.jsoup.select.Elements elements14 = document11.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements16 = elements14.append("#root");
        xmlTreeBuilder7.stack = elements16;
        org.jsoup.parser.ParseSettings parseSettings18 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder7.settings = parseSettings18;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("", "");
        org.jsoup.parser.Tag tag24 = document23.tag();
        org.jsoup.select.Elements elements26 = document23.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element27 = document23.head();
        org.jsoup.nodes.Document document28 = document23.clone();
        xmlTreeBuilder7.doc = document28;
        boolean boolean30 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.select.Elements elements36 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Element element38 = document35.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild39 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean40 = element38.is((org.jsoup.select.Evaluator) isFirstChild39);
        java.util.regex.Pattern pattern42 = null;
        org.jsoup.select.Elements elements43 = element38.getElementsByAttributeValueMatching("hi!", pattern42);
        int int44 = element38.childNodeSize();
        boolean boolean45 = element38.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = htmlTreeBuilder0.removeFromStack(element38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Node node7 = document5.clearAttributes();
        org.jsoup.nodes.Node node8 = document5.root();
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.nodes.Element element14 = document13.empty();
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (short) 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("", "");
        org.jsoup.select.Elements elements22 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("", "");
        org.jsoup.nodes.Element element27 = document26.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("", "");
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document32);
        org.jsoup.nodes.Node node34 = document32.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder36.parse("", "");
        org.jsoup.select.Elements elements40 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document39);
        org.jsoup.nodes.Element element43 = document39.attr("#root", false);
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        java.nio.charset.Charset charset46 = null;
        document45.charset(charset46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document51 = xmlTreeBuilder48.parse("", "");
        org.jsoup.nodes.Element element52 = document51.empty();
        org.jsoup.select.Elements elements54 = element52.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str55 = element52.id();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder57.parse("", "");
        org.jsoup.select.Elements elements61 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document60);
        org.jsoup.nodes.Node node62 = document60.clearAttributes();
        org.jsoup.nodes.Node node63 = document60.root();
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element65 = document60.empty();
        org.jsoup.nodes.Element[] elementArray66 = new org.jsoup.nodes.Element[] { element9, element14, document21, element27, document32, document39, document45, element52, element65 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList67 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList67, elementArray66);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document72 = xmlTreeBuilder69.parse("", "");
        org.jsoup.nodes.Element element73 = document72.empty();
        org.jsoup.select.Elements elements75 = element73.getElementsByIndexLessThan((int) (short) 0);
        int int77 = elements75.indexOf((java.lang.Object) (-1.0d));
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder78.parse("", "");
        java.lang.String str82 = document81.tagName();
        boolean boolean83 = document81.isBlock();
        boolean boolean84 = elements75.add((org.jsoup.nodes.Element) document81);
        boolean boolean85 = elementList67.add((org.jsoup.nodes.Element) document81);
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList88 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document81, "oot", parseErrorList87);
        int int89 = document81.elementSiblingIndex();
        java.lang.String str91 = document81.absUrl(":first-child");
        // The following exception was thrown during execution in test generation
        try {
            document81.title("[:first-child!=:first-child]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elementArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "#root" + "'", str82, "#root");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements8 = elements6.append("#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Node node15 = document13.root();
        boolean boolean16 = elements6.remove((java.lang.Object) document13);
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document13 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = elements18.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementArray17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 100);
        java.lang.String str2 = indexLessThan1.toString();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Element element11 = document8.prepend("hi!");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.nodes.Document document13 = element11.ownerDocument();
        org.jsoup.nodes.Element element14 = element11.nextElementSibling();
        boolean boolean15 = indexLessThan1.matches(element3, element14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(100)" + "'", str2, ":lt(100)");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements50 = document34.getElementsMatchingOwnText(":root");
        org.jsoup.select.Elements elements52 = document34.getElementsContainingText(":lt(100)");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        java.lang.String str8 = element7.baseUri();
        java.lang.String str9 = element7.data();
        int int10 = element7.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("r", "SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.traverse(nodeVisitor0, (org.jsoup.nodes.Node) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        boolean boolean3 = elements2.hasText();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Element element11 = document8.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild12 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean13 = element11.is((org.jsoup.select.Evaluator) isFirstChild12);
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueMatching("hi!", pattern15);
        int int17 = element11.childNodeSize();
        org.jsoup.nodes.Element element19 = element11.appendText("SYSTEM");
        int int20 = elements2.indexOf((java.lang.Object) element19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.nodes.Element element26 = document25.empty();
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            elements2.add((int) ' ', element26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Node node7 = document5.clearAttributes();
        org.jsoup.nodes.Node node8 = document5.root();
        org.jsoup.nodes.Element element9 = document5.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.nodes.Element element14 = document13.empty();
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexLessThan((int) (short) 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("", "");
        org.jsoup.select.Elements elements22 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("", "");
        org.jsoup.nodes.Element element27 = document26.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("", "");
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document32);
        org.jsoup.nodes.Node node34 = document32.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder36.parse("", "");
        org.jsoup.select.Elements elements40 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document39);
        org.jsoup.nodes.Element element43 = document39.attr("#root", false);
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        java.nio.charset.Charset charset46 = null;
        document45.charset(charset46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document51 = xmlTreeBuilder48.parse("", "");
        org.jsoup.nodes.Element element52 = document51.empty();
        org.jsoup.select.Elements elements54 = element52.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str55 = element52.id();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder57.parse("", "");
        org.jsoup.select.Elements elements61 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document60);
        org.jsoup.nodes.Node node62 = document60.clearAttributes();
        org.jsoup.nodes.Node node63 = document60.root();
        org.jsoup.nodes.Element element64 = document60.empty();
        org.jsoup.nodes.Element element65 = document60.empty();
        org.jsoup.nodes.Element[] elementArray66 = new org.jsoup.nodes.Element[] { element9, element14, document21, element27, document32, document39, document45, element52, element65 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList67 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList67, elementArray66);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document72 = xmlTreeBuilder69.parse("", "");
        org.jsoup.nodes.Element element73 = document72.empty();
        org.jsoup.select.Elements elements75 = element73.getElementsByIndexLessThan((int) (short) 0);
        int int77 = elements75.indexOf((java.lang.Object) (-1.0d));
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document81 = xmlTreeBuilder78.parse("", "");
        java.lang.String str82 = document81.tagName();
        boolean boolean83 = document81.isBlock();
        boolean boolean84 = elements75.add((org.jsoup.nodes.Element) document81);
        boolean boolean85 = elementList67.add((org.jsoup.nodes.Element) document81);
        org.jsoup.parser.ParseErrorList parseErrorList87 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList88 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document81, "oot", parseErrorList87);
        org.jsoup.nodes.Element element90 = document81.appendText("r");
        org.jsoup.nodes.Node node91 = document81.parent();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elementArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "#root" + "'", str82, "#root");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(element90);
        org.junit.Assert.assertNull(node91);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements10 = elements8.append("#root");
        xmlTreeBuilder1.stack = elements10;
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder1.settings = parseSettings12;
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        xmlTreeBuilder15.reader = characterReader19;
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder15.processStartTag("#root", attributes22);
        org.jsoup.parser.Tokeniser tokeniser24 = null;
        xmlTreeBuilder15.tokeniser = tokeniser24;
        org.jsoup.parser.ParseErrorList parseErrorList30 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.parser.Tag tag36 = document35.tag();
        org.jsoup.select.Elements elements38 = document35.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements40 = elements38.append("#root");
        xmlTreeBuilder31.stack = elements40;
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder15.parseFragment("hi!", "#root", parseErrorList30, parseSettings42);
        org.jsoup.parser.Parser parser44 = parser14.settings(parseSettings42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("", "");
        org.jsoup.parser.Tokeniser tokeniser49 = null;
        xmlTreeBuilder45.tokeniser = tokeniser49;
        org.jsoup.parser.Parser parser51 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        xmlTreeBuilder45.reader = characterReader52;
        org.jsoup.parser.Parser parser54 = parser44.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.TreeBuilder treeBuilder55 = parser44.getTreeBuilder();
        boolean boolean57 = treeBuilder55.processEndTag("#doctype");
        org.jsoup.parser.ParseSettings parseSettings58 = treeBuilder55.settings;
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(treeBuilder55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parseSettings58);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.parser.Tag tag12 = document11.tag();
        org.jsoup.select.Elements elements14 = document11.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements16 = elements14.append("#root");
        xmlTreeBuilder7.stack = elements16;
        org.jsoup.parser.ParseSettings parseSettings18 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder7.settings = parseSettings18;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("", "");
        org.jsoup.parser.Tag tag24 = document23.tag();
        org.jsoup.select.Elements elements26 = document23.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element27 = document23.head();
        org.jsoup.nodes.Document document28 = document23.clone();
        xmlTreeBuilder7.doc = document28;
        boolean boolean30 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        java.lang.String str31 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.select.Evaluator.Id id33 = new org.jsoup.select.Evaluator.Id("oot");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document37 = xmlTreeBuilder34.parse("", "");
        java.lang.String str38 = document37.tagName();
        boolean boolean39 = document37.isBlock();
        org.jsoup.select.Elements elements40 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) id33, (org.jsoup.nodes.Element) document37);
        java.lang.String str41 = document37.outerHtml();
        org.jsoup.nodes.Element element44 = document37.attr("<!---->", "EndTag");
        boolean boolean45 = htmlTreeBuilder0.isSpecial(element44);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        org.jsoup.nodes.Node node8 = document4.nextSibling();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("SYSTEM", "#root");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        java.lang.String[] strArray16 = new java.lang.String[] { "<!---->", "", "<!---->" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.select.Elements elements22 = document7.getElementsByAttributeValueContaining("r", "<!---->");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("", "");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Node node29 = document27.clearAttributes();
        org.jsoup.nodes.Node node30 = document27.root();
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("", "");
        org.jsoup.select.Elements elements37 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document36);
        org.jsoup.nodes.Element element39 = document36.prepend("hi!");
        org.jsoup.nodes.Element element40 = document27.appendTo(element39);
        int int41 = element40.elementSiblingIndex();
        org.jsoup.nodes.Element element43 = element40.removeClass(":first-child");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document47 = xmlTreeBuilder44.parse("", "");
        org.jsoup.parser.Tag tag48 = document47.tag();
        org.jsoup.select.Elements elements50 = document47.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element51 = document47.head();
        org.jsoup.nodes.Document document52 = document47.clone();
        org.jsoup.nodes.Node node53 = element40.before((org.jsoup.nodes.Node) document52);
        boolean boolean54 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document52);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNull(element51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("<!---->", "#root");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith5 = new org.jsoup.select.Evaluator.TagEndsWith("hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.parser.Tag tag10 = document9.tag();
        org.jsoup.select.Elements elements12 = document9.getElementsContainingOwnText("");
        org.jsoup.nodes.Node node13 = document9.clearAttributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element21 = document18.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild22 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean23 = element21.is((org.jsoup.select.Evaluator) isFirstChild22);
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element21.getElementsByAttributeValueMatching("hi!", pattern25);
        org.jsoup.nodes.Element element28 = element21.toggleClass("EndTag");
        boolean boolean29 = element28.isBlock();
        boolean boolean30 = tagEndsWith5.matches((org.jsoup.nodes.Element) document9, element28);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean32 = outputSettings31.prettyPrint();
        java.nio.charset.Charset charset33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.charset(charset33);
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax35 = outputSettings31.syntax();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings31.prettyPrint(true);
        org.jsoup.nodes.Document document38 = document9.outputSettings(outputSettings37);
        org.jsoup.nodes.Document document39 = document3.outputSettings(outputSettings37);
        java.lang.String str40 = document3.title();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + syntax35 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax35.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements10 = elements8.append("#root");
        xmlTreeBuilder1.stack = elements10;
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder1.settings = parseSettings12;
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        xmlTreeBuilder15.reader = characterReader19;
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder15.processStartTag("#root", attributes22);
        org.jsoup.parser.Tokeniser tokeniser24 = null;
        xmlTreeBuilder15.tokeniser = tokeniser24;
        org.jsoup.parser.ParseErrorList parseErrorList30 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.parser.Tag tag36 = document35.tag();
        org.jsoup.select.Elements elements38 = document35.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements40 = elements38.append("#root");
        xmlTreeBuilder31.stack = elements40;
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder15.parseFragment("hi!", "#root", parseErrorList30, parseSettings42);
        org.jsoup.parser.Parser parser44 = parser14.settings(parseSettings42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("", "");
        org.jsoup.parser.Tokeniser tokeniser49 = null;
        xmlTreeBuilder45.tokeniser = tokeniser49;
        org.jsoup.parser.Parser parser51 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        xmlTreeBuilder45.reader = characterReader52;
        org.jsoup.parser.Parser parser54 = parser44.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.TreeBuilder treeBuilder55 = parser44.getTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList56 = treeBuilder55.stack;
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(treeBuilder55);
        org.junit.Assert.assertNotNull(elementList56);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = org.jsoup.parser.Parser.parseFragment("EndTag", (org.jsoup.nodes.Element) document4, "#oot");
        java.lang.String str10 = document4.className();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = document4.dataset();
        org.jsoup.nodes.Element element13 = document4.appendText("");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        int int4 = parseErrorList1.lastIndexOf((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = parseErrorList1.remove(obj5);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator7 = parseErrorList1.spliterator();
        boolean boolean8 = parseErrorList1.isEmpty();
        org.jsoup.parser.ParseError[] parseErrorArray9 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList10 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10, parseErrorArray9);
        int int13 = parseErrorList10.lastIndexOf((java.lang.Object) (byte) 100);
        boolean boolean14 = parseErrorList10.isEmpty();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "");
        org.jsoup.parser.Tag tag21 = document20.tag();
        org.jsoup.select.Elements elements23 = document20.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements25 = elements23.append("#root");
        xmlTreeBuilder16.stack = elements25;
        org.jsoup.parser.ParseSettings parseSettings27 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder16.settings = parseSettings27;
        org.jsoup.parser.Parser parser29 = parser15.settings(parseSettings27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("", "");
        org.jsoup.parser.CharacterReader characterReader34 = null;
        xmlTreeBuilder30.reader = characterReader34;
        org.jsoup.nodes.Attributes attributes37 = null;
        boolean boolean38 = xmlTreeBuilder30.processStartTag("#root", attributes37);
        org.jsoup.parser.Tokeniser tokeniser39 = null;
        xmlTreeBuilder30.tokeniser = tokeniser39;
        org.jsoup.parser.ParseErrorList parseErrorList45 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document50 = xmlTreeBuilder47.parse("", "");
        org.jsoup.parser.Tag tag51 = document50.tag();
        org.jsoup.select.Elements elements53 = document50.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements55 = elements53.append("#root");
        xmlTreeBuilder46.stack = elements55;
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder30.parseFragment("hi!", "#root", parseErrorList45, parseSettings57);
        org.jsoup.parser.Parser parser59 = parser29.settings(parseSettings57);
        boolean boolean60 = parseErrorList10.remove((java.lang.Object) parseSettings57);
        boolean boolean61 = parseErrorList1.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList1.replaceAll(parseErrorUnaryOperator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseErrorSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parseErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.CharacterReader characterReader4 = null;
        xmlTreeBuilder0.reader = characterReader4;
        org.jsoup.nodes.Attributes attributes7 = null;
        boolean boolean8 = xmlTreeBuilder0.processStartTag("#root", attributes7);
        org.jsoup.parser.Tokeniser tokeniser9 = null;
        xmlTreeBuilder0.tokeniser = tokeniser9;
        org.jsoup.parser.ParseErrorList parseErrorList15 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "");
        org.jsoup.parser.Tag tag21 = document20.tag();
        org.jsoup.select.Elements elements23 = document20.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements25 = elements23.append("#root");
        xmlTreeBuilder16.stack = elements25;
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder0.parseFragment("hi!", "#root", parseErrorList15, parseSettings27);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements31 = document30.children();
        xmlTreeBuilder0.doc = document30;
        org.jsoup.parser.ParseErrorList parseErrorList33 = xmlTreeBuilder0.errors;
        org.jsoup.nodes.Element element34 = xmlTreeBuilder0.currentElement();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Node node6 = document4.clearAttributes();
        org.jsoup.nodes.Node node7 = document4.root();
        org.jsoup.nodes.Element element8 = document4.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element16 = document13.prepend("hi!");
        org.jsoup.nodes.Element element17 = document4.appendTo(element16);
        int int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Node node19 = element17.previousSibling();
        java.util.Set<java.lang.String> strSet20 = element17.classNames();
        org.jsoup.nodes.Node node22 = element17.wrap(":containsData()");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        int int3 = document2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document2, "[:first-child!=:first-child]");
        org.jsoup.nodes.Element element7 = document2.prependElement("[]");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("", "");
        org.jsoup.select.Elements elements13 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element15 = document12.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild16 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean17 = element15.is((org.jsoup.select.Evaluator) isFirstChild16);
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueMatching("hi!", pattern19);
        org.jsoup.nodes.Element element22 = element15.toggleClass("EndTag");
        org.jsoup.nodes.Element element23 = element7.prependChild((org.jsoup.nodes.Node) element15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.parser.Tag tag7 = tag6.setSelfClosing();
        boolean boolean8 = tag6.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        endTag10.type = tokenType11;
        char[] charArray14 = new char[] { '\ufffd' };
        boolean boolean18 = org.jsoup.parser.CharacterReader.rangeEquals(charArray14, (int) (byte) 10, (int) '4', "hi!");
        endTag10.appendAttributeValue(charArray14);
        endTag10.newAttribute();
        endTag10.selfClosing = true;
        int[] intArray26 = new int[] { (byte) 10, (short) 1, (short) 1 };
        endTag10.appendAttributeValue(intArray26);
        org.jsoup.nodes.Attributes attributes28 = endTag10.attributes;
        org.jsoup.nodes.FormElement formElement29 = new org.jsoup.nodes.FormElement(tag6, "EndTag", attributes28);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList30 = formElement29.formData();
        htmlTreeBuilder0.setFormElement(formElement29);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str33 = startTag32.tagName;
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag32.nameAttr("[:first-child!=:first-child]", attributes35);
        java.lang.String str37 = startTag36.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element38 = htmlTreeBuilder0.insertEmpty(startTag36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\ufffd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\ufffd");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "\ufffd]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(keyValList30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[:first-child!=:first-child]" + "'", str37, "[:first-child!=:first-child]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.select.Elements elements8 = document5.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements10 = elements8.append("#root");
        xmlTreeBuilder1.stack = elements10;
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder1.settings = parseSettings12;
        org.jsoup.parser.Parser parser14 = parser0.settings(parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        xmlTreeBuilder15.reader = characterReader19;
        org.jsoup.nodes.Attributes attributes22 = null;
        boolean boolean23 = xmlTreeBuilder15.processStartTag("#root", attributes22);
        org.jsoup.parser.Tokeniser tokeniser24 = null;
        xmlTreeBuilder15.tokeniser = tokeniser24;
        org.jsoup.parser.ParseErrorList parseErrorList30 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.parser.Tag tag36 = document35.tag();
        org.jsoup.select.Elements elements38 = document35.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements40 = elements38.append("#root");
        xmlTreeBuilder31.stack = elements40;
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder15.parseFragment("hi!", "#root", parseErrorList30, parseSettings42);
        org.jsoup.parser.Parser parser44 = parser14.settings(parseSettings42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("", "");
        org.jsoup.parser.Tokeniser tokeniser49 = null;
        xmlTreeBuilder45.tokeniser = tokeniser49;
        org.jsoup.parser.Parser parser51 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.CharacterReader characterReader52 = null;
        xmlTreeBuilder45.reader = characterReader52;
        org.jsoup.parser.Parser parser54 = parser44.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder45);
        org.jsoup.parser.CharacterReader characterReader55 = null;
        xmlTreeBuilder45.reader = characterReader55;
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser54);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Node node8 = document6.clearAttributes();
        org.jsoup.nodes.Node node9 = document6.root();
        org.jsoup.nodes.Element element10 = document6.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Element element18 = document15.prepend("hi!");
        org.jsoup.nodes.Element element19 = document6.appendTo(element18);
        java.lang.String str20 = document6.nodeName();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Element element28 = document25.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild29 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean30 = element28.is((org.jsoup.select.Evaluator) isFirstChild29);
        java.util.regex.Pattern pattern32 = null;
        org.jsoup.select.Elements elements33 = element28.getElementsByAttributeValueMatching("hi!", pattern32);
        int int34 = element28.childNodeSize();
        java.lang.String str35 = element28.outerHtml();
        java.lang.String str36 = element28.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = matchesOwn1.matches((org.jsoup.nodes.Element) document6, element28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild4 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Node node11 = document9.clearAttributes();
        org.jsoup.nodes.Node node12 = document9.root();
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element14 = document9.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "");
        org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Node node21 = document19.clearAttributes();
        boolean boolean22 = isNthLastChild4.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements24 = document19.getElementsContainingText("oot");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document28 = parser25.parseInput("<!---->", "#root");
        org.jsoup.select.Elements elements29 = document28.children();
        boolean boolean30 = containsOwnText1.matches((org.jsoup.nodes.Element) document19, (org.jsoup.nodes.Element) document28);
        java.lang.String str31 = containsOwnText1.toString();
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ":containsOwn()" + "'", str31, ":containsOwn()");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = parser0.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.framesetOk(false);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings11 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str13 = parseSettings11.normalizeTag("");
        xmlTreeBuilder0.settings = parseSettings11;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        xmlTreeBuilder0.currentToken = startTag15;
        startTag15.normalName = ":gt(65533)";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = startTag15.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Elements elements50 = document34.getElementsMatchingOwnText(":root");
        org.jsoup.select.Elements elements52 = elements50.prevAll("#comment");
        int int53 = elements50.size();
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.parser.Tag tag12 = document11.tag();
        org.jsoup.select.Elements elements14 = document11.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements16 = elements14.append("#root");
        xmlTreeBuilder7.stack = elements16;
        org.jsoup.parser.ParseSettings parseSettings18 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder7.settings = parseSettings18;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("", "");
        org.jsoup.parser.Tag tag24 = document23.tag();
        org.jsoup.select.Elements elements26 = document23.getElementsContainingOwnText("");
        org.jsoup.nodes.Element element27 = document23.head();
        org.jsoup.nodes.Document document28 = document23.clone();
        xmlTreeBuilder7.doc = document28;
        boolean boolean30 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("", "");
        org.jsoup.select.Elements elements36 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Element element38 = document35.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild39 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean40 = element38.is((org.jsoup.select.Evaluator) isFirstChild39);
        java.util.regex.Pattern pattern42 = null;
        org.jsoup.select.Elements elements43 = element38.getElementsByAttributeValueMatching("hi!", pattern42);
        org.jsoup.nodes.Element element45 = element38.toggleClass("EndTag");
        boolean boolean46 = element45.isBlock();
        htmlTreeBuilder0.maybeSetBaseUri(element45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        int int3 = document2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document2, "[:first-child!=:first-child]");
        org.jsoup.nodes.Element element7 = document2.prependElement("[]");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document2.outputSettings();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.select.Evaluator.ContainsText containsText2 = new org.jsoup.select.Evaluator.ContainsText("hi!");
        java.lang.String str3 = containsText2.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Node node10 = document8.clearAttributes();
        org.jsoup.nodes.Node node11 = document8.root();
        org.jsoup.nodes.Element element12 = document8.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Element element20 = document17.prepend("hi!");
        org.jsoup.nodes.Element element21 = document8.appendTo(element20);
        int int22 = element21.elementSiblingIndex();
        org.jsoup.nodes.Node node23 = element21.previousSibling();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("", "");
        boolean boolean28 = containsText2.matches(element21, (org.jsoup.nodes.Element) document27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.traverse(nodeVisitor0, (org.jsoup.nodes.Node) document27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":contains(hi!)" + "'", str3, ":contains(hi!)");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        int int4 = parseErrorList1.lastIndexOf((java.lang.Object) (byte) 100);
        boolean boolean5 = parseErrorList1.isEmpty();
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.parser.Tag tag12 = document11.tag();
        org.jsoup.select.Elements elements14 = document11.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements16 = elements14.append("#root");
        xmlTreeBuilder7.stack = elements16;
        org.jsoup.parser.ParseSettings parseSettings18 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder7.settings = parseSettings18;
        org.jsoup.parser.Parser parser20 = parser6.settings(parseSettings18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("", "");
        org.jsoup.parser.CharacterReader characterReader25 = null;
        xmlTreeBuilder21.reader = characterReader25;
        org.jsoup.nodes.Attributes attributes28 = null;
        boolean boolean29 = xmlTreeBuilder21.processStartTag("#root", attributes28);
        org.jsoup.parser.Tokeniser tokeniser30 = null;
        xmlTreeBuilder21.tokeniser = tokeniser30;
        org.jsoup.parser.ParseErrorList parseErrorList36 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("", "");
        org.jsoup.parser.Tag tag42 = document41.tag();
        org.jsoup.select.Elements elements44 = document41.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements46 = elements44.append("#root");
        xmlTreeBuilder37.stack = elements46;
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder37.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder21.parseFragment("hi!", "#root", parseErrorList36, parseSettings48);
        org.jsoup.parser.Parser parser50 = parser20.settings(parseSettings48);
        boolean boolean51 = parseErrorList1.remove((java.lang.Object) parseSettings48);
        java.lang.Object[] objArray52 = parseErrorList1.toArray();
        java.lang.Object obj53 = null;
        boolean boolean54 = parseErrorList1.contains(obj53);
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Node node9 = document7.clearAttributes();
        org.jsoup.nodes.Node node10 = document7.root();
        org.jsoup.nodes.Element element11 = document7.empty();
        org.jsoup.nodes.Element element12 = document7.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Node node19 = document17.clearAttributes();
        boolean boolean20 = isNthLastChild2.matches((org.jsoup.nodes.Element) document7, (org.jsoup.nodes.Element) document17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Node node27 = document25.clearAttributes();
        org.jsoup.nodes.Node node28 = document25.root();
        org.jsoup.nodes.Element element29 = document25.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("", "");
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Node node36 = document34.clearAttributes();
        org.jsoup.nodes.Node node37 = document34.root();
        org.jsoup.nodes.Element element38 = document34.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("", "");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Element element46 = document43.prepend("hi!");
        org.jsoup.nodes.Element element47 = document34.appendTo(element46);
        boolean boolean48 = isNthLastChild2.matches(element29, (org.jsoup.nodes.Element) document34);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder49.parse("", "");
        org.jsoup.nodes.Element element53 = document52.empty();
        org.jsoup.select.Elements elements55 = element53.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str56 = element53.id();
        org.jsoup.nodes.Element element57 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastChild2, element53);
        org.jsoup.select.Elements elements60 = element53.getElementsByAttributeValueEnding("EndTag", "SYSTEM");
        org.jsoup.select.Elements elements62 = element53.getElementsByIndexEquals(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element64 = element53.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(element57);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements62);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 100);
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild4 = new org.jsoup.select.Evaluator.IsNthLastChild((int) (short) 0, (int) (byte) 10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "");
        org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Node node11 = document9.clearAttributes();
        org.jsoup.nodes.Node node12 = document9.root();
        org.jsoup.nodes.Element element13 = document9.empty();
        org.jsoup.nodes.Element element14 = document9.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "");
        org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Node node21 = document19.clearAttributes();
        boolean boolean22 = isNthLastChild4.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("", "");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Node node29 = document27.clearAttributes();
        org.jsoup.nodes.Node node30 = document27.root();
        org.jsoup.nodes.Element element31 = document27.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder33.parse("", "");
        org.jsoup.select.Elements elements37 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document36);
        org.jsoup.nodes.Node node38 = document36.clearAttributes();
        org.jsoup.nodes.Node node39 = document36.root();
        org.jsoup.nodes.Element element40 = document36.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document45 = xmlTreeBuilder42.parse("", "");
        org.jsoup.select.Elements elements46 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document45);
        org.jsoup.nodes.Element element48 = document45.prepend("hi!");
        org.jsoup.nodes.Element element49 = document36.appendTo(element48);
        boolean boolean50 = isNthLastChild4.matches(element31, (org.jsoup.nodes.Element) document36);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document55 = xmlTreeBuilder52.parse("", "");
        org.jsoup.select.Elements elements56 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document55);
        org.jsoup.nodes.Element element58 = document55.prepend("hi!");
        java.lang.String str59 = element58.baseUri();
        org.jsoup.nodes.Document document60 = element58.ownerDocument();
        org.jsoup.nodes.Element element61 = element58.nextElementSibling();
        org.jsoup.nodes.Element element64 = element58.attr("oot", "SYSTEM");
        java.lang.String str65 = element58.data();
        boolean boolean66 = indexLessThan1.matches((org.jsoup.nodes.Element) document36, element58);
        org.jsoup.nodes.Element element68 = element58.appendText("#data");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(element68);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList1 = parser0.getErrors();
        org.jsoup.parser.TreeBuilder treeBuilder2 = parser0.getTreeBuilder();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNull(parseErrorList1);
        org.junit.Assert.assertNotNull(treeBuilder2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.CharacterReader characterReader2 = null;
        htmlTreeBuilder0.reader = characterReader2;
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild5 = new org.jsoup.select.Evaluator.IsFirstChild();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isFirstChild5, (org.jsoup.nodes.Element) document7);
        boolean boolean9 = document7.updateMetaCharsetElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("", "");
        org.jsoup.parser.CharacterReader characterReader15 = null;
        xmlTreeBuilder11.reader = characterReader15;
        java.lang.String str17 = xmlTreeBuilder11.baseUri;
        org.jsoup.nodes.Document document20 = xmlTreeBuilder11.parse("oot", "r");
        xmlTreeBuilder11.runParser();
        xmlTreeBuilder11.baseUri = ":first-child";
        java.util.ArrayList<org.jsoup.nodes.Element> elementList24 = xmlTreeBuilder11.stack;
        org.jsoup.parser.ParseErrorList parseErrorList29 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.ParseSettings parseSettings30 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str32 = parseSettings30.normalizeTag("");
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.nodes.Attributes attributes34 = parseSettings30.normalizeAttributes(attributes33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder11.parseFragment("#oot", "\n<!--<!---->-->", parseErrorList29, parseSettings30);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document39 = parser36.parseInput("<EndTag></EndTag>", "org.jsoup.SerializationException");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder41.parse("", "");
        org.jsoup.parser.Tag tag45 = document44.tag();
        org.jsoup.select.Elements elements47 = document44.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements49 = elements47.append("#root");
        xmlTreeBuilder40.stack = elements49;
        org.jsoup.parser.ParseSettings parseSettings51 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str53 = parseSettings51.normalizeTag("");
        xmlTreeBuilder40.settings = parseSettings51;
        org.jsoup.parser.Parser parser55 = parser36.settings(parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = htmlTreeBuilder0.parseFragment("#doctype", (org.jsoup.nodes.Element) document7, "<!---->", parseErrorList29, parseSettings51);
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elementList24);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(attributes34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(nodeList56);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild8 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean9 = element7.is((org.jsoup.select.Evaluator) isFirstChild8);
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueMatching("hi!", pattern11);
        int int13 = element7.childNodeSize();
        org.jsoup.nodes.Element element15 = element7.appendText("SYSTEM");
        java.lang.String str16 = element7.className();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element7 = document4.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild8 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean9 = element7.is((org.jsoup.select.Evaluator) isFirstChild8);
        java.util.regex.Pattern pattern11 = null;
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueMatching("hi!", pattern11);
        org.jsoup.select.Elements elements14 = element7.getElementsByAttribute("\ufffd>");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("hi!", "<EndTag></EndTag>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder3.parse("", "");
        org.jsoup.parser.Tag tag7 = document6.tag();
        org.jsoup.parser.Tag tag8 = tag7.setSelfClosing();
        boolean boolean9 = tag7.isSelfClosing();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag7, "EndTag");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "");
        org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Node node18 = document16.clearAttributes();
        org.jsoup.nodes.Node node19 = document16.root();
        org.jsoup.nodes.Element element20 = document16.empty();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Element element28 = document25.prepend("hi!");
        org.jsoup.nodes.Element element29 = document16.appendTo(element28);
        int int30 = element29.elementSiblingIndex();
        org.jsoup.nodes.Node node31 = element29.previousSibling();
        java.util.Set<java.lang.String> strSet32 = element29.classNames();
        boolean boolean33 = attributeWithValueContaining2.matches(element11, element29);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("oot", ":first-child");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tokeniser tokeniser6 = htmlTreeBuilder0.tokeniser;
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokeniser6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("r");
        characterReader1.advance();
        boolean boolean6 = characterReader1.rangeEquals(0, (int) (byte) 10, "");
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("", "");
        org.jsoup.parser.Tag tag13 = document12.tag();
        org.jsoup.select.Elements elements15 = document12.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements17 = elements15.append("#root");
        xmlTreeBuilder8.stack = elements17;
        org.jsoup.parser.ParseSettings parseSettings19 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder8.settings = parseSettings19;
        org.jsoup.parser.Parser parser21 = parser7.settings(parseSettings19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "");
        org.jsoup.parser.CharacterReader characterReader26 = null;
        xmlTreeBuilder22.reader = characterReader26;
        org.jsoup.nodes.Attributes attributes29 = null;
        boolean boolean30 = xmlTreeBuilder22.processStartTag("#root", attributes29);
        org.jsoup.parser.Tokeniser tokeniser31 = null;
        xmlTreeBuilder22.tokeniser = tokeniser31;
        org.jsoup.parser.ParseErrorList parseErrorList37 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder39.parse("", "");
        org.jsoup.parser.Tag tag43 = document42.tag();
        org.jsoup.select.Elements elements45 = document42.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements47 = elements45.append("#root");
        xmlTreeBuilder38.stack = elements47;
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder22.parseFragment("hi!", "#root", parseErrorList37, parseSettings49);
        org.jsoup.parser.Parser parser51 = parser21.settings(parseSettings49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document55 = xmlTreeBuilder52.parse("", "");
        org.jsoup.parser.Tokeniser tokeniser56 = null;
        xmlTreeBuilder52.tokeniser = tokeniser56;
        org.jsoup.parser.Parser parser58 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) xmlTreeBuilder52);
        org.jsoup.parser.CharacterReader characterReader59 = null;
        xmlTreeBuilder52.reader = characterReader59;
        org.jsoup.parser.Parser parser61 = parser51.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder52);
        org.jsoup.parser.ParseErrorList parseErrorList64 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document69 = xmlTreeBuilder66.parse("", "");
        org.jsoup.select.Elements elements70 = org.jsoup.select.Selector.select("#root", (org.jsoup.nodes.Element) document69);
        org.jsoup.nodes.Element element72 = document69.prepend("hi!");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild73 = new org.jsoup.select.Evaluator.IsFirstChild();
        boolean boolean74 = element72.is((org.jsoup.select.Evaluator) isFirstChild73);
        java.util.regex.Pattern pattern76 = null;
        org.jsoup.select.Elements elements77 = element72.getElementsByAttributeValueMatching("hi!", pattern76);
        int int78 = parseErrorList64.indexOf((java.lang.Object) "hi!");
        xmlTreeBuilder52.errors = parseErrorList64;
        org.jsoup.parser.Tokeniser tokeniser80 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(elements77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.Tag tag4 = document3.tag();
        org.jsoup.parser.Tag tag5 = tag4.setSelfClosing();
        boolean boolean6 = tag4.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        endTag8.type = tokenType9;
        char[] charArray12 = new char[] { '\ufffd' };
        boolean boolean16 = org.jsoup.parser.CharacterReader.rangeEquals(charArray12, (int) (byte) 10, (int) '4', "hi!");
        endTag8.appendAttributeValue(charArray12);
        endTag8.newAttribute();
        endTag8.selfClosing = true;
        int[] intArray24 = new int[] { (byte) 10, (short) 1, (short) 1 };
        endTag8.appendAttributeValue(intArray24);
        org.jsoup.nodes.Attributes attributes26 = endTag8.attributes;
        org.jsoup.nodes.FormElement formElement27 = new org.jsoup.nodes.FormElement(tag4, "EndTag", attributes26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection28 = formElement27.submit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: EndTag");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\ufffd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\ufffd");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "\ufffd]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = org.jsoup.parser.Parser.parseFragment("EndTag", (org.jsoup.nodes.Element) document4, "#oot");
        java.lang.String str10 = document4.className();
        org.jsoup.nodes.Element element12 = document4.removeClass("#doctype");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.parser.Tag tag5 = document4.tag();
        org.jsoup.select.Elements elements7 = document4.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements9 = elements7.append("#root");
        xmlTreeBuilder0.stack = elements9;
        org.jsoup.parser.ParseSettings parseSettings11 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str13 = parseSettings11.normalizeTag("");
        xmlTreeBuilder0.settings = parseSettings11;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        xmlTreeBuilder0.currentToken = startTag15;
        char[] charArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag15.appendAttributeValue(charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder2.parse("", "");
        org.jsoup.parser.Tag tag6 = document5.tag();
        org.jsoup.parser.Tag tag7 = tag6.setSelfClosing();
        boolean boolean8 = tag6.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        endTag10.type = tokenType11;
        char[] charArray14 = new char[] { '\ufffd' };
        boolean boolean18 = org.jsoup.parser.CharacterReader.rangeEquals(charArray14, (int) (byte) 10, (int) '4', "hi!");
        endTag10.appendAttributeValue(charArray14);
        endTag10.newAttribute();
        endTag10.selfClosing = true;
        int[] intArray26 = new int[] { (byte) 10, (short) 1, (short) 1 };
        endTag10.appendAttributeValue(intArray26);
        org.jsoup.nodes.Attributes attributes28 = endTag10.attributes;
        org.jsoup.nodes.FormElement formElement29 = new org.jsoup.nodes.FormElement(tag6, "EndTag", attributes28);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList30 = formElement29.formData();
        htmlTreeBuilder0.setFormElement(formElement29);
        java.lang.String str32 = formElement29.text();
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\ufffd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\ufffd");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "\ufffd]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(keyValList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean5 = htmlTreeBuilder0.isFragmentParsing();
        java.io.Reader reader6 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        xmlTreeBuilder8.reader = characterReader12;
        org.jsoup.nodes.Attributes attributes15 = null;
        boolean boolean16 = xmlTreeBuilder8.processStartTag("#root", attributes15);
        org.jsoup.parser.Tokeniser tokeniser17 = null;
        xmlTreeBuilder8.tokeniser = tokeniser17;
        org.jsoup.parser.ParseErrorList parseErrorList23 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, 0);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("", "");
        org.jsoup.parser.Tag tag29 = document28.tag();
        org.jsoup.select.Elements elements31 = document28.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements33 = elements31.append("#root");
        xmlTreeBuilder24.stack = elements33;
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder8.parseFragment("hi!", "#root", parseErrorList23, parseSettings35);
        int int37 = parseErrorList23.getMaxSize();
        boolean boolean38 = parseErrorList23.canAddError();
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder41.parse("", "");
        org.jsoup.parser.Tag tag45 = document44.tag();
        org.jsoup.select.Elements elements47 = document44.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements49 = elements47.append("#root");
        xmlTreeBuilder40.stack = elements49;
        org.jsoup.parser.ParseSettings parseSettings51 = org.jsoup.parser.ParseSettings.preserveCase;
        xmlTreeBuilder40.settings = parseSettings51;
        org.jsoup.parser.Parser parser53 = parser39.settings(parseSettings51);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, "#comment", parseErrorList23, parseSettings51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser53);
    }
}
