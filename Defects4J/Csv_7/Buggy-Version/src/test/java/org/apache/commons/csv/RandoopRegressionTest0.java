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
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.lang.Class<?> wildcardClass8 = cSVRecordList7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        java.lang.String str5 = cSVFormat1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.Quote quote8 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote8, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray17, false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withQuotePolicy(quote8);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(true);
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = cSVFormat22.parse(reader25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quote8 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote8.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        boolean boolean22 = cSVFormat21.isNullHandling();
        org.apache.commons.csv.Quote quote25 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray34 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote25, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray34, false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat21.withQuotePolicy(quote25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser38 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + quote25 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote25.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.File file0 = null;
        org.apache.commons.csv.Quote quote3 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray12 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote3, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray12, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote3 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote3.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray11 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote2, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray11, false);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote2.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        boolean boolean8 = cSVFormat2.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = cSVFormat0.parse(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean7 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat1.isNullHandling();
        boolean boolean9 = cSVFormat1.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser6.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        boolean boolean6 = cSVFormat5.isQuoting();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("", cSVFormat2);
        java.lang.String[] strArray10 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withEscape('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList21 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordList21);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        boolean boolean6 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        cSVFormat6.validate();
        boolean boolean8 = cSVFormat6.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat6);
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray21 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote12, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray21, false);
        java.lang.String str24 = cSVFormat6.format((java.lang.Object[]) strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withHeader(strArray21);
        java.lang.Character char26 = cSVFormat0.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote12.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\205\",\205" + "'", str24, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(char26);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("", cSVFormat2);
        java.lang.String[] strArray10 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [??, hi!, , ]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser6.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVRecordList11.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        boolean boolean7 = cSVParser4.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        boolean boolean13 = cSVFormat12.isCommentingEnabled();
        java.lang.String str14 = cSVFormat12.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\r\n" + "'", str14, "\r\n");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar('\f');
        boolean boolean6 = cSVFormat5.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat5.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.Character char5 = cSVFormat1.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser5.getRecords(cSVRecordList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        boolean boolean3 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote6 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuotePolicy(quote6);
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote10, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray19, false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat2.withQuotePolicy(quote10);
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean24 = cSVFormat22.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withSkipHeaderRecord(false);
        boolean boolean27 = cSVFormat26.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quote6 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote6.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String[] strArray11 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withEscape('\036');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        boolean boolean9 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat1.withCommentStart((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray11 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote2, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray11, false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\037');
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat13.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote2.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withDelimiter('\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser6.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withCommentStart('\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("\"\205\",\205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar('#');
        boolean boolean10 = cSVFormat9.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        java.lang.String str27 = cSVRecord23.get((int) (short) 1);
        int int28 = cSVRecord23.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\205" + "'", str27, "\205");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote11, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray20, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23, "\r\n", (long) 10);
        org.apache.commons.csv.CSVFormat cSVFormat28 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '\r', quote2, (java.lang.Character) ',', (java.lang.Character) '\"', true, true, "hi!", "\u2029", strArray20, false);
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        char char30 = cSVFormat28.getDelimiter();
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser32 = cSVFormat28.parse(reader31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote2.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote11.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + ' ' + "'", char30 == ' ');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("", cSVFormat2);
        java.lang.String[] strArray10 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        cSVParser4.close();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char13 = cSVFormat12.getCommentStart();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("", cSVFormat12);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser15.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator17 = cSVRecordList16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection18 = cSVParser4.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser5.spliterator();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVRecordSpliterator6, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser6.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser6.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNull(cSVRecord10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        java.lang.Object obj4 = null;
        boolean boolean5 = cSVFormat2.equals(obj4);
        org.apache.commons.csv.Quote quote6 = cSVFormat2.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(quote6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        boolean boolean8 = cSVParser4.isClosed();
        boolean boolean9 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.Character char9 = cSVFormat8.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.lang.Character char20 = cSVFormat1.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNull(char20);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        java.lang.String str24 = cSVRecord23.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap25 = cSVRecord23.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        cSVParser4.close();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char13 = cSVFormat12.getCommentStart();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("", cSVFormat12);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser15.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator17 = cSVRecordList16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList18 = cSVParser4.getRecords(cSVRecordList16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.Lexer lexer10 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = lexer10.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator('\r');
        boolean boolean6 = cSVFormat0.isQuoting();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\"\205\",\205#", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser11.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser11.nextRecord();
        boolean boolean14 = cSVFormat4.equals((java.lang.Object) cSVRecord13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNull(cSVRecord13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        org.apache.commons.csv.CSVRecord cSVRecord21 = cSVParser4.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser4.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNull(cSVRecord21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNull(strMap23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        java.lang.String str4 = cSVFormat1.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat9);
        org.apache.commons.csv.Quote quote15 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray24 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote15, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray24, false);
        java.lang.String str27 = cSVFormat9.format((java.lang.Object[]) strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray24, strMap28, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat6.withHeader(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + quote15 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote15.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\205\",\205" + "'", str27, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.Lexer lexer11 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) '\b');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord23.get("INVALID []");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        int int9 = cSVRecord8.size();
        java.lang.Class<?> wildcardClass10 = cSVRecord8.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap11, "INVALID []", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray9, strMap15, "\u2028", (long) (byte) 1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.Lexer lexer11 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader10);
        org.apache.commons.csv.Token token12 = new org.apache.commons.csv.Token();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token13 = lexer11.nextToken(token12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char30 = cSVFormat29.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote33 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withQuotePolicy(quote33);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray46 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote37, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray46, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat29.withQuotePolicy(quote37);
        boolean boolean50 = cSVFormat49.isNullHandling();
        org.apache.commons.csv.Quote quote53 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray62 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote53, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray62, false);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withQuotePolicy(quote53);
        java.lang.String[] strArray78 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote53, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray78, true);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + quote33 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote33.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + quote53 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote53.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat83);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str2 = cSVFormat1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str2, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        boolean boolean11 = cSVFormat1.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        long long3 = cSVParser2.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        boolean boolean13 = cSVFormat12.isCommentingEnabled();
        boolean boolean14 = cSVFormat12.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        boolean boolean23 = lexer21.isCommentStart((int) '\t');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = lexer21.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) (byte) 1);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[\205, \205]", (long) ',');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord28.get("TOKEN []");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        boolean boolean5 = cSVParser4.isClosed();
        long long6 = cSVParser4.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        boolean boolean4 = cSVFormat3.isQuoting();
        java.lang.String str5 = cSVFormat3.getRecordSeparator();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat3.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('#');
        boolean boolean13 = cSVFormat1.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        boolean boolean9 = cSVParser7.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser7.iterator();
        cSVParser7.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        cSVParser2.close();
        long long4 = cSVParser2.getCurrentLineNumber();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser9.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVRecordList10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser2.getRecords(cSVRecordList10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray11 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote2, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray11, false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\037');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char17 = cSVFormat16.getCommentStart();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat26);
        org.apache.commons.csv.Quote quote32 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray41 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote32, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray41, false);
        java.lang.String str44 = cSVFormat26.format((java.lang.Object[]) strArray41);
        java.util.Map<java.lang.String, java.lang.Integer> strMap45 = null;
        org.apache.commons.csv.CSVRecord cSVRecord48 = new org.apache.commons.csv.CSVRecord(strArray41, strMap45, "\u2028", (long) (byte) 1);
        java.lang.String str49 = cSVFormat20.format((java.lang.Object[]) strArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = cSVFormat15.format((java.lang.Object[]) strArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The quoteChar character and the delimiter cannot be the same ('#')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote2.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertTrue("'" + quote32 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote32.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\205\",\205" + "'", str44, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\205\",\205#" + "'", str49, "\"\205\",\205#");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        long long5 = cSVParser4.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        java.lang.Class<?> wildcardClass13 = cSVFormat12.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean7 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat1.isNullHandling();
        java.lang.String str9 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        boolean boolean8 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.isNullHandling();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat6);
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray21 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote12, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray21, false);
        java.lang.String str24 = cSVFormat6.format((java.lang.Object[]) strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withHeader(strArray21);
        boolean boolean26 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote12.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\205\",\205" + "'", str24, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat10);
        org.apache.commons.csv.Quote quote16 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray25 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote16, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray25, false);
        java.lang.String str28 = cSVFormat10.format((java.lang.Object[]) strArray25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray25, strMap29, "\u2028", (long) (byte) 1);
        java.lang.String str33 = cSVFormat4.format((java.lang.Object[]) strArray25);
        java.lang.String[] strArray34 = cSVFormat4.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + quote16 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote16.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\205\",\205" + "'", str28, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\205\",\205#" + "'", str33, "\"\205\",\205#");
        org.junit.Assert.assertNull(strArray34);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.Quote quote3 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray12 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote3, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray12, false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withQuotePolicy(quote3);
        org.apache.commons.csv.Quote quote16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuotePolicy(quote16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreSurroundingSpaces(true);
        java.lang.String str20 = cSVFormat15.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char22 = cSVFormat21.getCommentStart();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser34 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat31);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray46 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote37, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray46, false);
        java.lang.String str49 = cSVFormat31.format((java.lang.Object[]) strArray46);
        java.util.Map<java.lang.String, java.lang.Integer> strMap50 = null;
        org.apache.commons.csv.CSVRecord cSVRecord53 = new org.apache.commons.csv.CSVRecord(strArray46, strMap50, "\u2028", (long) (byte) 1);
        java.lang.String str54 = cSVFormat25.format((java.lang.Object[]) strArray46);
        java.lang.String str55 = cSVFormat15.format((java.lang.Object[]) strArray46);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + quote3 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote3.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVParser34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\205\",\205" + "'", str49, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\205\",\205#" + "'", str54, "\"\205\",\205#");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\205\",\"\205\"" + "'", str55, "\"\205\",\"\205\"");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withRecordSeparator('\036');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote8 = cSVFormat7.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat10);
        boolean boolean12 = cSVFormat7.equals((java.lang.Object) "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.Lexer lexer11 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withQuoteChar('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator21 = cSVParser4.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList22 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator21);
        org.junit.Assert.assertNotNull(cSVRecordList22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(false);
        java.lang.String str9 = cSVFormat6.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat1.isNullHandling();
        java.lang.String str10 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat2);
        org.apache.commons.csv.Quote quote8 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote8, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray17, false);
        java.lang.String str20 = cSVFormat2.format((java.lang.Object[]) strArray17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = null;
        org.apache.commons.csv.Lexer lexer22 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char31 = cSVFormat30.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote34 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withQuotePolicy(quote34);
        org.apache.commons.csv.Quote quote38 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray47 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote38, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray47, false);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat30.withQuotePolicy(quote38);
        boolean boolean51 = cSVFormat50.isNullHandling();
        org.apache.commons.csv.Quote quote54 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray63 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote54, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray63, false);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat50.withQuotePolicy(quote54);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat29.withQuotePolicy(quote54);
        java.lang.String[] strArray79 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat81 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote54, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray79, true);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat2.withQuotePolicy(quote54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser83 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertTrue("'" + quote8 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote8.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\205\",\205" + "'", str20, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(char31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + quote34 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote34.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + quote38 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote38.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + quote54 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote54.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(cSVFormat82);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = lexer21.getCurrentLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        org.apache.commons.csv.Token token9 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type10 = token9.type;
        org.apache.commons.csv.Token.Type type11 = org.apache.commons.csv.Token.Type.TOKEN;
        token9.type = type11;
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type14 = token13.type;
        org.apache.commons.csv.Token.Type type15 = org.apache.commons.csv.Token.Type.TOKEN;
        token13.type = type15;
        org.apache.commons.csv.Token.Type type17 = token13.type;
        token9.type = type17;
        java.lang.String str19 = token9.toString();
        token9.isReady = false;
        org.apache.commons.csv.Token token22 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type23 = token22.type;
        org.apache.commons.csv.Token.Type type24 = org.apache.commons.csv.Token.Type.TOKEN;
        token22.type = type24;
        org.apache.commons.csv.Token.Type type26 = token22.type;
        org.apache.commons.csv.Token.Type type27 = token22.type;
        token9.type = type27;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord8.get((java.lang.Enum<org.apache.commons.csv.Token.Type>) type27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type10.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type11.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type15.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type17.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "TOKEN []" + "'", str19, "TOKEN []");
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type23.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type24.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type26.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type27.equals(org.apache.commons.csv.Token.Type.TOKEN));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        long long9 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char9 = cSVFormat8.getCommentStart();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat8);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser13.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        boolean boolean18 = cSVFormat5.equals((java.lang.Object) cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertNull(cSVRecord15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = null;
        org.apache.commons.csv.Lexer lexer9 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader8);
        org.apache.commons.csv.Token token10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token11 = lexer9.nextToken(token10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String[] strArray11 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withQuoteChar('a');
        boolean boolean15 = cSVFormat3.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        boolean boolean23 = lexer21.isEscape((int) '\037');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        boolean boolean23 = lexer21.isEndOfFile((-1));
        boolean boolean25 = lexer21.isDelimiter(10);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = lexer6.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 100);
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean26 = cSVRecord23.isMapped("\"\205\",\205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord23.get((int) '\036');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char23 = cSVFormat22.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withCommentStart((java.lang.Character) '\f');
        boolean boolean26 = cSVFormat22.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withEscape('a');
        boolean boolean29 = cSVFormat1.equals((java.lang.Object) cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote4, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray13, false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char23 = cSVFormat22.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withCommentStart((java.lang.Character) '\f');
        java.lang.String str26 = cSVFormat22.toString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser33 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat30);
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray45 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote36, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray45, false);
        java.lang.String str48 = cSVFormat30.format((java.lang.Object[]) strArray45);
        java.util.Map<java.lang.String, java.lang.Integer> strMap49 = null;
        org.apache.commons.csv.CSVRecord cSVRecord52 = new org.apache.commons.csv.CSVRecord(strArray45, strMap49, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat28.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat55 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\t', quote4, (java.lang.Character) 'a', (java.lang.Character) ',', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", strArray45, false);
        java.lang.String str56 = cSVFormat55.getNullString();
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str26, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVParser33);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote36.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\205\",\205" + "'", str48, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "INVALID []" + "'", str56, "INVALID []");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        cSVParser7.close();
        java.lang.Class<?> wildcardClass12 = cSVParser7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char30 = cSVFormat29.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote33 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withQuotePolicy(quote33);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray46 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote37, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray46, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat29.withQuotePolicy(quote37);
        boolean boolean50 = cSVFormat49.isNullHandling();
        org.apache.commons.csv.Quote quote53 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray62 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote53, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray62, false);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withQuotePolicy(quote53);
        java.lang.String[] strArray78 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote53, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray78, true);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withQuotePolicy(quote53);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat81, "TOKEN []");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + quote33 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote33.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + quote53 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote53.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(cSVFormat81);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        boolean boolean7 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord23.iterator();
        java.lang.String str27 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        boolean boolean10 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getCurrentLineNumber();
        boolean boolean8 = cSVParser4.isClosed();
        cSVParser4.close();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char20 = cSVFormat19.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote23 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withQuotePolicy(quote23);
        org.apache.commons.csv.Quote quote27 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray36 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote27, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray36, false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat19.withQuotePolicy(quote27);
        boolean boolean40 = cSVFormat39.isNullHandling();
        org.apache.commons.csv.Quote quote43 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray52 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote43, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray52, false);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat39.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat18.withQuotePolicy(quote43);
        java.lang.String[] strArray68 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote43, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray68, true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat2.withQuotePolicy(quote43);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + quote23 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote23.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + quote27 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote27.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + quote43 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote43.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(cSVFormat71);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        cSVParser6.close();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser15.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator17 = cSVRecordList16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection18 = cSVParser6.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat8);
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray23 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote14, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray23, false);
        java.lang.String str26 = cSVFormat8.format((java.lang.Object[]) strArray23);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray23, strMap27, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat6.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat6.withNullString("\u2029");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote14.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\205\",\205" + "'", str26, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote4, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray13, false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withQuotePolicy(quote4);
        org.apache.commons.csv.Quote quote17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreSurroundingSpaces(true);
        boolean boolean21 = cSVFormat16.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.Quote quote3 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) quote3, "");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char15 = cSVFormat14.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuotePolicy(quote18);
        org.apache.commons.csv.Quote quote22 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray31 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote22, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray31, false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat14.withQuotePolicy(quote22);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote37 = cSVFormat34.getQuotePolicy();
        org.apache.commons.csv.Quote quote46 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray55 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote46, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray55, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap58 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray55, strMap58, "\r\n", (long) 10);
        boolean boolean62 = cSVRecord61.isConsistent();
        int int63 = cSVRecord61.size();
        java.util.Iterator<java.lang.String> strItor64 = cSVRecord61.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator65 = cSVRecord61.spliterator();
        int int66 = cSVRecord61.size();
        java.lang.String[] strArray67 = cSVRecord61.values();
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '\"', quote37, (java.lang.Character) '\f', (java.lang.Character) ',', false, true, "", "Delimiter=<\037> SkipHeaderRecord:false", strArray67, false);
        org.apache.commons.csv.CSVFormat cSVFormat71 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote3, (java.lang.Character) '\r', (java.lang.Character) ',', false, false, "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray67, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser72 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ?]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote3 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote3.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote18.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + quote22 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote22.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertTrue("'" + quote46 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote46.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(strSpliterator65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord8.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser6.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        long long11 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        java.lang.Class<?> wildcardClass22 = cSVFormat21.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar('\t');
        boolean boolean7 = cSVFormat1.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        org.apache.commons.csv.CSVRecord cSVRecord21 = cSVParser4.nextRecord();
        boolean boolean22 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNull(cSVRecord21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        boolean boolean5 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        boolean boolean9 = cSVParser8.isClosed();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char12 = cSVFormat11.getCommentStart();
        boolean boolean13 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        boolean boolean16 = cSVParser14.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cSVParser14.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList18 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char21 = cSVFormat20.getCommentStart();
        boolean boolean22 = cSVFormat20.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser23 = org.apache.commons.csv.CSVParser.parse("", cSVFormat20);
        org.apache.commons.csv.CSVRecord cSVRecord24 = cSVParser23.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char27 = cSVFormat26.getCommentStart();
        boolean boolean28 = cSVFormat26.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser31 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat26);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList32 = cSVParser31.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList33 = cSVParser23.getRecords(cSVRecordList32);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList34 = cSVParser14.getRecords(cSVRecordList33);
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection35 = cSVParser8.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList34);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNotNull(cSVRecordList18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVParser23);
        org.junit.Assert.assertNull(cSVRecord24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVParser31);
        org.junit.Assert.assertNotNull(cSVRecordList32);
        org.junit.Assert.assertNotNull(cSVRecordList33);
        org.junit.Assert.assertNotNull(cSVRecordList34);
        org.junit.Assert.assertNotNull(cSVRecordCollection35);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 100);
        boolean boolean25 = cSVRecord23.isMapped("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat14);
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray29 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote20, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray29, false);
        java.lang.String str32 = cSVFormat14.format((java.lang.Object[]) strArray29);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray29, strMap33, "", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat1.withHeader(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVParser17);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote20.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\205\",\205" + "'", str32, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar('\f');
        boolean boolean6 = cSVFormat5.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat8.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) (byte) 1);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.lang.Class<?> wildcardClass25 = cSVRecord23.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser6.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser5.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser5.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser5.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        boolean boolean21 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj3 = null;
        boolean boolean4 = cSVFormat2.equals(obj3);
        java.lang.Character char5 = cSVFormat2.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.Lexer lexer7 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader6);
        boolean boolean8 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withRecordSeparator(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withEscape('\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator('\r');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.Quote quote8 = cSVFormat7.getQuotePolicy();
        java.lang.String str9 = cSVFormat7.getRecordSeparator();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat7.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        java.lang.Class<?> wildcardClass8 = cSVRecordSpliterator7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuoteChar((java.lang.Character) '\036');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String[] strArray11 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        boolean boolean7 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser6.nextRecord();
        boolean boolean13 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat9);
        org.apache.commons.csv.Quote quote15 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray24 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote15, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray24, false);
        java.lang.String str27 = cSVFormat9.format((java.lang.Object[]) strArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = null;
        org.apache.commons.csv.Lexer lexer29 = new org.apache.commons.csv.Lexer(cSVFormat9, extendedBufferedReader28);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char38 = cSVFormat37.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote41 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withQuotePolicy(quote41);
        org.apache.commons.csv.Quote quote45 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray54 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote45, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray54, false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat37.withQuotePolicy(quote45);
        boolean boolean58 = cSVFormat57.isNullHandling();
        org.apache.commons.csv.Quote quote61 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray70 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote61, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray70, false);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat57.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat36.withQuotePolicy(quote61);
        java.lang.String[] strArray86 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat88 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote61, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray86, true);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat9.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat6.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat6.withQuoteChar((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + quote15 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote15.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\205\",\205" + "'", str27, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNull(char38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + quote41 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote41.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + quote45 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote45.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + quote61 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote61.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(cSVFormat92);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean7 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat1.isQuoting();
        char char9 = cSVFormat1.getDelimiter();
        boolean boolean10 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) quote2, "");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char12 = cSVFormat11.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) '\f');
        java.lang.String str15 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat19);
        org.apache.commons.csv.Quote quote25 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray34 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote25, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray34, false);
        java.lang.String str37 = cSVFormat19.format((java.lang.Object[]) strArray34);
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray34, strMap38, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat17.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat44 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '\n', quote2, (java.lang.Character) '\f', (java.lang.Character) '\f', true, true, "\205", "", strArray34, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withCommentStart('\037');
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote2.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str15, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + quote25 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote25.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\205\",\205" + "'", str37, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getCurrentLineNumber();
        boolean boolean8 = cSVParser4.isClosed();
        boolean boolean9 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        boolean boolean11 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 100);
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean26 = cSVRecord23.isMapped("\"\205\",\205");
        boolean boolean28 = cSVRecord23.isSet("Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuotePolicy(quote14);
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray27 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote18, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray27, false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withQuotePolicy(quote18);
        boolean boolean31 = cSVFormat30.isNullHandling();
        org.apache.commons.csv.Quote quote34 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray43 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote34, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray43, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withQuotePolicy(quote34);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat9.withQuotePolicy(quote34);
        java.lang.String[] strArray59 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote34, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray59, true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat1.withHeader(strArray59);
        boolean boolean63 = cSVFormat1.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote14.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote18.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + quote34 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote34.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char8 = cSVFormat7.getCommentStart();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat7);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser12.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser4.getRecords(cSVRecordList13);
        cSVParser4.close();
        long long16 = cSVParser4.getCurrentLineNumber();
        boolean boolean17 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        cSVParser6.close();
        long long9 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        boolean boolean11 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator('\r');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getCurrentLineNumber();
        boolean boolean8 = cSVParser4.isClosed();
        boolean boolean9 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        long long11 = cSVParser4.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj3 = null;
        boolean boolean4 = cSVFormat2.equals(obj3);
        java.lang.Character char5 = cSVFormat2.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.Lexer lexer7 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader6);
        boolean boolean8 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withRecordSeparator('\f');
        boolean boolean16 = cSVFormat12.isNullHandling();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser15.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator17 = cSVRecordList16.spliterator();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection18 = cSVParser4.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList16);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVRecordList16.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator17);
        org.junit.Assert.assertNotNull(cSVRecordCollection18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        long long5 = cSVParser4.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection7 = null;
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection8 = cSVParser4.getRecords(cSVRecordCollection7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(cSVRecordCollection8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        boolean boolean9 = cSVParser7.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser7.spliterator();
        long long12 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        long long26 = cSVRecord23.getRecordNumber();
        java.lang.String str27 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[\205, \205]" + "'", str27, "[\205, \205]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        boolean boolean6 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withRecordSeparator("\"\205\",\205");
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat8.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("", cSVFormat2);
        java.lang.String[] strArray10 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withQuoteChar('a');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat2);
        java.lang.Character char15 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withNullString("\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator21 = cSVRecordList19.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator21);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj2 = null;
        boolean boolean3 = cSVFormat1.equals(obj2);
        java.lang.Character char4 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator('\r');
        boolean boolean7 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("", cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVParser10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuotePolicy(quote14);
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray27 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote18, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray27, false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withQuotePolicy(quote18);
        boolean boolean31 = cSVFormat30.isNullHandling();
        org.apache.commons.csv.Quote quote34 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray43 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote34, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray43, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withQuotePolicy(quote34);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat9.withQuotePolicy(quote34);
        java.lang.String[] strArray59 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote34, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray59, true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat1.withHeader(strArray59);
        java.lang.String str63 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote14.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote18.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + quote34 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote34.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\r\n" + "'", str63, "\r\n");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser11.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        boolean boolean11 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withRecordSeparator('\037');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withQuoteChar((java.lang.Character) '\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray14 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote5, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray14, false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char24 = cSVFormat23.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withCommentStart((java.lang.Character) '\f');
        java.lang.String str27 = cSVFormat23.toString();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser34 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat31);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray46 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote37, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray46, false);
        java.lang.String str49 = cSVFormat31.format((java.lang.Object[]) strArray46);
        java.util.Map<java.lang.String, java.lang.Integer> strMap50 = null;
        org.apache.commons.csv.CSVRecord cSVRecord53 = new org.apache.commons.csv.CSVRecord(strArray46, strMap50, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat29.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\t', quote5, (java.lang.Character) 'a', (java.lang.Character) ',', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", strArray46, false);
        boolean boolean57 = cSVFormat56.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser60 = org.apache.commons.csv.CSVParser.parse("#", cSVFormat56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote5.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str27, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVParser34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\205\",\205" + "'", str49, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote4, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray13, false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withQuotePolicy(quote4);
        org.apache.commons.csv.Quote quote17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.Character char9 = cSVFormat8.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) '\f');
        java.lang.Object obj12 = null;
        boolean boolean13 = cSVFormat11.equals(obj12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.Quote quote9 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote9, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray18, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuotePolicy(quote9);
        boolean boolean22 = cSVFormat21.isNullHandling();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote9 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote9.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('#');
        char char8 = cSVFormat7.getDelimiter();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat7.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap11, "INVALID []", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray9, strMap15, "", (long) 0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser4.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.lang.Character char7 = cSVFormat1.getEscape();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.Lexer lexer11 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader10);
        boolean boolean13 = lexer11.readEndOfLine((int) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char30 = cSVFormat29.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote33 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withQuotePolicy(quote33);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray46 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote37, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray46, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat29.withQuotePolicy(quote37);
        boolean boolean50 = cSVFormat49.isNullHandling();
        org.apache.commons.csv.Quote quote53 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray62 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote53, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray62, false);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withQuotePolicy(quote53);
        java.lang.String[] strArray78 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote53, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray78, true);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withQuotePolicy(quote53);
        java.lang.Character char82 = cSVFormat81.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + quote33 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote33.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + quote53 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote53.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNull(char82);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        boolean boolean8 = cSVParser4.isClosed();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser13.getRecords();
        boolean boolean15 = cSVParser13.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cSVParser13.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection18 = cSVParser4.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList17);
        boolean boolean19 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 100);
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean26 = cSVRecord23.isMapped("\"\205\",\205");
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("[\205, \205]", cSVFormat1);
        long long3 = cSVParser2.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser6.nextRecord();
        cSVParser6.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser6.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(cSVRecord11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.Quote quote8 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote8, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray17, false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withQuotePolicy(quote8);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart((java.lang.Character) 'a');
        java.lang.Character char25 = cSVFormat22.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuoteChar('\b');
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = cSVFormat22.parse(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quote8 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote8.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart((java.lang.Character) 'a');
        char char13 = cSVFormat12.getDelimiter();
        org.apache.commons.csv.Quote quote14 = cSVFormat12.getQuotePolicy();
        java.lang.Character char15 = cSVFormat12.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
        org.junit.Assert.assertNull(quote14);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        java.lang.String str12 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str12, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char9 = cSVFormat8.getCommentStart();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat8);
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser11.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char15 = cSVFormat14.getCommentStart();
        boolean boolean16 = cSVFormat14.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat14);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser19.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList21 = cSVParser11.getRecords(cSVRecordList20);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList22 = cSVParser6.getRecords(cSVRecordList21);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordList21);
        org.junit.Assert.assertNotNull(cSVRecordList22);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        boolean boolean4 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        long long12 = cSVParser11.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser11.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord14 = cSVParser11.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertNotNull(cSVRecord14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char7 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withSkipHeaderRecord(false);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        cSVParser6.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser6.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        boolean boolean5 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withQuoteChar((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape((java.lang.Character) 'a');
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        boolean boolean10 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        long long12 = cSVParser11.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser11.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser11.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser11.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator21 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord22 = cSVParser4.nextRecord();
        long long23 = cSVParser4.getRecordNumber();
        long long24 = cSVParser4.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator21);
        org.junit.Assert.assertNull(cSVRecord22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) (byte) 1);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVRecordList9.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 100);
        java.lang.String str24 = cSVRecord23.toString();
        java.lang.String str25 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[\205, \205]" + "'", str25, "[\205, \205]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.nextRecord();
        long long10 = cSVParser7.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        long long5 = cSVParser4.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        cSVFormat5.validate();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\f> CommentStart=<\f> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar('\"');
        java.lang.String str13 = cSVFormat12.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<\f> CommentStart=<\f> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str13, "Delimiter=<,> QuoteChar=<\f> CommentStart=<\f> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        boolean boolean9 = cSVParser7.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord11.get("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecord11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        boolean boolean11 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean7 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char18 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withIgnoreSurroundingSpaces(true);
        boolean boolean25 = cSVFormat22.getIgnoreEmptyLines();
        org.apache.commons.csv.Quote quote28 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray37 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote28, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray37, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray37, strMap40, "\r\n", (long) 10);
        boolean boolean45 = cSVRecord43.isMapped("");
        java.lang.String[] strArray46 = cSVRecord43.values();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat22.withHeader(strArray46);
        java.util.Map<java.lang.String, java.lang.Integer> strMap48 = null;
        org.apache.commons.csv.CSVRecord cSVRecord51 = new org.apache.commons.csv.CSVRecord(strArray46, strMap48, "\205", (long) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('4', (java.lang.Character) '\b', quote10, (java.lang.Character) '\f', (java.lang.Character) '\"', false, true, "[\205, \205]", "\"\205\",\205", strArray46, true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat1.withHeader(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat54.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ?]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote10.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + quote28 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote28.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat54);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char8 = cSVFormat7.getCommentStart();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat7);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser12.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser4.getRecords(cSVRecordList13);
        java.lang.Class<?> wildcardClass15 = cSVRecordList14.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser6.getRecords();
        boolean boolean12 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.Lexer lexer5 = new org.apache.commons.csv.Lexer(cSVFormat0, extendedBufferedReader4);
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        boolean boolean11 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator('\f');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteChar((java.lang.Character) '\037');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = null;
        org.apache.commons.csv.Lexer lexer25 = new org.apache.commons.csv.Lexer(cSVFormat21, extendedBufferedReader24);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withQuoteChar('\\');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isNullHandling();
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        long long12 = cSVParser11.getCurrentLineNumber();
        long long13 = cSVParser11.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        boolean boolean7 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        long long11 = cSVParser4.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        boolean boolean10 = cSVRecord8.isMapped("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.String str11 = cSVRecord8.getComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote4, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray13, false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char23 = cSVFormat22.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withCommentStart((java.lang.Character) '\f');
        java.lang.String str26 = cSVFormat22.toString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser33 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat30);
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray45 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote36, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray45, false);
        java.lang.String str48 = cSVFormat30.format((java.lang.Object[]) strArray45);
        java.util.Map<java.lang.String, java.lang.Integer> strMap49 = null;
        org.apache.commons.csv.CSVRecord cSVRecord52 = new org.apache.commons.csv.CSVRecord(strArray45, strMap49, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat28.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat55 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\t', quote4, (java.lang.Character) 'a', (java.lang.Character) ',', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", strArray45, false);
        boolean boolean56 = cSVFormat55.isCommentingEnabled();
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str26, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVParser33);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote36.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\205\",\205" + "'", str48, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.nextRecord();
        boolean boolean10 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser6.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser5.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser5.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser5.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(cSVRecord10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser4.nextRecord();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) '\b');
        boolean boolean24 = cSVRecord23.isConsistent();
        boolean boolean26 = cSVRecord23.isSet("\u2028");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        boolean boolean13 = cSVFormat12.isCommentingEnabled();
        java.lang.Class<?> wildcardClass14 = cSVFormat12.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) (-1.0d));
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("Delimiter=<\037> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote10, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray19, false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char29 = cSVFormat28.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentStart((java.lang.Character) '\f');
        java.lang.String str32 = cSVFormat28.toString();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser39 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat36);
        org.apache.commons.csv.Quote quote42 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray51 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote42, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray51, false);
        java.lang.String str54 = cSVFormat36.format((java.lang.Object[]) strArray51);
        java.util.Map<java.lang.String, java.lang.Integer> strMap55 = null;
        org.apache.commons.csv.CSVRecord cSVRecord58 = new org.apache.commons.csv.CSVRecord(strArray51, strMap55, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat34.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\t', quote10, (java.lang.Character) 'a', (java.lang.Character) ',', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", strArray51, false);
        java.lang.String[] strArray62 = cSVFormat61.getHeader();
        java.lang.String str63 = cSVFormat5.format((java.lang.Object[]) strArray62);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str32, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVParser39);
        org.junit.Assert.assertTrue("'" + quote42 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote42.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\205\",\205" + "'", str54, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\205 \205Delimiter=<\037> SkipHeaderRecord:false" + "'", str63, "\205 \205Delimiter=<\037> SkipHeaderRecord:false");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('\f');
        boolean boolean8 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('\f');
        boolean boolean8 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withRecordSeparator("\"\205\",\"\205\"");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        boolean boolean9 = cSVFormat2.isEscaping();
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char22 = cSVFormat21.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote25 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuotePolicy(quote25);
        org.apache.commons.csv.Quote quote29 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray38 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote29, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray38, false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat21.withQuotePolicy(quote29);
        boolean boolean42 = cSVFormat41.isNullHandling();
        org.apache.commons.csv.Quote quote45 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray54 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote45, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray54, false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat41.withQuotePolicy(quote45);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat20.withQuotePolicy(quote45);
        java.lang.String[] strArray70 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote45, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray70, true);
        java.lang.String str73 = cSVFormat13.format((java.lang.Object[]) strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat13.withNullString("Delimiter=<,> QuoteChar=<\f> CommentStart=<\f> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + quote25 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote25.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + quote29 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote29.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + quote45 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote45.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray70);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"\r\n\",\"[\205, \205]\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\u2029" + "'", str73, "\"\r\n\",\"[\205, \205]\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\u2029");
        org.junit.Assert.assertNotNull(cSVFormat75);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        long long26 = cSVRecord23.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[\205, \205]" + "'", str24, "[\205, \205]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\036');
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser7.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser7.getHeaderMap();
        long long12 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        cSVParser6.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser6.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        boolean boolean7 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        long long11 = cSVParser8.getCurrentLineNumber();
        cSVParser8.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser8.spliterator();
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVRecordSpliterator13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withRecordSeparator('\036');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        boolean boolean8 = cSVParser4.isClosed();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser13.getRecords();
        boolean boolean15 = cSVParser13.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cSVParser13.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection18 = cSVParser4.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList17);
        org.apache.commons.csv.CSVRecord cSVRecord19 = cSVParser4.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordCollection18);
        org.junit.Assert.assertNull(cSVRecord19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        java.lang.String str5 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote10, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray19, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22, "\r\n", (long) 10);
        boolean boolean27 = cSVRecord25.isMapped("");
        java.lang.String[] strArray28 = cSVRecord25.values();
        java.lang.String str29 = cSVFormat1.format((java.lang.Object[]) strArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser30 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\205\",\205" + "'", str29, "\"\205\",\205");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuotePolicy(quote14);
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray27 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote18, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray27, false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withQuotePolicy(quote18);
        boolean boolean31 = cSVFormat30.isNullHandling();
        org.apache.commons.csv.Quote quote34 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray43 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote34, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray43, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withQuotePolicy(quote34);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat9.withQuotePolicy(quote34);
        java.lang.String[] strArray59 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote34, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray59, true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat1.withHeader(strArray59);
        java.util.Map<java.lang.String, java.lang.Integer> strMap63 = null;
        org.apache.commons.csv.CSVRecord cSVRecord66 = new org.apache.commons.csv.CSVRecord(strArray59, strMap63, "Delimiter=<#> Escape=< > QuoteChar=<#> CommentStart=<\f> NullString=<\r\n> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false Header:[\205, \205]", (long) (byte) 1);
        java.lang.String str68 = cSVRecord66.get(1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote14.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote18.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + quote34 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote34.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[\205, \205]" + "'", str68, "[\205, \205]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        boolean boolean9 = cSVParser6.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char13 = cSVFormat12.getCommentStart();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("", cSVFormat12);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser15.getRecords();
        boolean boolean17 = cSVParser15.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cSVParser15.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser15.getRecords();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char22 = cSVFormat21.getCommentStart();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser24 = org.apache.commons.csv.CSVParser.parse("", cSVFormat21);
        org.apache.commons.csv.CSVRecord cSVRecord25 = cSVParser24.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char28 = cSVFormat27.getCommentStart();
        boolean boolean29 = cSVFormat27.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser32 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat27);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList33 = cSVParser32.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList34 = cSVParser24.getRecords(cSVRecordList33);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList35 = cSVParser15.getRecords(cSVRecordList34);
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection36 = cSVParser6.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList35);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cSVParser24);
        org.junit.Assert.assertNull(cSVRecord25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVParser32);
        org.junit.Assert.assertNotNull(cSVRecordList33);
        org.junit.Assert.assertNotNull(cSVRecordList34);
        org.junit.Assert.assertNotNull(cSVRecordList35);
        org.junit.Assert.assertNotNull(cSVRecordCollection36);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator21 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord22 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord23 = cSVParser4.nextRecord();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection24 = null;
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection25 = cSVParser4.getRecords(cSVRecordCollection24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator21);
        org.junit.Assert.assertNull(cSVRecord22);
        org.junit.Assert.assertNull(cSVRecord23);
        org.junit.Assert.assertNull(cSVRecordCollection25);
        org.junit.Assert.assertNull(strMap26);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String[] strArray9 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape('\036');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote15 = cSVFormat1.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quote15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        long long5 = cSVParser4.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuotePolicy(quote14);
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray27 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote18, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray27, false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withQuotePolicy(quote18);
        boolean boolean31 = cSVFormat30.isNullHandling();
        org.apache.commons.csv.Quote quote34 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray43 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote34, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray43, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withQuotePolicy(quote34);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat9.withQuotePolicy(quote34);
        java.lang.String[] strArray59 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote34, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray59, true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat1.withHeader(strArray59);
        java.lang.Class<?> wildcardClass63 = strArray59.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote14.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote18.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + quote34 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote34.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        boolean boolean8 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.nextRecord();
        long long10 = cSVParser7.getRecordNumber();
        cSVParser7.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean11 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "", (long) (byte) 1);
        boolean boolean24 = cSVRecord23.isConsistent();
        java.lang.String[] strArray25 = cSVRecord23.values();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        boolean boolean5 = cSVParser4.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        boolean boolean7 = cSVParser4.isClosed();
        long long8 = cSVParser4.getRecordNumber();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        boolean boolean5 = cSVParser4.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        boolean boolean7 = cSVParser4.isClosed();
        long long8 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        boolean boolean5 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withQuoteChar((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withEscape((java.lang.Character) 'a');
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withQuoteChar('\\');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        long long8 = cSVParser7.getCurrentLineNumber();
        boolean boolean9 = cSVParser7.isClosed();
        long long10 = cSVParser7.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char7 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char14 = cSVFormat13.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote17 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat13);
        org.apache.commons.csv.CSVRecord cSVRecord20 = cSVParser19.nextRecord();
        boolean boolean22 = cSVRecord20.isMapped("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean23 = cSVFormat9.equals((java.lang.Object) cSVRecord20);
        long long24 = cSVRecord20.getRecordNumber();
        boolean boolean26 = cSVRecord20.isSet("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quote17 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote17.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNotNull(cSVRecord20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        boolean boolean20 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.Quote quote23 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) quote23, "");
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char35 = cSVFormat34.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote38 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withQuotePolicy(quote38);
        org.apache.commons.csv.Quote quote42 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray51 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote42, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray51, false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat34.withQuotePolicy(quote42);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote57 = cSVFormat54.getQuotePolicy();
        org.apache.commons.csv.Quote quote66 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray75 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote66, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray75, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap78 = null;
        org.apache.commons.csv.CSVRecord cSVRecord81 = new org.apache.commons.csv.CSVRecord(strArray75, strMap78, "\r\n", (long) 10);
        boolean boolean82 = cSVRecord81.isConsistent();
        int int83 = cSVRecord81.size();
        java.util.Iterator<java.lang.String> strItor84 = cSVRecord81.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator85 = cSVRecord81.spliterator();
        int int86 = cSVRecord81.size();
        java.lang.String[] strArray87 = cSVRecord81.values();
        org.apache.commons.csv.CSVFormat cSVFormat89 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '\"', quote57, (java.lang.Character) '\f', (java.lang.Character) ',', false, true, "", "Delimiter=<\037> SkipHeaderRecord:false", strArray87, false);
        org.apache.commons.csv.CSVFormat cSVFormat91 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote23, (java.lang.Character) '\r', (java.lang.Character) ',', false, false, "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray87, true);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat1.withQuotePolicy(quote23);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + quote23 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote23.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(char35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + quote38 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote38.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + quote42 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote42.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + quote57 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote57.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertTrue("'" + quote66 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote66.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(strItor84);
        org.junit.Assert.assertNotNull(strSpliterator85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(cSVFormat92);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuotePolicy(quote10);
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray23 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote14, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray23, false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat6.withQuotePolicy(quote14);
        boolean boolean27 = cSVFormat26.isNullHandling();
        org.apache.commons.csv.Quote quote30 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray39 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote30, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray39, false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat26.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat5.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat5.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser48 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote10.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote14.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + quote30 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote30.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char17 = cSVFormat16.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuotePolicy(quote20);
        org.apache.commons.csv.Quote quote24 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray33 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote24, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray33, false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat16.withQuotePolicy(quote24);
        boolean boolean37 = cSVFormat36.isNullHandling();
        org.apache.commons.csv.Quote quote40 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray49 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote40, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray49, false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat36.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat15.withQuotePolicy(quote40);
        java.lang.String[] strArray65 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote40, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray65, true);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat7.withHeader(strArray65);
        boolean boolean69 = cSVFormat5.equals((java.lang.Object) cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote20.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + quote24 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote24.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + quote40 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote40.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("[]", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser5.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser5.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser5.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser5.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader5);
        boolean boolean8 = lexer6.isEscape((int) ' ');
        boolean boolean10 = lexer6.isCommentStart((int) '\\');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char20 = cSVFormat19.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote23 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withQuotePolicy(quote23);
        org.apache.commons.csv.Quote quote27 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray36 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote27, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray36, false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat19.withQuotePolicy(quote27);
        boolean boolean40 = cSVFormat39.isNullHandling();
        org.apache.commons.csv.Quote quote43 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray52 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote43, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray52, false);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat39.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat18.withQuotePolicy(quote43);
        java.lang.String[] strArray68 = new java.lang.String[] { "\r\n", "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", "\u2029" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\r', quote43, (java.lang.Character) '\r', (java.lang.Character) '\b', false, true, "INVALID []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray68, true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat10.withHeader(strArray68);
        org.apache.commons.csv.CSVFormat cSVFormat73 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '4', quote2, (java.lang.Character) '\b', (java.lang.Character) '\r', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "\"\205\",\"\205\"", strArray68, true);
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote2.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + quote23 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote23.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + quote27 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote27.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + quote43 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote43.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(cSVFormat71);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNull(cSVRecord9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\036');
        boolean boolean8 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withEscape((java.lang.Character) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader5);
        boolean boolean8 = lexer6.isWhitespace((int) '\t');
        boolean boolean10 = lexer6.isStartOfLine((int) '\037');
        boolean boolean12 = lexer6.isQuoteChar(0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentStart('\\');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char12 = cSVFormat11.getCommentStart();
        boolean boolean13 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat11);
        java.lang.Character char17 = cSVFormat11.getEscape();
        boolean boolean18 = cSVFormat11.isEscaping();
        cSVFormat11.validate();
        boolean boolean20 = cSVFormat9.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat11.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVParser16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object obj1 = null;
        boolean boolean2 = cSVFormat0.equals(obj1);
        java.lang.Character char3 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        boolean boolean7 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        long long11 = cSVParser8.getCurrentLineNumber();
        cSVParser8.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser8.spliterator();
        boolean boolean14 = cSVFormat0.equals((java.lang.Object) cSVRecordSpliterator13);
        java.lang.Character char15 = cSVFormat0.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(char15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray16, strMap20, "\u2028", (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap24 = cSVRecord23.toMap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        boolean boolean11 = cSVParser6.isClosed();
        long long12 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser6.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser6.iterator();
        boolean boolean12 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char7 = cSVFormat6.getCommentStart();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat16);
        org.apache.commons.csv.Quote quote22 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray31 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote22, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray31, false);
        java.lang.String str34 = cSVFormat16.format((java.lang.Object[]) strArray31);
        java.util.Map<java.lang.String, java.lang.Integer> strMap35 = null;
        org.apache.commons.csv.CSVRecord cSVRecord38 = new org.apache.commons.csv.CSVRecord(strArray31, strMap35, "\u2028", (long) (byte) 1);
        java.lang.String str39 = cSVFormat10.format((java.lang.Object[]) strArray31);
        java.lang.String str40 = cSVFormat5.format((java.lang.Object[]) strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat5.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuoteChar((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertTrue("'" + quote22 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote22.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\205\",\205" + "'", str34, "\"\205\",\205");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\205\",\205#" + "'", str39, "\"\205\",\205#");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\205\",\205" + "'", str40, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser4, "");
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = null;
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser4.getRecords(cSVRecordList10);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser4.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser4.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNull(cSVRecordList11);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator21 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord22 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char25 = cSVFormat24.getCommentStart();
        boolean boolean26 = cSVFormat24.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser27 = org.apache.commons.csv.CSVParser.parse("", cSVFormat24);
        org.apache.commons.csv.CSVRecord cSVRecord28 = cSVParser27.nextRecord();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser27, "");
        boolean boolean31 = cSVParser27.isClosed();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char34 = cSVFormat33.getCommentStart();
        boolean boolean35 = cSVFormat33.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser36 = org.apache.commons.csv.CSVParser.parse("", cSVFormat33);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList37 = cSVParser36.getRecords();
        boolean boolean38 = cSVParser36.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap39 = cSVParser36.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList40 = cSVParser36.getRecords();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection41 = cSVParser27.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList40);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator42 = cSVRecordList40.spliterator();
        java.util.Collection<org.apache.commons.csv.CSVRecord> cSVRecordCollection43 = cSVParser4.getRecords((java.util.Collection<org.apache.commons.csv.CSVRecord>) cSVRecordList40);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator21);
        org.junit.Assert.assertNull(cSVRecord22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cSVParser27);
        org.junit.Assert.assertNull(cSVRecord28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cSVParser36);
        org.junit.Assert.assertNotNull(cSVRecordList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(strMap39);
        org.junit.Assert.assertNotNull(cSVRecordList40);
        org.junit.Assert.assertNotNull(cSVRecordCollection41);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator42);
        org.junit.Assert.assertNotNull(cSVRecordCollection43);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char8 = cSVFormat7.getCommentStart();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat7);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser12.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser4.getRecords(cSVRecordList13);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        boolean boolean22 = cSVFormat21.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char7 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char14 = cSVFormat13.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote17 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat13);
        org.apache.commons.csv.CSVRecord cSVRecord20 = cSVParser19.nextRecord();
        boolean boolean22 = cSVRecord20.isMapped("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean23 = cSVFormat9.equals((java.lang.Object) cSVRecord20);
        org.apache.commons.csv.Quote quote28 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray37 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote28, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray37, false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char47 = cSVFormat46.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withCommentStart((java.lang.Character) '\f');
        java.lang.String str50 = cSVFormat46.toString();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat46.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser57 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat54);
        org.apache.commons.csv.Quote quote60 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray69 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat71 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote60, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray69, false);
        java.lang.String str72 = cSVFormat54.format((java.lang.Object[]) strArray69);
        java.util.Map<java.lang.String, java.lang.Integer> strMap73 = null;
        org.apache.commons.csv.CSVRecord cSVRecord76 = new org.apache.commons.csv.CSVRecord(strArray69, strMap73, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat52.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\t', quote28, (java.lang.Character) 'a', (java.lang.Character) ',', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "INVALID []", strArray69, false);
        java.lang.String[] strArray80 = cSVFormat79.getHeader();
        java.lang.String str81 = cSVFormat9.format((java.lang.Object[]) strArray80);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quote17 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote17.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNotNull(cSVRecord20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + quote28 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote28.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNull(char47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str50, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVParser57);
        org.junit.Assert.assertTrue("'" + quote60 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote60.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"\205\",\205" + "'", str72, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\"\205\",\205" + "'", str81, "\"\205\",\205");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray16 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote7, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray16, false);
        java.lang.String str19 = cSVFormat1.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.Lexer lexer21 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = lexer21.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote7.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\205\",\205" + "'", str19, "\"\205\",\205");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser6.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.nextRecord();
        long long11 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        boolean boolean7 = cSVParser4.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getCurrentLineNumber();
        cSVParser4.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        java.lang.String[] strArray18 = new java.lang.String[] { "\r\n", "hi!", "", "" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray18, strMap20, "INVALID []", (long) (short) 1);
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('\t', (java.lang.Character) '\037', quote2, (java.lang.Character) ' ', (java.lang.Character) '\r', true, true, "[\205, \205]", "Delimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", strArray18, true);
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote2.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        boolean boolean9 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) quote2, "");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char12 = cSVFormat11.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart((java.lang.Character) '\f');
        java.lang.String str15 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat19);
        org.apache.commons.csv.Quote quote25 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray34 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote25, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray34, false);
        java.lang.String str37 = cSVFormat19.format((java.lang.Object[]) strArray34);
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray34, strMap38, "\u2028", (long) (byte) 1);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat17.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat44 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '\n', quote2, (java.lang.Character) '\f', (java.lang.Character) '\f', true, true, "\205", "", strArray34, false);
        java.lang.String[] strArray45 = cSVFormat44.getHeader();
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote2.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str15, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + quote25 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote25.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\205\",\205" + "'", str37, "\"\205\",\205");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        boolean boolean6 = cSVParser4.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat9);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.nextRecord();
        long long17 = cSVParser14.getCurrentLineNumber();
        long long18 = cSVParser14.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser4.getRecords(cSVRecordList19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char23 = cSVFormat22.getCommentStart();
        boolean boolean24 = cSVFormat22.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat22);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList26 = cSVParser25.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator27 = cSVParser25.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator28 = cSVParser25.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList29 = cSVParser25.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList30 = cSVParser4.getRecords(cSVRecordList29);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertNotNull(cSVRecordList26);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator27);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator28);
        org.junit.Assert.assertNotNull(cSVRecordList29);
        org.junit.Assert.assertNotNull(cSVRecordList30);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser6.nextRecord();
        long long9 = cSVParser6.getCurrentLineNumber();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser6.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader5);
        boolean boolean8 = lexer6.isWhitespace((int) '\t');
        boolean boolean10 = lexer6.isEscape((int) (short) 100);
        boolean boolean12 = lexer6.isEndOfFile((int) (short) 10);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat1);
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.Lexer lexer10 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader9);
        boolean boolean12 = lexer10.isCommentStart((int) '\n');
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type14 = token13.type;
        org.apache.commons.csv.Token.Type type15 = org.apache.commons.csv.Token.Type.TOKEN;
        token13.type = type15;
        org.apache.commons.csv.Token token17 = new org.apache.commons.csv.Token();
        org.apache.commons.csv.Token.Type type18 = token17.type;
        org.apache.commons.csv.Token.Type type19 = org.apache.commons.csv.Token.Type.TOKEN;
        token17.type = type19;
        org.apache.commons.csv.Token.Type type21 = token17.type;
        token13.type = type21;
        org.apache.commons.csv.Token.Type type23 = token13.type;
        org.apache.commons.csv.Token.Type type24 = token13.type;
        token13.isReady = false;
        java.lang.StringBuilder stringBuilder27 = token13.content;
        java.lang.String str28 = token13.toString();
        org.apache.commons.csv.Token.Type type29 = token13.type;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token30 = lexer10.nextToken(token13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type14.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type15.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type18.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type19.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type21.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type23.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type24.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "TOKEN []" + "'", str28, "TOKEN []");
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type29.equals(org.apache.commons.csv.Token.Type.TOKEN));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader5);
        // The following exception was thrown during execution in test generation
        try {
            lexer6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        boolean boolean14 = cSVFormat10.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat10);
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.NON_NUMERIC;
        java.lang.String[] strArray29 = new java.lang.String[] { "\205", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) '#', quote20, (java.lang.Character) '\f', (java.lang.Character) ' ', false, true, "", "\r\n", strArray29, false);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray29, strMap32, "\r\n", (long) 10);
        boolean boolean37 = cSVRecord35.isMapped("");
        java.lang.String[] strArray38 = cSVRecord35.values();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat10.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = new org.apache.commons.csv.CSVFormat('\t', (java.lang.Character) '\f', quote2, (java.lang.Character) '\\', (java.lang.Character) '\r', true, false, "TOKEN []", "[\205, \205]", strArray38, true);
        java.lang.String[] strArray42 = cSVFormat41.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVParser17);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote20.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat2);
        java.lang.Character char8 = cSVFormat2.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.Lexer lexer10 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader9);
        java.lang.String[] strArray11 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char2 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        java.lang.String str5 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char8 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withSkipHeaderRecord(false);
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str5, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }
}
