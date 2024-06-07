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
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('\037');
        java.lang.String str11 = cSVFormat6.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false" + "'", str11, "Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('\036');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces();
        char char5 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\f' + "'", char5 == '\f');
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean7 = cSVFormat0.getIgnoreHeaderCase();
        java.lang.String[] strArray8 = cSVFormat0.getHeader();
        char char9 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat10.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
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
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat1.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat1.withQuote('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
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
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withEscape(',');
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
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(quoteMode4);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.QuoteMode quoteMode2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('\037');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withCommentMarker('\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withNullString("Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
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
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        java.lang.Class<?> wildcardClass3 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.QuoteMode quoteMode9 = org.apache.commons.csv.QuoteMode.NONE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No quotes mode set but no escape character is set");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean6 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withIgnoreSurroundingSpaces(false);
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('|');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) '\t', "\205");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        boolean boolean29 = cSVFormat3.isQuoteCharacterSet();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withNullString("\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord();
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        boolean boolean9 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) '\n');
        boolean boolean9 = cSVFormat6.isEscapeCharacterSet();
        java.lang.Character char10 = cSVFormat6.getEscapeCharacter();
        boolean boolean11 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("\u2028");
        boolean boolean12 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('\\');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        boolean boolean4 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('\t');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        java.lang.String[] strArray14 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        java.lang.String str5 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.String str6 = cSVFormat5.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String str8 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrailingDelimiter();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print((java.lang.Object) cSVFormat9, appendable10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        java.lang.Object obj3 = null;
        boolean boolean4 = cSVFormat2.equals(obj3);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withIgnoreHeaderCase(false);
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
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        boolean boolean17 = cSVFormat1.isCommentMarkerSet();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.print((java.lang.Object) cSVFormat12, appendable13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        java.lang.Character char6 = cSVFormat1.getEscapeCharacter();
        java.lang.Character char7 = cSVFormat1.getCommentMarker();
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat1.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("\u2029> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('|');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrim(false);
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
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean5 = cSVFormat1.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        boolean boolean9 = cSVFormat6.isQuoteCharacterSet();
        java.lang.String str10 = cSVFormat6.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withHeader(resultSetMetaData11);
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) cSVFormat12, appendable13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('#');
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat6.println(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker('#');
        java.lang.Appendable appendable7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withHeader(strArray24);
        java.lang.String str26 = cSVFormat22.format((java.lang.Object[]) strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat17.withHeader(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat4.printRecord(appendable7, (java.lang.Object[]) strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(false);
        boolean boolean7 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat0, "Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withRecordSeparator("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        java.lang.String str7 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentMarker(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str7, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withNullString("Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuote((java.lang.Character) '\b');
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('\036');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.QuoteMode quoteMode3 = org.apache.commons.csv.QuoteMode.NONE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteMode(quoteMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No quotes mode set but no escape character is set");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + quoteMode3 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode3.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote('\b');
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
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat4.withHeaderComments(objArray47);
        boolean boolean53 = cSVFormat52.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withFirstRecordAsHeader();
        java.lang.String str5 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\f');
        boolean boolean8 = cSVFormat3.getIgnoreHeaderCase();
        boolean boolean9 = cSVFormat1.equals((java.lang.Object) cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        java.io.File file10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat9.print(file10, charset11);
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withFirstRecordAsHeader();
        boolean boolean12 = cSVFormat10.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean14 = cSVFormat13.isQuoteCharacterSet();
        boolean boolean15 = cSVFormat13.isCommentMarkerSet();
        boolean boolean16 = cSVFormat13.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape((java.lang.Character) '\b');
        boolean boolean19 = cSVFormat18.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker(' ');
        java.lang.Object[] objArray44 = new java.lang.Object[] { 0L, cSVFormat39, cSVFormat43 };
        java.lang.String str45 = cSVFormat36.format(objArray44);
        java.lang.String str46 = cSVFormat23.format(objArray44);
        boolean boolean47 = cSVFormat18.equals((java.lang.Object) objArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat10.withHeaderComments(objArray44);
        boolean boolean49 = cSVFormat10.getTrailingDelimiter();
        java.lang.Appendable appendable50 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) boolean49, appendable50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str45, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str46, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String str8 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode12 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quoteMode12 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode12.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withSkipHeaderRecord();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(resultSetMetaData5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = cSVFormat3.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withFirstRecordAsHeader();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat6.equals((java.lang.Object) cSVFormat9);
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withHeader(resultSetMetaData13);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces();
        char char4 = cSVFormat2.getDelimiter();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator("0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
        java.lang.String str5 = cSVFormat4.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0L, cSVFormat6, cSVFormat10 };
        java.lang.String str12 = cSVFormat3.format(objArray11);
        java.lang.String[] strArray13 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat3, "hi!");
        boolean boolean16 = cSVFormat3.isEscapeCharacterSet();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withDelimiter('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String[] strArray3 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        java.lang.String str37 = cSVFormat36.getRecordSeparator();
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
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker('\\');
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(resultSetMetaData8);
        boolean boolean10 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat8.withEscape('\036');
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
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.Character char4 = cSVFormat0.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuote('a');
        boolean boolean7 = cSVFormat6.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape((java.lang.Character) '4');
        java.lang.Appendable appendable19 = null;
        cSVFormat18.println(appendable19);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
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
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        boolean boolean38 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withAllowMissingColumnNames();
        java.lang.Object obj16 = null;
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat15.print(obj16, appendable17, false);
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
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withIgnoreSurroundingSpaces(false);
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
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape((java.lang.Character) '4');
        java.lang.Class<?> wildcardClass19 = cSVFormat16.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.toString();
        boolean boolean6 = cSVFormat4.getAllowMissingColumnNames();
        java.lang.Class<?> wildcardClass7 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrailingDelimiter();
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
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        char char13 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withFirstRecordAsHeader();
        java.lang.Object[] objArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withHeaderComments(objArray15);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        boolean boolean4 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean5 = cSVFormat0.getIgnoreHeaderCase();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withEscape((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.Character char5 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
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
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat1.withQuoteMode(quoteMode35);
        java.io.File file38 = null;
        java.nio.charset.Charset charset39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter40 = cSVFormat1.print(file38, charset39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
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
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\037');
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = cSVFormat14.parse(reader17);
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
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean7 = cSVFormat2.isNullStringSet();
        boolean boolean8 = cSVFormat2.getIgnoreEmptyLines();
        java.nio.file.Path path9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat2.print(path9, charset10);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat5);
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
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withRecordSeparator("Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
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
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        java.lang.String str11 = cSVFormat10.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        java.nio.file.Path path44 = null;
        java.nio.charset.Charset charset45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter46 = cSVFormat3.print(path44, charset45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('|');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(false);
        java.lang.String[] strArray15 = cSVFormat12.getHeaderComments();
        boolean boolean16 = cSVFormat12.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withTrailingDelimiter(true);
        char char28 = cSVFormat27.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker(' ');
        java.lang.Object[] objArray40 = new java.lang.Object[] { 0L, cSVFormat35, cSVFormat39 };
        java.lang.String str41 = cSVFormat32.format(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker(' ');
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0L, cSVFormat48, cSVFormat52 };
        java.lang.String str54 = cSVFormat45.format(objArray53);
        java.lang.String str55 = cSVFormat32.format(objArray53);
        org.apache.commons.csv.QuoteMode quoteMode56 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat32.withQuoteMode(quoteMode56);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat27.withQuoteMode(quoteMode56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat12.withQuoteMode(quoteMode56);
        java.lang.Appendable appendable60 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print((java.lang.Object) cSVFormat59, appendable60, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'a' + "'", char28 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str41, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str54, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str55, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode56 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode56.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        char char11 = cSVFormat9.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        java.lang.Character char20 = cSVFormat6.getCommentMarker();
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
        org.junit.Assert.assertNull(char20);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
        boolean boolean17 = cSVFormat16.getIgnoreHeaderCase();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        java.lang.Class<?> wildcardClass32 = cSVFormat28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withFirstRecordAsHeader();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat6.equals((java.lang.Object) cSVFormat9);
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat5.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat5.withHeader(resultSet37);
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
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        char char6 = cSVFormat1.getDelimiter();
        boolean boolean7 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        boolean boolean4 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withDelimiter('#');
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean11 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withSkipHeaderRecord();
        boolean boolean30 = cSVFormat29.getTrailingDelimiter();
        java.lang.Character char31 = cSVFormat29.getQuoteCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(char31);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        boolean boolean25 = cSVFormat24.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withTrailingDelimiter();
        java.lang.Appendable appendable27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char44 = cSVFormat43.getCommentMarker();
        boolean boolean45 = cSVFormat43.isNullStringSet();
        java.lang.String str46 = cSVFormat43.getNullString();
        boolean boolean47 = cSVFormat43.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray49 = cSVFormat48.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('\f');
        java.lang.String[] strArray55 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat43.withHeader(strArray55);
        java.lang.String str58 = cSVFormat41.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat29.withHeader(strArray55);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat24.printRecord(appendable27, (java.lang.Object[]) strArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNull(char44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205" + "'", str58, "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        java.lang.Character char11 = cSVFormat3.getEscapeCharacter();
        boolean boolean12 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('\f');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        java.lang.String[] strArray11 = cSVFormat9.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('|');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(false);
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        java.lang.Character char8 = cSVFormat6.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuote((java.lang.Character) '\036');
        boolean boolean41 = cSVFormat40.getIgnoreSurroundingSpaces();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat7.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat7.withCommentMarker((java.lang.Character) '\037');
        boolean boolean30 = cSVFormat7.getTrim();
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser32 = cSVFormat7.parse(reader31);
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
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        java.nio.file.Path path28 = null;
        java.nio.charset.Charset charset29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat8.print(path28, charset29);
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreEmptyLines(false);
        boolean boolean13 = cSVFormat3.getIgnoreHeaderCase();
        boolean boolean14 = cSVFormat3.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withFirstRecordAsHeader();
        boolean boolean16 = cSVFormat15.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape(' ');
        boolean boolean13 = cSVFormat7.equals((java.lang.Object) '4');
        boolean boolean14 = cSVFormat7.getTrim();
        boolean boolean15 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        java.lang.String[] strArray8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String[] strArray7 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withQuoteMode(quoteMode8);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + quoteMode8 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode8.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat7.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat7.withCommentMarker((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat7.withTrailingDelimiter(false);
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
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        boolean boolean9 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withNullString("Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames();
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat1.print(file4, charset5);
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
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(true);
        boolean boolean12 = cSVFormat11.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withHeader(strArray7);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        java.lang.String[] strArray14 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker(' ');
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0L, cSVFormat21, cSVFormat25 };
        java.lang.String str27 = cSVFormat18.format(objArray26);
        java.lang.String str28 = cSVFormat11.format(objArray26);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str27, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse" + "'", str28, "0aDelimiter=< a>  SkipHe aderRecord:f alseaDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alse");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('|');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator('\037');
        boolean boolean12 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withDelimiter('\036');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.String str7 = cSVFormat1.getNullString();
        java.lang.String[] strArray8 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        java.lang.String[] strArray13 = cSVFormat12.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        java.lang.Character char36 = cSVFormat35.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withAllowMissingColumnNames();
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
        org.junit.Assert.assertNull(char36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withCommentMarker('\b');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("\u2028");
        java.lang.String str12 = cSVFormat9.getNullString();
        java.lang.String[] strArray13 = cSVFormat9.getHeader();
        java.lang.String str14 = cSVFormat9.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentMarker((java.lang.Character) '\"');
        java.lang.String[] strArray10 = cSVFormat1.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withFirstRecordAsHeader();
        boolean boolean9 = cSVFormat8.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String str5 = cSVFormat4.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        boolean boolean8 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char11 = cSVFormat10.getCommentMarker();
        boolean boolean12 = cSVFormat10.isNullStringSet();
        java.lang.String str13 = cSVFormat10.getNullString();
        boolean boolean14 = cSVFormat10.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray16 = cSVFormat15.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withQuote('\f');
        java.lang.String[] strArray22 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat10.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat6.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat1.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withEscape((java.lang.Character) '4');
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
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(resultSetMetaData27);
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat8.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quoteMode11);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        java.lang.Character char11 = cSVFormat10.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        boolean boolean20 = cSVFormat14.getIgnoreEmptyLines();
        boolean boolean21 = cSVFormat14.getTrailingDelimiter();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.getIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Appendable appendable7 = null;
        cSVFormat2.println(appendable7);
        java.lang.String str9 = cSVFormat2.getRecordSeparator();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withFirstRecordAsHeader();
        java.lang.String str5 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\f');
        boolean boolean8 = cSVFormat3.getIgnoreHeaderCase();
        boolean boolean9 = cSVFormat1.equals((java.lang.Object) cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '\037');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        char char9 = cSVFormat1.getDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean5 = cSVFormat1.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char22 = cSVFormat21.getCommentMarker();
        boolean boolean23 = cSVFormat21.isNullStringSet();
        java.lang.String str24 = cSVFormat21.getNullString();
        boolean boolean25 = cSVFormat21.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray27 = cSVFormat26.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote('\f');
        java.lang.String[] strArray33 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat21.withHeader(strArray33);
        java.lang.String str36 = cSVFormat19.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat7.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean41 = cSVFormat40.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode44 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteMode(quoteMode44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withQuoteMode(quoteMode44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat1.withQuoteMode(quoteMode44);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205" + "'", str36, "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + quoteMode44 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode44.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentMarker((java.lang.Character) '\b');
        char char9 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        java.lang.String[] strArray17 = cSVFormat14.getHeaderComments();
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
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        char char4 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withSkipHeaderRecord(true);
        char char8 = cSVFormat7.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('\036');
        boolean boolean9 = cSVFormat6.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = quoteMode5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        java.lang.Character char10 = cSVFormat7.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withNullString("\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        java.lang.String str7 = cSVFormat1.toString();
        boolean boolean8 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withSkipHeaderRecord(true);
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat7.withQuote('\b');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuote('|');
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.String str9 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrim();
        boolean boolean11 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean12 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        boolean boolean6 = cSVFormat3.getTrailingDelimiter();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSet7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        java.lang.Character char6 = cSVFormat5.getQuoteCharacter();
        boolean boolean7 = cSVFormat5.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withHeader(strArray43);
        java.lang.String str45 = cSVFormat41.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat36.withHeader(strArray43);
        java.lang.String str47 = cSVFormat26.format((java.lang.Object[]) strArray43);
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
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        boolean boolean16 = cSVFormat15.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withDelimiter(',');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat4 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str5 = cSVFormat4.toString();
        boolean boolean6 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char5 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        boolean boolean7 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean6 = cSVFormat5.getTrailingDelimiter();
        boolean boolean7 = cSVFormat5.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("Delimiter=<a> QuoteChar=<\t> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.Appendable appendable5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrailingDelimiter(true);
        char char17 = cSVFormat16.getDelimiter();
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
        org.apache.commons.csv.QuoteMode quoteMode45 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat21.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat16.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean49 = cSVFormat48.isQuoteCharacterSet();
        boolean boolean50 = cSVFormat48.isCommentMarkerSet();
        boolean boolean51 = cSVFormat48.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withEscape((java.lang.Character) '\b');
        boolean boolean54 = cSVFormat48.getSkipHeaderRecord();
        boolean boolean55 = cSVFormat48.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat48.withHeader(resultSet56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char60 = cSVFormat59.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withFirstRecordAsHeader();
        char char62 = cSVFormat61.getDelimiter();
        java.lang.Character char63 = cSVFormat61.getQuoteCharacter();
        java.lang.String[] strArray64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withHeader(strArray64);
        java.lang.Appendable appendable66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withHeader(strArray68);
        cSVFormat65.printRecord(appendable66, (java.lang.Object[]) strArray68);
        java.lang.String str71 = cSVFormat48.format((java.lang.Object[]) strArray68);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat47.withHeader(strArray68);
        cSVFormat4.printRecord(appendable5, (java.lang.Object[]) strArray68);
        java.sql.ResultSet resultSet74 = null;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat4.withHeader(resultSet74);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + 'a' + "'", char17 == 'a');
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
        org.junit.Assert.assertTrue("'" + quoteMode45 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode45.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(char60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + 'a' + "'", char62 == 'a');
        org.junit.Assert.assertNull(char63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat75);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        java.lang.String str8 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withSkipHeaderRecord();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        boolean boolean13 = cSVFormat11.isCommentMarkerSet();
        char char14 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat11.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withFirstRecordAsHeader();
        boolean boolean22 = cSVFormat20.getTrim();
        java.lang.Appendable appendable23 = null;
        cSVFormat20.println(appendable23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withCommentMarker(' ');
        java.lang.Object[] objArray39 = new java.lang.Object[] { 0L, cSVFormat34, cSVFormat38 };
        java.lang.String str40 = cSVFormat31.format(objArray39);
        java.lang.String str41 = cSVFormat27.format(objArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withHeader(strArray43);
        java.lang.String str45 = cSVFormat27.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat11.withHeader(strArray43);
        java.lang.String str47 = cSVFormat7.format((java.lang.Object[]) strArray43);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\t' + "'", char14 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(quoteMode16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str40, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str41, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("\u2029> SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        boolean boolean9 = cSVFormat1.equals((java.lang.Object) cSVFormat7);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat1.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("\u2029> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("\205");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> NullString=<hi!> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        java.lang.Appendable appendable6 = null;
        cSVFormat5.println(appendable6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('4');
        java.lang.Character char12 = cSVFormat9.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Character char7 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean5 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat7.withEscape('\"');
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
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        boolean boolean8 = cSVFormat0.isNullStringSet();
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
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat2.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(resultSetMetaData4);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        boolean boolean8 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char6 = cSVFormat5.getCommentMarker();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char16 = cSVFormat15.getCommentMarker();
        boolean boolean17 = cSVFormat15.isNullStringSet();
        java.lang.String str18 = cSVFormat15.getNullString();
        boolean boolean19 = cSVFormat15.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray21 = cSVFormat20.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('\f');
        java.lang.String[] strArray27 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat15.withHeader(strArray27);
        java.lang.String str30 = cSVFormat13.format((java.lang.Object[]) strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat1.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker(' ');
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0L, cSVFormat38, cSVFormat42 };
        java.lang.String str44 = cSVFormat35.format(objArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentMarker(' ');
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0L, cSVFormat51, cSVFormat55 };
        java.lang.String str57 = cSVFormat48.format(objArray56);
        java.lang.String str58 = cSVFormat35.format(objArray56);
        org.apache.commons.csv.QuoteMode quoteMode59 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat35.withQuoteMode(quoteMode59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat1.withQuoteMode(quoteMode59);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205" + "'", str30, "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str44, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str57, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str58, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode59 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode59.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat.Predefined predefined8 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) predefined8, appendable9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + predefined8 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined8.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat1.withIgnoreEmptyLines(false);
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
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('\t');
        java.lang.Object[] objArray9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter(false);
        java.nio.file.Path path13 = null;
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat10.print(path13, charset14);
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
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
        java.nio.file.Path path20 = null;
        java.nio.charset.Charset charset21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter22 = cSVFormat19.print(path20, charset21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String str5 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean7 = cSVFormat6.isNullStringSet();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(resultSet8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('|');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        boolean boolean6 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        boolean boolean13 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        char char13 = cSVFormat9.getDelimiter();
        java.lang.String[] strArray14 = cSVFormat9.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withRecordSeparator("\205");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNull(quoteMode5);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentMarker('\036');
        boolean boolean7 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('|');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char23 = cSVFormat22.getCommentMarker();
        boolean boolean24 = cSVFormat22.isNullStringSet();
        java.lang.String str25 = cSVFormat22.getNullString();
        boolean boolean26 = cSVFormat22.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray28 = cSVFormat27.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withQuote('\f');
        java.lang.String[] strArray34 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat22.withHeader(strArray34);
        java.lang.String str37 = cSVFormat20.format((java.lang.Object[]) strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat8.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat8.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean42 = cSVFormat41.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode45 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat8.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat0.withQuoteMode(quoteMode45);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205" + "'", str37, "\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + quoteMode45 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode45.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        java.lang.Character char10 = cSVFormat1.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withFirstRecordAsHeader();
        boolean boolean25 = cSVFormat23.getTrim();
        java.lang.Appendable appendable26 = null;
        cSVFormat23.println(appendable26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat23.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker(' ');
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0L, cSVFormat37, cSVFormat41 };
        java.lang.String str43 = cSVFormat34.format(objArray42);
        java.lang.String str44 = cSVFormat30.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withHeader(strArray46);
        java.lang.String str48 = cSVFormat30.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat21.withHeaderComments((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withFirstRecordAsHeader();
        java.lang.Character char53 = cSVFormat52.getCommentMarker();
        boolean boolean54 = cSVFormat52.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withFirstRecordAsHeader();
        boolean boolean60 = cSVFormat58.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withCommentMarker(' ');
        java.lang.Object[] objArray72 = new java.lang.Object[] { 0L, cSVFormat67, cSVFormat71 };
        java.lang.String str73 = cSVFormat64.format(objArray72);
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat80 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat82 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withCommentMarker(' ');
        java.lang.Object[] objArray85 = new java.lang.Object[] { 0L, cSVFormat80, cSVFormat84 };
        java.lang.String str86 = cSVFormat77.format(objArray85);
        java.lang.String str87 = cSVFormat64.format(objArray85);
        org.apache.commons.csv.QuoteMode quoteMode88 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat64.withQuoteMode(quoteMode88);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat58.withQuoteMode(quoteMode88);
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat52.withQuoteMode(quoteMode88);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat49.withQuoteMode(quoteMode88);
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
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
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
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNull(char53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str73, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str86, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str87, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode88 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode88.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(cSVFormat91);
        org.junit.Assert.assertNotNull(cSVFormat92);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.getIgnoreHeaderCase();
        boolean boolean4 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
        boolean boolean13 = cSVFormat7.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withAllowMissingColumnNames();
        boolean boolean15 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
        boolean boolean8 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withFirstRecordAsHeader();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat6.equals((java.lang.Object) cSVFormat9);
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withTrim(false);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '\f');
        boolean boolean6 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withAllowMissingColumnNames(true);
        char char9 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        boolean boolean8 = cSVFormat3.getSkipHeaderRecord();
        char char9 = cSVFormat3.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        boolean boolean27 = cSVFormat23.isEscapeCharacterSet();
        java.lang.Appendable appendable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter29 = cSVFormat23.print(appendable28);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
        boolean boolean25 = cSVFormat24.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape((java.lang.Character) '\"');
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
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\037');
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat9.print(appendable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean7 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withCommentMarker((java.lang.Character) ',');
        java.lang.Character char12 = cSVFormat1.getQuoteCharacter();
        java.lang.Appendable appendable13 = null;
        cSVFormat1.println(appendable13);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        boolean boolean3 = cSVFormat1.isNullStringSet();
        java.lang.String str4 = cSVFormat1.getNullString();
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        char char6 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentMarker('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('\037');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        java.lang.Appendable appendable9 = null;
        cSVFormat7.println(appendable9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        java.lang.String str6 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean8 = cSVFormat7.isQuoteCharacterSet();
        boolean boolean9 = cSVFormat7.isCommentMarkerSet();
        boolean boolean10 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape((java.lang.Character) '\b');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0L, cSVFormat20, cSVFormat24 };
        java.lang.String str26 = cSVFormat17.format(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat17.format(objArray38);
        boolean boolean41 = cSVFormat12.equals((java.lang.Object) objArray38);
        java.lang.String str42 = cSVFormat0.format(objArray38);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str26, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0\tDelimiter=<a> SkipHeaderRecord:false\tDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str42, "0\tDelimiter=<a> SkipHeaderRecord:false\tDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withIgnoreEmptyLines();
        boolean boolean17 = cSVFormat16.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        boolean boolean11 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(resultSetMetaData5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat1.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker(' ');
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print((java.lang.Object) boolean10, appendable11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        java.lang.Character char11 = cSVFormat10.getCommentMarker();
        boolean boolean12 = cSVFormat10.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        java.lang.Character char11 = cSVFormat10.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreSurroundingSpaces();
        boolean boolean28 = cSVFormat27.getTrim();
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.Appendable appendable2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray4 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuote('\f');
        java.lang.String[] strArray10 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.printRecord(appendable2, (java.lang.Object[]) strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreHeaderCase();
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
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('\f');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator(',');
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.print((java.lang.Object) cSVFormat16, appendable19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
        boolean boolean20 = cSVFormat14.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withAllowMissingColumnNames(false);
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
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
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
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuote('\f');
        java.lang.String[] strArray17 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        java.lang.String str19 = cSVFormat9.format((java.lang.Object[]) strArray17);
        boolean boolean20 = cSVFormat9.getTrailingDelimiter();
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
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\u2029\"\t0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false\t\205" + "'", str19, "\"\u2029\"\t0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false\t\205");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        boolean boolean6 = cSVFormat1.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat8, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        java.lang.Character char12 = cSVFormat8.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean14 = cSVFormat13.isQuoteCharacterSet();
        boolean boolean15 = cSVFormat13.isCommentMarkerSet();
        boolean boolean16 = cSVFormat13.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape((java.lang.Character) '\b');
        boolean boolean19 = cSVFormat18.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker(' ');
        java.lang.Object[] objArray44 = new java.lang.Object[] { 0L, cSVFormat39, cSVFormat43 };
        java.lang.String str45 = cSVFormat36.format(objArray44);
        java.lang.String str46 = cSVFormat23.format(objArray44);
        boolean boolean47 = cSVFormat18.equals((java.lang.Object) objArray44);
        java.lang.String str48 = cSVFormat8.format(objArray44);
        java.lang.String str49 = cSVFormat1.format(objArray44);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str32, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, Delimiter=<a> SkipHeaderRecord:false, Delimiter=<a> CommentStart=< > SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str45, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str46, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str48, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str49, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
    }
}

