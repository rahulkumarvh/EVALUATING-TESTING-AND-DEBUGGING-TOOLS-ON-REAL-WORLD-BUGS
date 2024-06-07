package org.apache.commons.math.stat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        boolean boolean7 = frequency0.equals((java.lang.Object) (byte) -1);
        frequency0.clear();
        long long10 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getPct(' ');
        frequency0.addValue((long) (byte) 10);
        long long12 = frequency0.getCumFreq((long) '#');
        long long13 = frequency0.getSumFreq();
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct('a');
        double double19 = frequency0.getCumPct(100L);
        double double21 = frequency0.getCumPct(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        double double17 = frequency13.getPct('#');
        double double19 = frequency13.getPct((java.lang.Object) (-1.0f));
        long long21 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double23 = frequency13.getPct((-1));
        long long25 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long26 = frequency0.getCount((java.lang.Object) long25);
        frequency0.addValue(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct(' ');
        double double13 = frequency0.getCumPct((long) (byte) 1);
        long long15 = frequency0.getCount((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq('#');
        double double10 = frequency6.getPct((long) (short) 100);
        long long11 = frequency0.getCount((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        double double14 = frequency0.getCumPct((int) (byte) 1);
        double double16 = frequency0.getCumPct((long) (short) 1);
        long long18 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        long long11 = frequency0.getCount(' ');
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double15 = frequency0.getPct((int) (short) 1);
        double double17 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        long long22 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency18.addValue((int) (byte) 0);
        long long26 = frequency18.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        double double28 = frequency18.getPct(' ');
        double double30 = frequency18.getCumPct('#');
        // The following exception was thrown during execution in test generation
        try {
            double double31 = frequency0.getCumPct((java.lang.Object) frequency18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double16 = frequency0.getCumPct((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((long) 100);
        frequency0.addValue((int) (short) 1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct('#');
        double double23 = frequency15.getCumPct((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        double double25 = frequency15.getPct(obj24);
        double double26 = frequency0.getPct(obj24);
        long long28 = frequency0.getCount('a');
        double double30 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long7 = frequency0.getCumFreq((int) (byte) 100);
        double double9 = frequency0.getPct(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        long long14 = frequency10.getCumFreq((java.lang.Object) (byte) 1);
        frequency10.addValue((long) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency10.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double24 = frequency0.getPct(0L);
        double double26 = frequency0.getCumPct(1L);
        frequency0.addValue((long) '#');
        long long30 = frequency0.getCount('#');
        double double32 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double34 = frequency0.getPct('4');
        long long36 = frequency0.getCumFreq(10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        double double10 = frequency0.getPct((long) (short) -1);
        double double12 = frequency0.getCumPct((int) (short) 100);
        double double14 = frequency0.getPct((long) (byte) 0);
        double double16 = frequency0.getPct(10);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        double double21 = frequency17.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency17.valuesIterator();
        double double24 = frequency17.getCumPct('#');
        frequency17.addValue((int) (short) -1);
        long long28 = frequency17.getCount((int) ' ');
        boolean boolean30 = frequency17.equals((java.lang.Object) true);
        double double32 = frequency17.getCumPct((java.lang.Object) 0.0f);
        double double34 = frequency17.getCumPct((java.lang.Object) "");
        double double36 = frequency17.getCumPct(0);
        double double38 = frequency17.getPct((int) (byte) -1);
        long long39 = frequency0.getCount((java.lang.Object) double38);
        frequency0.addValue((java.lang.Integer) 1);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq('#');
        double double46 = frequency42.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency42.valuesIterator();
        long long49 = frequency42.getCount('#');
        double double51 = frequency42.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long53 = frequency42.getCount(' ');
        // The following exception was thrown during execution in test generation
        try {
            long long54 = frequency0.getCumFreq((java.lang.Object) frequency42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        double double16 = frequency0.getCumPct((-1));
        long long17 = frequency0.getSumFreq();
        long long19 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        double double27 = frequency23.getPct('#');
        long long29 = frequency23.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency23.addValue((long) 0);
        long long33 = frequency23.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency23.addValue((int) ' ');
        boolean boolean36 = frequency0.equals((java.lang.Object) frequency23);
        long long38 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double6 = frequency0.getPct((int) '4');
        double double8 = frequency0.getPct((long) 'a');
        double double10 = frequency0.getPct((int) '4');
        double double12 = frequency0.getPct((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        double double22 = frequency0.getCumPct((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        long long27 = frequency23.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long29 = frequency23.getCount(1);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq('#');
        long long34 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long36 = frequency30.getCumFreq((int) (short) -1);
        long long38 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency30.clear();
        java.lang.Object obj40 = null;
        double double41 = frequency30.getPct(obj40);
        double double43 = frequency30.getPct('#');
        long long45 = frequency30.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long47 = frequency30.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long48 = frequency23.getCumFreq((java.lang.Object) long47);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = frequency0.getCumPct((java.lang.Object) frequency23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long20 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq('#');
        double double28 = frequency24.getPct('#');
        double double29 = frequency21.getCumPct((java.lang.Object) '#');
        java.lang.Object obj30 = null;
        double double31 = frequency21.getPct(obj30);
        long long33 = frequency21.getCumFreq(0L);
        double double35 = frequency21.getPct((long) '#');
        double double37 = frequency21.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency21.addValue('a');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        double double44 = frequency40.getPct('#');
        long long46 = frequency40.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long47 = frequency21.getCumFreq((java.lang.Object) "hi!");
        boolean boolean48 = frequency0.equals((java.lang.Object) long47);
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCumFreq('#');
        double double53 = frequency49.getPct('#');
        long long55 = frequency49.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency49.addValue((long) 0);
        boolean boolean58 = frequency0.equals((java.lang.Object) 0);
        frequency0.addValue((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue(100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double8 = frequency0.getCumPct((int) '#');
        long long10 = frequency0.getCount((long) 0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getPct('#');
        double double23 = frequency11.getCumPct((long) (short) 10);
        double double24 = frequency0.getPct((java.lang.Object) (short) 10);
        double double26 = frequency0.getCumPct('4');
        java.lang.String str27 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        long long7 = frequency0.getSumFreq();
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        double double11 = frequency0.getPct(strComparable10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double10 = frequency0.getPct((java.lang.Object) long9);
        frequency0.addValue('a');
        frequency0.addValue(' ');
        double double16 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getPct('4');
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long17 = frequency0.getCount((int) '4');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct((long) (short) 100);
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "");
        double double27 = frequency19.getPct(' ');
        frequency19.addValue((long) (byte) 10);
        long long31 = frequency19.getCumFreq((long) '#');
        long long32 = frequency19.getSumFreq();
        long long34 = frequency19.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double36 = frequency19.getCumPct('a');
        long long37 = frequency0.getCumFreq((java.lang.Object) double36);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCumFreq('#');
        double double42 = frequency38.getPct((long) (short) 100);
        long long44 = frequency38.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency38.addValue((java.lang.Integer) 0);
        double double48 = frequency38.getPct(100);
        long long50 = frequency38.getCount((int) (short) 0);
        long long52 = frequency38.getCumFreq('a');
        frequency38.addValue((long) (-1));
        frequency38.addValue((long) 1);
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency();
        long long59 = frequency57.getCumFreq('#');
        long long61 = frequency57.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long62 = frequency38.getCount((java.lang.Object) long61);
        long long64 = frequency38.getCount((long) 1);
        double double66 = frequency38.getPct(0L);
        frequency38.addValue((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double69 = frequency0.getCumPct((java.lang.Object) frequency38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.3333333333333333d + "'", double66 == 0.3333333333333333d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) 1);
        long long12 = frequency0.getCount((int) (short) -1);
        double double14 = frequency0.getCumPct('#');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        long long20 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = frequency16.toString();
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq('#');
        double double26 = frequency22.getPct((long) (short) 100);
        long long27 = frequency16.getCount((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency16.valuesIterator();
        double double30 = frequency16.getCumPct(0L);
        double double32 = frequency16.getCumPct((long) (byte) 10);
        boolean boolean33 = frequency0.equals((java.lang.Object) frequency16);
        double double35 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long8 = frequency0.getCumFreq(0);
        frequency0.addValue((int) (short) -1);
        long long12 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double24 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double26 = frequency0.getPct((int) (byte) 10);
        double double28 = frequency0.getCumPct(0);
        frequency0.addValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        double double22 = frequency0.getCumPct(strComparable21);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        double double27 = frequency23.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency23.valuesIterator();
        java.lang.String str29 = frequency23.toString();
        double double31 = frequency23.getPct('4');
        frequency23.addValue((java.lang.Integer) (-1));
        double double35 = frequency23.getPct((int) (short) 100);
        double double37 = frequency23.getCumPct((long) 1);
        frequency0.addValue((java.lang.Object) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq('#');
        double double43 = frequency39.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency39.valuesIterator();
        double double46 = frequency39.getCumPct('#');
        frequency39.addValue((int) (short) -1);
        frequency39.addValue((int) '4');
        double double52 = frequency39.getCumPct(' ');
        frequency39.addValue((java.lang.Integer) 10);
        frequency39.clear();
        long long56 = frequency39.getSumFreq();
        double double57 = frequency0.getCumPct((java.lang.Object) long56);
        long long59 = frequency0.getCumFreq('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getCumPct('a');
        double double16 = frequency0.getPct((int) (byte) 0);
        long long18 = frequency0.getCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCount(1);
        long long7 = frequency0.getSumFreq();
        long long9 = frequency0.getCumFreq('4');
        long long11 = frequency0.getCumFreq((int) '#');
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        frequency0.addValue((java.lang.Integer) 10);
        double double10 = frequency0.getPct('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long14 = frequency0.getCount((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount(0);
        frequency0.clear();
        double double10 = frequency0.getCumPct((int) ' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        frequency0.addValue((int) '4');
        double double13 = frequency0.getCumPct(' ');
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.clear();
        long long17 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency18.valuesIterator();
        long long25 = frequency18.getCount('#');
        long long27 = frequency18.getCount((long) '#');
        long long29 = frequency18.getCumFreq((int) (byte) 10);
        boolean boolean30 = frequency0.equals((java.lang.Object) frequency18);
        long long32 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq('#');
        double double37 = frequency33.getPct((java.lang.Object) (-1.0d));
        frequency33.addValue((long) ' ');
        frequency33.clear();
        boolean boolean41 = frequency0.equals((java.lang.Object) frequency33);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq('#');
        double double46 = frequency42.getPct('#');
        double double48 = frequency42.getPct((java.lang.Object) (-1.0f));
        long long50 = frequency42.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double52 = frequency42.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor53 = frequency42.valuesIterator();
        frequency42.addValue(0L);
        long long57 = frequency42.getCumFreq(' ');
        long long59 = frequency42.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long61 = frequency42.getCumFreq((long) (byte) 0);
        boolean boolean62 = frequency0.equals((java.lang.Object) frequency42);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(wildcardComparableItor53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long6 = frequency0.getSumFreq();
        double double8 = frequency0.getCumPct('#');
        double double10 = frequency0.getCumPct((int) (byte) 1);
        long long12 = frequency0.getCumFreq(0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        double double20 = frequency16.getPct('#');
        double double21 = frequency13.getCumPct((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        double double23 = frequency13.getPct(obj22);
        long long25 = frequency13.getCumFreq(0L);
        long long27 = frequency13.getCumFreq((long) (byte) 100);
        long long28 = frequency0.getCumFreq((java.lang.Object) long27);
        long long30 = frequency0.getCumFreq((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        frequency0.addValue((java.lang.Integer) 10);
        double double10 = frequency0.getPct('#');
        double double12 = frequency0.getCumPct((long) (short) 10);
        long long14 = frequency0.getCount((long) (byte) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.addValue((long) (short) 1);
        long long8 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        double double8 = frequency0.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq('#');
        double double13 = frequency9.getPct((java.lang.Object) (-1.0d));
        long long15 = frequency9.getCount('#');
        frequency0.addValue((java.lang.Object) long15);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        double double21 = frequency17.getPct((long) (short) 100);
        long long23 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "");
        long long25 = frequency17.getCumFreq((int) (short) 0);
        double double27 = frequency17.getPct(' ');
        boolean boolean28 = frequency0.equals((java.lang.Object) frequency17);
        frequency0.clear();
        double double31 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n2\t1\t33%\t67%\n10\t1\t33%\t100%\n");
        long long33 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) 1);
        long long12 = frequency0.getCount((int) (short) -1);
        double double14 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        long long15 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double17 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n");
        double double19 = frequency0.getPct((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct(100);
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n");
        double double16 = frequency0.getCumPct((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        double double42 = frequency0.getCumPct((int) '#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor43 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor43);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long6 = frequency0.getSumFreq();
        double double8 = frequency0.getCumPct('#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct(0);
        frequency0.clear();
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        long long42 = frequency0.getCumFreq('#');
        long long44 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        long long47 = frequency45.getCumFreq('#');
        double double49 = frequency45.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency45.valuesIterator();
        double double52 = frequency45.getCumPct('#');
        long long54 = frequency45.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCumFreq('#');
        double double59 = frequency55.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor60 = frequency55.valuesIterator();
        double double62 = frequency55.getPct((int) (byte) 100);
        long long64 = frequency55.getCount(10);
        double double65 = frequency45.getPct((java.lang.Object) 10);
        long long67 = frequency45.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double69 = frequency45.getPct(0L);
        double double71 = frequency45.getCumPct(1L);
        boolean boolean72 = frequency0.equals((java.lang.Object) frequency45);
        long long74 = frequency45.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency45.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(wildcardComparableItor60);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        frequency0.addValue('a');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        java.lang.String str16 = frequency10.toString();
        frequency10.addValue('a');
        long long19 = frequency10.getSumFreq();
        long long20 = frequency0.getCumFreq((java.lang.Object) long19);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double24 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double26 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        double double28 = frequency0.getPct((int) (short) 1);
        double double30 = frequency0.getCumPct('a');
        long long32 = frequency0.getCount(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('#');
        long long16 = frequency0.getCumFreq(100L);
        double double18 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        long long16 = frequency0.getCount(100L);
        long long18 = frequency0.getCumFreq(' ');
        double double20 = frequency0.getCumPct('4');
        double double22 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq('#');
        double double30 = frequency26.getPct('#');
        double double31 = frequency23.getCumPct((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        double double33 = frequency23.getPct(obj32);
        long long35 = frequency23.getCumFreq(0L);
        double double37 = frequency23.getPct((long) (short) 100);
        double double39 = frequency23.getPct(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        double double44 = frequency40.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor45 = frequency40.valuesIterator();
        java.lang.String str46 = frequency40.toString();
        double double48 = frequency40.getPct('4');
        long long49 = frequency23.getCount((java.lang.Object) double48);
        long long50 = frequency0.getCumFreq((java.lang.Object) long49);
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCumFreq('#');
        long long55 = frequency51.getCumFreq((java.lang.Object) (byte) 1);
        long long57 = frequency51.getCount(0L);
        double double59 = frequency51.getPct('a');
        long long61 = frequency51.getCount('a');
        double double63 = frequency51.getCumPct('a');
        long long64 = frequency0.getCumFreq((java.lang.Object) 'a');
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency();
        long long67 = frequency65.getCumFreq('#');
        double double69 = frequency65.getPct('#');
        double double71 = frequency65.getPct((java.lang.Object) (-1.0f));
        long long73 = frequency65.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double75 = frequency65.getPct((-1));
        long long77 = frequency65.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long79 = frequency65.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long81 = frequency65.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long83 = frequency65.getCount((java.lang.Object) (byte) -1);
        long long84 = frequency0.getCount((java.lang.Object) long83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(wildcardComparableItor45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        long long16 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n2\t1\t33%\t67%\n10\t1\t33%\t100%\n");
        frequency0.addValue('4');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency19.valuesIterator();
        double double26 = frequency19.getPct((int) (byte) 100);
        long long28 = frequency19.getCount(10);
        java.lang.String str29 = frequency19.toString();
        long long31 = frequency19.getCount((int) '4');
        double double33 = frequency19.getPct((int) '#');
        double double35 = frequency19.getCumPct(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor36 = frequency19.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        long long39 = frequency37.getCumFreq('#');
        double double41 = frequency37.getPct((java.lang.Object) (-1.0d));
        long long43 = frequency37.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long45 = frequency37.getCount((int) (short) 0);
        double double47 = frequency37.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        long long50 = frequency48.getCumFreq('#');
        long long52 = frequency48.getCumFreq((java.lang.Object) (byte) 1);
        long long54 = frequency48.getCumFreq((long) (byte) 10);
        frequency48.clear();
        boolean boolean56 = frequency37.equals((java.lang.Object) frequency48);
        long long57 = frequency19.getCumFreq((java.lang.Object) boolean56);
        double double59 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long60 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(wildcardComparableItor36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.clear();
        frequency0.addValue((long) '4');
        double double13 = frequency0.getCumPct((long) 100);
        java.lang.String str14 = frequency0.toString();
        double double16 = frequency0.getPct(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        frequency0.addValue(100);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double11 = frequency7.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency7.valuesIterator();
        double double14 = frequency7.getCumPct('#');
        frequency7.addValue((int) (short) -1);
        frequency7.addValue((int) '4');
        double double20 = frequency7.getCumPct(' ');
        frequency7.addValue((java.lang.Integer) 10);
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency7);
        frequency7.addValue((int) 'a');
        double double27 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.clear();
        java.lang.Object obj10 = null;
        double double11 = frequency0.getPct(obj10);
        long long13 = frequency0.getCount(2L);
        frequency0.addValue((java.lang.Integer) 0);
        long long16 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue(100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double8 = frequency0.getCumPct((int) '#');
        long long10 = frequency0.getCount((long) 0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getPct('#');
        double double23 = frequency11.getCumPct((long) (short) 10);
        double double24 = frequency0.getPct((java.lang.Object) (short) 10);
        double double26 = frequency0.getCumPct('4');
        double double28 = frequency0.getPct((int) (byte) 0);
        long long30 = frequency0.getCount((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct('#');
        long long12 = frequency0.getCount(10);
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long18 = frequency0.getCount('a');
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        long long11 = frequency7.getCumFreq((java.lang.Object) (byte) 1);
        long long13 = frequency7.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        double double17 = frequency7.getPct((java.lang.Object) long16);
        frequency7.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean20 = frequency0.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long22 = frequency0.getCumFreq((int) '#');
        double double24 = frequency0.getCumPct(' ');
        long long25 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getPct('4');
        java.lang.String str14 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        double double20 = frequency16.getPct('#');
        double double22 = frequency16.getPct((java.lang.Object) (-1.0f));
        long long24 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency16.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency16.valuesIterator();
        double double29 = frequency16.getPct('4');
        java.lang.String str30 = frequency16.toString();
        boolean boolean31 = frequency0.equals((java.lang.Object) frequency16);
        double double33 = frequency16.getPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct('a');
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCount((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        frequency0.addValue((int) '4');
        double double13 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        long long18 = frequency14.getCumFreq((java.lang.Object) (byte) 1);
        double double20 = frequency14.getPct((int) '4');
        double double22 = frequency14.getCumPct((long) (short) 1);
        double double23 = frequency0.getCumPct((java.lang.Object) (short) 1);
        long long25 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double27 = frequency0.getPct((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCumFreq('#');
        double double32 = frequency28.getPct((java.lang.Object) (-1.0d));
        long long34 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long36 = frequency28.getCount((int) (short) 0);
        boolean boolean37 = frequency0.equals((java.lang.Object) frequency28);
        long long39 = frequency0.getCount(' ');
        double double41 = frequency0.getCumPct((long) (short) 0);
        frequency0.addValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.5d + "'", double41 == 0.5d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long6 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        long long9 = frequency0.getCount((long) 100);
        long long11 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        frequency0.addValue((long) '#');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        double double18 = frequency14.getPct((java.lang.Object) (-1.0d));
        long long20 = frequency14.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency14.getCumFreq((long) (short) -1);
        java.lang.String str23 = frequency14.toString();
        java.lang.Object obj24 = null;
        long long25 = frequency14.getCumFreq(obj24);
        long long26 = frequency0.getCumFreq((java.lang.Object) long25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        long long16 = frequency0.getCount(100L);
        long long18 = frequency0.getCount((long) (byte) 0);
        long long19 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCount((long) '4');
        frequency0.addValue(' ');
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long20 = frequency0.getCumFreq((java.lang.Object) "");
        long long22 = frequency0.getCount((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq('#');
        double double13 = frequency9.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency9.valuesIterator();
        double double16 = frequency9.getCumPct('#');
        long long18 = frequency9.getCount((java.lang.Object) (short) -1);
        long long20 = frequency9.getCumFreq((int) (short) 100);
        double double21 = frequency0.getPct((java.lang.Object) (short) 100);
        frequency0.clear();
        double double24 = frequency0.getPct((int) '4');
        long long26 = frequency0.getCumFreq((long) (-1));
        double double28 = frequency0.getCumPct(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCount(10);
        java.lang.String str13 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        long long18 = frequency0.getCumFreq('4');
        double double20 = frequency0.getPct((long) (byte) 10);
        double double22 = frequency0.getPct('4');
        double double24 = frequency0.getPct(' ');
        double double26 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getPct('4');
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long17 = frequency0.getCount((int) '4');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency0.valuesIterator();
        long long19 = frequency0.getSumFreq();
        frequency0.addValue(10L);
        java.lang.String str22 = frequency0.toString();
        java.lang.Class<?> wildcardClass23 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue((long) 100);
        double double14 = frequency0.getPct((long) (byte) 0);
        long long16 = frequency0.getCount((long) 1);
        double double18 = frequency0.getCumPct(' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        boolean boolean10 = frequency0.equals((java.lang.Object) (short) 0);
        double double12 = frequency0.getPct((int) (byte) 0);
        double double14 = frequency0.getCumPct((long) (byte) 1);
        frequency0.clear();
        double double17 = frequency0.getCumPct('#');
        double double19 = frequency0.getCumPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long9 = frequency0.getCount((int) (short) 10);
        double double11 = frequency0.getPct('4');
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = frequency0.getCount(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        double double27 = frequency23.getPct('#');
        long long29 = frequency23.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency23.addValue((long) 0);
        long long33 = frequency23.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency23.addValue((int) ' ');
        boolean boolean36 = frequency0.equals((java.lang.Object) frequency23);
        long long38 = frequency0.getCumFreq(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.clear();
        java.lang.Object obj10 = null;
        double double11 = frequency0.getPct(obj10);
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long15 = frequency0.getCumFreq((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        frequency0.addValue(100);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double11 = frequency7.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency7.valuesIterator();
        double double14 = frequency7.getCumPct('#');
        frequency7.addValue((int) (short) -1);
        frequency7.addValue((int) '4');
        double double20 = frequency7.getCumPct(' ');
        frequency7.addValue((java.lang.Integer) 10);
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency7);
        double double25 = frequency7.getPct((java.lang.Object) '4');
        long long27 = frequency7.getCumFreq(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCumFreq((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        double double19 = frequency15.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency15.valuesIterator();
        double double22 = frequency15.getCumPct('#');
        frequency15.addValue((int) (short) -1);
        double double25 = frequency0.getPct((java.lang.Object) (short) -1);
        long long27 = frequency0.getCumFreq(100);
        long long29 = frequency0.getCount((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        long long17 = frequency0.getSumFreq();
        double double19 = frequency0.getPct((-1));
        java.lang.Class<?> wildcardClass20 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        long long42 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCumFreq('#');
        long long47 = frequency43.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency43.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long50 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.Comparable<java.lang.String> strComparable51 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(strComparable51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        long long11 = frequency0.getCount('a');
        double double13 = frequency0.getCumPct(0L);
        double double15 = frequency0.getPct((long) (-1));
        java.lang.String str16 = frequency0.toString();
        double double18 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.addValue((long) (short) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long11 = frequency0.getCount('#');
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCount((int) (byte) -1);
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double6 = frequency0.getPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCumFreq((java.lang.Object) (byte) 1);
        long long17 = frequency11.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        double double25 = frequency21.getPct('#');
        double double26 = frequency18.getCumPct((java.lang.Object) '#');
        java.lang.Object obj27 = null;
        double double28 = frequency18.getPct(obj27);
        long long30 = frequency18.getCount((long) '4');
        frequency18.addValue((java.lang.Integer) 100);
        long long33 = frequency11.getCumFreq((java.lang.Object) 100);
        double double35 = frequency11.getPct('a');
        frequency11.addValue((java.lang.Integer) (-1));
        boolean boolean38 = frequency0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCumFreq((long) (short) -1);
        double double10 = frequency0.getPct((long) (byte) 0);
        double double12 = frequency0.getPct('#');
        frequency0.addValue((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) 'a');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency0.getSumFreq();
        double double15 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency0.valuesIterator();
        long long12 = frequency0.getCumFreq((long) ' ');
        double double14 = frequency0.getCumPct((long) (byte) 100);
        double double16 = frequency0.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double6 = frequency0.getPct((int) '4');
        double double8 = frequency0.getCumPct((long) (short) 1);
        frequency0.addValue('4');
        double double12 = frequency0.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        double double20 = frequency16.getPct('#');
        double double21 = frequency13.getCumPct((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        double double23 = frequency13.getPct(obj22);
        long long25 = frequency13.getCumFreq(0L);
        double double27 = frequency13.getPct((long) '#');
        double double29 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency13.addValue('a');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq('#');
        double double36 = frequency32.getPct('#');
        long long38 = frequency32.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency13.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        long long44 = frequency40.getCumFreq((java.lang.Object) (byte) 1);
        long long46 = frequency40.getCumFreq((java.lang.Object) 10.0d);
        frequency40.addValue((long) (byte) 1);
        double double50 = frequency40.getCumPct((int) 'a');
        double double52 = frequency40.getCumPct((int) (short) 10);
        double double53 = frequency13.getCumPct((java.lang.Object) double52);
        long long55 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long57 = frequency13.getCount('a');
        long long58 = frequency0.getCount((java.lang.Object) 'a');
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency();
        long long61 = frequency59.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCumFreq('#');
        double double66 = frequency62.getPct('#');
        double double67 = frequency59.getCumPct((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        double double69 = frequency59.getPct(obj68);
        long long71 = frequency59.getCumFreq(0L);
        long long73 = frequency59.getCumFreq((long) (byte) 100);
        long long74 = frequency59.getSumFreq();
        long long76 = frequency59.getCumFreq((int) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor77 = frequency59.valuesIterator();
        frequency59.addValue((long) (short) 1);
        boolean boolean80 = frequency0.equals((java.lang.Object) frequency59);
        frequency59.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double8 = frequency0.getPct((-1));
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double12 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct('#');
        double double23 = frequency15.getCumPct((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        double double25 = frequency15.getPct(obj24);
        double double26 = frequency0.getPct(obj24);
        frequency0.addValue((java.lang.Integer) (-1));
        long long30 = frequency0.getCount((long) (byte) 1);
        double double32 = frequency0.getCumPct('4');
        double double34 = frequency0.getCumPct((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getPct('4');
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long17 = frequency0.getCount((int) '4');
        frequency0.clear();
        double double20 = frequency0.getCumPct('4');
        frequency0.addValue(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCount(10);
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((int) (short) 100);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(strComparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        boolean boolean10 = frequency0.equals((java.lang.Object) (short) 0);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq(' ');
        long long15 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        frequency0.addValue((long) ' ');
        double double8 = frequency0.getCumPct('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long10 = frequency0.getCumFreq((int) 'a');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq('#');
        double double16 = frequency12.getPct('#');
        double double18 = frequency12.getPct((java.lang.Object) (-1.0f));
        long long20 = frequency12.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double22 = frequency12.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency12.valuesIterator();
        double double25 = frequency12.getPct('4');
        long long27 = frequency12.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        boolean boolean28 = frequency0.equals((java.lang.Object) frequency12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long9 = frequency0.getSumFreq();
        long long11 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        java.lang.String str12 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        long long19 = frequency15.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long21 = frequency15.getCumFreq((int) (short) -1);
        long long22 = frequency15.getSumFreq();
        frequency15.addValue(1);
        double double25 = frequency0.getCumPct((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double9 = frequency0.getCumPct('4');
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double13 = frequency0.getCumPct((long) (short) -1);
        boolean boolean15 = frequency0.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 10);
        double double15 = frequency0.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        double double20 = frequency16.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency16.valuesIterator();
        long long22 = frequency16.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency16.valuesIterator();
        long long25 = frequency16.getCount((long) 100);
        long long27 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long29 = frequency16.getCount(0);
        frequency0.addValue((java.lang.Object) 0);
        double double32 = frequency0.getCumPct((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount(10L);
        java.lang.String str10 = frequency0.toString();
        double double12 = frequency0.getPct((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        double double17 = frequency13.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency13.valuesIterator();
        boolean boolean20 = frequency13.equals((java.lang.Object) 0.5d);
        java.lang.String str21 = frequency13.toString();
        long long23 = frequency13.getCount((long) 0);
        long long25 = frequency13.getCount((int) (short) 1);
        long long27 = frequency13.getCount((int) (short) 100);
        long long28 = frequency13.getSumFreq();
        frequency13.addValue('#');
        // The following exception was thrown during execution in test generation
        try {
            double double31 = frequency0.getCumPct((java.lang.Object) frequency13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency0.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        double double21 = frequency17.getPct((long) (short) 100);
        long long23 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency17.addValue((java.lang.Integer) 0);
        long long27 = frequency17.getCumFreq(1L);
        long long29 = frequency17.getCumFreq(10L);
        long long30 = frequency0.getCumFreq((java.lang.Object) long29);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq('#');
        double double35 = frequency31.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor36 = frequency31.valuesIterator();
        java.lang.String str37 = frequency31.toString();
        frequency31.addValue('a');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        double double44 = frequency40.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor45 = frequency40.valuesIterator();
        double double47 = frequency40.getCumPct('#');
        long long49 = frequency40.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        long long52 = frequency50.getCumFreq('#');
        double double54 = frequency50.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor55 = frequency50.valuesIterator();
        double double57 = frequency50.getPct((int) (byte) 100);
        long long59 = frequency50.getCount(10);
        double double60 = frequency40.getPct((java.lang.Object) 10);
        boolean boolean61 = frequency31.equals((java.lang.Object) 10);
        long long63 = frequency31.getCount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = frequency0.getCumFreq((java.lang.Object) frequency31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(wildcardComparableItor36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(wildcardComparableItor45);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(wildcardComparableItor55);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        double double16 = frequency0.getCumPct(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency0.valuesIterator();
        java.lang.String str18 = frequency0.toString();
        long long20 = frequency0.getCumFreq(' ');
        frequency0.addValue((long) ' ');
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double24 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long25 = frequency0.getSumFreq();
        long long27 = frequency0.getCount((long) (byte) 100);
        double double29 = frequency0.getPct((long) 0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        frequency30.clear();
        frequency30.addValue((java.lang.Integer) 1);
        double double35 = frequency30.getPct((long) 'a');
        java.lang.Class<?> wildcardClass36 = frequency30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            long long37 = frequency0.getCumFreq((java.lang.Object) frequency30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCount((java.lang.Object) 1.0d);
        double double10 = frequency0.getCumPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCumFreq((java.lang.Object) (byte) 1);
        long long17 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        frequency11.addValue((long) (byte) 1);
        double double21 = frequency11.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq('#');
        long long26 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long28 = frequency22.getCumFreq((int) (short) -1);
        double double30 = frequency22.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq('#');
        double double35 = frequency31.getPct((java.lang.Object) (-1.0d));
        long long37 = frequency31.getCount('#');
        frequency22.addValue((java.lang.Object) long37);
        long long40 = frequency22.getCumFreq((-1L));
        long long41 = frequency11.getCumFreq((java.lang.Object) (-1L));
        long long43 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double45 = frequency11.getPct('a');
        java.lang.String str46 = frequency11.toString();
        long long48 = frequency11.getCount(' ');
        double double49 = frequency0.getPct((java.lang.Object) ' ');
        java.lang.String str50 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        frequency0.addValue(100);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double11 = frequency7.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency7.valuesIterator();
        double double14 = frequency7.getCumPct('#');
        frequency7.addValue((int) (short) -1);
        frequency7.addValue((int) '4');
        double double20 = frequency7.getCumPct(' ');
        frequency7.addValue((java.lang.Integer) 10);
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency7);
        long long25 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double27 = frequency7.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.addValue((long) (short) 1);
        double double8 = frequency0.getPct((long) (short) 100);
        frequency0.clear();
        long long11 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        double double22 = frequency0.getCumPct(strComparable21);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        double double27 = frequency23.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency23.valuesIterator();
        java.lang.String str29 = frequency23.toString();
        double double31 = frequency23.getPct('4');
        frequency23.addValue((java.lang.Integer) (-1));
        double double35 = frequency23.getPct((int) (short) 100);
        double double37 = frequency23.getCumPct((long) 1);
        frequency0.addValue((java.lang.Object) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq('#');
        double double43 = frequency39.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency39.valuesIterator();
        double double46 = frequency39.getCumPct('#');
        frequency39.addValue((int) (short) -1);
        frequency39.addValue((int) '4');
        double double52 = frequency39.getCumPct(' ');
        frequency39.addValue((java.lang.Integer) 10);
        frequency39.clear();
        long long56 = frequency39.getSumFreq();
        double double57 = frequency0.getCumPct((java.lang.Object) long56);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        long long60 = frequency58.getCumFreq('#');
        double double62 = frequency58.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor63 = frequency58.valuesIterator();
        java.lang.String str64 = frequency58.toString();
        double double66 = frequency58.getPct('4');
        double double68 = frequency58.getCumPct((int) '#');
        java.lang.Class<?> wildcardClass69 = frequency58.getClass();
        boolean boolean70 = frequency0.equals((java.lang.Object) wildcardClass69);
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        long long73 = frequency71.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency();
        long long76 = frequency74.getCumFreq('#');
        double double78 = frequency74.getPct('#');
        double double79 = frequency71.getCumPct((java.lang.Object) '#');
        java.lang.Object obj80 = null;
        double double81 = frequency71.getPct(obj80);
        long long83 = frequency71.getCumFreq(0L);
        double double85 = frequency71.getPct((long) '#');
        double double87 = frequency71.getPct((java.lang.Comparable<java.lang.String>) "");
        double double88 = frequency0.getCumPct((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(wildcardComparableItor63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str64, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCount(10);
        java.lang.String str13 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        long long18 = frequency0.getCumFreq('4');
        long long20 = frequency0.getCumFreq(0L);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        double double25 = frequency21.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency21.valuesIterator();
        double double28 = frequency21.getCumPct('#');
        frequency21.addValue((int) (short) -1);
        long long32 = frequency21.getCount((int) ' ');
        double double34 = frequency21.getPct(1);
        long long35 = frequency0.getCount((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n");
        double double18 = frequency0.getCumPct((long) ' ');
        long long20 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        long long25 = frequency21.getCumFreq((java.lang.Object) (byte) 1);
        double double27 = frequency21.getPct((int) '4');
        long long29 = frequency21.getCumFreq((long) (byte) -1);
        frequency21.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency0.getPct((java.lang.Object) "hi!");
        long long34 = frequency0.getCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) 1);
        long long12 = frequency0.getCount((int) (short) -1);
        double double14 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long18 = frequency0.getCount((long) (byte) -1);
        double double20 = frequency0.getPct((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getPct((java.lang.Object) (-1.0f));
        long long29 = frequency21.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long31 = frequency21.getCount('4');
        frequency21.addValue('#');
        boolean boolean34 = frequency0.equals((java.lang.Object) frequency21);
        double double36 = frequency0.getPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.5d + "'", double36 == 0.5d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        long long15 = frequency0.getCumFreq(' ');
        long long17 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        double double20 = frequency0.getPct('#');
        long long22 = frequency0.getCount('#');
        long long23 = frequency0.getSumFreq();
        double double25 = frequency0.getPct('#');
        double double27 = frequency0.getPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct('#');
        double double15 = frequency7.getCumPct((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        double double17 = frequency7.getPct(obj16);
        long long19 = frequency7.getCount((long) '4');
        frequency7.addValue((java.lang.Integer) 100);
        long long22 = frequency0.getCumFreq((java.lang.Object) 100);
        long long24 = frequency0.getCount(100L);
        java.lang.String str25 = frequency0.toString();
        long long27 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq('#');
        double double35 = frequency31.getPct('#');
        double double36 = frequency28.getCumPct((java.lang.Object) '#');
        long long38 = frequency28.getCumFreq((long) (short) 0);
        frequency28.addValue((long) 100);
        frequency28.addValue((int) (byte) 1);
        double double44 = frequency28.getCumPct(0L);
        long long46 = frequency28.getCumFreq((long) (short) -1);
        frequency28.addValue((int) '4');
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCumFreq('#');
        double double53 = frequency49.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor54 = frequency49.valuesIterator();
        java.lang.String str55 = frequency49.toString();
        double double57 = frequency49.getPct('4');
        frequency49.addValue((java.lang.Integer) (-1));
        double double61 = frequency49.getPct((int) (short) 100);
        double double63 = frequency49.getCumPct('4');
        long long65 = frequency49.getCount(100L);
        long long67 = frequency49.getCumFreq(' ');
        double double69 = frequency49.getCumPct('4');
        double double71 = frequency49.getCumPct(0);
        double double72 = frequency28.getPct((java.lang.Object) double71);
        double double73 = frequency0.getCumPct((java.lang.Object) double72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(wildcardComparableItor54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str55, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCumFreq(0);
        double double10 = frequency0.getPct((long) (short) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double10 = frequency0.getPct((java.lang.Object) long9);
        frequency0.addValue('a');
        long long14 = frequency0.getCumFreq((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCumFreq((long) (byte) 100);
        long long16 = frequency0.getCount(0);
        frequency0.addValue((java.lang.Integer) 100);
        java.lang.String str19 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency0.getCumPct(0L);
        double double18 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        double double25 = frequency19.getPct((java.lang.Object) (-1.0f));
        long long27 = frequency19.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double29 = frequency19.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency19.valuesIterator();
        double double32 = frequency19.getPct('4');
        java.lang.String str33 = frequency19.toString();
        double double34 = frequency0.getPct((java.lang.Object) str33);
        boolean boolean36 = frequency0.equals((java.lang.Object) 0.5d);
        double double38 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        long long10 = frequency0.getCumFreq(1L);
        frequency0.addValue(2L);
        frequency0.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        long long19 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = frequency15.toString();
        long long21 = frequency0.getCount((java.lang.Object) str20);
        java.lang.String str22 = frequency0.toString();
        frequency0.addValue((java.lang.Integer) 100);
        double double26 = frequency0.getCumPct('4');
        frequency0.addValue((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n2\t1\t33%\t67%\n10\t1\t33%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n2\t1\t33%\t67%\n10\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getPct(' ');
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double14 = frequency0.getPct((int) (byte) 100);
        double double16 = frequency0.getCumPct((-1L));
        long long18 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        double double19 = frequency11.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        double double24 = frequency20.getPct((java.lang.Object) (-1.0d));
        long long26 = frequency20.getCount('#');
        frequency11.addValue((java.lang.Object) long26);
        long long29 = frequency11.getCumFreq((-1L));
        long long30 = frequency0.getCumFreq((java.lang.Object) (-1L));
        long long32 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double34 = frequency0.getPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency0.valuesIterator();
        long long36 = frequency0.getSumFreq();
        long long38 = frequency0.getCount((long) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq('#');
        double double43 = frequency39.getPct((java.lang.Object) (-1.0d));
        long long45 = frequency39.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency39.addValue((long) (short) 1);
        frequency39.clear();
        long long50 = frequency39.getCumFreq(100);
        frequency39.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long53 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.clear();
        java.lang.Object obj10 = null;
        double double11 = frequency0.getPct(obj10);
        double double13 = frequency0.getPct('#');
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((long) 0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct((long) (short) 100);
        long long24 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency18.getPct(' ');
        frequency18.addValue((long) (byte) 10);
        long long30 = frequency18.getCumFreq((long) '#');
        long long31 = frequency18.getSumFreq();
        double double33 = frequency18.getCumPct('a');
        long long35 = frequency18.getCumFreq((int) (byte) 0);
        long long37 = frequency18.getCount('#');
        long long38 = frequency0.getCumFreq((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        double double16 = frequency0.getCumPct(0L);
        long long18 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq('#');
        double double26 = frequency22.getPct('#');
        double double27 = frequency19.getCumPct((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        double double29 = frequency19.getPct(obj28);
        long long31 = frequency19.getCumFreq(0L);
        long long33 = frequency19.getCount((long) '4');
        frequency19.addValue(' ');
        double double37 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) double37);
        long long40 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCumFreq((long) (byte) 100);
        long long15 = frequency0.getSumFreq();
        long long17 = frequency0.getCumFreq((int) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency0.valuesIterator();
        frequency0.clear();
        long long21 = frequency0.getCumFreq((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct('a');
        frequency0.clear();
        frequency0.clear();
        frequency0.addValue(0);
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = frequency0.getPct(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue(100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        long long15 = frequency0.getCumFreq(' ');
        double double17 = frequency0.getPct('#');
        long long19 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double21 = frequency0.getPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        double double9 = frequency0.getPct(0);
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        double double7 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long8 = frequency0.getSumFreq();
        double double10 = frequency0.getPct('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        double double17 = frequency10.getPct((int) (byte) 100);
        long long19 = frequency10.getCount(10);
        double double20 = frequency0.getPct((java.lang.Object) 10);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double24 = frequency0.getPct(0L);
        double double26 = frequency0.getCumPct(1L);
        double double28 = frequency0.getPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct('a');
        frequency0.clear();
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        long long19 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency11.clear();
        java.lang.Object obj21 = null;
        double double22 = frequency11.getPct(obj21);
        long long24 = frequency11.getCumFreq(0L);
        long long25 = frequency0.getCount((java.lang.Object) long24);
        long long27 = frequency0.getCumFreq(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        frequency0.addValue('a');
        long long10 = frequency0.getCumFreq((int) (byte) 10);
        long long12 = frequency0.getCount((long) (byte) -1);
        long long13 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCount(10);
        java.lang.String str13 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        double double24 = frequency20.getPct('#');
        double double25 = frequency17.getCumPct((java.lang.Object) '#');
        java.lang.Object obj26 = null;
        double double27 = frequency17.getPct(obj26);
        long long29 = frequency17.getCumFreq(0L);
        long long31 = frequency17.getCumFreq((long) (byte) 100);
        frequency17.addValue((long) (-1));
        long long34 = frequency17.getSumFreq();
        double double35 = frequency0.getPct((java.lang.Object) long34);
        long long37 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor38 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor38);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq('#');
        double double10 = frequency6.getPct('#');
        long long12 = frequency6.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency6.addValue((long) 0);
        double double15 = frequency0.getPct((java.lang.Object) 0);
        double double17 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct((long) 1);
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        double double19 = frequency11.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        double double24 = frequency20.getPct((java.lang.Object) (-1.0d));
        long long26 = frequency20.getCount('#');
        frequency11.addValue((java.lang.Object) long26);
        long long29 = frequency11.getCumFreq((-1L));
        long long30 = frequency0.getCumFreq((java.lang.Object) (-1L));
        long long32 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double34 = frequency0.getPct('a');
        java.lang.String str35 = frequency0.toString();
        long long37 = frequency0.getCount('#');
        double double39 = frequency0.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue((long) 100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        double double17 = frequency13.getPct((long) (short) 100);
        long long19 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "");
        double double21 = frequency13.getPct(' ');
        frequency13.addValue((long) (byte) 10);
        long long25 = frequency13.getCumFreq((long) '#');
        long long26 = frequency13.getSumFreq();
        long long28 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        boolean boolean29 = frequency0.equals((java.lang.Object) long28);
        double double31 = frequency0.getPct((long) '#');
        long long33 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCumFreq((long) (short) -1);
        double double10 = frequency0.getPct((long) (byte) 0);
        double double12 = frequency0.getPct('#');
        long long14 = frequency0.getCumFreq((int) (byte) 10);
        double double16 = frequency0.getPct(100);
        long long18 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((long) 0);
        long long10 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.clear();
        double double13 = frequency0.getCumPct((long) 'a');
        long long15 = frequency0.getCount((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCumFreq((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        double double19 = frequency15.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency15.valuesIterator();
        double double22 = frequency15.getCumPct('#');
        frequency15.addValue((int) (short) -1);
        double double25 = frequency0.getPct((java.lang.Object) (short) -1);
        double double27 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCumFreq('#');
        double double32 = frequency28.getPct((long) (short) 100);
        long long34 = frequency28.getCount((java.lang.Comparable<java.lang.String>) "");
        long long36 = frequency28.getCumFreq((int) (short) 0);
        long long38 = frequency28.getCumFreq((int) (short) 1);
        double double40 = frequency28.getCumPct((long) (byte) 10);
        boolean boolean41 = frequency0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('a');
        double double16 = frequency0.getPct('#');
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 0);
        long long22 = frequency0.getCount(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency0.getCumPct(0L);
        double double18 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency19.valuesIterator();
        double double26 = frequency19.getCumPct('#');
        long long28 = frequency19.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCumFreq('#');
        long long33 = frequency29.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long35 = frequency29.getCumFreq((int) (short) -1);
        double double37 = frequency29.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCumFreq('#');
        double double42 = frequency38.getPct((java.lang.Object) (-1.0d));
        long long44 = frequency38.getCount('#');
        frequency29.addValue((java.lang.Object) long44);
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        long long48 = frequency46.getCumFreq('#');
        double double50 = frequency46.getPct((long) (short) 100);
        long long52 = frequency46.getCount((java.lang.Comparable<java.lang.String>) "");
        long long54 = frequency46.getCumFreq((int) (short) 0);
        double double56 = frequency46.getPct(' ');
        boolean boolean57 = frequency29.equals((java.lang.Object) frequency46);
        long long59 = frequency29.getCount(0);
        double double61 = frequency29.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCumFreq('#');
        long long66 = frequency62.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long68 = frequency62.getCumFreq((int) (short) -1);
        frequency62.addValue((java.lang.Integer) 10);
        long long72 = frequency62.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long74 = frequency62.getCumFreq((long) (byte) 10);
        java.lang.String str75 = frequency62.toString();
        double double76 = frequency29.getPct((java.lang.Object) str75);
        boolean boolean77 = frequency19.equals((java.lang.Object) frequency29);
        frequency0.addValue((java.lang.Object) boolean77);
        long long80 = frequency0.getCumFreq(' ');
        double double82 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str75, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) (short) 100);
        double double16 = frequency0.getPct(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        long long22 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long24 = frequency18.getCumFreq((int) (short) -1);
        frequency18.addValue((java.lang.Integer) 10);
        frequency0.addValue((java.lang.Object) 10);
        frequency0.addValue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        double double19 = frequency15.getPct('#');
        double double21 = frequency15.getPct((java.lang.Object) (-1.0f));
        long long23 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double25 = frequency15.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency15.valuesIterator();
        frequency15.addValue(0L);
        long long30 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long31 = frequency0.getCumFreq((java.lang.Object) "hi!");
        long long33 = frequency0.getCumFreq((long) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor34 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq('#');
        double double39 = frequency35.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor40 = frequency35.valuesIterator();
        double double42 = frequency35.getCumPct('#');
        long long44 = frequency35.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long45 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long47 = frequency0.getCumFreq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(wildcardComparableItor40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getPct(0);
        long long12 = frequency0.getCount((java.lang.Object) (short) -1);
        long long14 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue((long) 100);
        frequency0.addValue((int) (byte) 1);
        double double16 = frequency0.getCumPct(0L);
        long long18 = frequency0.getCumFreq((long) (short) -1);
        java.lang.Class<?> wildcardClass19 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('a');
        double double16 = frequency0.getPct('#');
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 0);
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long6 = frequency0.getSumFreq();
        double double8 = frequency0.getCumPct('#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        long long18 = frequency14.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency14.getCumPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency14.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = frequency0.getCount((java.lang.Object) frequency14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        long long15 = frequency0.getCumFreq(' ');
        long long17 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency18.valuesIterator();
        double double25 = frequency18.getCumPct('#');
        frequency18.addValue((int) (short) -1);
        frequency18.addValue((int) '4');
        double double31 = frequency18.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq('#');
        long long36 = frequency32.getCumFreq((java.lang.Object) (byte) 1);
        double double38 = frequency32.getPct((int) '4');
        double double40 = frequency32.getCumPct((long) (short) 1);
        double double41 = frequency18.getCumPct((java.lang.Object) (short) 1);
        long long43 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean44 = frequency0.equals((java.lang.Object) frequency18);
        frequency18.clear();
        double double47 = frequency18.getPct('4');
        java.lang.Class<?> wildcardClass48 = frequency18.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((long) (short) 1);
        long long10 = frequency0.getCumFreq('a');
        frequency0.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue((int) (byte) 0);
        frequency0.clear();
        double double9 = frequency0.getCumPct(10);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        double double14 = frequency10.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency10.valuesIterator();
        java.lang.String str16 = frequency10.toString();
        long long17 = frequency10.getSumFreq();
        long long18 = frequency10.getSumFreq();
        long long20 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double22 = frequency10.getPct((long) (short) 0);
        boolean boolean23 = frequency0.equals((java.lang.Object) (short) 0);
        long long24 = frequency0.getSumFreq();
        long long26 = frequency0.getCumFreq('4');
        java.lang.Comparable<java.lang.String> strComparable27 = null;
        double double28 = frequency0.getPct(strComparable27);
        double double30 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        boolean boolean7 = frequency0.equals((java.lang.Object) 0.5d);
        long long8 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        double double11 = frequency0.getCumPct(strComparable10);
        frequency0.addValue('a');
        double double15 = frequency0.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('4');
        double double16 = frequency0.getPct((long) 1);
        long long17 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct('#');
        double double23 = frequency15.getCumPct((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        double double25 = frequency15.getPct(obj24);
        double double26 = frequency0.getPct(obj24);
        frequency0.addValue((java.lang.Integer) (-1));
        frequency0.addValue((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq('#');
        double double35 = frequency31.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor36 = frequency31.valuesIterator();
        double double38 = frequency31.getCumPct('#');
        frequency31.addValue((int) (short) -1);
        long long42 = frequency31.getCount((int) ' ');
        boolean boolean44 = frequency31.equals((java.lang.Object) true);
        frequency31.addValue((int) '4');
        long long48 = frequency31.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long50 = frequency31.getCumFreq(10L);
        long long52 = frequency31.getCumFreq('4');
        frequency31.addValue((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(wildcardComparableItor36);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCount((java.lang.Object) 1.0d);
        frequency0.addValue((long) 10);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        double double15 = frequency11.getPct((long) (short) 100);
        long long17 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency11.addValue((java.lang.Integer) 0);
        double double21 = frequency11.getPct(100);
        long long23 = frequency11.getCount((int) (short) 0);
        long long25 = frequency11.getCumFreq('a');
        frequency11.addValue((long) (-1));
        frequency11.addValue((long) 1);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq('#');
        long long34 = frequency30.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long35 = frequency11.getCount((java.lang.Object) long34);
        long long37 = frequency11.getCount((long) 1);
        double double39 = frequency11.getPct(0L);
        double double40 = frequency0.getPct((java.lang.Object) 0L);
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.3333333333333333d + "'", double39 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        double double17 = frequency0.getCumPct((java.lang.Object) "");
        double double19 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq('#');
        double double27 = frequency23.getPct('#');
        double double28 = frequency20.getCumPct((java.lang.Object) '#');
        double double30 = frequency20.getPct((long) (short) -1);
        double double32 = frequency20.getCumPct((int) (short) 100);
        double double34 = frequency20.getPct((long) (byte) 0);
        double double36 = frequency20.getPct(10);
        double double37 = frequency0.getCumPct((java.lang.Object) double36);
        frequency0.clear();
        long long40 = frequency0.getCumFreq(2L);
        double double42 = frequency0.getCumPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        double double17 = frequency0.getCumPct((java.lang.Object) "");
        double double19 = frequency0.getCumPct(0);
        double double21 = frequency0.getPct((int) (byte) -1);
        long long23 = frequency0.getCount('4');
        double double25 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long27 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double29 = frequency0.getPct('a');
        double double31 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        long long7 = frequency0.getSumFreq();
        long long8 = frequency0.getSumFreq();
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n");
        long long12 = frequency0.getCount((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency11.getCumFreq((int) (short) -1);
        double double19 = frequency11.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        double double24 = frequency20.getPct((java.lang.Object) (-1.0d));
        long long26 = frequency20.getCount('#');
        frequency11.addValue((java.lang.Object) long26);
        long long29 = frequency11.getCumFreq((-1L));
        long long30 = frequency0.getCumFreq((java.lang.Object) (-1L));
        long long32 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.lang.String str33 = frequency0.toString();
        frequency0.addValue((int) (short) -1);
        long long37 = frequency0.getCount((long) (byte) -1);
        long long39 = frequency0.getCount((int) (short) 0);
        double double41 = frequency0.getCumPct(' ');
        double double43 = frequency0.getPct((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        boolean boolean7 = frequency0.equals((java.lang.Object) 0.5d);
        long long8 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        double double11 = frequency0.getCumPct(strComparable10);
        long long12 = frequency0.getSumFreq();
        long long14 = frequency0.getCount((int) (byte) 10);
        java.lang.String str15 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue((int) (byte) 0);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        double double10 = frequency0.getPct(' ');
        long long12 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        double double19 = frequency15.getPct('#');
        double double21 = frequency15.getPct((java.lang.Object) (-1.0f));
        long long23 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double25 = frequency15.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency15.valuesIterator();
        frequency15.addValue(0L);
        long long30 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long31 = frequency0.getCumFreq((java.lang.Object) "hi!");
        long long33 = frequency0.getCumFreq((long) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor34 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        long long38 = frequency36.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq('#');
        double double43 = frequency39.getPct('#');
        double double44 = frequency36.getCumPct((java.lang.Object) '#');
        java.lang.Object obj45 = null;
        double double46 = frequency36.getPct(obj45);
        long long48 = frequency36.getCumFreq(0L);
        double double50 = frequency36.getPct((long) (short) 100);
        double double52 = frequency36.getPct(0);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        long long55 = frequency53.getCumFreq('#');
        double double57 = frequency53.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor58 = frequency53.valuesIterator();
        java.lang.String str59 = frequency53.toString();
        double double61 = frequency53.getPct('4');
        long long62 = frequency36.getCount((java.lang.Object) double61);
        double double63 = frequency0.getCumPct((java.lang.Object) long62);
        long long65 = frequency0.getCumFreq((int) '4');
        frequency0.addValue((int) (short) -1);
        java.lang.String str68 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor34);
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(wildcardComparableItor58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str59, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n" + "'", str68, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct('a');
        frequency0.clear();
        frequency0.clear();
        long long12 = frequency0.getCumFreq(0);
        double double14 = frequency0.getPct((long) 100);
        java.lang.String str15 = frequency0.toString();
        frequency0.addValue((java.lang.Integer) (-1));
        double double19 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq('#');
        double double24 = frequency20.getPct((long) (short) 100);
        long long26 = frequency20.getCount((java.lang.Comparable<java.lang.String>) "");
        double double28 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double30 = frequency20.getPct('#');
        long long31 = frequency20.getSumFreq();
        double double33 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        boolean boolean34 = frequency0.equals((java.lang.Object) frequency20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        long long14 = frequency0.getCount((long) '4');
        frequency0.addValue(' ');
        frequency0.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        double double15 = frequency0.getCumPct((java.lang.Object) 0.0f);
        double double17 = frequency0.getCumPct((java.lang.Object) "");
        double double19 = frequency0.getCumPct(0);
        double double21 = frequency0.getPct((int) (byte) -1);
        long long23 = frequency0.getCount('4');
        double double25 = frequency0.getCumPct('#');
        frequency0.addValue((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        long long16 = frequency0.getCount(100L);
        long long18 = frequency0.getCumFreq(' ');
        double double20 = frequency0.getCumPct(0L);
        long long21 = frequency0.getSumFreq();
        long long23 = frequency0.getCount((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct('a');
        frequency0.clear();
        frequency0.clear();
        double double12 = frequency0.getPct((int) 'a');
        double double14 = frequency0.getPct((int) 'a');
        double double16 = frequency0.getPct((int) (short) 1);
        long long17 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq('#');
        double double10 = frequency6.getPct((long) (short) 100);
        long long11 = frequency0.getCount((java.lang.Object) (short) 100);
        double double13 = frequency0.getPct('4');
        long long15 = frequency0.getCount(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency0.valuesIterator();
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        long long14 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long16 = frequency10.getCumFreq((int) (short) -1);
        double double18 = frequency10.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct((java.lang.Object) (-1.0d));
        long long25 = frequency19.getCount('#');
        frequency10.addValue((java.lang.Object) long25);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        double double31 = frequency27.getPct((long) (short) 100);
        long long33 = frequency27.getCount((java.lang.Comparable<java.lang.String>) "");
        long long35 = frequency27.getCumFreq((int) (short) 0);
        double double37 = frequency27.getPct(' ');
        boolean boolean38 = frequency10.equals((java.lang.Object) frequency27);
        double double39 = frequency0.getCumPct((java.lang.Object) boolean38);
        long long40 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCumFreq('#');
        long long45 = frequency41.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long46 = frequency0.getCumFreq((java.lang.Object) long45);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        double double51 = frequency0.getCumPct((int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct('#');
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long15 = frequency0.getCumFreq('a');
        long long17 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        frequency0.addValue((long) (byte) 1);
        double double10 = frequency0.getCumPct((int) 'a');
        double double12 = frequency0.getCumPct((int) (short) 10);
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency0.getCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        long long42 = frequency0.getCumFreq('#');
        long long44 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        long long47 = frequency45.getCumFreq('#');
        double double49 = frequency45.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency45.valuesIterator();
        double double52 = frequency45.getCumPct('#');
        long long54 = frequency45.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCumFreq('#');
        double double59 = frequency55.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor60 = frequency55.valuesIterator();
        double double62 = frequency55.getPct((int) (byte) 100);
        long long64 = frequency55.getCount(10);
        double double65 = frequency45.getPct((java.lang.Object) 10);
        long long67 = frequency45.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double69 = frequency45.getPct(0L);
        double double71 = frequency45.getCumPct(1L);
        boolean boolean72 = frequency0.equals((java.lang.Object) frequency45);
        double double74 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(wildcardComparableItor60);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double6 = frequency0.getPct((int) '4');
        double double8 = frequency0.getCumPct((long) (short) 1);
        frequency0.addValue('4');
        frequency0.clear();
        java.lang.Object obj12 = null;
        long long13 = frequency0.getCumFreq(obj12);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        frequency0.addValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getPct(' ');
        long long10 = frequency0.getCount((long) '4');
        double double12 = frequency0.getCumPct((long) 0);
        double double14 = frequency0.getCumPct((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n52\t1\t33%\t100%\n");
        double double18 = frequency0.getCumPct((long) ' ');
        long long20 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq('#');
        long long25 = frequency21.getCumFreq((java.lang.Object) (byte) 1);
        double double27 = frequency21.getPct((int) '4');
        long long29 = frequency21.getCumFreq((long) (byte) -1);
        frequency21.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency0.getPct((java.lang.Object) "hi!");
        double double34 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double36 = frequency0.getCumPct((long) (short) 10);
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq('#');
        long long14 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long16 = frequency10.getCumFreq((int) (short) -1);
        double double18 = frequency10.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct((java.lang.Object) (-1.0d));
        long long25 = frequency19.getCount('#');
        frequency10.addValue((java.lang.Object) long25);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        double double31 = frequency27.getPct((long) (short) 100);
        long long33 = frequency27.getCount((java.lang.Comparable<java.lang.String>) "");
        long long35 = frequency27.getCumFreq((int) (short) 0);
        double double37 = frequency27.getPct(' ');
        boolean boolean38 = frequency10.equals((java.lang.Object) frequency27);
        long long40 = frequency10.getCount(0);
        double double42 = frequency10.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCumFreq('#');
        long long47 = frequency43.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long49 = frequency43.getCumFreq((int) (short) -1);
        frequency43.addValue((java.lang.Integer) 10);
        long long53 = frequency43.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long55 = frequency43.getCumFreq((long) (byte) 10);
        java.lang.String str56 = frequency43.toString();
        double double57 = frequency10.getPct((java.lang.Object) str56);
        boolean boolean58 = frequency0.equals((java.lang.Object) frequency10);
        long long60 = frequency0.getCumFreq((int) 'a');
        double double62 = frequency0.getCumPct((long) (short) 0);
        frequency0.addValue((int) '4');
        long long66 = frequency0.getCount((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str56, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCount(0);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq('#');
        double double16 = frequency12.getPct('#');
        double double17 = frequency9.getCumPct((java.lang.Object) '#');
        java.lang.Object obj18 = null;
        double double19 = frequency9.getPct(obj18);
        long long21 = frequency9.getCount(10);
        java.lang.String str22 = frequency9.toString();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        boolean boolean25 = frequency0.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double27 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        frequency0.addValue(100);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double11 = frequency7.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency7.valuesIterator();
        double double14 = frequency7.getCumPct('#');
        frequency7.addValue((int) (short) -1);
        frequency7.addValue((int) '4');
        double double20 = frequency7.getCumPct(' ');
        frequency7.addValue((java.lang.Integer) 10);
        boolean boolean23 = frequency0.equals((java.lang.Object) frequency7);
        long long25 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        boolean boolean7 = frequency0.equals((java.lang.Object) 0.5d);
        long long8 = frequency0.getSumFreq();
        double double10 = frequency0.getPct(0L);
        long long12 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getPct((int) 'a');
        double double14 = frequency0.getPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        long long16 = frequency0.getCount(100L);
        long long18 = frequency0.getCumFreq(' ');
        double double20 = frequency0.getCumPct(0L);
        long long21 = frequency0.getSumFreq();
        double double23 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('a');
        frequency0.addValue((long) (-1));
        frequency0.addValue((long) 1);
        double double20 = frequency0.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.3333333333333333d + "'", double20 == 0.3333333333333333d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        double double14 = frequency0.getPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct('#');
        double double23 = frequency15.getCumPct((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        double double25 = frequency15.getPct(obj24);
        double double26 = frequency0.getPct(obj24);
        frequency0.addValue((java.lang.Integer) (-1));
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long6 = frequency0.getSumFreq();
        double double8 = frequency0.getCumPct('#');
        double double10 = frequency0.getCumPct((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        long long42 = frequency0.getCumFreq('#');
        double double44 = frequency0.getCumPct('#');
        long long46 = frequency0.getCumFreq((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq('#');
        double double10 = frequency0.getPct((java.lang.Object) long9);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long14 = frequency0.getCount((long) 10);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        frequency0.addValue((long) ' ');
        long long13 = frequency0.getSumFreq();
        double double15 = frequency0.getCumPct((int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        long long11 = frequency0.getCount((int) ' ');
        boolean boolean13 = frequency0.equals((java.lang.Object) true);
        long long15 = frequency0.getCount('#');
        frequency0.addValue(10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct(100);
        long long12 = frequency0.getCount((int) (short) 0);
        long long14 = frequency0.getCumFreq('a');
        frequency0.addValue((long) (-1));
        frequency0.addValue((long) 1);
        double double20 = frequency0.getCumPct((int) (byte) 0);
        long long22 = frequency0.getCount(100L);
        frequency0.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCumFreq('#');
        double double29 = frequency25.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency25.valuesIterator();
        boolean boolean32 = frequency25.equals((java.lang.Object) 0.5d);
        long long33 = frequency25.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor34 = frequency25.valuesIterator();
        java.lang.Comparable<java.lang.String> strComparable35 = null;
        double double36 = frequency25.getCumPct(strComparable35);
        double double38 = frequency25.getPct(1);
        double double40 = frequency25.getPct('#');
        double double41 = frequency0.getPct((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.6666666666666666d + "'", double20 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        long long9 = frequency0.getCount((java.lang.Object) (short) -1);
        long long11 = frequency0.getCount('a');
        frequency0.clear();
        long long14 = frequency0.getCumFreq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        long long16 = frequency0.getCount(100L);
        long long18 = frequency0.getCumFreq(' ');
        double double20 = frequency0.getCumPct('4');
        long long22 = frequency0.getCumFreq((int) (short) 100);
        long long24 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCumFreq('#');
        double double29 = frequency25.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency25.valuesIterator();
        double double32 = frequency25.getCumPct('#');
        long long34 = frequency25.getCount((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq('#');
        double double39 = frequency35.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor40 = frequency35.valuesIterator();
        double double42 = frequency35.getPct((int) (byte) 100);
        long long44 = frequency35.getCount(10);
        double double45 = frequency25.getPct((java.lang.Object) 10);
        long long47 = frequency25.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double49 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long51 = frequency25.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        long long54 = frequency52.getCumFreq('#');
        double double56 = frequency52.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor57 = frequency52.valuesIterator();
        double double59 = frequency52.getCumPct((int) (byte) 100);
        frequency52.addValue((int) (short) 100);
        frequency25.addValue((java.lang.Object) (short) 100);
        long long63 = frequency0.getCount((java.lang.Object) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor64 = frequency0.valuesIterator();
        long long66 = frequency0.getCount(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(wildcardComparableItor40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(wildcardComparableItor57);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double8 = frequency0.getPct(' ');
        frequency0.addValue((long) (byte) 10);
        long long12 = frequency0.getCumFreq((long) '#');
        long long13 = frequency0.getSumFreq();
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct('a');
        double double19 = frequency0.getPct('4');
        double double21 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((java.lang.Object) (-1.0d));
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long8 = frequency0.getCumFreq((long) (short) -1);
        double double10 = frequency0.getPct((long) (byte) 0);
        long long12 = frequency0.getCount(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct(100);
        java.lang.Class<?> wildcardClass18 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCount(10);
        java.lang.String str13 = frequency0.toString();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        frequency0.clear();
        long long19 = frequency0.getCumFreq(0L);
        double double21 = frequency0.getPct((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long9 = frequency0.getSumFreq();
        long long11 = frequency0.getCount((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq('#');
        double double19 = frequency15.getPct('#');
        double double20 = frequency12.getCumPct((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        double double22 = frequency12.getPct(obj21);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = frequency0.getPct((java.lang.Object) frequency12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        frequency0.addValue((int) '4');
        double double13 = frequency0.getCumPct(' ');
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.clear();
        long long17 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq('#');
        double double22 = frequency18.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency18.valuesIterator();
        long long25 = frequency18.getCount('#');
        long long27 = frequency18.getCount((long) '#');
        long long29 = frequency18.getCumFreq((int) (byte) 10);
        boolean boolean30 = frequency0.equals((java.lang.Object) frequency18);
        long long32 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq('#');
        double double37 = frequency33.getPct((java.lang.Object) (-1.0d));
        frequency33.addValue((long) ' ');
        frequency33.clear();
        boolean boolean41 = frequency0.equals((java.lang.Object) frequency33);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq('#');
        double double46 = frequency42.getPct((java.lang.Object) (-1.0d));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency42.valuesIterator();
        boolean boolean49 = frequency42.equals((java.lang.Object) 0.5d);
        long long51 = frequency42.getCumFreq((int) (byte) 10);
        double double53 = frequency42.getPct((long) (byte) 1);
        double double54 = frequency0.getCumPct((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double6 = frequency0.getPct((int) '4');
        double double8 = frequency0.getCumPct((long) (short) 1);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double12 = frequency0.getPct('#');
        long long14 = frequency0.getCumFreq((-1L));
        java.lang.String str15 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        frequency0.addValue(100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        long long12 = frequency0.getCumFreq(0L);
        double double14 = frequency0.getPct((long) '#');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq('#');
        double double23 = frequency19.getPct('#');
        long long25 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) (byte) 1);
        long long33 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((long) (byte) 1);
        double double37 = frequency27.getCumPct((int) 'a');
        double double39 = frequency27.getCumPct((int) (short) 10);
        double double40 = frequency0.getCumPct((java.lang.Object) double39);
        long long42 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCumFreq('#');
        long long47 = frequency43.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency43.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long50 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long52 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) (-1));
        double double12 = frequency0.getPct((int) (short) 100);
        double double14 = frequency0.getCumPct('4');
        double double16 = frequency0.getCumPct((-1));
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        double double21 = frequency17.getPct((java.lang.Object) (-1.0d));
        long long23 = frequency17.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency17.addValue((long) (short) 1);
        java.lang.Class<?> wildcardClass26 = frequency17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = frequency0.getCumFreq((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct('#');
        double double6 = frequency0.getPct((java.lang.Object) (-1.0f));
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double10 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq('#');
        double double21 = frequency17.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency17.valuesIterator();
        java.lang.String str23 = frequency17.toString();
        frequency17.addValue('a');
        frequency17.clear();
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq('#');
        double double31 = frequency27.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor32 = frequency27.valuesIterator();
        java.lang.String str33 = frequency27.toString();
        frequency27.addValue('a');
        long long36 = frequency27.getSumFreq();
        long long37 = frequency17.getCumFreq((java.lang.Object) long36);
        long long39 = frequency17.getCount((int) '4');
        frequency17.addValue((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double42 = frequency0.getCumPct((java.lang.Object) frequency17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(wildcardComparableItor32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long6 = frequency0.getCumFreq((int) (short) -1);
        double double8 = frequency0.getCumPct(1L);
        long long10 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        double double18 = frequency14.getPct('#');
        double double19 = frequency11.getCumPct((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        double double21 = frequency11.getPct(obj20);
        long long23 = frequency11.getCumFreq(0L);
        double double25 = frequency11.getPct((long) '#');
        double double27 = frequency11.getPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = frequency0.equals((java.lang.Object) double27);
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double32 = frequency0.getCumPct((int) (short) 10);
        long long34 = frequency0.getCumFreq((int) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq('#');
        long long39 = frequency35.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str40 = frequency35.toString();
        frequency35.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double44 = frequency35.getCumPct('4');
        double double46 = frequency35.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double48 = frequency35.getCumPct((long) (short) -1);
        boolean boolean49 = frequency0.equals((java.lang.Object) (short) -1);
        double double51 = frequency0.getPct((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        java.lang.String str6 = frequency0.toString();
        long long7 = frequency0.getSumFreq();
        long long8 = frequency0.getSumFreq();
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq('#');
        long long15 = frequency11.getCumFreq((java.lang.Object) (byte) 1);
        long long17 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        frequency11.addValue((long) (byte) 1);
        double double21 = frequency11.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq('#');
        long long26 = frequency22.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long28 = frequency22.getCumFreq((int) (short) -1);
        double double30 = frequency22.getCumPct(1L);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq('#');
        double double35 = frequency31.getPct((java.lang.Object) (-1.0d));
        long long37 = frequency31.getCount('#');
        frequency22.addValue((java.lang.Object) long37);
        long long40 = frequency22.getCumFreq((-1L));
        long long41 = frequency11.getCumFreq((java.lang.Object) (-1L));
        frequency11.addValue((java.lang.Integer) 0);
        double double44 = frequency0.getCumPct((java.lang.Object) 0);
        long long46 = frequency0.getCumFreq(' ');
        frequency0.addValue(0);
        double double50 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long52 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double6 = frequency0.getPct((int) '4');
        double double8 = frequency0.getCumPct((long) (short) 1);
        frequency0.addValue('4');
        double double12 = frequency0.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        double double20 = frequency16.getPct('#');
        double double21 = frequency13.getCumPct((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        double double23 = frequency13.getPct(obj22);
        long long25 = frequency13.getCumFreq(0L);
        double double27 = frequency13.getPct((long) '#');
        double double29 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency13.addValue('a');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq('#');
        double double36 = frequency32.getPct('#');
        long long38 = frequency32.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency13.getCumFreq((java.lang.Object) "hi!");
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        long long44 = frequency40.getCumFreq((java.lang.Object) (byte) 1);
        long long46 = frequency40.getCumFreq((java.lang.Object) 10.0d);
        frequency40.addValue((long) (byte) 1);
        double double50 = frequency40.getCumPct((int) 'a');
        double double52 = frequency40.getCumPct((int) (short) 10);
        double double53 = frequency13.getCumPct((java.lang.Object) double52);
        long long55 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long57 = frequency13.getCount('a');
        long long58 = frequency0.getCount((java.lang.Object) 'a');
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency();
        long long61 = frequency59.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCumFreq('#');
        double double66 = frequency62.getPct('#');
        double double67 = frequency59.getCumPct((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        double double69 = frequency59.getPct(obj68);
        long long71 = frequency59.getCumFreq(0L);
        long long73 = frequency59.getCumFreq((long) (byte) 100);
        long long74 = frequency59.getSumFreq();
        long long76 = frequency59.getCumFreq((int) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor77 = frequency59.valuesIterator();
        frequency59.addValue((long) (short) 1);
        boolean boolean80 = frequency0.equals((java.lang.Object) frequency59);
        long long82 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('#');
        frequency0.addValue((int) (short) -1);
        frequency0.addValue((int) '4');
        long long13 = frequency0.getCount(0);
        double double15 = frequency0.getPct((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq('#');
        long long20 = frequency16.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency16.addValue((int) (byte) 0);
        long long24 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        frequency16.addValue((java.lang.Integer) 1);
        double double27 = frequency0.getCumPct((java.lang.Object) 1);
        double double29 = frequency0.getPct((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.5d + "'", double27 == 0.5d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        boolean boolean10 = frequency0.equals((java.lang.Object) (short) 0);
        double double12 = frequency0.getPct((int) (byte) 0);
        double double14 = frequency0.getCumPct((long) (byte) 1);
        frequency0.clear();
        double double17 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long19 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        long long4 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long9 = frequency0.getSumFreq();
        long long11 = frequency0.getCount((int) (byte) 100);
        long long13 = frequency0.getCumFreq(100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        double double4 = frequency0.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((int) (byte) 100);
        long long9 = frequency0.getCount(10);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCount((int) '4');
        long long13 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq('#');
        double double18 = frequency14.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency14.valuesIterator();
        double double21 = frequency14.getCumPct('#');
        frequency14.addValue((int) (short) -1);
        frequency14.addValue((int) '4');
        double double27 = frequency14.getCumPct(' ');
        frequency14.clear();
        long long30 = frequency14.getCumFreq((long) 100);
        long long31 = frequency0.getCount((java.lang.Object) 100);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq('#');
        long long36 = frequency32.getCumFreq((java.lang.Object) (byte) 1);
        long long38 = frequency32.getCumFreq((java.lang.Object) 10.0d);
        frequency32.addValue((long) (byte) 1);
        double double42 = frequency32.getCumPct((int) 'a');
        double double44 = frequency32.getCumPct((int) (short) 10);
        java.lang.String str45 = frequency32.toString();
        long long46 = frequency0.getCount((java.lang.Object) str45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        long long5 = frequency3.getCumFreq('#');
        double double7 = frequency3.getPct('#');
        double double8 = frequency0.getCumPct((java.lang.Object) '#');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        frequency0.addValue((long) 100);
        frequency0.addValue((int) (byte) 1);
        long long16 = frequency0.getCount(1);
        long long18 = frequency0.getCount((long) (byte) 1);
        double double20 = frequency0.getPct((int) (byte) 0);
        long long21 = frequency0.getSumFreq();
        double double23 = frequency0.getCumPct((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq('#');
        double double28 = frequency24.getPct('#');
        double double30 = frequency24.getPct((java.lang.Object) (-1.0f));
        long long32 = frequency24.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency24.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency24.valuesIterator();
        frequency24.addValue((java.lang.Integer) 10);
        double double39 = frequency24.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq('#');
        double double44 = frequency40.getPct((long) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor45 = frequency40.valuesIterator();
        long long46 = frequency40.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency40.valuesIterator();
        long long49 = frequency40.getCount((long) 100);
        long long51 = frequency40.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long53 = frequency40.getCount(0);
        frequency24.addValue((java.lang.Object) 0);
        frequency0.addValue((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(wildcardComparableItor45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }
}

