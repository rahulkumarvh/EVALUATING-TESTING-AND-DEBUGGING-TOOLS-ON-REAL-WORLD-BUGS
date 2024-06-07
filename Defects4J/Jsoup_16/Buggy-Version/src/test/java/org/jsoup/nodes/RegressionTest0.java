package org.jsoup.nodes;

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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.nodes.Element element12 = document9.toggleClass("");
        java.lang.String str13 = document9.outerHtml();
        java.lang.String str14 = document9.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document9.outputSettings();
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.indentAmount(0);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (byte) 1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("\nhi!", "", ":containsOwn(", "<hi!></hi!>");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<#document></#document>", "#root", "#:containsOwn(", "&lt;#document&gt;&lt;/#document&gt;");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("");
        org.jsoup.nodes.TextNode textNode13 = textNode9.text("hi!");
        org.jsoup.nodes.Node node16 = textNode13.attr(":matchesOwn(null", "hi!");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        node16.outerHtmlTail(stringBuilder17, (int) (byte) 1, outputSettings19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.nodes.Element element25 = document22.toggleClass("");
        java.lang.String str26 = document22.outerHtml();
        java.lang.String str27 = document22.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = document22.outputSettings();
        java.nio.charset.Charset charset29 = outputSettings28.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings19.charset(charset29);
        int int31 = outputSettings30.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, 0, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        java.lang.String str7 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.nodes.Element element14 = document11.toggleClass("");
        java.lang.String str15 = document11.outerHtml();
        java.lang.String str16 = document11.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document11.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (byte) -1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        textNode4.text = "hi!";
        int int7 = textNode4.siblingIndex();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str15 = documentType14.nodeName();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        java.lang.String str20 = document19.nodeName();
        org.jsoup.nodes.Element element22 = document19.toggleClass("");
        java.lang.String str23 = document19.outerHtml();
        java.lang.String str24 = document19.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document19.outputSettings();
        java.nio.charset.Charset charset26 = outputSettings25.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings25.escapeMode(escapeMode27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings25.indentAmount(0);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        java.lang.String str33 = document32.nodeName();
        org.jsoup.nodes.Element element35 = document32.toggleClass("");
        java.lang.String str36 = document32.outerHtml();
        java.lang.String str37 = document32.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = document32.outputSettings();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        java.lang.String str41 = document40.nodeName();
        org.jsoup.nodes.Element element43 = document40.toggleClass("");
        java.lang.String str44 = document40.outerHtml();
        java.lang.String str45 = document40.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = document40.outputSettings();
        java.nio.charset.Charset charset47 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings38.charset(charset47);
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings30.charset(charset47);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings30.indentAmount((int) (short) 10);
        documentType14.outerHtmlTail(stringBuilder16, (int) '4', outputSettings30);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings30.indentAmount(1);
        // The following exception was thrown during execution in test generation
        try {
            textNode4.outerHtmlHead(stringBuilder8, (int) (byte) 10, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#document" + "'", str41, "#document");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertNotNull(outputSettings54);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("          ", "#document", ":containsOwn(", "                                ");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.nodes.Element element12 = document9.toggleClass("");
        java.lang.String str13 = document9.outerHtml();
        java.lang.String str14 = document9.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document9.outputSettings();
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        java.lang.String str17 = org.jsoup.nodes.Entities.escape(".[:matchesown(null*=hi!]", outputSettings15);
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 0, outputSettings15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".[:matchesown(null*=hi!]" + "'", str17, ".[:matchesown(null*=hi!]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        java.lang.String str7 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (byte) 10, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(outputSettings12);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<[:matchesown(null*=hi!]></[:matchesown(null*=hi!]>", "class=\"\"", ":contains(", "[:containsown($=#text]");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("");
        org.jsoup.select.Evaluator.Class class3 = new org.jsoup.select.Evaluator.Class("[:matchesown(null*=hi!]");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        java.lang.String str6 = document5.nodeName();
        org.jsoup.nodes.Element element8 = document5.toggleClass("");
        org.jsoup.nodes.Element element9 = element8.empty();
        org.jsoup.nodes.Element element11 = element9.appendElement("#document");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document13.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element17 = document13.removeClass("#text");
        boolean boolean18 = class3.matches(element11, element17);
        org.jsoup.select.Evaluator.Class class20 = new org.jsoup.select.Evaluator.Class("[:matchesown(null*=hi!]");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.nodes.Element element25 = document22.toggleClass("");
        org.jsoup.nodes.Element element26 = element25.empty();
        org.jsoup.nodes.Element element28 = element26.appendElement("#document");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element34 = document30.removeClass("#text");
        boolean boolean35 = class20.matches(element28, element34);
        boolean boolean36 = tag1.matches(element11, element34);
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str42 = documentType41.nodeName();
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        java.lang.String str47 = document46.nodeName();
        org.jsoup.nodes.Element element49 = document46.toggleClass("");
        java.lang.String str50 = document46.outerHtml();
        java.lang.String str51 = document46.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = document46.outputSettings();
        java.nio.charset.Charset charset53 = outputSettings52.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = outputSettings52.escapeMode(escapeMode54);
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings52.indentAmount(0);
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        java.lang.String str60 = document59.nodeName();
        org.jsoup.nodes.Element element62 = document59.toggleClass("");
        java.lang.String str63 = document59.outerHtml();
        java.lang.String str64 = document59.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = document59.outputSettings();
        org.jsoup.nodes.Document document67 = new org.jsoup.nodes.Document("");
        java.lang.String str68 = document67.nodeName();
        org.jsoup.nodes.Element element70 = document67.toggleClass("");
        java.lang.String str71 = document67.outerHtml();
        java.lang.String str72 = document67.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings73 = document67.outputSettings();
        java.nio.charset.Charset charset74 = outputSettings73.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings75 = outputSettings65.charset(charset74);
        org.jsoup.nodes.Document.OutputSettings outputSettings76 = outputSettings57.charset(charset74);
        org.jsoup.nodes.Document.OutputSettings outputSettings78 = outputSettings57.indentAmount((int) (short) 10);
        documentType41.outerHtmlTail(stringBuilder43, (int) '4', outputSettings57);
        java.lang.String str80 = documentType41.nodeName();
        java.lang.StringBuilder stringBuilder81 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings83 = null;
        documentType41.outerHtmlTail(stringBuilder81, 0, outputSettings83);
        element11.replaceWith((org.jsoup.nodes.Node) documentType41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#doctype" + "'", str42, "#doctype");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#document" + "'", str47, "#document");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#document" + "'", str60, "#document");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "#document" + "'", str68, "#document");
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(outputSettings73);
        org.junit.Assert.assertNotNull(charset74);
        org.junit.Assert.assertNotNull(outputSettings75);
        org.junit.Assert.assertNotNull(outputSettings76);
        org.junit.Assert.assertNotNull(outputSettings78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "#doctype" + "'", str80, "#doctype");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":matchesOwn(null", "#doctype", ":matchesOwn(null", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("");
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("hi!");
        org.jsoup.nodes.Node node18 = textNode15.attr("hi!", "");
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes19.html(stringBuilder20, outputSettings21);
        int int23 = attributes19.size();
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode28 = textNode26.text("");
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        attributes29.html(stringBuilder30, outputSettings31);
        java.lang.String str33 = attributes29.toString();
        textNode28.attributes = attributes29;
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        attributes35.html(stringBuilder36, outputSettings37);
        int int39 = attributes35.size();
        textNode28.attributes = attributes35;
        attributes19.addAll(attributes35);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes19.spliterator();
        node18.attributes = attributes19;
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        java.lang.String str46 = document45.nodeName();
        org.jsoup.nodes.Element element48 = document45.toggleClass("");
        java.lang.String str49 = document45.outerHtml();
        java.lang.String str50 = document45.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = document45.outputSettings();
        boolean boolean52 = attributes19.equals((java.lang.Object) outputSettings51);
        documentType4.attributes = attributes19;
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<#document></#document>", "#root", "#:containsOwn(", "&lt;#document&gt;&lt;/#document&gt;");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.lang.String str9 = document8.nodeName();
        org.jsoup.nodes.Element element11 = document8.toggleClass("");
        java.lang.String str12 = document8.outerHtml();
        java.lang.String str13 = document8.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document8.outputSettings();
        java.nio.charset.Charset charset15 = outputSettings14.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings14.escapeMode(escapeMode16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings14.indentAmount(0);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.nodeName();
        org.jsoup.nodes.Element element24 = document21.toggleClass("");
        java.lang.String str25 = document21.outerHtml();
        java.lang.String str26 = document21.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = document21.outputSettings();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        java.lang.String str30 = document29.nodeName();
        org.jsoup.nodes.Element element32 = document29.toggleClass("");
        java.lang.String str33 = document29.outerHtml();
        java.lang.String str34 = document29.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = document29.outputSettings();
        java.nio.charset.Charset charset36 = outputSettings35.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings27.charset(charset36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings19.charset(charset36);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings19.indentAmount((int) (short) 10);
        documentType4.outerHtmlTail(stringBuilder5, 0, outputSettings40);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings40);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.nodes.Element element12 = document9.toggleClass("");
        java.lang.String str13 = document9.outerHtml();
        java.lang.String str14 = document9.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document9.outputSettings();
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.indentAmount(0);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.nodes.Element element25 = document22.toggleClass("");
        java.lang.String str26 = document22.outerHtml();
        java.lang.String str27 = document22.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = document22.outputSettings();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String str31 = document30.nodeName();
        org.jsoup.nodes.Element element33 = document30.toggleClass("");
        java.lang.String str34 = document30.outerHtml();
        java.lang.String str35 = document30.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document30.outputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings28.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings20.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings20.indentAmount((int) (short) 10);
        documentType4.outerHtmlTail(stringBuilder6, (int) '4', outputSettings20);
        java.lang.String str43 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings46.clone();
        int int48 = outputSettings46.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings46.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings50.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder44, (int) (byte) 0, outputSettings52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings52);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#text", "[:matchesown(null*=hi!]");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.StringBuilder stringBuilder4 = null;
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Document document8 = textNode7.ownerDocument();
        boolean boolean9 = textNode7.isBlank();
        boolean boolean11 = textNode7.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode7.text("#text");
        java.lang.String str14 = textNode13.text;
        java.lang.String str15 = textNode13.text;
        java.lang.String str16 = textNode13.toString();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str24 = documentType23.nodeName();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        java.lang.String str29 = document28.nodeName();
        org.jsoup.nodes.Element element31 = document28.toggleClass("");
        java.lang.String str32 = document28.outerHtml();
        java.lang.String str33 = document28.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = document28.outputSettings();
        java.nio.charset.Charset charset35 = outputSettings34.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings34.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings34.indentAmount(0);
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        java.lang.String str42 = document41.nodeName();
        org.jsoup.nodes.Element element44 = document41.toggleClass("");
        java.lang.String str45 = document41.outerHtml();
        java.lang.String str46 = document41.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = document41.outputSettings();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        java.lang.String str50 = document49.nodeName();
        org.jsoup.nodes.Element element52 = document49.toggleClass("");
        java.lang.String str53 = document49.outerHtml();
        java.lang.String str54 = document49.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = document49.outputSettings();
        java.nio.charset.Charset charset56 = outputSettings55.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = outputSettings47.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings58 = outputSettings39.charset(charset56);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = outputSettings39.indentAmount((int) (short) 10);
        documentType23.outerHtmlTail(stringBuilder25, (int) '4', outputSettings39);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings39.indentAmount(1);
        textNode13.outerHtmlTail(stringBuilder17, (int) (byte) 0, outputSettings39);
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(stringBuilder4, outputSettings39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#text" + "'", str14, "#text");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#text" + "'", str15, "#text");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#document" + "'", str42, "#document");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#document" + "'", str50, "#document");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(outputSettings55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings63);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":matchesOwn(null", "#doctype", ":matchesOwn(null", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
        documentType4.setSiblingIndex((int) (short) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Element element4 = document1.appendElement("[:matchesown(null*=hi!]");
        java.lang.String str5 = document1.text();
        org.jsoup.nodes.Attributes attributes6 = document1.attributes;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes6.dataset();
        int int8 = attributes6.size();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Document document13 = textNode12.ownerDocument();
        boolean boolean14 = textNode12.isBlank();
        boolean boolean16 = textNode12.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode12.text("#text");
        java.lang.String str19 = textNode18.text;
        java.lang.String str20 = textNode18.text;
        java.lang.String str21 = textNode18.toString();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str29 = documentType28.nodeName();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.nodeName();
        org.jsoup.nodes.Element element36 = document33.toggleClass("");
        java.lang.String str37 = document33.outerHtml();
        java.lang.String str38 = document33.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = document33.outputSettings();
        java.nio.charset.Charset charset40 = outputSettings39.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings39.escapeMode(escapeMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.indentAmount(0);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        java.lang.String str47 = document46.nodeName();
        org.jsoup.nodes.Element element49 = document46.toggleClass("");
        java.lang.String str50 = document46.outerHtml();
        java.lang.String str51 = document46.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = document46.outputSettings();
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("");
        java.lang.String str55 = document54.nodeName();
        org.jsoup.nodes.Element element57 = document54.toggleClass("");
        java.lang.String str58 = document54.outerHtml();
        java.lang.String str59 = document54.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = document54.outputSettings();
        java.nio.charset.Charset charset61 = outputSettings60.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings52.charset(charset61);
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = outputSettings44.charset(charset61);
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings44.indentAmount((int) (short) 10);
        documentType28.outerHtmlTail(stringBuilder30, (int) '4', outputSettings44);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings44.indentAmount(1);
        textNode18.outerHtmlTail(stringBuilder22, (int) (byte) 0, outputSettings44);
        attributes6.html(stringBuilder9, outputSettings44);
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#text" + "'", str20, "#text");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#text" + "'", str21, "#text");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#document" + "'", str47, "#document");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#document" + "'", str55, "#document");
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(outputSettings63);
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(outputSettings68);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        java.lang.Class<?> wildcardClass7 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.select.Evaluator.Tag tag9 = new org.jsoup.select.Evaluator.Tag("[hi!*=hi!]");
        java.lang.String str10 = tag9.toString();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Element element15 = document12.toggleClass("");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str19 = element15.baseUri();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.lang.String str22 = document21.nodeName();
        org.jsoup.nodes.Element element24 = document21.toggleClass("");
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str28 = element24.baseUri();
        org.jsoup.nodes.Element element29 = element24.clone();
        java.lang.String str30 = element24.val();
        boolean boolean31 = tag9.matches(element15, element24);
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.nodeName();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = document33.dataset();
        java.lang.String str36 = document33.toString();
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        boolean boolean39 = tag9.matches((org.jsoup.nodes.Element) document33, (org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.Element element41 = document38.prepend(":matches(null");
        org.jsoup.nodes.Element element43 = document38.text("          ");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceChild((org.jsoup.nodes.Node) document7, (org.jsoup.nodes.Node) document38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!*=hi!]" + "'", str10, "[hi!*=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":matchesOwn(null", "#doctype", ":matchesOwn(null", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Element element15 = document12.toggleClass("");
        java.lang.String str16 = document12.outerHtml();
        java.lang.String str17 = document12.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document12.outputSettings();
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.escapeMode(escapeMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings18.indentAmount(0);
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        java.lang.String str26 = document25.nodeName();
        org.jsoup.nodes.Element element28 = document25.toggleClass("");
        java.lang.String str29 = document25.outerHtml();
        java.lang.String str30 = document25.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = document25.outputSettings();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        java.lang.String str34 = document33.nodeName();
        org.jsoup.nodes.Element element36 = document33.toggleClass("");
        java.lang.String str37 = document33.outerHtml();
        java.lang.String str38 = document33.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = document33.outputSettings();
        java.nio.charset.Charset charset40 = outputSettings39.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings31.charset(charset40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings23.charset(charset40);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, 0, outputSettings42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings42);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.attr(":matches(null", "&lt;body&gt;&lt;/body&gt;");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        documentType4.setBaseUri("#:containsOwn(");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.nodes.Element element13 = document10.toggleClass("");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("#document", "hi!");
        java.lang.String str17 = element13.baseUri();
        org.jsoup.nodes.Element element18 = element13.clone();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.preserveWhitespace();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, ":containsOwn(");
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("");
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        attributes32.html(stringBuilder33, outputSettings34);
        java.lang.String str36 = attributes32.toString();
        textNode31.attributes = attributes32;
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        attributes38.html(stringBuilder39, outputSettings40);
        int int42 = attributes38.size();
        textNode31.attributes = attributes38;
        java.lang.String str44 = attributes38.html();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag20, ":matchesOwn(null", attributes38);
        boolean boolean46 = element18.equals((java.lang.Object) element45);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) element45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jsoup.nodes.DocumentType documentType5 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str6 = documentType5.nodeName();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.nodes.Element element13 = document10.toggleClass("");
        java.lang.String str14 = document10.outerHtml();
        java.lang.String str15 = document10.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document10.outputSettings();
        java.nio.charset.Charset charset17 = outputSettings16.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings16.escapeMode(escapeMode18);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings16.indentAmount(0);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        java.lang.String str24 = document23.nodeName();
        org.jsoup.nodes.Element element26 = document23.toggleClass("");
        java.lang.String str27 = document23.outerHtml();
        java.lang.String str28 = document23.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = document23.outputSettings();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        java.lang.String str32 = document31.nodeName();
        org.jsoup.nodes.Element element34 = document31.toggleClass("");
        java.lang.String str35 = document31.outerHtml();
        java.lang.String str36 = document31.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = document31.outputSettings();
        java.nio.charset.Charset charset38 = outputSettings37.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings29.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings21.charset(charset38);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = outputSettings21.indentAmount((int) (short) 10);
        documentType5.outerHtmlTail(stringBuilder7, (int) '4', outputSettings21);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings21.indentAmount(1);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("[[:matchesown(null*=hi!]^=#document]", outputSettings21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[[:matchesown(null*=hi!]^=#document]" + "'", str46, "[[:matchesown(null*=hi!]^=#document]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "[:matchesown(null*=hi!]=\"[:matchesown(null*=hi!]\"", "[[:containsown($=[:matchesown(null*=hi!]]*=:matchesown(null]", "[:containsown($=[:matchesown(null*=hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        int int11 = outputSettings9.indentAmount();
        documentType4.outerHtmlTail(stringBuilder7, (int) (byte) 10, outputSettings9);
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.nodes.Element element19 = document16.toggleClass("");
        java.lang.String str20 = document16.outerHtml();
        java.lang.String str21 = document16.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document16.outputSettings();
        boolean boolean23 = outputSettings22.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.clone();
        int int25 = outputSettings24.indentAmount();
        documentType4.outerHtmlTail(stringBuilder13, (-1), outputSettings24);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.lang.String str10 = document9.nodeName();
        org.jsoup.nodes.Element element12 = document9.toggleClass("");
        java.lang.String str13 = document9.outerHtml();
        java.lang.String str14 = document9.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document9.outputSettings();
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings15.escapeMode(escapeMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.indentAmount(0);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.lang.String str23 = document22.nodeName();
        org.jsoup.nodes.Element element25 = document22.toggleClass("");
        java.lang.String str26 = document22.outerHtml();
        java.lang.String str27 = document22.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = document22.outputSettings();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        java.lang.String str31 = document30.nodeName();
        org.jsoup.nodes.Element element33 = document30.toggleClass("");
        java.lang.String str34 = document30.outerHtml();
        java.lang.String str35 = document30.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document30.outputSettings();
        java.nio.charset.Charset charset37 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings28.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings20.charset(charset37);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings20.indentAmount((int) (short) 10);
        documentType4.outerHtmlTail(stringBuilder6, (int) '4', outputSettings20);
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings20.indentAmount(1);
        java.nio.charset.CharsetEncoder charsetEncoder45 = outputSettings20.encoder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(charsetEncoder45);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        documentType4.baseUri = "<#document></#document>";
        documentType4.setBaseUri("#:containsOwn(");
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.select.Evaluator.Class class12 = new org.jsoup.select.Evaluator.Class("[:matchesown(null*=hi!]");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.lang.String str15 = document14.nodeName();
        org.jsoup.nodes.Element element17 = document14.toggleClass("");
        org.jsoup.nodes.Element element18 = element17.empty();
        org.jsoup.nodes.Element element20 = element18.appendElement("#document");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document22.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element26 = document22.removeClass("#text");
        boolean boolean27 = class12.matches(element20, element26);
        org.jsoup.select.Elements elements29 = element20.select("[^[hi!*=hi!]]");
        org.jsoup.nodes.Node node30 = element20.parent();
        boolean boolean31 = documentType4.equals((java.lang.Object) node30);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.preserveWhitespace();
        boolean boolean5 = tag1.isSelfClosing();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes7.clone();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document document11 = document10.normalise();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element14 = document13.head();
        org.jsoup.nodes.Element element16 = document13.appendElement("[:matchesown(null*=hi!]");
        boolean boolean17 = document10.equals((java.lang.Object) element16);
        boolean boolean18 = attributes7.equals((java.lang.Object) document10);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag1, "                                                                                                    ", attributes7);
        boolean boolean20 = tag1.canContainBlock();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("#text", ":matchesOwn(null", "", ":matchesOwn(null");
        java.lang.String str26 = documentType25.nodeName();
        boolean boolean27 = tag1.equals((java.lang.Object) documentType25);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<hi!></hi!>", "<[:matchesown(null*=hi!]></[:matchesown(null*=hi!]>", "<[:matchesown(null*=hi!]></[:matchesown(null*=hi!]>", ".:containsOwn(");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":matchesOwn(null", "#doctype", ":matchesOwn(null", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 10, outputSettings13);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }
}

