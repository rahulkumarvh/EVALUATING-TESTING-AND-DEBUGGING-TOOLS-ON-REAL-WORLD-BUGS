package org.jsoup.parser;

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
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(" data=\"\"", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.wrap(":gt(-1)");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(":contains(hi!", ":empty");
        org.jsoup.nodes.Element element4 = document2.toggleClass(":empty");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element4.lastElementSibling();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        org.jsoup.nodes.Element element6 = document3.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment("", element6, "<:containsOwn(hi!>");
        java.lang.Integer int9 = element6.elementSiblingIndex();
        htmlTreeBuilder0.setHeadElement(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder0.parse("#root", "[*]");
        htmlTreeBuilder0.resetInsertionMode();
        boolean boolean17 = htmlTreeBuilder0.inScope("[:containsown(hi!!=#document]");
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.getActiveFormattingElement(" data=\"\" #root=\":first-of-type\"");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj22 = null;
        boolean boolean23 = document21.equals(obj22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = document21.siblingNodes();
        org.jsoup.select.Elements elements26 = document21.getElementsByTag(" data=\"\"");
        boolean boolean27 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document21);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str30 = document29.data();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.parser.Tag tag33 = document32.tag();
        org.jsoup.nodes.Element element35 = document32.appendText("");
        java.lang.String str36 = element35.baseUri();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("[:gt(-1)$=starttag]");
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str41 = document40.data();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj45 = null;
        boolean boolean46 = document44.equals(obj45);
        boolean boolean48 = document44.hasAttr(":gt(-1)");
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document document50 = document44.outputSettings(outputSettings49);
        htmlTreeBuilder42.pushActiveFormattingElements((org.jsoup.nodes.Element) document44);
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj56 = null;
        boolean boolean57 = document55.equals(obj56);
        org.jsoup.nodes.Element element59 = document55.addClass("");
        java.lang.String str60 = document55.location();
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.Object obj63 = null;
        boolean boolean64 = document62.equals(obj63);
        java.lang.String[] strArray72 = new java.lang.String[] { ":empty", "#root", " data=\"\"", "hi!", "*", ":gt(-1)", "StartTag" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        org.jsoup.nodes.Element element75 = document62.classNames((java.util.Set<java.lang.String>) strSet73);
        org.jsoup.nodes.Element[] elementArray76 = new org.jsoup.nodes.Element[] { document29, element35, document38, document40, document44, document53, document55, document62 };
        java.util.LinkedList<org.jsoup.nodes.Element> elementList77 = new java.util.LinkedList<org.jsoup.nodes.Element>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList77, elementArray76);
        java.lang.Object obj79 = elementList77.clone();
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType82 = new org.jsoup.select.Evaluator.IsNthOfType(2, 0);
        boolean boolean83 = elementList77.removeFirstOccurrence((java.lang.Object) isNthOfType82);
        org.jsoup.nodes.Element element84 = elementList77.peekFirst();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.jsoup.nodes.Element element85 = htmlTreeBuilder0.aboveOnStack(element84);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        org.jsoup.nodes.Element element6 = document3.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment("", element6, "<:containsOwn(hi!>");
        java.lang.Integer int9 = element6.elementSiblingIndex();
        htmlTreeBuilder0.setHeadElement(element6);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder0.parse("#root", "[*]");
        htmlTreeBuilder0.resetInsertionMode();
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.jsoup.nodes.Element element17 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str22 = document21.data();
        org.jsoup.nodes.Element element24 = document21.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = org.jsoup.parser.Parser.parseFragment("", element24, "<:containsOwn(hi!>");
        java.lang.Integer int27 = element24.elementSiblingIndex();
        htmlTreeBuilder18.setHeadElement(element24);
        htmlTreeBuilder18.generateImpliedEndTags();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder18.parse("#root", "[*]");
        htmlTreeBuilder18.resetInsertionMode();
        java.lang.String[] strArray35 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        boolean boolean36 = htmlTreeBuilder18.inScope(":eq(-1)", strArray35);
        htmlTreeBuilder0.popStackToClose(strArray35);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        char[] charArray42 = new char[] { 'a', '#', '#' };
        startTag38.appendAttributeValue(charArray42);
        java.lang.String str44 = startTag38.tagName;
        org.jsoup.parser.Token.StartTag startTag45 = startTag38.asStartTag();
        startTag38.selfClosing = false;
        boolean boolean48 = startTag38.isEndTag();
        startTag38.appendAttributeName(":nth-of-type(10)");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState51 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag38, htmlTreeBuilderState51);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str4 = document3.data();
        org.jsoup.nodes.Element element6 = document3.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment("", element6, "<:containsOwn(hi!>");
        java.lang.Integer int9 = element6.elementSiblingIndex();
        htmlTreeBuilder0.setHeadElement(element6);
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str17 = document16.data();
        org.jsoup.nodes.Element element19 = document16.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment("", element19, "<:containsOwn(hi!>");
        java.lang.Integer int22 = element19.elementSiblingIndex();
        htmlTreeBuilder13.setHeadElement(element19);
        htmlTreeBuilder13.generateImpliedEndTags();
        org.jsoup.nodes.Document document27 = htmlTreeBuilder13.parse("#root", "[*]");
        htmlTreeBuilder13.resetInsertionMode();
        htmlTreeBuilder13.clearStackToTableBodyContext();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str34 = document33.data();
        org.jsoup.nodes.Element element36 = document33.text(":first-of-type");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = org.jsoup.parser.Parser.parseFragment("", element36, "<:containsOwn(hi!>");
        java.lang.Integer int39 = element36.elementSiblingIndex();
        htmlTreeBuilder30.setHeadElement(element36);
        htmlTreeBuilder30.generateImpliedEndTags();
        org.jsoup.nodes.Document document44 = htmlTreeBuilder30.parse("#root", "[*]");
        htmlTreeBuilder30.resetInsertionMode();
        java.lang.String[] strArray47 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        boolean boolean48 = htmlTreeBuilder30.inScope(":eq(-1)", strArray47);
        java.lang.String[] strArray53 = new java.lang.String[] { ":last-child", ":only-child", "</<html>\n <head></head>\n <body></body>\n</html>>", " data=\"\"" };
        htmlTreeBuilder30.popStackToClose(strArray53);
        boolean boolean55 = htmlTreeBuilder13.inScope(strArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean56 = htmlTreeBuilder0.inScope("<html>\n <head></head>\n <body>\n  Doctype\n </body>\n</html>[]", strArray53);
    }
}

