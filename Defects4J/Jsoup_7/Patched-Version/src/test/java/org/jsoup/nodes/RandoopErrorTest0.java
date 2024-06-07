package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document4.title("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = document3.dataset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document3.wrap("SYSTEM  SYSTEM SYSTEM");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document4.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode7 = document4.quirksMode();
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document4.text("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Comment comment3 = new org.jsoup.nodes.Comment(":last-of-type", "SYSTEMhi");
        org.jsoup.nodes.Node node5 = comment3.removeAttr(":last-of-type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent(node5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        java.lang.String str8 = document6.text();
        org.jsoup.nodes.Element element11 = document6.attr("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.prepend("SYSTEM");
        org.jsoup.nodes.Attributes attributes8 = element7.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.processStartTag("4", attributes8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag();
        endTag3.finaliseTag();
        org.jsoup.parser.Token.Tag tag5 = endTag3.reset();
        tag5.finaliseTag();
        tag5.appendAttributeName('a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        java.lang.String str8 = document6.text();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType11 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType11, (org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = org.jsoup.select.Collector.collect((org.jsoup.select.Evaluator) isNthLastOfType11, (org.jsoup.nodes.Element) document16);
        boolean boolean18 = document6.is((org.jsoup.select.Evaluator) isNthLastOfType11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("SYSTEM", "SYSTEM");
        org.jsoup.nodes.Node node9 = textNode6.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes10 = textNode6.attributes();
        boolean boolean12 = attributes10.equals((java.lang.Object) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.processStartTag("4", attributes10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement(":containsOwn(system)");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("SYSTEMhi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope(":containsOwn(system)");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element5 = document3.prepend("SYSTEM");
        org.jsoup.nodes.Document document6 = document3.ownerDocument();
        org.jsoup.select.Elements elements8 = document6.getElementsContainingOwnText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document6.childNodesCopy();
        boolean boolean10 = document6.hasParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document4.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode7 = document4.quirksMode();
        java.lang.String str9 = document4.attr("hi!");
        org.jsoup.nodes.Element element10 = document4.empty();
        org.jsoup.nodes.Element element12 = element10.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = htmlTreeBuilder0.isInActiveFormattingElements(element12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = endTag1.reset();
        java.lang.String str4 = tag3.normalName();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag3, htmlTreeBuilderState5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.finaliseTag();
        org.jsoup.helper.Validate.notNull((java.lang.Object) endTag1, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("[**=hi!]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jsoup.nodes.TextNode textNode1 = new org.jsoup.nodes.TextNode("*");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = textNode1.wrap(":matchesOwn(null)");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements6 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType3, (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Element element8 = document5.removeClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("SYSTEMhi:last-of-type#document");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.select.Evaluator.IsEmpty isEmpty3 = new org.jsoup.select.Evaluator.IsEmpty();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.prepend("SYSTEM");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.prepend("SYSTEM");
        org.jsoup.nodes.Document document12 = document9.ownerDocument();
        org.jsoup.select.Elements elements14 = document12.getElementsContainingOwnText("");
        int int15 = document12.siblingIndex();
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Element element17 = element7.appendTo((org.jsoup.nodes.Element) document12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("", "");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("", "");
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document35.prepend("SYSTEM");
        org.jsoup.nodes.Document document38 = document35.ownerDocument();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element42 = document40.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray43 = new org.jsoup.nodes.Element[] { document23, document25, element29, document33, document38, document40 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList44 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList44, elementArray43);
        org.jsoup.select.Elements elements46 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList44);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator47 = elements46.spliterator();
        xmlTreeBuilder18.stack = elements46;
        org.jsoup.nodes.Document document51 = xmlTreeBuilder18.parse("", "SYSTEM");
        org.jsoup.nodes.Document document52 = xmlTreeBuilder18.doc;
        boolean boolean53 = isEmpty3.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element54 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document52);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingText("SYSTEMhi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document1.firstElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = htmlTreeBuilder0.inTableScope("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("[null]=\"*\"");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inTableScope("SYSTEMhi");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element5 = document3.prepend("SYSTEM");
        org.jsoup.nodes.Document document6 = document3.ownerDocument();
        org.jsoup.select.Elements elements8 = document6.getElementsContainingOwnText("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document6.childNodesCopy();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.val();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = document14.quirksMode();
        org.jsoup.nodes.Element element18 = document11.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element19 = document14.head();
        org.jsoup.nodes.Element element21 = document14.after("SYSTEM  SYSTEM SYSTEM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document6, (org.jsoup.nodes.Element) document14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document5.prepend("SYSTEM");
        org.jsoup.nodes.Document document8 = document5.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsContainingOwnText("");
        int int11 = document8.siblingIndex();
        boolean boolean12 = document8.hasText();
        org.jsoup.nodes.Element element13 = element3.appendTo((org.jsoup.nodes.Element) document8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = document17.dataset();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = document17.textNodes();
        org.jsoup.select.Elements elements22 = document17.getElementsByAttributeValueNot(":last-of-type", "SYSTEM  SYSTEM SYSTEM");
        org.jsoup.nodes.Element element23 = element3.appendTo((org.jsoup.nodes.Element) document17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document17.text("\n<!--:last-of-type-->");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.val();
        org.jsoup.select.Elements elements8 = document4.getElementsByAttributeValueMatching("", "");
        htmlTreeBuilder0.stack = elements8;
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document11.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode14 = document11.quirksMode();
        java.lang.String str16 = document11.attr("hi!");
        org.jsoup.nodes.Element element17 = document11.empty();
        org.jsoup.nodes.Element element19 = element17.html("");
        org.jsoup.nodes.Element element21 = element17.removeClass("[null]");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        java.lang.String str24 = document23.val();
        org.jsoup.select.Elements elements27 = document23.getElementsByAttributeValueEnding("hi!", "hi!");
        java.lang.String str28 = document23.val();
        org.jsoup.nodes.Element element30 = document23.html(":last-of-type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement(element17, (org.jsoup.nodes.Element) document23);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.processStartTag("#document");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document7.prepend("SYSTEM");
        org.jsoup.nodes.Attributes attributes10 = element9.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes10.spliterator();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute(":last-of-type", "4");
        org.jsoup.nodes.Attributes attributes15 = attributes10.put(attribute14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilder0.processStartTag(":containsOwn(system)", attributes10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan4 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.prepend("SYSTEM");
        org.jsoup.nodes.Document document25 = document22.ownerDocument();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray30 = new org.jsoup.nodes.Element[] { document10, document12, element16, document20, document25, document27 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList31 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList31, elementArray30);
        org.jsoup.select.Elements elements33 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList31);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator34 = elements33.spliterator();
        xmlTreeBuilder5.stack = elements33;
        org.jsoup.nodes.Document document38 = xmlTreeBuilder5.parse("", "SYSTEM");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder5.doc;
        org.jsoup.nodes.Element element41 = document39.prependText("*");
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element49 = document47.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("", "");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element57 = document55.prepend("SYSTEM");
        org.jsoup.nodes.Document document58 = document55.ownerDocument();
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element62 = document60.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray63 = new org.jsoup.nodes.Element[] { document43, document45, element49, document53, document58, document60 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList64 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList64, elementArray63);
        org.jsoup.select.Elements elements66 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList64);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType69 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document71 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements72 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType69, (org.jsoup.nodes.Element) document71);
        org.jsoup.select.Elements elements73 = elements72.empty();
        boolean boolean74 = elements66.remove((java.lang.Object) elements72);
        org.jsoup.nodes.Document document77 = new org.jsoup.nodes.Document("");
        java.lang.String str78 = document77.val();
        org.jsoup.nodes.Document document80 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element82 = document80.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode83 = document80.quirksMode();
        org.jsoup.nodes.Element element84 = document77.prependChild((org.jsoup.nodes.Node) document80);
        elements66.add(0, (org.jsoup.nodes.Element) document77);
        boolean boolean86 = indexGreaterThan4.matches(element41, (org.jsoup.nodes.Element) document77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean87 = htmlTreeBuilder0.isInActiveFormattingElements(element41);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getActiveFormattingElement("SYSTEMhi:last-of-type#document");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings5 = new org.jsoup.parser.ParseSettings(true, true);
        htmlTreeBuilder0.settings = parseSettings5;
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
        java.lang.String str13 = document11.text();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType16 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType16, (org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = org.jsoup.select.Collector.collect((org.jsoup.select.Evaluator) isNthLastOfType16, (org.jsoup.nodes.Element) document21);
        boolean boolean23 = document11.is((org.jsoup.select.Evaluator) isNthLastOfType16);
        org.jsoup.select.Elements elements26 = document11.getElementsByAttributeValue("SYSTEM  SYSTEM SYSTEM", "SYSTEMhi!");
        org.jsoup.select.Elements elements28 = document11.select("*");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token3 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.prepend("SYSTEM");
        org.jsoup.nodes.Document document12 = document9.ownerDocument();
        org.jsoup.select.Elements elements14 = document12.getElementsContainingOwnText("");
        int int15 = document12.siblingIndex();
        boolean boolean16 = document12.hasText();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document12.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        java.lang.String str3 = htmlTreeBuilder0.baseUri;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("4");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack("SYSTEM");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("SYSTEM", "SYSTEM");
        org.jsoup.nodes.Node node5 = textNode2.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.text();
        java.lang.String str9 = textNode2.absUrl("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = textNode2.wrap("SYSTEMhi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan4 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element16 = document14.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.prepend("SYSTEM");
        org.jsoup.nodes.Document document25 = document22.ownerDocument();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element29 = document27.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray30 = new org.jsoup.nodes.Element[] { document10, document12, element16, document20, document25, document27 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList31 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList31, elementArray30);
        org.jsoup.select.Elements elements33 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList31);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator34 = elements33.spliterator();
        xmlTreeBuilder5.stack = elements33;
        org.jsoup.nodes.Document document38 = xmlTreeBuilder5.parse("", "SYSTEM");
        org.jsoup.nodes.Document document39 = xmlTreeBuilder5.doc;
        org.jsoup.nodes.Element element41 = document39.prependText("*");
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element49 = document47.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("", "");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element57 = document55.prepend("SYSTEM");
        org.jsoup.nodes.Document document58 = document55.ownerDocument();
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element62 = document60.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray63 = new org.jsoup.nodes.Element[] { document43, document45, element49, document53, document58, document60 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList64 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList64, elementArray63);
        org.jsoup.select.Elements elements66 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList64);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType69 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document71 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements72 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType69, (org.jsoup.nodes.Element) document71);
        org.jsoup.select.Elements elements73 = elements72.empty();
        boolean boolean74 = elements66.remove((java.lang.Object) elements72);
        org.jsoup.nodes.Document document77 = new org.jsoup.nodes.Document("");
        java.lang.String str78 = document77.val();
        org.jsoup.nodes.Document document80 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element82 = document80.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode83 = document80.quirksMode();
        org.jsoup.nodes.Element element84 = document77.prependChild((org.jsoup.nodes.Node) document80);
        elements66.add(0, (org.jsoup.nodes.Element) document77);
        boolean boolean86 = indexGreaterThan4.matches(element41, (org.jsoup.nodes.Element) document77);
        htmlTreeBuilder0.setHeadElement(element41);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState88 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState88);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.val();
        org.jsoup.select.Elements elements8 = document4.getElementsByAttributeValueMatching("", "");
        htmlTreeBuilder0.stack = elements8;
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document12.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode15 = document12.quirksMode();
        java.lang.String str17 = document12.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document12, "*");
        org.jsoup.parser.Tag tag20 = document12.tag();
        boolean boolean21 = tag20.isFormListed();
        boolean boolean22 = tag20.isFormSubmittable();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        int int25 = attributes24.size();
        org.jsoup.nodes.FormElement formElement26 = new org.jsoup.nodes.FormElement(tag20, "SYSTEM", attributes24);
        htmlTreeBuilder0.setFormElement(formElement26);
        org.jsoup.nodes.Document document28 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        java.lang.String str6 = document4.text();
        org.jsoup.nodes.Element element9 = document4.attr("hi!", "hi!");
        org.jsoup.nodes.Element element12 = element9.attr(":last-of-type", "SYSTEMhi");
        int int13 = element12.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element12.wrap(":matchesOwn(null)");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder1.parse("", "");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element12 = document10.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document18.prepend("SYSTEM");
        org.jsoup.nodes.Document document21 = document18.ownerDocument();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document23.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray26 = new org.jsoup.nodes.Element[] { document6, document8, element12, document16, document21, document23 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList27 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList27, elementArray26);
        org.jsoup.select.Elements elements29 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList27);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator30 = elements29.spliterator();
        xmlTreeBuilder1.stack = elements29;
        org.jsoup.nodes.Document document34 = xmlTreeBuilder1.parse("", "SYSTEM");
        org.jsoup.nodes.Document document35 = xmlTreeBuilder1.doc;
        org.jsoup.parser.Token.EndTag endTag36 = new org.jsoup.parser.Token.EndTag();
        endTag36.finaliseTag();
        org.jsoup.helper.Validate.notNull((java.lang.Object) endTag36, "hi!");
        endTag36.appendAttributeName("*");
        xmlTreeBuilder1.currentToken = endTag36;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList44 = htmlTreeBuilder43.stack;
        org.jsoup.nodes.Document document45 = htmlTreeBuilder43.getDocument();
        org.jsoup.nodes.Element element46 = htmlTreeBuilder43.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag36, htmlTreeBuilder43);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        doctype5.forceQuirks = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings5 = new org.jsoup.parser.ParseSettings(true, true);
        htmlTreeBuilder0.settings = parseSettings5;
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("SYSTEM", "SYSTEM");
        org.jsoup.nodes.Node node13 = textNode10.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes14 = textNode10.attributes();
        boolean boolean16 = attributes14.equals((java.lang.Object) (byte) 100);
        java.lang.String str17 = attributes14.toString();
        org.jsoup.nodes.Attributes attributes20 = attributes14.put("SYSTEMhi", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = htmlTreeBuilder0.processStartTag(":only-of-type", attributes14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getActiveFormattingElement(":gt(-1)");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getFromStack("SYSTEMhi");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.val();
        org.jsoup.helper.Validate.notNull((java.lang.Object) document5);
        java.util.Set<java.lang.String> strSet8 = document5.classNames();
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.resetInsertionMode();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.currentElement();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        int int8 = attributes7.size();
        org.jsoup.parser.Token.StartTag startTag9 = startTag5.nameAttr(":last-of-type", attributes7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insert(startTag9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = new org.jsoup.parser.ParseErrorList(0, (int) (short) 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "SYSTEM" };
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.sort(strArray5);
        boolean boolean7 = parseErrorList3.equals((java.lang.Object) strArray6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        int int9 = parseErrorList3.indexOf((java.lang.Object) htmlTreeBuilderState8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = element3.text("SYSTEM  SYSTEM SYSTEM");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = htmlTreeBuilder0.inListItemScope("EndTag");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token3 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document2.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode5 = document2.quirksMode();
        org.jsoup.select.Elements elements7 = document2.getElementsMatchingText("SYSTEMhi!");
        org.jsoup.select.Elements elements8 = document2.getAllElements();
        org.jsoup.nodes.Element element10 = document2.tagName("[]");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.val();
        org.jsoup.select.Elements elements16 = document12.getElementsByAttributeValueMatching("", "");
        boolean boolean17 = allElements0.matches((org.jsoup.nodes.Element) document2, (org.jsoup.nodes.Element) document12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document12.text("org.jsoup.SerializationException: SYSTEMhi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.stack;
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.finaliseTag();
        endTag4.selfClosing = true;
        boolean boolean8 = endTag4.isComment();
        endTag4.normalName = "";
        boolean boolean11 = endTag4.isSelfClosing();
        boolean boolean12 = endTag4.isStartTag();
        htmlTreeBuilder0.currentToken = endTag4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = htmlTreeBuilder0.getFromStack("!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        org.jsoup.nodes.Document document4 = document1.ownerDocument();
        org.jsoup.nodes.Node node5 = document4.root();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document4.title("");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token3 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.stack;
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("*");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("#document", "SYSTEM");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document4.prepend("SYSTEM");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element10 = document8.prepend("SYSTEM");
        org.jsoup.nodes.Document document11 = document8.ownerDocument();
        org.jsoup.select.Elements elements13 = document11.getElementsContainingOwnText("");
        int int14 = document11.siblingIndex();
        boolean boolean15 = document11.hasText();
        org.jsoup.nodes.Element element16 = element6.appendTo((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = document20.dataset();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = document20.textNodes();
        org.jsoup.select.Elements elements25 = document20.getElementsByAttributeValueNot(":last-of-type", "SYSTEM  SYSTEM SYSTEM");
        org.jsoup.nodes.Element element26 = element6.appendTo((org.jsoup.nodes.Element) document20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder27.parse("", "");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element38 = document36.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder39.parse("", "");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element46 = document44.prepend("SYSTEM");
        org.jsoup.nodes.Document document47 = document44.ownerDocument();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element51 = document49.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray52 = new org.jsoup.nodes.Element[] { document32, document34, element38, document42, document47, document49 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList53 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList53, elementArray52);
        org.jsoup.select.Elements elements55 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList53);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator56 = elements55.spliterator();
        xmlTreeBuilder27.stack = elements55;
        org.jsoup.nodes.Document document60 = xmlTreeBuilder27.parse("", "SYSTEM");
        org.jsoup.nodes.Document document61 = xmlTreeBuilder27.doc;
        org.jsoup.nodes.Element element63 = document61.prependText("*");
        boolean boolean64 = attributeWithValueStarting2.matches(element6, (org.jsoup.nodes.Element) document61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element65 = document61.firstElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.stack;
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        org.jsoup.helper.Validate.notNull((java.lang.Object) endTag5, "hi!");
        endTag5.finaliseTag();
        boolean boolean10 = endTag5.selfClosing;
        endTag5.finaliseTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.val();
        org.jsoup.select.Elements elements8 = document4.getElementsByAttributeValueMatching("", "");
        htmlTreeBuilder0.stack = elements8;
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = org.jsoup.parser.HtmlTreeBuilderState.InCaption;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.val();
        org.jsoup.select.Elements elements8 = document4.getElementsByAttributeValueMatching("", "");
        htmlTreeBuilder0.stack = elements8;
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getActiveFormattingElement("<#root>\n SYSTEM\n</#root>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element11 = document9.prepend("SYSTEM");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document17.prepend("SYSTEM");
        org.jsoup.nodes.Document document20 = document17.ownerDocument();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element24 = document22.prepend("SYSTEM");
        org.jsoup.nodes.Element[] elementArray25 = new org.jsoup.nodes.Element[] { document5, document7, element11, document15, document20, document22 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList26, elementArray25);
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList26);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator29 = elements28.spliterator();
        xmlTreeBuilder0.stack = elements28;
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("", "SYSTEM");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = document33.lastElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.processEndTag("                                                                                   ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<#root>\n SYSTEM\n</#root>");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.prepend("SYSTEM");
        org.jsoup.nodes.Document document9 = document6.ownerDocument();
        org.jsoup.select.Elements elements11 = document9.getElementsContainingOwnText("");
        int int12 = document9.siblingIndex();
        org.jsoup.nodes.Element element14 = document9.createElement("#text");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = document9.firstElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.stack;
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.finaliseTag();
        endTag4.selfClosing = true;
        boolean boolean8 = endTag4.isComment();
        endTag4.normalName = "";
        boolean boolean11 = endTag4.isSelfClosing();
        boolean boolean12 = endTag4.isStartTag();
        htmlTreeBuilder0.currentToken = endTag4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("[**=hi!]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope(" <!--:last-of-type-->");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        org.jsoup.select.Evaluator.AllElements allElements4 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode9 = document6.quirksMode();
        org.jsoup.select.Elements elements11 = document6.getElementsMatchingText("SYSTEMhi!");
        org.jsoup.select.Elements elements12 = document6.getAllElements();
        org.jsoup.nodes.Element element14 = document6.tagName("[]");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.val();
        org.jsoup.select.Elements elements20 = document16.getElementsByAttributeValueMatching("", "");
        boolean boolean21 = allElements4.matches((org.jsoup.nodes.Element) document6, (org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Attributes attributes22 = document16.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = htmlTreeBuilder0.processStartTag("[null]=\"*\"=\"#root\"", attributes22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder2.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder2.originalState();
        htmlTreeBuilder2.generateImpliedEndTags();
        htmlTreeBuilder2.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder2.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
        htmlTreeBuilder2.transition(htmlTreeBuilderState10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document6.prepend("SYSTEM");
        org.jsoup.nodes.Document document9 = document6.ownerDocument();
        org.jsoup.select.Elements elements11 = document9.getElementsContainingOwnText("");
        int int12 = document9.siblingIndex();
        org.jsoup.nodes.Element element14 = document9.createElement("#text");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType18 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType18, (org.jsoup.nodes.Element) document20);
        java.lang.String str22 = document20.text();
        org.jsoup.nodes.Element element25 = document20.attr("hi!", "hi!");
        java.lang.String str26 = document20.outerHtml();
        org.jsoup.nodes.Element element28 = document20.prependElement("SYSTEMhi!");
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment(":last-of-type", "SYSTEMhi");
        org.jsoup.nodes.Node node33 = comment31.removeAttr(":last-of-type");
        boolean boolean35 = comment31.hasAttr("SYSTEM");
        java.lang.String str36 = comment31.getData();
        java.lang.String str37 = comment31.nodeName();
        boolean boolean39 = comment31.hasAttr("[4=systemhi]");
        org.jsoup.nodes.Element element40 = document20.appendChild((org.jsoup.nodes.Node) comment31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        java.lang.String str10 = document8.text();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType13 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType13, (org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Collector.collect((org.jsoup.select.Evaluator) isNthLastOfType13, (org.jsoup.nodes.Element) document18);
        boolean boolean20 = document8.is((org.jsoup.select.Evaluator) isNthLastOfType13);
        org.jsoup.select.Elements elements23 = document8.getElementsByAttributeValue("SYSTEM  SYSTEM SYSTEM", "SYSTEMhi!");
        java.lang.String str24 = document8.val();
        int int25 = document8.childNodeSize();
        java.lang.String str26 = document8.outerHtml();
        boolean boolean28 = document8.hasSameValue((java.lang.Object) ":matchesOwn(null)");
        org.jsoup.select.Evaluator.AttributeStarting attributeStarting30 = new org.jsoup.select.Evaluator.AttributeStarting("\n<!--:last-of-type-->");
        java.lang.String str31 = attributeStarting30.toString();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document34.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode37 = document34.quirksMode();
        java.lang.String str39 = document34.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document34, "*");
        org.jsoup.parser.Tag tag42 = document34.tag();
        boolean boolean43 = tag42.isFormListed();
        boolean boolean44 = tag42.isFormSubmittable();
        org.jsoup.nodes.Attributes attributes46 = new org.jsoup.nodes.Attributes();
        int int47 = attributes46.size();
        org.jsoup.nodes.FormElement formElement48 = new org.jsoup.nodes.FormElement(tag42, "SYSTEM", attributes46);
        org.jsoup.select.Elements elements49 = formElement48.elements();
        org.jsoup.select.Elements elements51 = formElement48.getElementsContainingOwnText("SYSTEM  SYSTEM SYSTEM");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType54 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) -1, (int) (short) 1);
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements57 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType54, (org.jsoup.nodes.Element) document56);
        java.lang.String str58 = document56.text();
        org.jsoup.nodes.Element element61 = document56.attr("hi!", "hi!");
        org.jsoup.nodes.Element element62 = document56.parent();
        boolean boolean63 = attributeStarting30.matches((org.jsoup.nodes.Element) formElement48, (org.jsoup.nodes.Element) document56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document56);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        boolean boolean2 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        java.lang.String str5 = document4.val();
        org.jsoup.select.Elements elements8 = document4.getElementsByAttributeValueMatching("", "");
        htmlTreeBuilder0.stack = elements8;
        boolean boolean10 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = htmlTreeBuilder0.inTableScope("SYSTEMhi");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement3 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.val();
        org.jsoup.helper.Validate.notNull((java.lang.Object) document5);
        java.util.Set<java.lang.String> strSet8 = document5.classNames();
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = htmlTreeBuilder0.processEndTag("\n<!--:last-of-type-->");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.FormElement formElement2 = htmlTreeBuilder0.getFormElement();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = htmlTreeBuilder0.stack;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("                                                                                   ");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray4 = new java.lang.String[] { "SYSTEM" };
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.sort(strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("#text", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, ":containsOwn(system)");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = htmlTreeBuilder0.inScope("#declaration", strArray4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.stack;
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = htmlTreeBuilder0.processEndTag("i!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.BeforeHead;
        htmlTreeBuilder0.transition(htmlTreeBuilderState6);
        org.jsoup.parser.Token.EOF eOF8 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token9 = eOF8.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element11 = htmlTreeBuilder10.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder10.originalState();
        htmlTreeBuilder10.generateImpliedEndTags();
        htmlTreeBuilder10.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = htmlTreeBuilderState6.process(token9, htmlTreeBuilder10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore(":last-of-type");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inButtonScope("EndTag");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token token2 = htmlTreeBuilder0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element3 = document1.prepend("SYSTEM");
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        document1.setBaseUri("SYSTEM");
        org.jsoup.nodes.Element element8 = document1.val("[null]=\"*\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text(":matchesOwn(null)");
    }
}

