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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Class<?> wildcardClass1 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        char char0 = org.apache.commons.csv.Constants.BACKSPACE;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\b' + "'", char0 == '\b');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        char char0 = org.apache.commons.csv.Constants.RS;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\036' + "'", char0 == '\036');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.Constants constants0 = new org.apache.commons.csv.Constants();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        char char0 = org.apache.commons.csv.Constants.SP;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ' ' + "'", char0 == ' ');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.commons.csv.Constants.PARAGRAPH_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\u2029" + "'", str0, "\u2029");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.commons.csv.Constants.NEXT_LINE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\205" + "'", str0, "\205");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = org.apache.commons.csv.Constants.LINE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\u2028" + "'", str0, "\u2028");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        char char0 = org.apache.commons.csv.Constants.COMMA;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + ',' + "'", char0 == ',');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = org.apache.commons.csv.Constants.UNDEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.lang.Class<?> wildcardClass27 = cSVFormat17.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        cSVFormat6.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        char char0 = org.apache.commons.csv.Constants.TAB;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\t' + "'", char0 == '\t');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        char char0 = org.apache.commons.csv.Constants.CR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat0.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.Class<?> wildcardClass7 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        char char0 = org.apache.commons.csv.Constants.LF;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\n' + "'", char0 == '\n');
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        org.apache.commons.csv.Quote quote8 = cSVFormat0.getQuotePolicy();
        java.lang.Character char9 = cSVFormat0.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        char char0 = org.apache.commons.csv.Constants.BACKSLASH;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\\' + "'", char0 == '\\');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        java.lang.String str3 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        java.lang.Character char3 = cSVFormat1.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser22 = cSVFormat9.parse(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        char char1 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '4');
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat4.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.isQuoting();
        java.lang.Class<?> wildcardClass10 = cSVFormat7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        char char0 = org.apache.commons.csv.Constants.US;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\037' + "'", char0 == '\037');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        java.lang.Class<?> wildcardClass7 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        boolean boolean9 = cSVFormat6.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        char char0 = org.apache.commons.csv.Constants.COMMENT;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '#' + "'", char0 == '#');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        java.lang.String str12 = cSVFormat11.toString();
        java.lang.Class<?> wildcardClass13 = cSVFormat11.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str12, "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\\');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat0.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.Object[] objArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVFormat9.format(objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.isQuoting();
        java.lang.Character char5 = cSVFormat3.getCommentStart();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.lang.Class<?> wildcardClass7 = cSVFormat3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        char char9 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.lang.String str5 = cSVFormat3.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.Class<?> wildcardClass3 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean26 = cSVFormat25.isNullHandling();
        boolean boolean27 = cSVFormat25.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean31 = cSVFormat30.isNullHandling();
        boolean boolean32 = cSVFormat30.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat30.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat30.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean41 = cSVFormat40.isNullHandling();
        boolean boolean42 = cSVFormat40.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean50 = cSVFormat49.isNullHandling();
        boolean boolean51 = cSVFormat49.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withIgnoreEmptyLines(false);
        boolean boolean54 = cSVFormat49.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat49.withEscape((java.lang.Character) '\\');
        java.lang.Object[] objArray57 = new java.lang.Object[] { cSVFormat29, 'a', false, '\"', '\\' };
        java.lang.String str58 = cSVFormat24.format(objArray57);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[Delimiter=<\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false, a, false, \", \\]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[Delimiter=<\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false, a, false, \", \\]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Delimiter=<\b\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\bn> SkipHeaderRecord:false\ta\tfalse\t\"\t\\a" + "'", str58, "Delimiter=<\b\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\bn> SkipHeaderRecord:false\ta\tfalse\t\"\t\\a");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        java.lang.Class<?> wildcardClass6 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentStart((java.lang.Character) '\b');
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        java.lang.String str12 = cSVFormat11.toString();
        java.lang.Object obj13 = null;
        boolean boolean14 = cSVFormat11.equals(obj13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str12, "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuotePolicy(quote7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = cSVFormat4.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        java.lang.String str9 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        java.lang.Character char18 = cSVFormat15.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        boolean boolean12 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        cSVFormat0.validate();
        java.lang.Character char3 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.Quote quote7 = cSVFormat0.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(quote7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('#');
        java.lang.String str11 = cSVFormat8.getNullString();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat8.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.isCommentingEnabled();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat0.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\037');
        boolean boolean10 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        java.lang.String str7 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator('\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.toString();
        java.lang.Character char2 = cSVFormat0.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat15.getSkipHeaderRecord();
        boolean boolean17 = cSVFormat15.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withDelimiter('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\037');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuotePolicy(quote7);
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat15.getSkipHeaderRecord();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = cSVFormat15.parse(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.isCommentingEnabled();
        cSVFormat0.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        java.lang.Object[] objArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVFormat4.format(objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        boolean boolean11 = cSVFormat6.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        boolean boolean21 = cSVFormat20.isQuoting();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = cSVFormat20.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\r');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator('\n');
        java.lang.Class<?> wildcardClass11 = cSVFormat6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        boolean boolean7 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = cSVFormat4.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart('a');
        java.lang.String str11 = cSVFormat8.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        java.lang.String str6 = cSVFormat0.toString();
        boolean boolean7 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.String str2 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=<\\> SkipHeaderRecord:false" + "'", str2, "Delimiter=<\\> SkipHeaderRecord:false");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        cSVFormat0.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String str1 = cSVFormat0.toString();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = cSVFormat0.parse(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str1, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        boolean boolean6 = cSVFormat4.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String str1 = cSVFormat0.toString();
        boolean boolean2 = cSVFormat0.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str1, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        java.lang.String str12 = cSVFormat9.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str12, "Delimiter=<\t> Escape=<\\> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentStart((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean9 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat7.withQuotePolicy(quote16);
        boolean boolean18 = cSVFormat4.equals((java.lang.Object) quote16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        boolean boolean7 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean8 = cSVFormat0.isCommentingEnabled();
        cSVFormat0.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar('#');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withCommentStart('a');
        boolean boolean26 = cSVFormat10.equals((java.lang.Object) cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b" + "'", str11, "\b");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        java.lang.String str7 = cSVFormat4.toString();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat4.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuoteChar('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreEmptyLines(true);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat9.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(strArray25);
        java.lang.String str28 = cSVFormat0.format((java.lang.Object[]) strArray25);
        boolean boolean29 = cSVFormat0.getIgnoreEmptyLines();
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = cSVFormat0.parse(reader30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str28, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\u2029");
        boolean boolean11 = cSVFormat8.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar('4');
        java.lang.String str9 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<#> QuoteChar=<4> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<#> QuoteChar=<4> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        java.lang.String str3 = cSVFormat1.getNullString();
        boolean boolean4 = cSVFormat1.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart('\t');
        boolean boolean23 = cSVFormat14.equals((java.lang.Object) cSVFormat20);
        char char24 = cSVFormat20.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\t' + "'", char24 == '\t');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean3 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('\b');
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat0.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        java.lang.Character char4 = cSVFormat0.getCommentStart();
        boolean boolean5 = cSVFormat0.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator("\u2029");
        java.lang.String str14 = cSVFormat13.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<\t> Escape=<\\\u2029> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str14, "Delimiter=<\t> Escape=<\\\u2029> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withEscape((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        java.lang.String str36 = cSVFormat9.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat9.withQuoteChar((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart('\t');
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false", "10", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10", "Delimiter=<\\> SkipHeaderRecord:false", "\u2028" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withHeader(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: '10' in [Delimiter=<?> Escape=<\\> RecordSeparator=<?> SkipHeaderRecord:false, 10, Delimiter=<?> QuoteChar=<\"> RecordSeparator=<??> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, 10, Delimiter=<\\> SkipHeaderRecord:false, ?]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        boolean boolean34 = cSVFormat33.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\037');
        java.lang.String str10 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuoteChar('\036');
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuotePolicy(quote11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator('4');
        java.lang.String[] strArray4 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str7 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withNullString("a");
        boolean boolean16 = cSVFormat15.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        cSVFormat5.validate();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.getSkipHeaderRecord();
        boolean boolean10 = cSVFormat7.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withSkipHeaderRecord(false);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        boolean boolean21 = cSVFormat20.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withCommentStart(' ');
        java.lang.Character char24 = cSVFormat23.getQuoteChar();
        char char25 = cSVFormat23.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\t' + "'", char25 == '\t');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        boolean boolean21 = cSVFormat20.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withCommentStart('\\');
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat25.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The comment start and the escape character cannot be the same ('\\')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat6.isQuoting();
        java.lang.String str8 = cSVFormat6.toString();
        char char9 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str8, "Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat0.isQuoting();
        boolean boolean7 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        java.lang.Character char34 = cSVFormat1.getQuoteChar();
        java.lang.String str35 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart('\b');
        boolean boolean19 = cSVFormat16.getIgnoreSurroundingSpaces();
        boolean boolean20 = cSVFormat4.equals((java.lang.Object) boolean19);
        boolean boolean21 = cSVFormat4.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteChar('#');
        java.lang.String str18 = cSVFormat13.getNullString();
        boolean boolean19 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("hi!");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat29.withHeader(strArray38);
        java.lang.String str41 = cSVFormat13.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat11.withHeader(strArray38);
        java.lang.String str43 = cSVFormat42.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str41, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteChar=<,> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str43, "Delimiter=<\t> Escape=<\\> QuoteChar=<,> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getSkipHeaderRecord();
        java.lang.String[] strArray7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat9.withEscape('\t');
        java.lang.Class<?> wildcardClass38 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        boolean boolean6 = cSVFormat3.isNullHandling();
        boolean boolean7 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape('\t');
        boolean boolean14 = cSVFormat13.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withNullString("Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
        char char8 = cSVFormat7.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\\' + "'", char8 == '\\');
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char13 = cSVFormat5.getCommentStart();
        java.lang.String[] strArray17 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withHeader(strArray27);
        char char31 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\t' + "'", char31 == '\t');
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        boolean boolean8 = cSVFormat6.getSkipHeaderRecord();
        cSVFormat6.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        boolean boolean13 = cSVFormat11.isEscaping();
        boolean boolean14 = cSVFormat11.isQuoting();
        boolean boolean15 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        java.lang.String str36 = cSVFormat9.getNullString();
        org.apache.commons.csv.Quote quote37 = cSVFormat9.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(quote37);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentStart((java.lang.Character) '\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat1.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        boolean boolean8 = cSVFormat6.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart('\t');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withEscape((java.lang.Character) '\b');
        boolean boolean25 = cSVFormat24.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        java.lang.String[] strArray8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.String str9 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart('\\');
        java.lang.Character char15 = cSVFormat14.getQuoteChar();
        boolean boolean16 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat0.isNullHandling();
        boolean boolean6 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char6 = cSVFormat0.getQuoteChar();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentStart((java.lang.Character) '\b');
        boolean boolean8 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        java.lang.String str8 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str8, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        boolean boolean8 = cSVFormat6.getSkipHeaderRecord();
        cSVFormat6.validate();
        java.lang.Class<?> wildcardClass10 = cSVFormat6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        boolean boolean28 = cSVFormat17.getSkipHeaderRecord();
        java.lang.Character char29 = cSVFormat17.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(char29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<4> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('#');
        java.lang.String str11 = cSVFormat10.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        boolean boolean21 = cSVFormat9.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart('\b');
        boolean boolean19 = cSVFormat16.getIgnoreSurroundingSpaces();
        boolean boolean20 = cSVFormat4.equals((java.lang.Object) boolean19);
        java.lang.Character char21 = cSVFormat4.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(char21);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote2 = cSVFormat0.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(quote2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\036');
        char char2 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\036' + "'", char2 == '\036');
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        java.lang.String[] strArray9 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteChar((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.isEscaping();
        boolean boolean4 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        boolean boolean11 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withNullString("\205");
        java.lang.String[] strArray14 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.String str10 = cSVFormat9.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> EmptyLines:ignored SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(strArray25);
        java.lang.String str28 = cSVFormat0.format((java.lang.Object[]) strArray25);
        boolean boolean29 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat0.withQuoteChar((java.lang.Character) '#');
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = cSVFormat31.parse(reader32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str28, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentStart((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withEscape('\036');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreSurroundingSpaces(false);
        boolean boolean27 = cSVFormat24.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        java.lang.Character char4 = cSVFormat0.getCommentStart();
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteChar('#');
        java.lang.String str18 = cSVFormat13.getNullString();
        boolean boolean19 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("hi!");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat29.withHeader(strArray38);
        java.lang.String str41 = cSVFormat13.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat11.withHeader(strArray38);
        java.lang.Class<?> wildcardClass43 = strArray38.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str41, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char13 = cSVFormat5.getCommentStart();
        java.lang.String[] strArray17 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withHeader(strArray27);
        boolean boolean31 = cSVFormat30.isCommentingEnabled();
        org.apache.commons.csv.Quote quote32 = cSVFormat30.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(quote32);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuotePolicy(quote2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator('4');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuotePolicy(quote5);
        java.lang.Character char7 = cSVFormat3.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        java.lang.Character char34 = cSVFormat33.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\u2029");
        boolean boolean11 = cSVFormat8.getSkipHeaderRecord();
        java.lang.Class<?> wildcardClass12 = cSVFormat8.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withNullString("\n");
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat8.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator('\037');
        boolean boolean11 = cSVFormat10.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape('4');
        boolean boolean14 = cSVFormat10.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote9 = cSVFormat6.getQuotePolicy();
        java.lang.String str10 = cSVFormat6.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuoteChar((java.lang.Character) '\f');
        java.lang.Object[] objArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVFormat8.format(objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('\036');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) '\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        java.lang.String str6 = cSVFormat0.toString();
        cSVFormat0.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator('\r');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        boolean boolean7 = cSVFormat6.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat8.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("Delimiter=<\b\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\bn> SkipHeaderRecord:false\ta\tfalse\t\"\t\\a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean3 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('\b');
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withNullString("Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        char char14 = cSVFormat13.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\t' + "'", char14 == '\t');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean11 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuoteChar('#');
        java.lang.String str14 = cSVFormat9.getNullString();
        boolean boolean15 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator("hi!");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat25.withHeader(strArray34);
        java.lang.String str37 = cSVFormat9.format((java.lang.Object[]) strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat0.withHeader(strArray34);
        char char39 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str37, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\t' + "'", char39 == '\t');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        org.apache.commons.csv.Quote quote6 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(quote6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart('\037');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('\037');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreSurroundingSpaces(false);
        java.lang.Character char27 = cSVFormat26.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuoteChar((java.lang.Character) '\f');
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuoteChar('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        java.lang.String[] strArray21 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        cSVFormat9.validate();
        boolean boolean25 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        java.lang.Character char8 = cSVFormat7.getCommentStart();
        java.lang.Class<?> wildcardClass9 = cSVFormat7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(false);
        java.lang.Character char8 = cSVFormat4.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator('\037');
        boolean boolean11 = cSVFormat10.isQuoting();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuoteChar((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        java.lang.String str16 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false" + "'", str16, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat9.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withEscape((java.lang.Character) '\036');
        java.io.Reader reader42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser43 = cSVFormat39.parse(reader42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat9.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withNullString("a");
        java.lang.Character char40 = cSVFormat39.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNull(char40);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean13 = cSVFormat9.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.Quote quote16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withQuotePolicy(quote16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart((java.lang.Character) '\037');
        boolean boolean10 = cSVFormat9.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withDelimiter('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat15.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        boolean boolean14 = cSVFormat11.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withNullString("Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("Delimiter=<\t> Escape=<\\> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withRecordSeparator('#');
        boolean boolean30 = cSVFormat17.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote9 = cSVFormat6.getQuotePolicy();
        org.apache.commons.csv.Quote quote10 = cSVFormat6.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertNull(quote10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.Quote quote10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean14 = cSVFormat13.isEscaping();
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuotePolicy(quote15);
        java.lang.Character char17 = cSVFormat16.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEscape((java.lang.Character) '4');
        boolean boolean20 = cSVFormat9.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        java.lang.String[] strArray21 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuotePolicy(quote24);
        boolean boolean26 = cSVFormat25.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '\b');
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('\037');
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.Quote quote21 = cSVFormat20.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(quote21);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat6.isQuoting();
        org.apache.commons.csv.Quote quote8 = cSVFormat6.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(quote8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(true);
        boolean boolean14 = cSVFormat10.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat5.isEscaping();
        boolean boolean8 = cSVFormat5.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        boolean boolean10 = cSVFormat4.getSkipHeaderRecord();
        java.lang.String[] strArray11 = cSVFormat4.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        java.lang.String str8 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(true);
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str8, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean8 = cSVFormat0.isCommentingEnabled();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char13 = cSVFormat5.getCommentStart();
        java.lang.String[] strArray17 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withHeader(strArray27);
        boolean boolean31 = cSVFormat30.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withQuoteChar((java.lang.Character) '\036');
        java.lang.String str34 = cSVFormat30.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat30.withDelimiter('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str34, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char7 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteChar('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '\"');
        java.lang.String str9 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<#> QuoteChar=<\"> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<#> QuoteChar=<\"> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        boolean boolean16 = cSVFormat14.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart('\t');
        boolean boolean9 = cSVFormat6.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        boolean boolean5 = cSVFormat1.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote12 = cSVFormat9.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '4');
        char char9 = cSVFormat8.getDelimiter();
        char char10 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean16 = cSVFormat15.isNullHandling();
        boolean boolean17 = cSVFormat15.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat15.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withEscape('\037');
        java.lang.String[] strArray26 = cSVFormat25.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withIgnoreEmptyLines(true);
        boolean boolean29 = cSVFormat14.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        char char11 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuoteChar('\036');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withRecordSeparator('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str10 = cSVFormat9.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean8 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('\b');
        java.lang.String str24 = cSVFormat23.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withRecordSeparator("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat34.withHeader(strArray43);
        java.lang.String[] strArray46 = cSVFormat34.getHeader();
        java.lang.String str47 = cSVFormat23.format((java.lang.Object[]) strArray46);
        java.lang.String str48 = cSVFormat12.format((java.lang.Object[]) strArray46);
        java.lang.String[] strArray49 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\b" + "'", str24, "\b");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str47, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str48, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNull(strArray49);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        boolean boolean4 = cSVFormat0.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines(true);
        boolean boolean13 = cSVFormat0.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        boolean boolean14 = cSVFormat13.getSkipHeaderRecord();
        java.lang.String str15 = cSVFormat13.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("\b");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        boolean boolean11 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withNullString("\205");
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withQuotePolicy(quote14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        java.lang.Character char9 = cSVFormat0.getQuoteChar();
        boolean boolean11 = cSVFormat0.equals((java.lang.Object) "Delimiter=<\t> Escape=<#> QuoteChar=<4> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator('\r');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        boolean boolean11 = cSVFormat9.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean7 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuoteChar('#');
        java.lang.String str10 = cSVFormat5.getNullString();
        boolean boolean11 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator("hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat21.withHeader(strArray30);
        java.lang.String str33 = cSVFormat5.format((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withDelimiter('\"');
        java.lang.Class<?> wildcardClass37 = cSVFormat3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str33, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        char char12 = cSVFormat10.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b" + "'", str11, "\b");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\t' + "'", char12 == '\t');
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        java.lang.Character char36 = cSVFormat9.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNull(char36);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        boolean boolean28 = cSVFormat17.isEscaping();
        java.lang.String str29 = cSVFormat17.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        cSVFormat0.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat13.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteChar('#');
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10 };
        java.lang.String str26 = cSVFormat21.format(objArray25);
        boolean boolean27 = cSVFormat8.equals((java.lang.Object) str26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat8.withRecordSeparator("Delimiter=<\b\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\bn> SkipHeaderRecord:false\ta\tfalse\t\"\t\\a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('#');
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10 };
        java.lang.String str13 = cSVFormat8.format(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withNullString("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        boolean boolean13 = cSVFormat11.isEscaping();
        boolean boolean14 = cSVFormat11.isQuoting();
        cSVFormat11.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        char char15 = cSVFormat11.getDelimiter();
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat11.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\t' + "'", char15 == '\t');
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        char char4 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\f');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat11.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        java.lang.String[] strArray21 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuotePolicy(quote24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withQuoteChar('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat6.isQuoting();
        boolean boolean8 = cSVFormat6.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('a');
        boolean boolean4 = cSVFormat1.isCommentingEnabled();
        boolean boolean5 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.Quote quote9 = cSVFormat6.getQuotePolicy();
        java.lang.Character char10 = cSVFormat6.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        boolean boolean12 = cSVFormat5.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        boolean boolean10 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        boolean boolean32 = cSVFormat31.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withCommentStart('\\');
        boolean boolean37 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean38 = cSVFormat9.equals((java.lang.Object) cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.apache.commons.csv.Quote quote8 = cSVFormat6.getQuotePolicy();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat6.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(quote8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        char char11 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean15 = cSVFormat14.isNullHandling();
        boolean boolean16 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("hi!");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreEmptyLines(true);
        java.lang.Character char27 = cSVFormat19.getCommentStart();
        java.lang.String[] strArray31 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat19.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat34.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat14.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat13.withHeader(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.Quote quote23 = cSVFormat22.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(quote23);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withQuoteChar('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean13 = cSVFormat9.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withEscape((java.lang.Character) ' ');
        boolean boolean16 = cSVFormat15.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuoteChar((java.lang.Character) '\036');
        boolean boolean12 = cSVFormat11.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('a');
        boolean boolean9 = cSVFormat8.isEscaping();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat8.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        boolean boolean11 = cSVFormat10.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat6.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart('\\');
        org.apache.commons.csv.Quote quote15 = cSVFormat11.getQuotePolicy();
        boolean boolean16 = cSVFormat11.getIgnoreEmptyLines();
        boolean boolean17 = cSVFormat11.isEscaping();
        cSVFormat11.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quote15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("Delimiter=<\\> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\t');
        boolean boolean14 = cSVFormat8.equals((java.lang.Object) '\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        char char11 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean14 = cSVFormat12.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.Quote quote21 = cSVFormat18.getQuotePolicy();
        boolean boolean22 = cSVFormat11.equals((java.lang.Object) quote21);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(quote21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        char char11 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart('\037');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteChar('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuoteChar('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        java.lang.String[] strArray9 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentStart((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        boolean boolean14 = cSVFormat13.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withCommentStart('\"');
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = cSVFormat17.parse(reader30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuotePolicy(quote2);
        org.apache.commons.csv.Quote quote4 = cSVFormat3.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        boolean boolean11 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withNullString("Delimiter=<\t> Escape=<\\> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        boolean boolean7 = cSVFormat6.isQuoting();
        java.lang.String str8 = cSVFormat6.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator('\037');
        boolean boolean11 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        boolean boolean10 = cSVFormat0.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\t');
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean3 = cSVFormat0.equals((java.lang.Object) '\f');
        boolean boolean4 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean11 = cSVFormat10.isNullHandling();
        boolean boolean12 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('\b');
        org.apache.commons.csv.Quote quote21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withQuotePolicy(quote21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean25 = cSVFormat23.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator('\b');
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator("hi!");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat44.withHeader(strArray53);
        java.lang.String[] strArray56 = cSVFormat44.getHeader();
        java.lang.String str57 = cSVFormat33.format((java.lang.Object[]) strArray56);
        java.lang.String str58 = cSVFormat22.format((java.lang.Object[]) strArray56);
        java.lang.String str59 = cSVFormat9.format((java.lang.Object[]) strArray56);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\b" + "'", str34, "\b");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str57, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str58, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsehi!" + "'", str59, "\\r\\n\t1\\\t100.0\\\tfalsehi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat2.isNullHandling();
        boolean boolean17 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean18 = cSVFormat2.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart('\\');
        org.apache.commons.csv.Quote quote15 = cSVFormat11.getQuotePolicy();
        boolean boolean16 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quote15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        boolean boolean18 = cSVFormat14.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        cSVFormat0.validate();
        java.lang.String[] strArray3 = cSVFormat0.getHeader();
        char char4 = cSVFormat0.getDelimiter();
        java.lang.Object[] objArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVFormat0.format(objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        java.lang.String str7 = cSVFormat4.toString();
        boolean boolean8 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean9 = cSVFormat4.getIgnoreEmptyLines();
        java.lang.Character char10 = cSVFormat4.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(true);
        boolean boolean10 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withRecordSeparator("Delimiter=<\"> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.Quote quote8 = cSVFormat4.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quote8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        char char15 = cSVFormat11.getDelimiter();
        java.lang.Character char16 = cSVFormat11.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\t' + "'", char15 == '\t');
        org.junit.Assert.assertNull(char16);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        java.lang.Character char4 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart((java.lang.Character) 'a');
        boolean boolean5 = cSVFormat4.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.Quote quote16 = cSVFormat2.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(quote16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat2.isNullHandling();
        java.lang.String str9 = cSVFormat2.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withNullString("\\r\\n\t1\\\t100.0\\\tfalse");
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        boolean boolean28 = cSVFormat17.isEscaping();
        java.lang.String str29 = cSVFormat17.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Delimiter=<\t> Escape=<\\\u2028, \205, \n]" + "'", str29, "Delimiter=<\t> Escape=<\\\u2028, \205, \n]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        boolean boolean8 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Class<?> wildcardClass9 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean17 = cSVFormat16.isNullHandling();
        boolean boolean18 = cSVFormat16.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat16.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteChar('#');
        java.lang.String str27 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator("hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator("hi!");
        java.lang.String[] strArray50 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withRecordSeparator("hi!");
        java.lang.String[] strArray62 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat53.withHeader(strArray62);
        java.lang.String str65 = cSVFormat39.format((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat29.withHeader(strArray62);
        java.lang.String str67 = cSVFormat13.format((java.lang.Object[]) strArray62);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str65, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1\t100.0\tfalse\f#" + "'", str67, "1\t100.0\tfalse\f#");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withQuoteChar((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        boolean boolean13 = cSVFormat12.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withDelimiter('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        java.lang.String str11 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        java.lang.String str10 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        char char9 = cSVFormat0.getDelimiter();
        boolean boolean10 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withNullString("");
        boolean boolean13 = cSVFormat12.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteChar('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        boolean boolean14 = cSVFormat11.isNullHandling();
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuotePolicy(quote15);
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = cSVFormat11.parse(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart((java.lang.Character) '\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("Delimiter=<\"> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String str9 = cSVFormat6.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<,> QuoteChar=<\"> CommentStart=<\\> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str9, "Delimiter=<,> QuoteChar=<\"> CommentStart=<\\> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator("hi!");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat30.withHeader(strArray39);
        java.lang.String str42 = cSVFormat16.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat4.withHeader(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str42, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        java.lang.Character char34 = cSVFormat1.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalsea");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withCommentStart((java.lang.Character) '\t');
        java.io.Reader reader39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser40 = cSVFormat38.parse(reader39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape('\t');
        java.lang.Character char14 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape((java.lang.Character) '\b');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withNullString("Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, 4r4n, 1\t100.0\tfalse]\\Delimiter=<\t> Escape=<4\\> QuoteChar=<#> RecordSeparator=<4n> SkipHeaderRecord:false\\Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false\\\b\\0\\10");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart('\f');
        boolean boolean10 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        java.lang.Object obj9 = null;
        boolean boolean10 = cSVFormat8.equals(obj9);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        boolean boolean7 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        java.lang.Character char34 = cSVFormat1.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalsea");
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withRecordSeparator("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator('a');
        java.lang.String str47 = cSVFormat46.getRecordSeparator();
        org.apache.commons.csv.Quote quote48 = null;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withQuotePolicy(quote48);
        boolean boolean50 = cSVFormat1.equals((java.lang.Object) cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "a" + "'", str47, "a");
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        java.lang.String str6 = cSVFormat4.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\t> Escape=<\\> NullString=<hi!> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withEscape((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) ',');
        boolean boolean13 = cSVFormat6.isNullHandling();
        char char14 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\t' + "'", char14 == '\t');
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat7.getRecordSeparator();
        boolean boolean11 = cSVFormat7.getSkipHeaderRecord();
        char char12 = cSVFormat7.getDelimiter();
        java.lang.String str13 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\t' + "'", char12 == '\t');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(strArray25);
        java.lang.String str28 = cSVFormat0.format((java.lang.Object[]) strArray25);
        boolean boolean29 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat0.withDelimiter('\"');
        java.lang.String str32 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str28, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean11 = cSVFormat9.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('\b');
        org.apache.commons.csv.Quote quote20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean24 = cSVFormat22.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator('\b');
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withRecordSeparator("hi!");
        java.lang.String[] strArray52 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat43.withHeader(strArray52);
        java.lang.String[] strArray55 = cSVFormat43.getHeader();
        java.lang.String str56 = cSVFormat32.format((java.lang.Object[]) strArray55);
        java.lang.String str57 = cSVFormat21.format((java.lang.Object[]) strArray55);
        java.lang.String str58 = cSVFormat8.format((java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\b" + "'", str33, "\b");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str56, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str57, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str58, "\\r\\n\t1\\\t100.0\\\tfalse");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\t');
        boolean boolean7 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean7 = cSVFormat0.equals((java.lang.Object) (-1));
        java.lang.Character char8 = cSVFormat0.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('#');
        java.lang.String str11 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator("hi!");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator("hi!");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat37.withHeader(strArray46);
        java.lang.String str49 = cSVFormat23.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat13.withHeader(strArray46);
        java.lang.String[] strArray51 = cSVFormat13.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str49, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(strArray51);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.Quote quote9 = cSVFormat6.getQuotePolicy();
        boolean boolean10 = cSVFormat6.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('a');
        char char9 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withQuoteChar((java.lang.Character) '\f');
        boolean boolean30 = cSVFormat17.isCommentingEnabled();
        boolean boolean31 = cSVFormat17.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat17.withCommentStart((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.Character char7 = cSVFormat0.getQuoteChar();
        cSVFormat0.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        char char9 = cSVFormat0.getDelimiter();
        boolean boolean10 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withNullString("");
        java.lang.String[] strArray13 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withIgnoreEmptyLines(true);
        java.lang.Character char18 = cSVFormat10.getCommentStart();
        java.lang.String[] strArray22 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator("hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreEmptyLines(true);
        java.lang.Character char34 = cSVFormat26.getCommentStart();
        java.lang.String[] strArray38 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat26.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat41.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withIgnoreEmptyLines(false);
        boolean boolean53 = cSVFormat50.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean55 = cSVFormat54.isNullHandling();
        boolean boolean56 = cSVFormat54.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat54.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat54.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat54.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withQuoteChar('#');
        java.lang.Object[] objArray66 = new java.lang.Object[] { 10 };
        java.lang.String str67 = cSVFormat62.format(objArray66);
        java.lang.String str68 = cSVFormat50.format(objArray66);
        java.lang.String str69 = cSVFormat10.format(objArray66);
        java.lang.String str70 = cSVFormat7.format(objArray66);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "10" + "'", str67, "10");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "10hi!" + "'", str68, "10hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "10hi!" + "'", str69, "10hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "10" + "'", str70, "10");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        java.lang.Object[] objArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVFormat14.format(objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        java.lang.String[] strArray8 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat4.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        java.lang.String str12 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentStart((java.lang.Character) '\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b" + "'", str11, "\b");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('a');
        org.apache.commons.csv.Quote quote6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuotePolicy(quote6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        boolean boolean6 = cSVFormat4.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteChar(',');
        java.lang.String str28 = cSVFormat27.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator("hi!");
        java.lang.String[] strArray51 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat54.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator("hi!");
        java.lang.String[] strArray65 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat61.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withRecordSeparator("hi!");
        java.lang.String[] strArray77 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat73.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat68.withHeader(strArray77);
        java.lang.String str80 = cSVFormat54.format((java.lang.Object[]) strArray77);
        java.lang.String str81 = cSVFormat40.format((java.lang.Object[]) strArray77);
        java.lang.String str82 = cSVFormat27.format((java.lang.Object[]) strArray77);
        java.lang.String str83 = cSVFormat15.format((java.lang.Object[]) strArray77);
        java.io.Reader reader84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser85 = cSVFormat15.parse(reader84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "a" + "'", str28, "a");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str80, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str81, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + ",,\t,\r\n,\t,1\t100.0\tfalse,a" + "'", str82, ",,\t,\r\n,\t,1\t100.0\tfalse,a");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsehi!" + "'", str83, "\\r\\n\t1\\\t100.0\\\tfalsehi!");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat4.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart((java.lang.Character) 'a');
        boolean boolean29 = cSVFormat26.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.Quote quote6 = cSVFormat5.getQuotePolicy();
        boolean boolean7 = cSVFormat5.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quote6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.Quote quote10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char9 = cSVFormat8.getCommentStart();
        cSVFormat8.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteChar('#');
        java.lang.String str18 = cSVFormat13.getNullString();
        boolean boolean19 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("hi!");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat29.withHeader(strArray38);
        java.lang.String str41 = cSVFormat13.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat11.withHeader(strArray38);
        char char43 = cSVFormat11.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str41, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\t' + "'", char43 == '\t');
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean7 = cSVFormat0.equals((java.lang.Object) (-1));
        java.lang.Character char8 = cSVFormat0.getQuoteChar();
        boolean boolean9 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord(true);
        cSVFormat10.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat6.isQuoting();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuoteChar((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str8, "Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuoteChar((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withDelimiter('a');
        java.lang.String str8 = cSVFormat7.getNullString();
        boolean boolean9 = cSVFormat7.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("hi!");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withHeader(strArray32);
        java.lang.String str35 = cSVFormat9.format((java.lang.Object[]) strArray32);
        java.lang.String str36 = cSVFormat9.getRecordSeparator();
        boolean boolean37 = cSVFormat9.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str35, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "a" + "'", str36, "a");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean11 = cSVFormat10.isNullHandling();
        boolean boolean12 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar('#');
        java.lang.String str15 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withEscape((java.lang.Character) '\t');
        boolean boolean18 = cSVFormat7.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(strArray25);
        java.lang.String str28 = cSVFormat0.format((java.lang.Object[]) strArray25);
        boolean boolean29 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean33 = cSVFormat32.isNullHandling();
        boolean boolean34 = cSVFormat32.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat32.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withDelimiter(' ');
        java.lang.String[] strArray41 = cSVFormat38.getHeader();
        boolean boolean42 = cSVFormat0.equals((java.lang.Object) strArray41);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str28, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean12 = cSVFormat11.isNullHandling();
        boolean boolean13 = cSVFormat11.isEscaping();
        java.lang.String str14 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) '\f');
        boolean boolean25 = cSVFormat8.equals((java.lang.Object) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat8.withCommentStart((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        cSVFormat9.validate();
        boolean boolean15 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat14.withRecordSeparator('\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('\037');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart('\\');
        java.lang.String str15 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        boolean boolean22 = cSVFormat13.equals((java.lang.Object) cSVFormat16);
        boolean boolean23 = cSVFormat13.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str12, "Delimiter=<\t> Escape=<\\> CommentStart=<\b> RecordSeparator=<a> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("\\r\\n\t1\\\t100.0\\\tfalse");
        boolean boolean10 = cSVFormat4.isQuoting();
        char char11 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str7 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("Delimiter=<\t> Escape=<\\\u2028, \205, \n]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        boolean boolean7 = cSVFormat6.isQuoting();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean13 = cSVFormat9.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreEmptyLines(true);
        boolean boolean16 = cSVFormat9.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        boolean boolean14 = cSVFormat13.isQuoting();
        java.lang.String[] strArray15 = cSVFormat13.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar('\t');
        org.apache.commons.csv.Quote quote16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuotePolicy(quote16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        boolean boolean10 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean7 = cSVFormat6.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withQuoteChar('\b');
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat6.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat4.withHeader(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        java.lang.String[] strArray10 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\037');
        boolean boolean10 = cSVFormat9.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        boolean boolean21 = cSVFormat20.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withCommentStart(' ');
        boolean boolean24 = cSVFormat20.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        java.lang.String str4 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        java.lang.String str13 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.Quote quote8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuotePolicy(quote8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        boolean boolean18 = cSVFormat14.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        boolean boolean11 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        boolean boolean11 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withNullString("\205");
        java.lang.String[] strArray14 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) '\\');
        java.lang.String str7 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean8 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("1\t100.0\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('\037');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        boolean boolean23 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.Quote quote24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withQuotePolicy(quote24);
        boolean boolean26 = cSVFormat4.equals((java.lang.Object) quote24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuoteChar('\b');
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        char char14 = cSVFormat12.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\t' + "'", char14 == '\t');
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('a');
        java.lang.Character char20 = cSVFormat14.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(char20);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        java.lang.Character char4 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean9 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withNullString("");
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withQuotePolicy(quote14);
        boolean boolean16 = cSVFormat6.equals((java.lang.Object) cSVFormat7);
        boolean boolean17 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        char char9 = cSVFormat0.getDelimiter();
        boolean boolean10 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('#');
        char char9 = cSVFormat4.getDelimiter();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) char9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean15 = cSVFormat13.isEscaping();
        java.lang.String str16 = cSVFormat13.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withCommentStart('\"');
        boolean boolean25 = cSVFormat0.equals((java.lang.Object) cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator(',');
        char char11 = cSVFormat10.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuotePolicy(quote7);
        java.lang.String str9 = cSVFormat8.toString();
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withCommentStart('\f');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat3.isQuoting();
        java.lang.Character char5 = cSVFormat3.getCommentStart();
        java.lang.String str6 = cSVFormat3.getNullString();
        boolean boolean7 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("hi!");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(strArray25);
        java.lang.String str28 = cSVFormat0.format((java.lang.Object[]) strArray25);
        org.apache.commons.csv.Quote quote29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withQuotePolicy(quote29);
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser32 = cSVFormat30.parse(reader31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str28, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getNullString();
        boolean boolean4 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withCommentStart('a');
        boolean boolean13 = cSVFormat12.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat0.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteChar((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('a');
        org.apache.commons.csv.Quote quote6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuotePolicy(quote6);
        boolean boolean8 = cSVFormat3.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean13 = cSVFormat9.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteChar('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\037');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.isNullHandling();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(strArray29);
        java.lang.String str32 = cSVFormat2.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat1.withHeader(strArray29);
        org.apache.commons.csv.Quote quote34 = cSVFormat33.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str32, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(quote34);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat6.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withRecordSeparator("\u2029");
        org.apache.commons.csv.Quote quote13 = cSVFormat12.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quote13);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator('\037');
        java.lang.String str10 = cSVFormat4.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean26 = cSVFormat24.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape('#');
        java.lang.String[] strArray31 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("hi!");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat34.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withCommentStart('\b');
        java.lang.Object[] objArray56 = new java.lang.Object[] { cSVFormat23, cSVFormat28, cSVFormat34, '\b', 0, 10L };
        java.lang.String str57 = cSVFormat15.format(objArray56);
        java.lang.String str58 = cSVFormat7.format(objArray56);
        boolean boolean59 = cSVFormat7.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat7.withCommentStart('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse], Delimiter=<\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false, \b, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse], Delimiter=<\t> Escape=<\\> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false, \b, 0, 10]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Delimiter=<\\\t> Escape=<\\\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \\r\\n, 1\\\t100.0\\\tfalse]\tDelimiter=<\\\t> Escape=<\\\\> QuoteChar=<#> RecordSeparator=<\\n> SkipHeaderRecord:false\tDelimiter=<\\\t> Escape=<\\\\> RecordSeparator=<hi!> SkipHeaderRecord:false\t\b\t0\t10hi!" + "'", str57, "Delimiter=<\\\t> Escape=<\\\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \\r\\n, 1\\\t100.0\\\tfalse]\tDelimiter=<\\\t> Escape=<\\\\> QuoteChar=<#> RecordSeparator=<\\n> SkipHeaderRecord:false\tDelimiter=<\\\t> Escape=<\\\\> RecordSeparator=<hi!> SkipHeaderRecord:false\t\b\t0\t10hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, 4r4n, 1\t100.0\tfalse]\\Delimiter=<\t> Escape=<4\\> QuoteChar=<#> RecordSeparator=<4n> SkipHeaderRecord:false\\Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false\\\b\\0\\10" + "'", str58, "Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, 4r4n, 1\t100.0\tfalse]\\Delimiter=<\t> Escape=<4\\> QuoteChar=<#> RecordSeparator=<4n> SkipHeaderRecord:false\\Delimiter=<\t> Escape=<4\\> RecordSeparator=<hi!> SkipHeaderRecord:false\\\b\\0\\10");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getEscape();
        java.lang.Character char2 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        boolean boolean9 = cSVFormat8.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreEmptyLines(true);
        boolean boolean17 = cSVFormat11.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(true);
        boolean boolean10 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withEscape('\037');
        boolean boolean13 = cSVFormat12.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        char char15 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withQuoteChar((java.lang.Character) 'a');
        cSVFormat17.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\t' + "'", char15 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getSkipHeaderRecord();
        java.lang.String[] strArray7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        boolean boolean9 = cSVFormat4.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator("hi!");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat30.withHeader(strArray39);
        java.lang.String str42 = cSVFormat16.format((java.lang.Object[]) strArray39);
        java.lang.String str43 = cSVFormat6.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat6.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str42, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str43, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\037');
        boolean boolean11 = cSVFormat6.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean12 = cSVFormat11.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\037');
        java.lang.String[] strArray17 = cSVFormat14.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("\u2029");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withHeader(strArray18);
        java.lang.String[] strArray21 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withRecordSeparator("Delimiter=<\t> Escape=<#> QuoteChar=<#> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.Character char24 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat9.withEscape((java.lang.Character) '#');
        boolean boolean27 = cSVFormat9.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean6 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withDelimiter('\"');
        boolean boolean13 = cSVFormat0.equals((java.lang.Object) cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart('\b');
        org.apache.commons.csv.Quote quote12 = cSVFormat11.getQuotePolicy();
        boolean boolean13 = cSVFormat11.isEscaping();
        boolean boolean14 = cSVFormat11.isQuoting();
        java.lang.String str15 = cSVFormat11.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentStart((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("Delimiter=<\"> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\u2029");
        java.lang.String str11 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withNullString("\u2029");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        char char6 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.String[] strArray2 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(strArray12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator("hi!");
        java.lang.String[] strArray40 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withRecordSeparator("hi!");
        java.lang.String[] strArray52 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat43.withHeader(strArray52);
        java.lang.String str55 = cSVFormat29.format((java.lang.Object[]) strArray52);
        java.lang.String str56 = cSVFormat15.format((java.lang.Object[]) strArray52);
        boolean boolean57 = cSVFormat5.equals((java.lang.Object) cSVFormat15);
        java.lang.Character char58 = cSVFormat5.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str55, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str56, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(char58);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        java.lang.Character char9 = cSVFormat8.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char13 = cSVFormat5.getCommentStart();
        java.lang.String[] strArray17 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withHeader(strArray27);
        boolean boolean31 = cSVFormat30.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat17.withQuoteChar('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) '\\');
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        java.lang.String str8 = cSVFormat4.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.String str11 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100.0, false, \036]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1\t100.0\tfalse" + "'", str7, "1\t100.0\tfalse");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str11, "Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape((java.lang.Character) '\b');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuotePolicy(quote3);
        java.lang.Character char5 = cSVFormat4.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) '4');
        java.lang.Character char8 = cSVFormat4.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        boolean boolean8 = cSVFormat6.getSkipHeaderRecord();
        java.lang.Character char9 = cSVFormat6.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("hi!");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withIgnoreEmptyLines(true);
        java.lang.Character char15 = cSVFormat7.getCommentStart();
        java.lang.String[] strArray19 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat7.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuoteChar(',');
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat38.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withRecordSeparator("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withHeader(strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withRecordSeparator("hi!");
        java.lang.String[] strArray70 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat76 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withRecordSeparator("hi!");
        java.lang.String[] strArray82 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat78.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat73.withHeader(strArray82);
        java.lang.String str85 = cSVFormat59.format((java.lang.Object[]) strArray82);
        java.lang.String str86 = cSVFormat45.format((java.lang.Object[]) strArray82);
        java.lang.String str87 = cSVFormat32.format((java.lang.Object[]) strArray82);
        java.lang.String str88 = cSVFormat20.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat4.withHeader(strArray82);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "a" + "'", str33, "a");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str85, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str86, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ",,\t,\r\n,\t,1\t100.0\tfalse,a" + "'", str87, ",,\t,\r\n,\t,1\t100.0\tfalse,a");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsehi!" + "'", str88, "\\r\\n\t1\\\t100.0\\\tfalsehi!");
        org.junit.Assert.assertNotNull(cSVFormat89);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        cSVFormat9.validate();
        boolean boolean15 = cSVFormat9.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\u2029");
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuotePolicy(quote11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat7.getRecordSeparator();
        boolean boolean11 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withDelimiter('\f');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreEmptyLines(true);
        java.lang.Character char17 = cSVFormat9.getCommentStart();
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withHeader(strArray21);
        boolean boolean23 = cSVFormat6.equals((java.lang.Object) cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat7.getRecordSeparator();
        boolean boolean11 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}
