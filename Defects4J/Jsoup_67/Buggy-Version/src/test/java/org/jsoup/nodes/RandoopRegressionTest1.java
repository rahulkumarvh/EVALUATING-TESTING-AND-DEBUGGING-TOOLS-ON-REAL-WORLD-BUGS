package org.jsoup.nodes;

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
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Node node4 = document2.parentNode;
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element8 = document6.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document6.new OutputSettings();
        org.jsoup.nodes.Element element10 = document2.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node11 = null;
        document6.setParentNode(node11);
        org.jsoup.nodes.Element element14 = document6.getElementById("#data");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "hi!");
        textNode2.setSiblingIndex(5);
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("#document");
        org.jsoup.select.Elements elements8 = element4.getElementsMatchingText("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element4.siblingNodes();
        org.jsoup.nodes.Element element10 = element4.firstElementSibling();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element16 = document14.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document14.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings17.indentAmount(0);
        // The following exception was thrown during execution in test generation
        try {
            element4.outerHtmlHead(stringBuilder11, (int) (short) 10, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#text", "");
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueMatching("&num;declaration=\"&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\"", pattern4);
        org.jsoup.select.Elements elements6 = elements5.remove();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        element9.attributes = attributes13;
        org.jsoup.nodes.Element element16 = element9.toggleClass("#declaration");
        java.lang.String str17 = element9.html();
        boolean boolean19 = element9.hasClass("          ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.jsoup.nodes.Evaluator.Id id1 = new org.jsoup.nodes.Evaluator.Id("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element5 = document3.text("hi!");
        org.jsoup.nodes.Element element7 = element5.prepend("#comment");
        element5.baseUri = "<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>";
        java.lang.String str10 = element5.className();
        org.jsoup.nodes.Element element12 = element5.prependText("                                                    ");
        org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValueMatching(" ", "<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray22 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = document18.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        element25.attributes = attributes29;
        org.jsoup.nodes.Element element32 = element25.toggleClass("#declaration");
        element5.parentNode = element32;
        boolean boolean34 = id1.matches(element5);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node[] nodeArray37 = document36.childNodesAsArray();
        org.jsoup.nodes.Attributes attributes38 = document36.attributes;
        boolean boolean39 = id1.matches((org.jsoup.nodes.Element) document36);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        boolean boolean2 = document1.preserveWhitespace();
        document1.title("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = document1.dataset();
        org.jsoup.nodes.Element element7 = document1.createElement("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        element7.setSiblingIndex((int) ' ');
        org.jsoup.nodes.Element element11 = element7.appendText("<html>\n <head>\n  <title>#document</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.jsoup.nodes.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.nodes.Evaluator.ContainsOwnText("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray8 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document4.classNames((java.util.Set<java.lang.String>) strSet9);
        java.lang.String str12 = document4.html();
        org.jsoup.parser.Tag tag13 = document4.tag();
        java.lang.String str14 = document4.nodeName();
        java.lang.String str15 = document4.ownText();
        org.jsoup.select.Elements elements17 = document4.getElementsMatchingOwnText("");
        boolean boolean19 = document4.hasClass("");
        boolean boolean20 = containsOwnText1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element22 = document4.append("");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#text#text#text#document#texthi!#text&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;#textdata-\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Evaluator.Attribute attribute3 = new org.jsoup.nodes.Evaluator.Attribute("");
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("#root", "#document");
        org.jsoup.nodes.Attributes attributes7 = document6.attributes;
        org.jsoup.nodes.Element element8 = document6.body();
        boolean boolean9 = attribute3.matches(element8);
        boolean boolean10 = tag1.matches(element8);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-", "&num;declaration");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element6 = document4.text("hi!");
        org.jsoup.nodes.Element element7 = document4.body();
        org.jsoup.nodes.Element element9 = element7.prepend("#comment");
        boolean boolean10 = attributeWithValueEnding2.matches(element9);
        org.jsoup.nodes.Element element11 = element9.lastElementSibling();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueStarting("\n<html>\n <head></head>\n <body <html> <head></head> <body></body> </html>=\"&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\">\n  hi!\n </body>\n</html>", "&num;declaration=\"&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream10 = elements9.stream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementStream10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        java.lang.String str10 = document2.html();
        org.jsoup.parser.Tag tag11 = document2.tag();
        java.lang.String str12 = document2.nodeName();
        org.jsoup.select.Elements elements15 = document2.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document2.childNodes();
        org.jsoup.select.Elements elements18 = document2.getElementsByAttribute("#data");
        java.lang.String str19 = document2.outerHtml();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("#root", "");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        textNode22.outerHtmlTail(stringBuilder23, (int) 'a', outputSettings25);
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        textNode22.outerHtmlTail(stringBuilder27, 4, outputSettings29);
        org.jsoup.nodes.Node node31 = textNode22.parentNode;
        org.jsoup.nodes.Node[] nodeArray32 = textNode22.childNodesAsArray();
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) nodeArray32);
        document2.addChildren(nodeArray32);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeArray32);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("#document");
        org.jsoup.select.Elements elements8 = elements6.select("          ");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals10 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.select.Elements elements12 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals10, element11);
        org.jsoup.select.Elements elements13 = elements12.parents();
        int int14 = elements8.lastIndexOf((java.lang.Object) elements12);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("&num;declaration", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        int int18 = elements8.indexOf((java.lang.Object) "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-", "data-", true);
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray12 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        java.lang.String str16 = document8.html();
        boolean boolean18 = document8.hasClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document8.outputSettings();
        xmlDeclaration3.outerHtmlTail(stringBuilder4, 10, outputSettings19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = xmlDeclaration3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(outputSettings19);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.appendText("hi!");
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Element element10 = document1.attr("                                                    ", "");
        org.jsoup.nodes.Element element12 = document1.val("#comment");
        org.jsoup.nodes.Element element13 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "#document");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes;
        org.jsoup.nodes.Element element4 = document2.body();
        org.jsoup.nodes.Node node6 = element4.removeAttr("          ");
        java.lang.Object obj7 = null;
        boolean boolean8 = node6.equals(obj7);
        node6.setBaseUri("<html>\n <head></head>\n <body>\n  #document \n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node6.childNodes;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>", "html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.DataNode dataNode4 = dataNode2.setWholeData("#text");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element10 = document8.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document8.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            dataNode4.indent(stringBuilder5, 4, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataNode4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-", "data-", true);
        int int4 = xmlDeclaration3.siblingIndex;
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("#root", "");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        textNode10.outerHtmlTail(stringBuilder11, (int) 'a', outputSettings13);
        java.lang.String str15 = textNode10.text();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element21 = document19.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document19.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        textNode10.outerHtmlTail(stringBuilder16, 100, outputSettings22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = outputSettings22.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder26 = outputSettings22.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings22.prettyPrint(false);
        xmlDeclaration3.outerHtmlTail(stringBuilder6, (int) (short) 100, outputSettings28);
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element35 = document33.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document33.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.prettyPrint(true);
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element42 = document40.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = document40.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings43.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap49 = escapeMode48.getMap();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings47.escapeMode(escapeMode48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings38.escapeMode(escapeMode48);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(stringBuilder30, 6, outputSettings51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-" + "'", str5, "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(charsetEncoder26);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        org.jsoup.nodes.Node node8 = element6.parentNode;
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueMatching("#declaration", "          ");
        org.jsoup.nodes.Element element14 = element6.attr("#root", "hi!");
        org.jsoup.nodes.Element element16 = element6.appendText("#declaration");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element20 = document18.text("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        document18.parentNode = document22;
        org.jsoup.nodes.Element element25 = document18.text("<html>\n <head></head>\n <body></body>\n</html>");
        element16.parentNode = document18;
        org.jsoup.nodes.Element element28 = element16.after("#text#text#text#document#texthi!#text<html>\n <head></head>\n <body></body>\n</html>#textdata-");
        org.jsoup.nodes.Element element30 = element16.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueContaining("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "#comment");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan(5);
        boolean boolean11 = document1.hasAttr("<html>\n");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node9 = document2.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "#text#text#text#document#texthi!#text<html>\n <head></head>\n <body></body>\n</html>#textdata-");
        org.jsoup.select.Elements elements11 = document2.getElementsContainingText(" text=\"                                                    \"");
        org.jsoup.nodes.Element element13 = document2.append("                                                    ");
        java.lang.String str14 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-", "hi!");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element9 = document7.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document7.new OutputSettings();
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", outputSettings10);
        comment2.outerHtmlTail(stringBuilder3, 100, outputSettings10);
        java.lang.String str13 = comment2.getData();
        java.lang.String str14 = comment2.getData();
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-" + "'", str13, "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-" + "'", str14, "#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean2 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        java.lang.String str9 = attributes7.html();
        attributes4.addAll(attributes7);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes4.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes4.asList();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag1, "#comment", attributes4);
        attributes4.remove("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes4.asList();
        attributes4.remove("          ");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(attributeList19);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.appendText("hi!");
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document1.getElementsByTag("<html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        document1.siblingIndex = (short) 10;
        org.jsoup.nodes.Element element14 = document1.appendText("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements15 = element14.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#text", "");
        java.util.regex.Pattern pattern4 = null;
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueMatching("&num;declaration=\"&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\"", pattern4);
        java.lang.String str6 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = elements12.toString();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream14 = elements12.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elementStream14);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Node[] nodeArray2 = document1.childNodesAsArray();
        boolean boolean3 = document1.preserveWhitespace();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        java.lang.String str10 = document2.html();
        org.jsoup.parser.Tag tag11 = document2.tag();
        boolean boolean12 = tag11.canContainBlock();
        boolean boolean13 = tag11.isEmpty();
        java.lang.String str14 = tag11.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        boolean boolean8 = tag7.preserveWhitespace();
        java.lang.String str9 = tag7.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        org.jsoup.nodes.Node node8 = element6.parentNode;
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueMatching("#declaration", "          ");
        int int12 = element6.siblingIndex;
        org.jsoup.select.Elements elements14 = element6.getElementsByIndexLessThan(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator15 = elements14.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementSpliterator15);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.util.regex.Pattern pattern1 = null;
        org.jsoup.nodes.Evaluator.AttributeWithValueMatching attributeWithValueMatching2 = new org.jsoup.nodes.Evaluator.AttributeWithValueMatching("#comment", pattern1);
        attributeWithValueMatching2.key = "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!";
        java.util.regex.Pattern pattern5 = null;
        attributeWithValueMatching2.pattern = pattern5;
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray13 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        java.lang.String str17 = document9.html();
        org.jsoup.parser.Tag tag18 = document9.tag();
        java.lang.String str19 = document9.nodeName();
        boolean boolean20 = attributeWithValueMatching2.matches((org.jsoup.nodes.Element) document9);
        java.lang.String str21 = document9.data();
        org.jsoup.parser.Tag tag22 = document9.tag();
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.data();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.nodes.Element element7 = document1.head();
        java.lang.String str8 = element7.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        java.lang.String str4 = document2.toString();
        java.lang.String str6 = document2.attr("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element5 = document3.text("hi!");
        org.jsoup.nodes.Element element6 = document3.body();
        org.jsoup.select.Elements elements8 = element6.getElementsByTag("#document");
        boolean boolean9 = indexEquals1.matches(element6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element13 = document11.text("hi!");
        org.jsoup.nodes.Element element14 = document11.body();
        boolean boolean15 = indexEquals1.matches((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document16 = document11.normalise();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        java.lang.String str10 = document2.html();
        boolean boolean12 = document2.hasClass("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document2.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings13.escapeMode();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("#root", "");
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        textNode19.outerHtmlTail(stringBuilder20, (int) 'a', outputSettings22);
        java.lang.String str24 = textNode19.text();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element30 = document28.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = document28.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = outputSettings31.escapeMode();
        textNode19.outerHtmlTail(stringBuilder25, 100, outputSettings31);
        java.nio.charset.CharsetEncoder charsetEncoder34 = outputSettings31.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder35 = outputSettings31.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap37 = escapeMode36.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap38 = escapeMode36.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap39 = escapeMode36.getMap();
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("#declaration", charsetEncoder35, escapeMode36);
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        java.util.Map<java.lang.Character, java.lang.String> charMap42 = escapeMode41.getMap();
        java.util.Map<java.lang.Character, java.lang.String> charMap43 = escapeMode41.getMap();
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings13.escapeMode(escapeMode41);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertNotNull(charsetEncoder35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap37);
        org.junit.Assert.assertNotNull(charMap38);
        org.junit.Assert.assertNotNull(charMap39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
        org.junit.Assert.assertNotNull(charMap42);
        org.junit.Assert.assertNotNull(charMap43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(outputSettings45);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("data-", "#document");
        document2.setBaseUri("&num;declaration=\"&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = document2.dataset();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean3 = document1.hasAttr(" ");
        org.jsoup.nodes.Element element4 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean2 = tag1.isInline();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        java.lang.String str9 = attributes7.html();
        attributes4.addAll(attributes7);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes4.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes4.asList();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag1, "#comment", attributes4);
        attributes4.remove("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes4.asList();
        boolean boolean18 = attributes4.hasKey("#text#text#text#document#texthi!#text<html>\n <head></head>\n <body></body>\n</html>#textdata-");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.select.Elements elements3 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals1, element2);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals5 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.select.Elements elements7 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals5, element6);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals9 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals9, element10);
        org.jsoup.select.Elements elements13 = elements11.removeClass("#comment");
        int int14 = elements7.indexOf((java.lang.Object) elements11);
        boolean boolean15 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        org.jsoup.select.Elements elements17 = elements7.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals19 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element20 = null;
        org.jsoup.select.Elements elements21 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals19, element20);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals23 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element24 = null;
        org.jsoup.select.Elements elements25 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals23, element24);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals27 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element28 = null;
        org.jsoup.select.Elements elements29 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals27, element28);
        org.jsoup.select.Elements elements31 = elements29.removeClass("#comment");
        int int32 = elements25.indexOf((java.lang.Object) elements29);
        boolean boolean33 = elements21.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.select.Elements elements35 = elements25.val("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean36 = elements7.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray43 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = document39.classNames((java.util.Set<java.lang.String>) strSet44);
        java.lang.String str47 = document39.html();
        org.jsoup.parser.Tag tag48 = document39.tag();
        java.lang.String str49 = document39.nodeName();
        org.jsoup.select.Elements elements52 = document39.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        boolean boolean53 = elements25.add((org.jsoup.nodes.Element) document39);
        org.jsoup.select.Elements elements56 = elements25.attr("#root", "&num;declaration");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals59 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element60 = null;
        org.jsoup.select.Elements elements61 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals59, element60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = elements56.addAll(100, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str47, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#document" + "'", str49, "#document");
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) 'h');
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting4 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("#comment", "<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element8 = document6.text("hi!");
        org.jsoup.nodes.Element element9 = document6.body();
        org.jsoup.nodes.Element element11 = document6.appendText("hi!");
        boolean boolean12 = attributeWithValueStarting4.matches(element11);
        boolean boolean13 = indexLessThan1.matches(element11);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingText("#comment");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals8 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.select.Elements elements10 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals8, element9);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals12 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals12, element13);
        org.jsoup.select.Elements elements16 = elements14.removeClass("#comment");
        int int17 = elements10.indexOf((java.lang.Object) elements14);
        org.jsoup.select.Elements elements19 = elements10.html("#comment");
        org.jsoup.select.Elements elements20 = elements19.parents();
        boolean boolean21 = elements5.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements19.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = elements19.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elementSpliterator22);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.select.Elements elements3 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals1, element2);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals5 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.select.Elements elements7 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals5, element6);
        org.jsoup.select.Elements elements9 = elements7.removeClass("#comment");
        int int10 = elements3.indexOf((java.lang.Object) elements7);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals12 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals12, element13);
        org.jsoup.select.Elements elements16 = elements14.removeClass("#comment");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList18 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList18, elementArray17);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator20 = elementList18.spliterator();
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals22 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.select.Elements elements24 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals22, element23);
        org.jsoup.select.Elements elements26 = elements24.removeClass("#comment");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals28 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element29 = null;
        org.jsoup.select.Elements elements30 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals28, element29);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals32 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element33 = null;
        org.jsoup.select.Elements elements34 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals32, element33);
        org.jsoup.select.Elements elements36 = elements34.removeClass("#comment");
        int int37 = elements30.indexOf((java.lang.Object) elements34);
        org.jsoup.nodes.Element[] elementArray38 = new org.jsoup.nodes.Element[] {};
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList39, elementArray38);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator41 = elementList39.spliterator();
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals43 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element44 = null;
        org.jsoup.select.Elements elements45 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals43, element44);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals47 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element48 = null;
        org.jsoup.select.Elements elements49 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals47, element48);
        org.jsoup.select.Elements elements51 = elements49.removeClass("#comment");
        int int52 = elements45.indexOf((java.lang.Object) elements49);
        java.util.List[] listArray54 = new java.util.List[6];
        @SuppressWarnings("unchecked")
        java.util.List<org.jsoup.nodes.Element>[] elementListArray55 = (java.util.List<org.jsoup.nodes.Element>[]) listArray54;
        elementListArray55[0] = elements16;
        elementListArray55[1] = elementList18;
        elementListArray55[2] = elements24;
        elementListArray55[3] = elements30;
        elementListArray55[4] = elementList39;
        elementListArray55[5] = elements49;
        java.util.List<org.jsoup.nodes.Element>[] elementListArray68 = elements7.toArray(elementListArray55);
        boolean boolean70 = elements7.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray77 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.jsoup.nodes.Element element80 = document73.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.select.Elements elements83 = element80.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals85 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element86 = null;
        org.jsoup.select.Elements elements87 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals85, element86);
        org.jsoup.select.Elements elements88 = elements87.parents();
        org.jsoup.select.Elements elements90 = elements87.append("#text#documenthi!<html> <head></head> <body></body> </html>data-");
        boolean boolean91 = elements83.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements90);
        boolean boolean92 = elements7.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements83);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elementSpliterator20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(elementArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elementSpliterator41);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(listArray54);
        org.junit.Assert.assertNotNull(elementListArray55);
        org.junit.Assert.assertNotNull(elementListArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(elements83);
        org.junit.Assert.assertNotNull(elements87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(elements90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element5 = document3.text("hi!");
        org.jsoup.nodes.Element element6 = document3.body();
        org.jsoup.select.Elements elements8 = element6.getElementsByTag("#document");
        boolean boolean9 = indexEquals1.matches(element6);
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals11 = new org.jsoup.nodes.Evaluator.IndexEquals((int) '4');
        int int12 = indexEquals11.index;
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("");
        boolean boolean15 = document14.preserveWhitespace();
        document14.title("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = document14.dataset();
        org.jsoup.nodes.Element element20 = document14.createElement("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        boolean boolean21 = indexEquals11.matches((org.jsoup.nodes.Element) document14);
        boolean boolean22 = indexEquals1.matches((org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element26 = document24.text("hi!");
        org.jsoup.nodes.Element element27 = document24.body();
        org.jsoup.nodes.Element element29 = document24.appendText("hi!");
        java.lang.String str30 = document24.id();
        org.jsoup.nodes.Element element32 = document24.prependText("#text#text#text#document#texthi!#text<html>\n <head></head>\n <body></body>\n</html>#textdata-");
        java.lang.String str33 = document24.outerHtml();
        boolean boolean34 = indexEquals1.matches((org.jsoup.nodes.Element) document24);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#text#text#text#document#texthi!#text&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;#textdata-\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" + "'", str33, "#text#text#text#document#texthi!#text&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;#textdata-\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#root", "");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        textNode2.outerHtmlTail(stringBuilder3, (int) 'a', outputSettings5);
        java.lang.String str7 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("                                                    ");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n  <html>  \n  </html> \n </body>\n</html>", "html>\n <head>\n  <title></title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements6 = elements4.html(" text=\"                                                    \"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#document", "#root");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((int) (byte) -1);
        java.lang.String str5 = document2.text();
        boolean boolean7 = document2.hasClass("<html>\n <head></head>\n <body>\n  <html>  \n  </html> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element5 = document3.text("hi!");
        org.jsoup.nodes.Element element6 = document3.body();
        org.jsoup.select.Elements elements8 = element6.getElementsByTag("#document");
        boolean boolean9 = indexEquals1.matches(element6);
        org.jsoup.nodes.Element element12 = element6.attr("<html> <head></head> <body></body> </html>", "<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str16 = comment15.nodeName();
        element12.replaceWith((org.jsoup.nodes.Node) comment15);
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("#root", "");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        textNode22.outerHtmlTail(stringBuilder23, (int) 'a', outputSettings25);
        java.lang.String str27 = textNode22.text();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element33 = document31.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document31.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        textNode22.outerHtmlTail(stringBuilder28, 100, outputSettings34);
        java.nio.charset.CharsetEncoder charsetEncoder37 = outputSettings34.encoder();
        comment15.outerHtmlTail(stringBuilder18, (int) (byte) 0, outputSettings34);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder37);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.select.Elements elements3 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals1, element2);
        org.jsoup.select.Elements elements4 = elements3.parents();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element8 = document6.text("hi!");
        org.jsoup.select.Elements elements10 = document6.getElementsContainingText("#comment");
        org.jsoup.nodes.Node node12 = document6.childNode(0);
        org.jsoup.select.Elements elements14 = document6.getElementsByAttribute("#declaration");
        boolean boolean15 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements14.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.appendText("hi!");
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Element element9 = document1.appendText("");
        org.jsoup.nodes.Element element10 = document1.body();
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueMatching("#document", pattern12);
        org.jsoup.select.Elements elements15 = elements13.html("#root");
        org.jsoup.select.Elements elements17 = elements15.prepend("html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray19 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        java.lang.String str23 = document15.html();
        org.jsoup.nodes.Element element24 = document15.empty();
        org.jsoup.nodes.Element element25 = element9.appendChild((org.jsoup.nodes.Node) document15);
        element9.setBaseUri("html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.createElement("#text");
        org.jsoup.nodes.Element element10 = document2.prependText(" ");
        java.lang.String str12 = element10.attr("&num;declaration=\"&lt;html&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("#comment", "<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals4 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element8 = document6.text("hi!");
        org.jsoup.nodes.Element element9 = document6.body();
        org.jsoup.select.Elements elements11 = element9.getElementsByTag("#document");
        boolean boolean12 = indexEquals4.matches(element9);
        org.jsoup.nodes.Element element15 = element9.attr("<html> <head></head> <body></body> </html>", "<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan(2);
        boolean boolean18 = attributeWithValueStarting2.matches(element15);
        boolean boolean20 = element15.hasClass("&gt;\n &lt;head&gt;\n  &lt;title&gt;&lt;/title&gt;\n &lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(" <head>\n  <title></title>\n </head>\n <body></body>\n</html>", "          ");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element5 = document3.text("hi!");
        org.jsoup.select.Elements elements7 = document3.getElementsContainingText("#comment");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals1, (org.jsoup.nodes.Element) document3);
        org.jsoup.select.Elements elements9 = elements8.empty();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor10 = elements9.iterator();
        org.jsoup.select.Elements elements12 = elements9.prepend("#text");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("#document", "#root");
        java.lang.StringBuilder stringBuilder3 = null;
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray11 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        element14.attributes = attributes18;
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element25 = document23.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document23.new OutputSettings();
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", outputSettings26);
        attributes18.html(stringBuilder20, outputSettings26);
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element33 = document31.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document31.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        int int36 = outputSettings34.indentAmount();
        attributes18.html(stringBuilder29, outputSettings34);
        dataNode2.outerHtmlTail(stringBuilder3, (int) '<', outputSettings34);
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = document43.childNodes();
        org.jsoup.nodes.Element element47 = document43.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements49 = document43.getElementsMatchingOwnText("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = document43.outputSettings();
        java.nio.charset.Charset charset51 = outputSettings50.charset();
        dataNode2.outerHtmlTail(stringBuilder39, (int) (short) 10, outputSettings50);
        java.lang.String str53 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode55 = dataNode2.setWholeData("\n<body>\n #root\n</body>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#document" + "'", str53, "#document");
        org.junit.Assert.assertNotNull(dataNode55);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.lang.String[] strArray6 = new java.lang.String[] { "#comment", "#comment", "#comment" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        java.lang.String str10 = document2.html();
        org.jsoup.parser.Tag tag11 = document2.tag();
        java.lang.String str12 = document2.nodeName();
        java.lang.String str13 = document2.ownText();
        org.jsoup.select.Elements elements15 = document2.getElementsMatchingOwnText("");
        boolean boolean17 = document2.hasClass("#document");
        org.jsoup.nodes.Node node18 = document2.parent();
        java.lang.String str19 = document2.nodeName();
        org.jsoup.nodes.Element element21 = document2.prependText("html");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Node node4 = document2.parentNode;
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element8 = document6.text("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document6.new OutputSettings();
        org.jsoup.nodes.Element element10 = document2.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node13 = document2.attr("#text#documenthi!<html>\n <head></head>\n <body></body>\n</html>data-", "          ");
        java.lang.String str14 = document2.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.nodes.Element element3 = document1.text("hi!");
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.nodes.Element element6 = document1.appendText("hi!");
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByClass("          ");
        java.lang.String str11 = document8.id();
        boolean boolean12 = document8.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        boolean boolean8 = tag7.isBlock();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag7, "<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean11 = tag7.preserveWhitespace();
        boolean boolean12 = tag7.isKnownTag();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean16 = tag15.isInline();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes18.dataset();
        java.lang.String str20 = attributes18.html();
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes21.dataset();
        java.lang.String str23 = attributes21.html();
        attributes18.addAll(attributes21);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator25 = attributes18.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes18.asList();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag15, "#comment", attributes18);
        attributes18.remove("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Attribute> attributeList30 = attributes18.asList();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag7, "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>", attributes18);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeSpliterator25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(attributeList30);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.jsoup.nodes.Element element6 = document2.attr("hi!", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag7 = element6.tag();
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isSelfClosing();
        boolean boolean10 = tag7.isEmpty();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes12.dataset();
        java.lang.String str14 = attributes12.html();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        java.lang.String str17 = attributes15.html();
        attributes12.addAll(attributes15);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag7, "hi!hi!", attributes15);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }
}

