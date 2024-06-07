package org.apache.commons.csv;

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
        java.lang.String str0 = org.apache.commons.csv.Constants.NEXT_LINE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\205" + "'", str0, "\205");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuote('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat2.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.commons.csv.Constants.LINE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\u2028" + "'", str0, "\u2028");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        boolean boolean8 = cSVFormat6.isNullStringSet();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat4.print((java.lang.Object) cSVFormat6, appendable9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.apache.commons.csv.Constants.END_OF_STREAM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        char char0 = org.apache.commons.csv.Constants.US;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\037' + "'", char0 == '\037');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        char char0 = org.apache.commons.csv.Constants.TAB;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\t' + "'", char0 == '\t');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.Class<?> wildcardClass5 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.Constants constants0 = new org.apache.commons.csv.Constants();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) 'a', appendable8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.Class<?> wildcardClass13 = objArray11.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        char char0 = org.apache.commons.csv.Constants.BACKSPACE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\b' + "'", char0 == '\b');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withEscape(' ');
        java.lang.String[] strArray8 = cSVFormat2.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.Appendable appendable6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        boolean boolean11 = cSVFormat10.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withFirstRecordAsHeader();
        boolean boolean15 = cSVFormat13.getTrim();
        java.lang.Appendable appendable16 = null;
        cSVFormat13.println(appendable16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean19 = cSVFormat18.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withTrim(true);
        java.lang.Object[] objArray30 = new java.lang.Object[] { boolean11, appendable16, cSVFormat18, (byte) 1, cSVFormat27 };
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.printRecord(appendable6, objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[false, null, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, 1, Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[false, null, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, 1, Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = org.apache.commons.csv.Constants.PARAGRAPH_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\u2029" + "'", str0, "\u2029");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = cSVFormat2.format(objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        char char0 = org.apache.commons.csv.Constants.CR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        java.nio.file.Path path3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat1.print(path3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        java.lang.Object obj6 = null;
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat5.print(obj6, appendable7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) (-1), appendable7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.nio.file.Path path4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat1.print(path4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        boolean boolean9 = cSVFormat6.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = cSVFormat0.parse(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        char char0 = org.apache.commons.csv.Constants.COMMA;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ',' + "'", char0 == ',');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\205");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = org.apache.commons.csv.Constants.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str9, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat1.print(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) '\"', "\u2029");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat5.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str0 = org.apache.commons.csv.Constants.CRLF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) '#', "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Appendable appendable7 = null;
        cSVFormat1.println(appendable7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(true);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        java.lang.Appendable appendable5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        boolean boolean9 = cSVFormat7.getTrim();
        java.lang.Appendable appendable10 = null;
        cSVFormat7.println(appendable10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker(' ');
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0L, cSVFormat21, cSVFormat25 };
        java.lang.String str27 = cSVFormat18.format(objArray26);
        java.lang.String str28 = cSVFormat14.format(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.printRecord(appendable5, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str27, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str28, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        char char0 = org.apache.commons.csv.Constants.COMMENT;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '#' + "'", char0 == '#');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\u2028");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\u2029");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = cSVFormat1.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        char char0 = org.apache.commons.csv.Constants.RS;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\036' + "'", char0 == '\036');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat3.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat0.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat1.print(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str4 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str4, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        java.nio.file.Path path7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat0.print(path7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat1.print(appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        java.lang.Object[] objArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVFormat5.format(objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        java.lang.Class<?> wildcardClass1 = quoteMode0.getClass();
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.Character char10 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Assertions.notNull((java.lang.Object) quoteMode6, "\u2029");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter '?' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        java.io.File file13 = null;
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat8.print(file13, charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        java.io.File file10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat7.print(file10, charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, cSVFormat15, cSVFormat19 };
        java.lang.String str21 = cSVFormat12.format(objArray20);
        java.lang.String str22 = cSVFormat8.format(objArray20);
        java.lang.Class<?> wildcardClass23 = objArray20.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str21, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str22, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withQuote((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = org.apache.commons.csv.QuoteMode.NONE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteMode(quoteMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No quotes mode set but no escape character is set");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quoteMode6 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode6.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.getSkipHeaderRecord();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat1.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSetMetaData5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        boolean boolean5 = cSVFormat4.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str5 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.Character char5 = cSVFormat4.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = cSVFormat24.parse(reader25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String[] strArray8 = new java.lang.String[] { "\u2028", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: '' in [?, , ]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        boolean boolean4 = cSVFormat2.getTrim();
        java.lang.Appendable appendable5 = null;
        cSVFormat2.println(appendable5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat7.print(appendable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat8.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        boolean boolean12 = cSVFormat9.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat3.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(strArray11);
        java.lang.String str13 = cSVFormat9.format((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withHeader(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withSkipHeaderRecord();
        java.lang.Appendable appendable11 = null;
        java.lang.Object[] objArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat10.printRecord(appendable11, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String str8 = cSVFormat1.getNullString();
        boolean boolean9 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withSkipHeaderRecord(false);
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        java.nio.file.Path path5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat2.print(path5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        java.nio.file.Path path12 = null;
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat1.print(path12, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat1.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("\u2029");
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeaderComments((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat2.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        boolean boolean5 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat4.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(quoteMode7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start marker character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        java.lang.Appendable appendable8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(strArray10);
        cSVFormat7.printRecord(appendable8, (java.lang.Object[]) strArray10);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat7.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat0.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withSkipHeaderRecord(false);
        java.lang.Character char9 = cSVFormat8.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        java.lang.String[] strArray15 = new java.lang.String[] { "\u2029", "\r\n", "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false", "\u2029", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withHeader(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: '?' in [?, ??, Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false, ?, ]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat12.print(appendable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        boolean boolean7 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat4, "\u2029");
        java.lang.Class<?> wildcardClass8 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        boolean boolean11 = cSVFormat10.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        java.nio.file.Path path25 = null;
        java.nio.charset.Charset charset26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter27 = cSVFormat24.print(path25, charset26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.print((java.lang.Object) (short) 100, appendable5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat0.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        java.nio.file.Path path7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat4.print(path7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String str8 = cSVFormat1.getNullString();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat1.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat6.getHeaderComments();
        boolean boolean8 = cSVFormat6.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) '\f');
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat5.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.lang.Appendable appendable4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray6 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\f');
        java.lang.String[] strArray12 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.printRecord(appendable4, (java.lang.Object[]) strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat7, "\u2028");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray7 = cSVFormat6.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\f');
        java.lang.String[] strArray13 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withHeader(strArray13);
        java.lang.Class<?> wildcardClass16 = strArray13.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        java.lang.String str4 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord();
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat8.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        java.lang.Character char6 = cSVFormat1.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean7 = cSVFormat1.getIgnoreSurroundingSpaces();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat1.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        java.lang.String str2 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.Character char8 = cSVFormat1.getCommentMarker();
        boolean boolean9 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        boolean boolean7 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat2.withQuoteMode(quoteMode35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter38 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str20, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str34, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode35 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode35.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.lang.Appendable appendable4 = null;
        cSVFormat3.println(appendable4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('\f');
        java.lang.Object obj18 = null;
        boolean boolean19 = cSVFormat17.equals(obj18);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat0.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        boolean boolean6 = cSVFormat4.isNullStringSet();
        java.lang.String str7 = cSVFormat4.getNullString();
        boolean boolean8 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuote('\f');
        java.lang.String[] strArray16 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, cSVFormat19, cSVFormat23 };
        java.lang.String str25 = cSVFormat16.format(objArray24);
        java.lang.String str26 = cSVFormat3.format(objArray24);
        org.apache.commons.csv.QuoteMode quoteMode27 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreEmptyLines();
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = cSVFormat28.parse(reader30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str26, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode27 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode27.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str9 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str9, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withIgnoreSurroundingSpaces(true);
        java.lang.Class<?> wildcardClass17 = cSVFormat8.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        boolean boolean6 = cSVFormat3.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<a> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<a> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) '\037');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        boolean boolean10 = cSVFormat9.getSkipHeaderRecord();
        java.lang.Class<?> wildcardClass11 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) "Delimiter=<a> SkipHeaderRecord:false", "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        java.lang.String[] strArray16 = cSVFormat14.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, cSVFormat19, cSVFormat23 };
        java.lang.String str25 = cSVFormat16.format(objArray24);
        java.lang.String str26 = cSVFormat3.format(objArray24);
        org.apache.commons.csv.QuoteMode quoteMode27 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreEmptyLines();
        java.io.File file30 = null;
        java.nio.charset.Charset charset31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter32 = cSVFormat28.print(file30, charset31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str26, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode27 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode27.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker('\b');
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat9.print(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        java.lang.Character char8 = cSVFormat7.getCommentMarker();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str3 = cSVFormat2.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreEmptyLines(false);
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord();
        java.nio.file.Path path7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat2.print(path7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        java.lang.String str16 = cSVFormat14.getNullString();
        java.lang.Appendable appendable17 = null;
        cSVFormat14.println(appendable17);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false" + "'", str9, "Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.QuoteMode quoteMode2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start marker character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat7, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.io.File file37 = null;
        java.nio.charset.Charset charset38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter39 = cSVFormat36.print(file37, charset38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat5.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        java.lang.Appendable appendable38 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat5.print((java.lang.Object) cSVFormat37, appendable38, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str20, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str34, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode35 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode35.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, cSVFormat19, cSVFormat23 };
        java.lang.String str25 = cSVFormat16.format(objArray24);
        java.lang.String str26 = cSVFormat3.format(objArray24);
        org.apache.commons.csv.QuoteMode quoteMode27 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrailingDelimiter(false);
        java.io.File file32 = null;
        java.nio.charset.Charset charset33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter34 = cSVFormat28.print(file32, charset33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str26, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode27 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode27.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        boolean boolean4 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = strArray5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean14 = cSVFormat8.getIgnoreHeaderCase();
        char char15 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'a' + "'", char15 == 'a');
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreSurroundingSpaces();
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        boolean boolean13 = cSVFormat11.isCommentMarkerSet();
        boolean boolean14 = cSVFormat11.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withEscape((java.lang.Character) '\b');
        boolean boolean17 = cSVFormat16.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker(' ');
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0L, cSVFormat24, cSVFormat28 };
        java.lang.String str30 = cSVFormat21.format(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker(' ');
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0L, cSVFormat37, cSVFormat41 };
        java.lang.String str43 = cSVFormat34.format(objArray42);
        java.lang.String str44 = cSVFormat21.format(objArray42);
        boolean boolean45 = cSVFormat16.equals((java.lang.Object) objArray42);
        java.lang.String str46 = cSVFormat9.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat9.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str30, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str43, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str44, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse" + "'", str46, "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        boolean boolean12 = cSVFormat10.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat11.print(appendable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        boolean boolean5 = cSVFormat3.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        java.lang.String str25 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u2029> SkipHeaderRecord:false" + "'", str25, "\u2029> SkipHeaderRecord:false");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        java.lang.String str4 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205" + "'", str40, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.print(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        boolean boolean3 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat0.getHeader();
        java.lang.String str9 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim();
        java.lang.Appendable appendable15 = null;
        cSVFormat14.println(appendable15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        boolean boolean19 = cSVFormat6.equals((java.lang.Object) cSVFormat14);
        boolean boolean20 = cSVFormat6.getTrailingDelimiter();
        java.lang.Character char21 = cSVFormat6.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quoteMode13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(char21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('a');
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat1.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat2.print(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.isEscapeCharacterSet();
        java.lang.Character char8 = cSVFormat2.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean7 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getIgnoreEmptyLines();
        java.lang.String[] strArray12 = cSVFormat8.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.lang.String str6 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator("\u2029");
        java.lang.String str9 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentMarker((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat4.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        java.io.File file14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat8.print(file14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '\"');
        char char7 = cSVFormat4.getDelimiter();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat4.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '|' + "'", char7 == '|');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat10.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        boolean boolean13 = cSVFormat3.getIgnoreHeaderCase();
        boolean boolean14 = cSVFormat3.isCommentMarkerSet();
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeader(resultSetMetaData15);
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrim();
        boolean boolean11 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Assertions.notNull((java.lang.Object) quoteMode5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter '' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        java.nio.file.Path path4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.print(path4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat5, "\u2029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        java.lang.Class<?> wildcardClass5 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat6.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('\037');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String[] strArray8 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Appendable appendable7 = null;
        cSVFormat2.println(appendable7);
        java.lang.String str9 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withAllowMissingColumnNames(true);
        java.io.File file12 = null;
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat11.print(file12, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuote('\f');
        java.lang.String[] strArray8 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.print((java.lang.Object) cSVFormat10, appendable15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String str2 = cSVFormat1.getNullString();
        java.lang.Class<?> wildcardClass3 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        java.lang.String str12 = cSVFormat11.toString();
        java.lang.String str13 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str12, "Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat5.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.Class<?> wildcardClass13 = cSVFormat10.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withHeader(resultSetMetaData16);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrim();
        boolean boolean11 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.println(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Object obj8 = null;
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print(obj8, appendable9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('\036');
        java.lang.Class<?> wildcardClass4 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSetMetaData5);
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        boolean boolean8 = cSVFormat6.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quoteMode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode12 = org.apache.commons.csv.QuoteMode.NONE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuoteMode(quoteMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No quotes mode set but no escape character is set");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quoteMode12 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode12.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('\"');
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, cSVFormat15, cSVFormat19 };
        java.lang.String str21 = cSVFormat12.format(objArray20);
        java.lang.String str22 = cSVFormat8.format(objArray20);
        boolean boolean23 = cSVFormat8.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str21, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str22, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat2.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        java.lang.Appendable appendable7 = null;
        cSVFormat6.println(appendable7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator('\037');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape('\t');
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        boolean boolean11 = cSVFormat9.getTrim();
        java.lang.Appendable appendable12 = null;
        cSVFormat9.println(appendable12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0L, cSVFormat23, cSVFormat27 };
        java.lang.String str29 = cSVFormat20.format(objArray28);
        java.lang.String str30 = cSVFormat16.format(objArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withHeader(strArray32);
        java.lang.String str34 = cSVFormat16.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat0.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str29, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str30, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        boolean boolean2 = cSVFormat0.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSetMetaData5);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        boolean boolean11 = cSVFormat9.getTrim();
        java.lang.Appendable appendable12 = null;
        cSVFormat9.println(appendable12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0L, cSVFormat23, cSVFormat27 };
        java.lang.String str29 = cSVFormat20.format(objArray28);
        java.lang.String str30 = cSVFormat16.format(objArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withHeader(strArray32);
        java.lang.String str34 = cSVFormat16.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        java.lang.String[] strArray38 = cSVFormat37.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withAllowMissingColumnNames();
        java.lang.Appendable appendable40 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat35.print((java.lang.Object) cSVFormat39, appendable40, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str29, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str30, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        char char4 = cSVFormat1.getDelimiter();
        java.lang.Character char5 = cSVFormat1.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        java.sql.ResultSetMetaData resultSetMetaData39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat1.withHeader(resultSetMetaData39);
        org.apache.commons.csv.QuoteMode quoteMode41 = cSVFormat40.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(quoteMode41);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        boolean boolean8 = cSVFormat0.isNullStringSet();
        boolean boolean9 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean10 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrim();
        boolean boolean11 = cSVFormat9.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.lang.String str6 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator("\u2029");
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        char char11 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, cSVFormat18, cSVFormat22 };
        java.lang.String str24 = cSVFormat15.format(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker(' ');
        java.lang.Object[] objArray36 = new java.lang.Object[] { 0L, cSVFormat31, cSVFormat35 };
        java.lang.String str37 = cSVFormat28.format(objArray36);
        java.lang.String str38 = cSVFormat15.format(objArray36);
        org.apache.commons.csv.QuoteMode quoteMode39 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat15.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat10.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat10.withRecordSeparator("0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str24, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str37, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str38, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode39 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode39.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator('\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape('\036');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.String[] strArray4 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim();
        java.lang.Appendable appendable15 = null;
        cSVFormat14.println(appendable15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        boolean boolean19 = cSVFormat6.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quoteMode13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start marker character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quoteMode7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat1.getEscapeCharacter();
        boolean boolean12 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean13 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape('\t');
        java.lang.Class<?> wildcardClass8 = cSVFormat7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat4.getTrim();
        java.lang.Appendable appendable7 = null;
        cSVFormat4.println(appendable7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, cSVFormat18, cSVFormat22 };
        java.lang.String str24 = cSVFormat15.format(objArray23);
        java.lang.String str25 = cSVFormat11.format(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withHeaderComments(objArray23);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) objArray23, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str24, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String[] strArray3 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator('\n');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('\036');
        boolean boolean5 = cSVFormat2.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.String str8 = cSVFormat7.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, cSVFormat15, cSVFormat19 };
        java.lang.String str21 = cSVFormat12.format(objArray20);
        java.lang.String str22 = cSVFormat8.format(objArray20);
        java.sql.ResultSet resultSet23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat8.withHeader(resultSet23);
        boolean boolean25 = cSVFormat8.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str21, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str22, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Character char5 = cSVFormat1.getCommentMarker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat7.withTrim();
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u2029" + "'", str26, "\u2029");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat4.getTrim();
        java.lang.Appendable appendable7 = null;
        cSVFormat4.println(appendable7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, cSVFormat18, cSVFormat22 };
        java.lang.String str24 = cSVFormat15.format(objArray23);
        java.lang.String str25 = cSVFormat11.format(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withHeaderComments(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str24, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(quoteMode6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) 'a');
        java.lang.Appendable appendable4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withFirstRecordAsHeader();
        boolean boolean8 = cSVFormat6.getTrim();
        java.lang.Appendable appendable9 = null;
        cSVFormat6.println(appendable9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        boolean boolean16 = cSVFormat14.isNullStringSet();
        java.lang.String str17 = cSVFormat14.getNullString();
        boolean boolean18 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray20 = cSVFormat19.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('\f');
        java.lang.String[] strArray26 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat14.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat12.withHeaderComments((java.lang.Object[]) strArray26);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.printRecord(appendable4, (java.lang.Object[]) strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.String str6 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        boolean boolean8 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('\037');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withEscape(',');
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withHeader(resultSet13);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        java.lang.Character char5 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str8 = cSVFormat7.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) cSVFormat7, appendable11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        boolean boolean6 = cSVFormat4.isNullStringSet();
        java.lang.String str7 = cSVFormat4.getNullString();
        boolean boolean8 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuote('\f');
        java.lang.String[] strArray16 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withHeader(strArray16);
        boolean boolean20 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat0.withQuote('\037');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('\037');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0L, cSVFormat15, cSVFormat19 };
        java.lang.String str21 = cSVFormat12.format(objArray20);
        java.lang.String str22 = cSVFormat8.format(objArray20);
        java.sql.ResultSet resultSet23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat8.withHeader(resultSet23);
        boolean boolean25 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withNullString("Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
        boolean boolean28 = cSVFormat27.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str21, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str22, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        boolean boolean18 = cSVFormat15.isQuoteCharacterSet();
        java.lang.String str19 = cSVFormat15.getNullString();
        boolean boolean20 = cSVFormat15.isEscapeCharacterSet();
        boolean boolean21 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat15.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean24 = cSVFormat8.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat8.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape(',');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withDelimiter('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        java.lang.Object[] objArray15 = new java.lang.Object[] { 0L, cSVFormat10, cSVFormat14 };
        java.lang.String str16 = cSVFormat7.format(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0L, cSVFormat23, cSVFormat27 };
        java.lang.String str29 = cSVFormat20.format(objArray28);
        java.lang.String str30 = cSVFormat7.format(objArray28);
        org.apache.commons.csv.QuoteMode quoteMode31 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat7.withQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentMarker(' ');
        java.lang.Object[] objArray45 = new java.lang.Object[] { 0L, cSVFormat40, cSVFormat44 };
        java.lang.String str46 = cSVFormat37.format(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withCommentMarker(' ');
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0L, cSVFormat53, cSVFormat57 };
        java.lang.String str59 = cSVFormat50.format(objArray58);
        java.lang.String str60 = cSVFormat37.format(objArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat1.withHeaderComments(objArray58);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str16, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str29, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str30, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode31 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode31.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str46, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str59, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str60, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat61);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        boolean boolean15 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean17 = cSVFormat16.isQuoteCharacterSet();
        boolean boolean18 = cSVFormat16.isCommentMarkerSet();
        boolean boolean19 = cSVFormat16.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withEscape((java.lang.Character) '\b');
        boolean boolean22 = cSVFormat21.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        java.lang.Object[] objArray34 = new java.lang.Object[] { 0L, cSVFormat29, cSVFormat33 };
        java.lang.String str35 = cSVFormat26.format(objArray34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withCommentMarker(' ');
        java.lang.Object[] objArray47 = new java.lang.Object[] { 0L, cSVFormat42, cSVFormat46 };
        java.lang.String str48 = cSVFormat39.format(objArray47);
        java.lang.String str49 = cSVFormat26.format(objArray47);
        boolean boolean50 = cSVFormat21.equals((java.lang.Object) objArray47);
        java.lang.String str51 = cSVFormat14.format(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat1.withHeaderComments(objArray47);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str35, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str48, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str49, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse" + "'", str51, "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        org.junit.Assert.assertNotNull(cSVFormat52);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        java.lang.Character char8 = cSVFormat1.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(true);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat3.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean5 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSetMetaData5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('#');
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat4.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        java.sql.ResultSetMetaData resultSetMetaData39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat1.withHeader(resultSetMetaData39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withHeader(strArray44);
        java.lang.String str46 = cSVFormat1.format((java.lang.Object[]) strArray44);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withFirstRecordAsHeader();
        char char16 = cSVFormat15.getDelimiter();
        java.lang.Character char17 = cSVFormat15.getQuoteCharacter();
        java.lang.String[] strArray18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.Appendable appendable20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withHeader(strArray22);
        cSVFormat19.printRecord(appendable20, (java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat8.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withQuote((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'a' + "'", char16 == 'a');
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        java.lang.String str10 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        java.lang.String[] strArray3 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(true);
        boolean boolean16 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0L, cSVFormat19, cSVFormat23 };
        java.lang.String str25 = cSVFormat16.format(objArray24);
        java.lang.String str26 = cSVFormat3.format(objArray24);
        org.apache.commons.csv.QuoteMode quoteMode27 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreEmptyLines();
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str25, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str26, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode27 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode27.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        boolean boolean7 = cSVFormat6.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat1.getEscapeCharacter();
        boolean boolean12 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean13 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        char char9 = cSVFormat1.getDelimiter();
        char char10 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        boolean boolean6 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        boolean boolean4 = cSVFormat2.getTrim();
        java.lang.Appendable appendable5 = null;
        cSVFormat2.println(appendable5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('\037');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        boolean boolean6 = cSVFormat4.isNullStringSet();
        java.lang.String str7 = cSVFormat4.getNullString();
        boolean boolean8 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuote('\f');
        java.lang.String[] strArray16 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withHeader(strArray16);
        boolean boolean20 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat0.withQuote('\037');
        char char23 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\t' + "'", char23 == '\t');
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        java.lang.Object obj6 = null;
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print(obj6, appendable7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote('\f');
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(strArray14);
        java.lang.Character char17 = cSVFormat1.getQuoteCharacter();
        char char18 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'a' + "'", char18 == 'a');
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean7 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        char char10 = cSVFormat1.getDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withHeader(resultSetMetaData11);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrailingDelimiter();
        java.lang.String str7 = cSVFormat6.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        java.sql.ResultSet resultSet42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withHeader(resultSet42);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205" + "'", str40, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSetMetaData5);
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat10, "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean7 = cSVFormat6.getTrailingDelimiter();
        java.lang.String str8 = cSVFormat6.getRecordSeparator();
        boolean boolean9 = cSVFormat6.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str8, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord();
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(resultSet16);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('\n');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        boolean boolean6 = cSVFormat4.isCommentMarkerSet();
        boolean boolean7 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withEscape((java.lang.Character) '\b');
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, cSVFormat17, cSVFormat21 };
        java.lang.String str23 = cSVFormat14.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0L, cSVFormat30, cSVFormat34 };
        java.lang.String str36 = cSVFormat27.format(objArray35);
        java.lang.String str37 = cSVFormat14.format(objArray35);
        boolean boolean38 = cSVFormat9.equals((java.lang.Object) objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat1.withHeaderComments(objArray35);
        java.lang.String str40 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str23, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str36, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str37, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str40, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean14 = cSVFormat13.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode19 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withTrim();
        java.lang.Appendable appendable21 = null;
        cSVFormat20.println(appendable21);
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreSurroundingSpaces();
        java.lang.Appendable appendable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat13.print((java.lang.Object) cSVFormat25, appendable26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quoteMode19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        java.lang.String str6 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.QuoteMode quoteMode2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        boolean boolean4 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        java.lang.Class<?> wildcardClass7 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.lang.Character char6 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(',');
        boolean boolean7 = cSVFormat4.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        boolean boolean7 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat8.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        boolean boolean6 = cSVFormat5.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        char char13 = cSVFormat9.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withQuote('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('\036');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withFirstRecordAsHeader();
        char char16 = cSVFormat15.getDelimiter();
        java.lang.Character char17 = cSVFormat15.getQuoteCharacter();
        java.lang.String[] strArray18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.Appendable appendable20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withHeader(strArray22);
        cSVFormat19.printRecord(appendable20, (java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat8.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.Class<?> wildcardClass28 = cSVFormat8.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'a' + "'", char16 == 'a');
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.println(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote('\f');
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(strArray14);
        java.lang.String[] strArray17 = cSVFormat1.getHeaderComments();
        boolean boolean18 = cSVFormat1.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Assertions.notNull(obj0, "Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'Delimiter=<a> QuoteChar=<?> SkipHeaderRecord:false' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        char char6 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        org.junit.Assert.assertNull(quoteMode7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat3, "hi!");
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat3.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        boolean boolean9 = cSVFormat8.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char4 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.Character char8 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("\u2028");
        java.lang.String str12 = cSVFormat9.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        boolean boolean16 = cSVFormat13.isQuoteCharacterSet();
        java.lang.String str17 = cSVFormat13.getNullString();
        boolean boolean18 = cSVFormat13.isEscapeCharacterSet();
        boolean boolean19 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat13.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat13.withCommentMarker((java.lang.Character) ',');
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat11.print((java.lang.Object) cSVFormat23, appendable24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat6.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withDelimiter('\036');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String[] strArray2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(strArray2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(resultSet4);
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        java.nio.file.Path path11 = null;
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat8.print(path11, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean5 = cSVFormat1.isNullStringSet();
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat1.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        boolean boolean6 = cSVFormat4.isNullStringSet();
        java.lang.String str7 = cSVFormat4.getNullString();
        boolean boolean8 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuote('\f');
        java.lang.String[] strArray16 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withHeader(strArray16);
        boolean boolean20 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat0.withQuote('\037');
        java.io.Reader reader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = cSVFormat0.parse(reader23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean14 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote((java.lang.Character) '\036');
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat4.println(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        java.lang.String str9 = cSVFormat7.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode9 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withQuoteMode(quoteMode9);
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        java.sql.ResultSetMetaData resultSetMetaData39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat1.withHeader(resultSetMetaData39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        boolean boolean5 = cSVFormat2.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        java.lang.String str7 = cSVFormat1.toString();
        boolean boolean8 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withNullString("hi!");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str7, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat5.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat8.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat6.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat6.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        boolean boolean9 = cSVFormat8.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        boolean boolean13 = cSVFormat12.getTrailingDelimiter();
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        java.lang.String[] strArray16 = cSVFormat8.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<a> QuoteChar=<?> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('\036');
        java.lang.Appendable appendable9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char24 = cSVFormat23.getCommentMarker();
        boolean boolean25 = cSVFormat23.isNullStringSet();
        java.lang.String str26 = cSVFormat23.getNullString();
        boolean boolean27 = cSVFormat23.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray29 = cSVFormat28.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withQuote('\f');
        java.lang.String[] strArray35 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat23.withHeader(strArray35);
        java.lang.String str38 = cSVFormat21.format((java.lang.Object[]) strArray35);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat8.printRecord(appendable9, (java.lang.Object[]) strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205" + "'", str38, "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        java.lang.String str7 = cSVFormat5.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str7, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.nio.file.Path path5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(path5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        boolean boolean6 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withAllowMissingColumnNames(true);
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) predefined0, "");
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord();
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.print((java.lang.Object) 10.0f, appendable10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat1.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = cSVFormat1.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("\u2029> SkipHeaderRecord:false");
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        boolean boolean34 = cSVFormat5.equals((java.lang.Object) objArray31);
        boolean boolean35 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat5.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator('\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(true);
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat5.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrim();
        java.nio.file.Path path5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat4.print(path5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Appendable appendable7 = null;
        cSVFormat2.println(appendable7);
        java.lang.String str9 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat13.getQuoteMode();
        boolean boolean17 = cSVFormat13.isCommentMarkerSet();
        boolean boolean18 = cSVFormat13.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withSkipHeaderRecord();
        boolean boolean20 = cSVFormat11.equals((java.lang.Object) cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(quoteMode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote('\f');
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(strArray14);
        java.lang.Character char17 = cSVFormat1.getQuoteCharacter();
        java.lang.Character char18 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat1.withDelimiter('|');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) false, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Assertions.notNull(obj0, "Delimiter=<a> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'Delimiter=<a> SkipHeaderRecord:false' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\037');
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat2.print((java.lang.Object) '\037', appendable16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '\"');
        char char7 = cSVFormat4.getDelimiter();
        boolean boolean8 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '|' + "'", char7 == '|');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.lang.String str6 = cSVFormat1.getNullString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat1.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat2.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        java.lang.Class<?> wildcardClass1 = predefined0.getClass();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        java.io.File file13 = null;
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat8.print(file13, charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.getIgnoreHeaderCase();
        boolean boolean4 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat2.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quoteMode5);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        java.io.File file10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat7.print(file10, charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withFirstRecordAsHeader();
        char char14 = cSVFormat13.getDelimiter();
        java.lang.Character char15 = cSVFormat13.getQuoteCharacter();
        java.lang.String[] strArray16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(strArray16);
        java.lang.Appendable appendable18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withHeader(strArray20);
        cSVFormat17.printRecord(appendable18, (java.lang.Object[]) strArray20);
        java.lang.String str23 = cSVFormat0.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "");
        boolean boolean26 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat5.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quoteMode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        boolean boolean39 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        java.lang.Character char6 = cSVFormat5.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        boolean boolean7 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        java.lang.String str6 = cSVFormat0.getNullString();
        char char7 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote((java.lang.Character) '\036');
        java.lang.Appendable appendable5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str8 = cSVFormat7.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(false);
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean14 = cSVFormat13.isQuoteCharacterSet();
        boolean boolean15 = cSVFormat13.isCommentMarkerSet();
        boolean boolean16 = cSVFormat13.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape((java.lang.Character) '\b');
        boolean boolean19 = cSVFormat13.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withIgnoreSurroundingSpaces();
        boolean boolean21 = cSVFormat20.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray24 = cSVFormat23.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withQuote('\f');
        java.lang.String[] strArray30 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        java.lang.String str32 = cSVFormat22.format((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat12.withHeader(strArray30);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat2.printRecord(appendable5, (java.lang.Object[]) strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\u2029\"\t0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false\t\205" + "'", str32, "\"\u2029\"\t0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false\t\205");
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        java.lang.Class<?> wildcardClass7 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("\"\u2029\"\t0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false\t\205");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(true);
        char char18 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker(' ');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 0L, cSVFormat25, cSVFormat29 };
        java.lang.String str31 = cSVFormat22.format(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker(' ');
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0L, cSVFormat38, cSVFormat42 };
        java.lang.String str44 = cSVFormat35.format(objArray43);
        java.lang.String str45 = cSVFormat22.format(objArray43);
        org.apache.commons.csv.QuoteMode quoteMode46 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat22.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat17.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat6.withQuoteMode(quoteMode46);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'a' + "'", char18 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str31, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str44, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str45, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode46 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode46.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        boolean boolean3 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.isQuoteCharacterSet();
        char char7 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        char char4 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("\u2029");
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        boolean boolean18 = cSVFormat15.isQuoteCharacterSet();
        java.lang.String str19 = cSVFormat15.getNullString();
        boolean boolean20 = cSVFormat15.isEscapeCharacterSet();
        boolean boolean21 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat15.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean24 = cSVFormat8.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.lang.String str27 = cSVFormat23.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Delimiter=<a> NullString=<Delimiter=<a> SkipHeaderRecord:false> SkipHeaderRecord:false" + "'", str27, "Delimiter=<a> NullString=<Delimiter=<a> SkipHeaderRecord:false> SkipHeaderRecord:false");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames();
        boolean boolean10 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, cSVFormat17, cSVFormat21 };
        java.lang.String str23 = cSVFormat14.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0L, cSVFormat30, cSVFormat34 };
        java.lang.String str36 = cSVFormat27.format(objArray35);
        java.lang.String str37 = cSVFormat14.format(objArray35);
        org.apache.commons.csv.QuoteMode quoteMode38 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat14.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat5.withQuoteMode(quoteMode38);
        java.sql.ResultSetMetaData resultSetMetaData41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat5.withHeader(resultSetMetaData41);
        boolean boolean43 = cSVFormat3.equals((java.lang.Object) resultSetMetaData41);
        boolean boolean44 = cSVFormat3.getIgnoreEmptyLines();
        boolean boolean45 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str23, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str36, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str37, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode38 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode38.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.lang.String str6 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator("\u2029");
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSet9);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.String[] strArray6 = cSVFormat0.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray7 = cSVFormat6.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\f');
        java.lang.String[] strArray13 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withHeader(strArray13);
        java.lang.Character char16 = cSVFormat1.getCommentMarker();
        java.lang.String str17 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str17, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuote('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames();
        boolean boolean10 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, cSVFormat17, cSVFormat21 };
        java.lang.String str23 = cSVFormat14.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0L, cSVFormat30, cSVFormat34 };
        java.lang.String str36 = cSVFormat27.format(objArray35);
        java.lang.String str37 = cSVFormat14.format(objArray35);
        org.apache.commons.csv.QuoteMode quoteMode38 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat14.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat5.withQuoteMode(quoteMode38);
        java.sql.ResultSetMetaData resultSetMetaData41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat5.withHeader(resultSetMetaData41);
        boolean boolean43 = cSVFormat3.equals((java.lang.Object) resultSetMetaData41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat3.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str23, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str36, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str37, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode38 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode38.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("hi!");
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) cSVFormat9, appendable12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('\f');
        java.io.File file18 = null;
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat15.print(file18, charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean14 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withNullString("\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        boolean boolean39 = cSVFormat1.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str33, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        char char13 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withFirstRecordAsHeader();
        boolean boolean21 = cSVFormat19.getTrim();
        java.lang.Appendable appendable22 = null;
        cSVFormat19.println(appendable22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat26.format(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(strArray42);
        java.lang.String str44 = cSVFormat26.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withHeader(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\t' + "'", char13 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quoteMode15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str39, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str40, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('\036');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        boolean boolean3 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        boolean boolean42 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205" + "'", str40, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames();
        boolean boolean10 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0L, cSVFormat17, cSVFormat21 };
        java.lang.String str23 = cSVFormat14.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0L, cSVFormat30, cSVFormat34 };
        java.lang.String str36 = cSVFormat27.format(objArray35);
        java.lang.String str37 = cSVFormat14.format(objArray35);
        org.apache.commons.csv.QuoteMode quoteMode38 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat14.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat5.withQuoteMode(quoteMode38);
        java.sql.ResultSetMetaData resultSetMetaData41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat5.withHeader(resultSetMetaData41);
        boolean boolean43 = cSVFormat3.equals((java.lang.Object) resultSetMetaData41);
        boolean boolean44 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str23, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str36, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str37, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode38 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode38.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode14 = cSVFormat8.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(quoteMode14);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        char char14 = cSVFormat12.getDelimiter();
        java.lang.Appendable appendable15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker(' ');
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0L, cSVFormat22, cSVFormat26 };
        java.lang.String str28 = cSVFormat19.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker(' ');
        java.lang.Object[] objArray40 = new java.lang.Object[] { 0L, cSVFormat35, cSVFormat39 };
        java.lang.String str41 = cSVFormat32.format(objArray40);
        java.lang.String str42 = cSVFormat19.format(objArray40);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat12.printRecord(appendable15, objArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'a' + "'", char14 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str28, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str41, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str42, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        java.lang.Appendable appendable8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(strArray10);
        cSVFormat7.printRecord(appendable8, (java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withSkipHeaderRecord();
        java.lang.Appendable appendable15 = null;
        cSVFormat14.println(appendable15);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim();
        java.lang.Appendable appendable15 = null;
        cSVFormat14.println(appendable15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        boolean boolean19 = cSVFormat6.equals((java.lang.Object) cSVFormat14);
        boolean boolean20 = cSVFormat6.getTrailingDelimiter();
        boolean boolean21 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quoteMode13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat5.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) '\037');
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quoteMode7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.Object[] objArray9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        java.lang.Appendable appendable8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(strArray10);
        cSVFormat7.printRecord(appendable8, (java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withIgnoreSurroundingSpaces();
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('\b');
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str12, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withFirstRecordAsHeader();
        char char16 = cSVFormat15.getDelimiter();
        java.lang.Character char17 = cSVFormat15.getQuoteCharacter();
        java.lang.String[] strArray18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.Appendable appendable20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withHeader(strArray22);
        cSVFormat19.printRecord(appendable20, (java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat8.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat8.withCommentMarker((java.lang.Character) '\b');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'a' + "'", char16 == 'a');
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('\036');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) '\037');
        java.io.File file11 = null;
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat8.print(file11, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        java.lang.String str7 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat1.getEscapeCharacter();
        boolean boolean12 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withIgnoreHeaderCase(true);
        java.io.File file15 = null;
        java.nio.charset.Charset charset16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.print(file15, charset16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) '\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker((java.lang.Character) '\b');
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}
