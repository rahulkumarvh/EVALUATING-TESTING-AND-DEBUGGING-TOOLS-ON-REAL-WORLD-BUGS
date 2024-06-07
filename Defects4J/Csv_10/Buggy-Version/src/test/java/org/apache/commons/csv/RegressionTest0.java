package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator(' ');
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat5.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator("hi!");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.Character char8 = cSVFormat5.getEscape();
        java.lang.Object[] objArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVFormat5.format(objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat4.print(appendable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.isEscaping();
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.print(appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) 'a');
        java.lang.Character char9 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withEscape('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NONE;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuotePolicy(quote2);
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.print(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote2.equals(org.apache.commons.csv.Quote.NONE));
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuotePolicy(quote7);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat8.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote7.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat7.print(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar(',');
        char char8 = cSVFormat7.getDelimiter();
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '\f');
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withRecordSeparator("hi!");
        java.lang.String str17 = cSVFormat16.getNullString();
        boolean boolean18 = cSVFormat8.equals((java.lang.Object) cSVFormat16);
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat16.print(appendable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape('\b');
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat5.print(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuoteChar((java.lang.Character) '\f');
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuoteChar((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withRecordSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter17 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuoteChar((java.lang.Character) '\f');
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuoteChar((java.lang.Character) '\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withEscape('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) 1.0d);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat2.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str19 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreEmptyLines(false);
        java.lang.String[] strArray31 = cSVFormat28.getHeader();
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat28.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat18.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat16.withHeader(strArray35);
        java.lang.String str39 = cSVFormat9.format((java.lang.Object[]) strArray35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str12, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str19, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "aDelimiter=<,> QuoteChaar=<\"> NullString=<Delimiter=< > SkipHeaaderRecord:faalse> RecordSepaaraator=<\r\n> SkipHeaaderRecord:faalsea,hi!,aDelimiter=<,> QuoteChaar=<4> RecordSepaaraator=<\r\n> SkipHeaaderRecord:faalsea" + "'", str39, "aDelimiter=<,> QuoteChaar=<\"> NullString=<Delimiter=< > SkipHeaaderRecord:faalse> RecordSepaaraator=<\r\n> SkipHeaaderRecord:faalsea,hi!,aDelimiter=<,> QuoteChaar=<4> RecordSepaaraator=<\r\n> SkipHeaaderRecord:faalsea");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.Character char8 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator("\205");
        boolean boolean11 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str14 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("\205");
        org.apache.commons.csv.Quote quote17 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat5.withQuotePolicy(quote17);
        java.lang.Appendable appendable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat5.print(appendable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str14, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quote17 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote17.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat2, "hi!");
        java.lang.String str9 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.String str11 = cSVFormat10.getNullString();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(false);
        java.lang.String str16 = cSVFormat15.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str25 = cSVFormat24.toString();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreEmptyLines(false);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.lang.String[] strArray41 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat34.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat24.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat18.withHeader(strArray41);
        java.lang.String str45 = cSVFormat10.format((java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r\n" + "'", str16, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str25, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\thi!\tDelimiter=<,> QuoteChar=<4> RecordSeparator=<\\r\\n> SkipHeaderRecord:false" + "'", str45, "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\thi!\tDelimiter=<,> QuoteChar=<4> RecordSeparator=<\\r\\n> SkipHeaderRecord:false");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(false);
        boolean boolean12 = cSVFormat8.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withRecordSeparator('\f');
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat14.print(appendable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        java.lang.String[] strArray9 = cSVFormat6.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withHeader(strArray13);
        java.lang.String str15 = cSVFormat0.format((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str15, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) '\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.Character char4 = cSVFormat3.getCommentStart();
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.String str8 = cSVFormat7.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape('\037');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        boolean boolean13 = cSVFormat9.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withEscape(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter18 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat8.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote7.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        java.lang.Object[] objArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVFormat6.format(objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuoteChar('\t');
        boolean boolean13 = cSVFormat12.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape(' ');
        java.lang.Character char16 = cSVFormat12.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat21.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str41 = cSVFormat40.toString();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str48 = cSVFormat47.toString();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withIgnoreEmptyLines(false);
        java.lang.String[] strArray60 = cSVFormat57.getHeader();
        java.lang.String[] strArray64 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat57.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat47.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat45.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat38.withHeader(strArray64);
        java.lang.String str69 = cSVFormat27.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat12.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str41, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str48, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str69, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('\\');
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.print(appendable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter3 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) 1.0d);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentStart('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreEmptyLines(false);
        java.lang.String[] strArray22 = cSVFormat19.getHeader();
        java.lang.String[] strArray26 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat9.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat3.withHeader(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter30 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str10, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char1 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean11 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str14 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str21 = cSVFormat20.toString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreEmptyLines(false);
        java.lang.String[] strArray33 = cSVFormat30.getHeader();
        java.lang.String[] strArray37 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat30.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat20.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat18.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat10.withHeader(strArray37);
        java.lang.String str42 = cSVFormat7.format((java.lang.Object[]) strArray37);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str14, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str21, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\thi!\t\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str42, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\thi!\t\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str24 = cSVFormat23.toString();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str31 = cSVFormat30.toString();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withIgnoreEmptyLines(false);
        java.lang.String[] strArray43 = cSVFormat40.getHeader();
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat40.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat30.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat28.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat21.withHeader(strArray47);
        java.lang.String str52 = cSVFormat10.format((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat10.withRecordSeparator('#');
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
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str24, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str31, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str52, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat54);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat2, "hi!");
        java.lang.String str9 = cSVFormat2.getRecordSeparator();
        char char10 = cSVFormat2.getDelimiter();
        java.lang.String[] strArray11 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator("Delimiter=<,> Escape=<a> QuoteChar=<\f> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote16 = cSVFormat13.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str19 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str26 = cSVFormat25.toString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreEmptyLines(false);
        java.lang.String[] strArray38 = cSVFormat35.getHeader();
        java.lang.String[] strArray42 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat35.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat25.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat23.withHeader(strArray42);
        java.lang.String str46 = cSVFormat13.format((java.lang.Object[]) strArray42);
        boolean boolean47 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat13.withRecordSeparator("Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.Appendable appendable50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter51 = cSVFormat49.print(appendable50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(quote16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str19, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str26, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str46, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str24 = cSVFormat23.toString();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str31 = cSVFormat30.toString();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withIgnoreEmptyLines(false);
        java.lang.String[] strArray43 = cSVFormat40.getHeader();
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat40.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat30.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat28.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat21.withHeader(strArray47);
        java.lang.String str52 = cSVFormat10.format((java.lang.Object[]) strArray47);
        boolean boolean53 = cSVFormat10.getIgnoreSurroundingSpaces();
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
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str24, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str31, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str52, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        boolean boolean5 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuoteChar((java.lang.Character) '\"');
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat4.print(appendable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuoteChar('\t');
        boolean boolean13 = cSVFormat12.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape(' ');
        java.lang.Character char16 = cSVFormat12.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat21.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str41 = cSVFormat40.toString();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str48 = cSVFormat47.toString();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withQuoteChar(',');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withIgnoreEmptyLines(false);
        java.lang.String[] strArray60 = cSVFormat57.getHeader();
        java.lang.String[] strArray64 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat57.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat47.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat45.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat38.withHeader(strArray64);
        java.lang.String str69 = cSVFormat27.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat12.withHeader(strArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withCommentStart('\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str41, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str48, "Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str69, "\"Delimiter=<,> QuoteChar=<\"\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!,\"Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat70);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("#\f\u2029,#Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false#,#Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true#");
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat14.print(appendable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar('#');
        boolean boolean10 = cSVFormat9.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape('\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withSkipHeaderRecord(false);
        boolean boolean15 = cSVFormat9.isQuoting();
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat9.print(appendable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuoteChar('\t');
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat13, "Delimiter=<,> QuoteChar=<\"> NullString=<Delimiter=< > SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter18 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }
}

