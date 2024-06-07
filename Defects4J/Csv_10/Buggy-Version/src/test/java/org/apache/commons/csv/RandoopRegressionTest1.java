package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        boolean boolean14 = cSVFormat13.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withIgnoreEmptyLines(true);
        java.lang.Character char25 = cSVFormat17.getCommentStart();
        java.lang.String[] strArray29 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat17.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("hi!");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat33.withIgnoreEmptyLines(true);
        java.lang.Character char41 = cSVFormat33.getCommentStart();
        java.lang.String[] strArray45 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat33.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withRecordSeparator("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat48.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withIgnoreEmptyLines(false);
        boolean boolean60 = cSVFormat57.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean62 = cSVFormat61.isNullHandling();
        boolean boolean63 = cSVFormat61.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withQuoteChar('#');
        java.lang.Object[] objArray73 = new java.lang.Object[] { 10 };
        java.lang.String str74 = cSVFormat69.format(objArray73);
        java.lang.String str75 = cSVFormat57.format(objArray73);
        java.lang.String str76 = cSVFormat17.format(objArray73);
        java.lang.String str77 = cSVFormat13.format(objArray73);
        java.lang.String str78 = cSVFormat13.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(char41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "10" + "'", str74, "10");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "10hi!" + "'", str75, "10hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "10hi!" + "'", str76, "10hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "10a" + "'", str77, "10a");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "a" + "'", str78, "a");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat2.isNullHandling();
        java.lang.String str9 = cSVFormat2.toString();
        java.lang.Character char10 = cSVFormat2.getQuoteChar();
        java.lang.Class<?> wildcardClass11 = cSVFormat2.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreEmptyLines(false);
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
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withSkipHeaderRecord(false);
        char char15 = cSVFormat14.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\t' + "'", char15 == '\t');
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator("hi!");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        java.lang.String str8 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(true);
        java.lang.String str11 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]" + "'", str8, "Delimiter=<\t> Escape=<\\> RecordSeparator=<hi!> SkipHeaderRecord:false Header:[, \r\n, 1\t100.0\tfalse]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        char char5 = cSVFormat0.getDelimiter();
        boolean boolean7 = cSVFormat0.equals((java.lang.Object) (-1));
        java.lang.Character char8 = cSVFormat0.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentStart('\f');
        boolean boolean11 = cSVFormat10.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        boolean boolean9 = cSVFormat0.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        java.lang.Character char13 = cSVFormat12.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        java.lang.Character char10 = cSVFormat2.getCommentStart();
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray14);
        boolean boolean16 = cSVFormat15.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean19 = cSVFormat17.isEscaping();
        java.lang.String str20 = cSVFormat17.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart('#');
        boolean boolean31 = cSVFormat15.equals((java.lang.Object) cSVFormat28);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean33 = cSVFormat32.isNullHandling();
        boolean boolean34 = cSVFormat32.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat37.withIgnoreEmptyLines(true);
        java.lang.Character char45 = cSVFormat37.getCommentStart();
        java.lang.String[] strArray49 = new java.lang.String[] { "\u2028", "\205", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat37.withHeader(strArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withRecordSeparator("hi!");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat52.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat32.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat28.withHeader(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(char45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(false);
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n" + "'", str34, "\n");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        java.lang.String str21 = cSVFormat16.getNullString();
        boolean boolean22 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat32.withHeader(strArray41);
        java.lang.String str44 = cSVFormat16.format((java.lang.Object[]) strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat13.withHeader(strArray41);
        boolean boolean46 = cSVFormat13.isQuoting();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str44, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.isNullHandling();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100.0d, boolean4, '\036' };
        java.lang.String str7 = cSVFormat0.format(objArray6);
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char9 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape('4');
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
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('\f');
        java.lang.String str8 = cSVFormat0.getNullString();
        java.lang.String str9 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat0.isEscaping();
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withQuoteChar(' ');
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
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreSurroundingSpaces(false);
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
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart('a');
        boolean boolean11 = cSVFormat8.getSkipHeaderRecord();
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
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        java.lang.String str21 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withIgnoreSurroundingSpaces(true);
        boolean boolean24 = cSVFormat23.getSkipHeaderRecord();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('\036');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean8 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote13 = cSVFormat12.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord(false);
        java.lang.Class<?> wildcardClass18 = cSVFormat15.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quote13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withIgnoreSurroundingSpaces(false);
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
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        char char51 = cSVFormat50.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withNullString("Delimiter=<\\> SkipHeaderRecord:false");
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
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '\t' + "'", char51 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat53);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        java.lang.String str21 = cSVFormat16.getNullString();
        boolean boolean22 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat32.withHeader(strArray41);
        java.lang.String str44 = cSVFormat16.format((java.lang.Object[]) strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat13.withHeader(strArray41);
        java.lang.String str46 = cSVFormat13.getNullString();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str44, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        boolean boolean2 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean7 = cSVFormat6.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        java.lang.Class<?> wildcardClass13 = cSVFormat11.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        org.apache.commons.csv.Quote quote19 = cSVFormat17.getQuotePolicy();
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
        org.junit.Assert.assertNull(quote19);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char6 = cSVFormat0.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        boolean boolean9 = cSVFormat0.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuoteChar('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withDelimiter('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) '\\');
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
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        cSVFormat17.validate();
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        java.lang.Class<?> wildcardClass23 = cSVFormat22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.Quote quote4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat5.isEscaping();
        boolean boolean8 = cSVFormat5.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar(',');
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator("hi!");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withRecordSeparator("hi!");
        java.lang.String[] strArray49 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withHeader(strArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withRecordSeparator("hi!");
        java.lang.String[] strArray63 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat59.withHeader(strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withRecordSeparator("hi!");
        java.lang.String[] strArray75 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat71.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat66.withHeader(strArray75);
        java.lang.String str78 = cSVFormat52.format((java.lang.Object[]) strArray75);
        java.lang.String str79 = cSVFormat38.format((java.lang.Object[]) strArray75);
        java.lang.String str80 = cSVFormat25.format((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat13.withHeader(strArray75);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a" + "'", str26, "a");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str78, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str79, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + ",,\t,\r\n,\t,1\t100.0\tfalse,a" + "'", str80, ",,\t,\r\n,\t,1\t100.0\tfalse,a");
        org.junit.Assert.assertNotNull(cSVFormat81);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat9.withQuotePolicy(quote24);
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
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.Class<?> wildcardClass5 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
        boolean boolean2 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('\b');
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
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
        java.lang.String[] strArray33 = cSVFormat21.getHeader();
        java.lang.String str34 = cSVFormat10.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator("hi!");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withRecordSeparator("hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withRecordSeparator("hi!");
        java.lang.String[] strArray69 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat72.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withRecordSeparator("hi!");
        java.lang.String[] strArray81 = new java.lang.String[] { "", "\r\n", "1\t100.0\tfalse" };
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat77.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat72.withHeader(strArray81);
        java.lang.String str84 = cSVFormat58.format((java.lang.Object[]) strArray81);
        java.lang.String str85 = cSVFormat44.format((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat10.withHeader(strArray81);
        boolean boolean87 = cSVFormat86.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat86.withCommentStart('a');
        boolean boolean90 = cSVFormat89.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b" + "'", str11, "\b");
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalse" + "'", str34, "\\r\\n\t1\\\t100.0\\\tfalse");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str84, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\\r\\n\t1\\\t100.0\\\tfalsea" + "'", str85, "\\r\\n\t1\\\t100.0\\\tfalsea");
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }
}

