package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 104.0f, (double) 2, (double) 2L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 31, (float) 16, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 104, 4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB", (long) 43684);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43684L + "'", long2 == 43684L);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "mixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemi/uSERS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: mixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemi/uSERS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0#1" + "'", str8, "0#1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, 10);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                           1.7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                           1.7\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0 220.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                   0.01 0.401 0.79 0.01 0.23444444444444444444444444444444444444444444444444444444444444444444444444                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                   0.01 0.401 0.79 0.01 0.23444444444444444444444444444444444444444444444444444444444444444444444444                   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("J4 V-1 100A...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) -1, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (short) 100, 26);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 110, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str16, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 93, (long) 43684, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3046, (double) 35L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3046.0d + "'", double3 == 3046.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                              ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                              ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;class [LjavaelangeCharSe/var/folders/q_/q9vzn1hs6pqdw0s9wlgsgybw0000gn/T/");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 3869, 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Environment1.8.0_1811.8.0_1811.8 Runtime SE Jv(TM)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 136, 425L, (long) 3869);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3869L + "'", long3 == 3869L);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 86, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1414040410" + "'", str10, "1414040410");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1" + "'", str13, "0 1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a-1" + "'", str8, "-1a10a-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(44.0f, (float) 9, (float) 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a1a104a10a4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ")MT(avaJ ES emitnuR 8.1181_0.8.1181_0.8.1tnemnorivnE");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: )MT(avaJ ES emitnuR 8.1181_0.8.1181_0.8.1tnemnorivnE");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 55, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0#1" + "'", str16, "0#1");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 65, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 198, 31);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14-1410404-1" + "'", str10, "-14-1410404-1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) '4', (int) (short) 41);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 66, 0);
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(17.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 119, 0L, 200L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 200L + "'", long3 == 200L);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 208L, (float) (byte) 0, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "Jvvirtulmchinespecifiction");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Jvvirtulmchinespecifiction");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1" + "'", str13, "0 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "041" + "'", str15, "041");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 23, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 3292, 47);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long29 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 43684, 0);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long36 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-14104-1" + "'", str22, "-14104-1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-14104-1" + "'", str28, "-14104-1");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1 10 -1" + "'", str35, "-1 10 -1");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.0#10.0#10.0140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0#10.0#10.0140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("J#Vi#u#M#in#S#ifi#i#nM#OS X", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 425L, (float) 1696, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1696.0f + "'", float3 == 1696.0f);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 3, (int) (short) -1);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 87, 8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a1" + "'", str10, "0a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "041" + "'", str16, "041");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(17.0f, 97.0f, (float) 206);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 206.0f + "'", float3 == 206.0f);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(223, 11, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(130, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 44, (double) 26, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 104, 15);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 57, 0);
        long long27 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1#10#-1" + "'", str13, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 10 -1" + "'", str22, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("asasasaNOITACIFICEPSaIPAaaROFTAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"asasasaNOITACIFICEPSaIPAaaROFTAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (short) 100, (int) (short) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str18, "32.0#10.0#97.0#104.0#10.0");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 10, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 100, 52);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '#', (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a35.0a0.0a52.0a52.0" + "'", str11, "-1.0a35.0a0.0a52.0a52.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...Mixedmode4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS10.16");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 220, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.6f, 0.0d, (double) 135);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4  4 1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("jAVA pLATFORM api sPECIFICATION");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 104.0" + "'", str12, "-1.0 104.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0#104.0" + "'", str14, "-1.0#104.0");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (short) 1, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', (int) '#', (int) (short) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a10.0" + "'", str10, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0 10.0 10.0" + "'", str18, "100.0 10.0 10.0");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa8-ftua44444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 0.25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#104.0" + "'", str6, "-1.0#104.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a104.0" + "'", str8, "-1.0a104.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 104.0d + "'", double9 == 104.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" PLATFORM API SPECIFICATIO");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1a10a-1" + "'", str16, "-1a10a-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 1 104 10 -1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.0", 214);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 214 + "'", int2 == 214);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0 104.0" + "'", str5, "-1.0 104.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1#1#104#10#4" + "'", str16, "-1#1#104#10#4");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1#1#0#0#10" + "'", str16, "1#1#0#0#10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(16.0f, (float) 71, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                            chF#U");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("..J", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaa0#1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaa0#1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0#1" + "'", str7, "0#1");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#4A44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 28, 7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 0, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0#10.0#10.0" + "'", str16, "100.0#10.0#10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0a10.0a10.0" + "'", str18, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.0 10.0 10.0" + "'", str20, "100.0 10.0 10.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100.0a10.0a10.0" + "'", str22, "100.0a10.0a10.0");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 75, 135);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          01a0a0a1a1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "          -1.0a35.0a0.0a52.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:           -1.0a35.0a0.0a52.0a52.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a1a0a100a-1" + "'", str13, "100a1a1a0a100a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4L, (double) 31.0f, (double) 220.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 543);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 104.0" + "'", str12, "-1.0 104.0");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                -1#10NE-1#10NE-1#10NE-1#10NE-1#10NE-1#10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                   norivnE");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                    norivnE is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/xed modHTTP://JAVA.ORACLE.COM/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Java Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machin", (long) 214);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 214L + "'", long2 == 214L);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.6f, 0.0d, (double) 115.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.0d + "'", double3 == 115.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a10a10a100a1a100" + "'", str12, "10a10a10a100a1a100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 10 10 100 1 100" + "'", str14, "10 10 10 100 1 100");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 214, 150);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0#1" + "'", str8, "0#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, 7.0f, (float) 214);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 214.0f + "'", float3 == 214.0f);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (byte) 100, 24);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("8.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(120.0d, (double) 431L, (double) 33L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.0d + "'", double3 == 33.0d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(214, 81, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TION", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 0, (int) (short) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a1a0a0a10" + "'", str13, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a1a0a0a10" + "'", str19, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1414040410" + "'", str21, "1414040410");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 15, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 0, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.04104.0" + "'", str13, "-1.04104.0");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(13L, 143L, (long) 3293);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3293L + "'", long3 == 3293L);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aJ v  Virtu l M chine Specific tion                                                                                                                                                                                          ", (float) 62);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("UUUUUU");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 71, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 0, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a-1a10a0a-1" + "'", str11, "-1a-1a10a0a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "HTTP://JAVA.ORACLE.COM/");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HTTP://JAVA.ORACLE.COM/");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 1" + "'", str11, "0 1");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 143, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a10.0" + "'", str10, "100.0a10.0a10.0");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(28, 0, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(45, 13, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 220.0f + "'", float6 == 220.0f);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("U#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#8-F");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"U#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#8-F\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("t", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Mixedmode");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 75, (double) 136, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 136.0d + "'", double3 == 136.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#-1#1#100#33#10" + "'", str15, "-1#-1#1#100#33#10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-14-1414100433410" + "'", str20, "-14-1414100433410");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1 4 a 4 a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaa########################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0" + "'", str6, "-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0" + "'", str8, "-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0" + "'", str11, "-1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 214, (long) 57);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 214L + "'", long3 == 214L);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4, 4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 31, 8);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 25, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 10 10 100 1 100" + "'", str11, "10 10 10 100 1 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#0", 3046);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3046 + "'", int2 == 3046);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-14104-1" + "'", str11, "-14104-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 -1" + "'", str14, "-1 10 -1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X0U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 543, 96);
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1a1a104a10a4" + "'", str27, "-1a1a104a10a4");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '4', (int) (short) 1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 97, (int) (short) 44);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0a10.0a10.0" + "'", str14, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a1a0a0a10" + "'", str13, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1414040410" + "'", str16, "1414040410");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a1a0a0a10" + "'", str18, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 1 0 0 10" + "'", str21, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1a1a0a0a10" + "'", str23, "1a1a0a0a10");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 41);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-11104104");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1104104E7d) + "'", double1 == (-1.1104104E7d));
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("UTF-8");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 47, 3293);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("8.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, (int) (short) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1" + "'", str14, "0#1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str17, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaMIXEDaMODE");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Sun.lw2wt.m2co x.  rinterJob8- #4 u", 66L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66L + "'", long2 == 66L);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4, 4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 17, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100" + "'", str17, "100");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING; is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.7999999523162842d, (double) 13.0f, (double) (-111010L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.0d + "'", double3 == 13.0d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("40140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140140");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 150, (long) 3293, (long) 246);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 150L + "'", long3 == 150L);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.01.0#52.0#220.0#4.0#10.0#0.0", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 0, (int) (short) 1);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104 + "'", int21 == 104);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa4a4aaa#a#", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 115, 2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 47, (double) 24L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.0d + "'", double3 == 47.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(115, 71, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 71 + "'", int3 == 71);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 41, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(150.0f, (float) 230L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4aaa4aa4aaa4aa4aaa4aa4aaa4aa4aaa4aa4aaa4aa4aaa4aa4aaa4aa4aaa4aa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(17L, (long) 31, (long) 55);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 55L + "'", long3 == 55L);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#10#-1" + "'", str14, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 0, 242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str15, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.04104.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 32, 208);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a1a0a100a-1" + "'", str12, "100a1a1a0a100a-1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 26.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.0d + "'", double2 == 26.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0#1" + "'", str9, "0#1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "bbbJbbbJbbbJbbbJbbbJbbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbb");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: bbbJbbbJbbbJbbbJbbbJbbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbb");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a1a0a100a-1" + "'", str13, "100a1a1a0a100a-1");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 220L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220L + "'", long2 == 220L);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("macosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkit", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("java plati", 0.25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25f + "'", float2 == 0.25f);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) 3, (long) 200);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(36, 86, 221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 221 + "'", int3 == 221);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 54, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, 10);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#10#-1" + "'", str20, "-1#10#-1");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4#a#4A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#a#4A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0a1" + "'", str15, "0a1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0a1" + "'", str17, "0a1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 3869, 242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a35.0a0.0a52.0a52.0" + "'", str11, "-1.0a35.0a0.0a52.0a52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str13, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Oracle Corporation4444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Oracle Corporation4444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a100" + "'", str8, "-1a100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-14100" + "'", str11, "-14100");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#100", (float) 119L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 119.0f + "'", float2 == 119.0f);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("   hi!    -1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".:avaj/bil/rsu/:snoisnetxE/avaJ/yrarbiL/metsyS/:snoisnetxE/avaJ/yrarbiL/krowteN/:snoisnetxE/avaJ/yrarbiL/:snoisnetxE/avaJ/yrarbiL/ramuktijnas/sresU/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".:avaj/bil/rsu/:snoisnetxE/avaJ/yrarbiL/metsyS/:snoisnetxE/avaJ/yrarbiL/krowteN/:snoisnetxE/avaJ/yrarbiL/:snoisnetxE/avaJ/yrarbiL/ramuktijnas/sresU/\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 71, 71);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 24, (-1));
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Ja...", 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 28, 7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0#10.0#10.0" + "'", str16, "100.0#10.0#10.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("/USJAVA VIRTUAL MACHINE SPECIFICATIONAAAAAAAAAAAAAAAAAAAAAAAATS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS4/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS4/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS444/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/USJAVA VIRTUAL MACHINE SPECIFICATIONAAAAAAAAAAAAAAAAAAAAAAAATS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS4/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS4/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS444/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a1a104a10a4ususususususususususu0#1  aUS 4 0#1  aUS 4 0#1", (byte) 41);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 5, 4);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 1 0 0 10" + "'", str15, "1 1 0 0 10");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Java Virtual Machine SpecificationMac OS X          ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0 35.0 0.0 52.0 52.0", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 33, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.0d + "'", double3 == 33.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 104);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 10, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104 + "'", int21 == 104);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1a1a104a10a4" + "'", str23, "-1a1a104a10a4");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 99, (long) 34);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(198.0f, 31.0f, (float) 431);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 31.0f + "'", float3 == 31.0f);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("J#Vi#u#M#in#S#ifi#i#nM#OS X", (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaMIXEDaMODE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104-1" + "'", str10, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a-1" + "'", str12, "-1a10a-1");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 75, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0" + "'", str7, "-1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97, (double) 1696, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1696.0d + "'", double3 == 1696.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("TnemnorivnEemitnuRES)MT(ava100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TnemnorivnEemitnuRES)MT(ava100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a8-FTUaaaaaaaaaaaPLATFORMaaaaaaaaaaAPIaaaaaaaaaaSPECIFICATIONa8-FTUaaaaaaaaaaaPLATFOR-1100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32.010.097.0104.010.0", (long) 120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120L + "'", long2 == 120L);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 223, (int) (byte) 41);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 182, 3269);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 182");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-111010L), (long) (short) 100, (long) 246);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-111010L) + "'", long3 == (-111010L));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a 4 a 4  a 4 a 44 a #", (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1#10#-1" + "'", str18, "-1#10#-1");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100 -10 10 10 100 1 ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1414104041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("/Usjava virtual machine specificationaaaaaaaaaaaaaaaaaaaaaaaats/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/Usjava virtual machine specificationaaaaaaaaaaaaaaaaaaaaaaaats/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 48, 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "041" + "'", str13, "041");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "041" + "'", str15, "041");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("jvvirtulmchinespecifiction");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"jvvirtulmchinespecifiction\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 3292, 31);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 3292, 3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 10, 5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                           -1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4aaa4aaa http://java.oracle.com/ tnemnorivnEemitnuRES)MT(avaJ http://java.oracle.com/ sun.awt.CGraphicsEnvironment 4aaa4aaa ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(220, 1696, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("Mac OS X");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) '4', (int) (short) 41);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 66, 0);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 14, 6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("uS 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"uS 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 214, (int) (short) 44);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0 10.0 10.0" + "'", str12, "100.0 10.0 10.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("v Virtul Mchine Specifiction/Users/snjitkum");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 75, 0);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a35.0a0.0a52.0a52.0" + "'", str11, "-1.0a35.0a0.0a52.0a52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str13, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a35.0a0.0a52.0a52.0" + "'", str15, "-1.0a35.0a0.0a52.0a52.0");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 1" + "'", str8, "0 1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("      4  4        ", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 246, (int) (byte) 1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a1a104a10a4" + "'", str21, "-1a1a104a10a4");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 10 -1" + "'", str18, "-1 10 -1");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 10, 5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 41, 12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "  1-#01#1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:   1-#01#1-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44a#4", (double) 1736);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1736.0d + "'", double2 == 1736.0d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 41, 1755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 1" + "'", str10, "0 1");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                    ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 242L, 0.0f, (float) 143L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 242.0f + "'", float3 == 242.0f);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("SPECIFICATION API PLATFORM JAVA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(23, 65, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 10 -1" + "'", str17, "-1 10 -1");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4L, (long) (-1), (long) 31);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 223, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 1 0 0 10" + "'", str14, "1 1 0 0 10");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 104.0d + "'", double9 == 104.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(223.0f, 23.0f, (float) 1791L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1791.0f + "'", float3 == 1791.0f);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (float) 223);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 35L, 4.4444446E19f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444446E19f + "'", float3 == 4.4444446E19f);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("X SO MniifiS niM uiV J_SCRIPTS4/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS444/USERS/SANJITKUMAR/PERSONAL_PROJECTS/COLLEGEILLINOIS/SOFTWAREENGINEERINGPRINCIPLES/MILESTONE3/M3_SCRIPTS");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaTnemnorivnEemitnuRES)MT(avaTnemnorivnEemitnuRES)MT(ava", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(97L, 230L, (long) 28);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28L + "'", long3 == 28L);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-14-1414100433410" + "'", str14, "-14-1414100433410");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444/Users/sanjitkuma");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jre");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jre is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220.0f, 0.25d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 44, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1414040410" + "'", str13, "1414040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1a1a0a0a10" + "'", str15, "1a1a0a0a10");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4#4 a 4 a#4#4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 223, (float) '4', (float) 425);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 4  4   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(150L, (long) 58, (long) 206);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 206L + "'", long3 == 206L);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 -1 10 0 -1" + "'", str11, "-1 -1 10 0 -1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a-1a10a0a-1" + "'", str15, "-1a-1a10a0a-1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 75, (int) (short) 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(71.0f, (float) 13, 136.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 136.0f + "'", float3 == 136.0f);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0a104.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a104.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 52, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.04104.0" + "'", str9, "-1.04104.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0#1  aUS 4 0#1  aUS 4 0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#1  aUS 4 0#1  aUS 4 0#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "mixedmod");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: mixedmod");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0a1" + "'", str15, "0a1");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440a14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440a14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("java virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specificationjava virtual machine specification");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 242, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 242 + "'", int3 == 242);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeTION2.TION4TION.TION497.TION4TION4.TION4TION.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(32.0f, 431.0f, (float) 104);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 431.0f + "'", float3 == 431.0f);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 35, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                 Java  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 104aaa4aaaJava  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 10                                                                 ", (long) 242);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 242L + "'", long2 == 242L);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3269, 75, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3269 + "'", int3 == 3269);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) '4', (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a-1" + "'", str11, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 10 -1" + "'", str13, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#10#-1" + "'", str15, "-1#10#-1");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 44, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 14, (double) 66);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.1104104E7d), (double) 97, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3046, 62L, (long) 65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 62L + "'", long3 == 62L);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(250, 3293, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (byte) -1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 205, (int) (byte) 1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 3293, 136);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 48, 45);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-141410441044" + "'", str24, "-141410441044");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 104 + "'", int25 == 104);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                           1.7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 18, 0);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 104 + "'", int24 == 104);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(Float.POSITIVE_INFINITY, (float) 55, (float) 120L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 16, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 23, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 3292, 47);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long29 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 43684, 0);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long38 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-14104-1" + "'", str22, "-14104-1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-14104-1" + "'", str28, "-14104-1");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1 10 -1" + "'", str35, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1#10#-1" + "'", str37, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("macosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolkitmacosx.LWCToolki");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"m\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) '4', (int) (short) 41);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.Class<?> wildcardClass25 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-141410441044" + "'", str24, "-141410441044");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 1736, 48);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str19, "32.0410.0497.04104.0410.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 0, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 10 -1" + "'", str12, "-1 10 -1");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0 10.0 10.0" + "'", str12, "100.0 10.0 10.0");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(26, 136, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 136 + "'", int3 == 136);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#1a1a0a0a10", (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A8-FTUA44444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A8-FTUA44444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(48L, (long) (short) 0, 31L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 48L + "'", long3 == 48L);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("J#v# Pl#tform API Speci");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 41, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 104);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', (int) '4', (int) (byte) 10);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 21, 0);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0a10.0a10.0" + "'", str16, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', (int) '#', (int) (short) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 871, (int) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a10.0" + "'", str10, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#10#-1" + "'", str14, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(":");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) ' ', 26);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1a10a-1" + "'", str16, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1#10#-1" + "'", str23, "-1#10#-1");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("8.1", (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3869L, (double) 214.0f, (double) 3046);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3869.0d + "'", double3 == 3869.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1A10A-444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A-444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-110ne-110ne-110ne-110ne-110ne-110", 220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 220 + "'", int2 == 220);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaa#a#aaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 3288);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3288L + "'", long2 == 3288L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, 0.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 75, 15);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104-1" + "'", str10, "-14104-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 41, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 81L, (float) 143);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, 0L, (long) 65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 220, (int) ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 47, (int) (short) 10);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 223, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu MaaaaaaaaaaJ Viu M");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("jvvirtulmchinespecifiction");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"jvvirtul\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("J#Vi#u#M#in#S#ifi#i#nM#OS X");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJ4 V-1 100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJ4 V-1 100");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100 -10 10 10 100 1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a-1.0a-1.0a-1.0a100.0" + "'", str12, "100.0a-1.0a-1.0a-1.0a100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0a-1.0a-1.0a-1.0a100.0" + "'", str15, "100.0a-1.0a-1.0a-1.0a100.0");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 1791, 1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#1#104#10#4" + "'", str20, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-141410441044" + "'", str26, "-141410441044");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 104.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(104.0d, (double) 23.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 208, 6);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0#-1.0#-1.0#-1.0#100.0" + "'", str12, "100.0#-1.0#-1.0#-1.0#100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0a-1.0a-1.0a-1.0a100.0" + "'", str14, "100.0a-1.0a-1.0a-1.0a100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 0, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 -1" + "'", str14, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-14104-1" + "'", str16, "-14104-1");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 3293, 75);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 208, (int) (byte) 1);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-14104-1" + "'", str25, "-14104-1");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaa           52.0aaOracle Corporatioaaa           52.0aaa", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeTION2.TION4TION.TION497.TION4TION4.TION4TION.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeTION2.TION4TION.TION497.TION4TION4.TION4TION.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 3b-8_ 8 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(31, 223, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0" + "'", str6, "-1.0");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.8.0_181-b13n1.8.0_181-b13o1.8.0_181-b13i1.8.0_181-b13t1.8.0_181-b13a1.8.0_181-b13c1.8.0_181-b13i1.8.0_181-b13f1.8.0_181-b13i1.8.0_181-b13c1.8.0_181-b13e1.8.0_181-b13p1.8.0_181-b13S1.8.0_181-b13 1.8.0_181-b13e1.8.0_181-b13n1.8.0_181-b13i1.8.0_181-b13h1.8.0_181-b13c1.8.0_181-b13a1.8.0_181-b13M1.8.0_181-b13 1.8.0_181-b13l1.8.0_181-b13a1.8.0_181-b1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 220, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 66, 33);
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(246.0d, (double) 48.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 246.0d + "'", double3 == 246.0d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1791L, 10.0d, (double) 871.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4#4 a 4 a#4#4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#4 a 4 a#4#4 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "...                                                                               aaaaaaaaaS 4   ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...                                                                               aaaaaaaaaS 4   ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0a1" + "'", str15, "0a1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "041" + "'", str17, "041");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 41, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 200L, (float) 100, (float) 25L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 25.0f + "'", float3 == 25.0f);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444432.0410.0497.04104.0410444444444", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a 4 a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 75, (int) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("32.010.097.010.010.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                          aaaa #4 a 4  a 4 a 4  a                                                                            aaaaaaaaaa-1#10#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa #4 a 4  a 4 a 4  a                                                                            aaaaaaaaaa-1#10#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 3293, 136);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-141410441044" + "'", str24, "-141410441044");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) ' ', 15);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 26, 25);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0 104.0" + "'", str18, "-1.0 104.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4  4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("PECIFICATION API PATFORM JAVA", (float) 66L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 66.0f + "'", float2 == 66.0f);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(119, 43684, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(9L, 25L, 48L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 48L + "'", long3 == 48L);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 16.0f, (double) 120L, (double) 246L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 246.0d + "'", double3 == 246.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3275, (long) 120, (long) 1791);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3275L + "'", long3 == 3275L);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#1#104#10#4" + "'", str20, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-141410441044" + "'", str22, "-141410441044");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444444444444444444444444444444444444444-14-1410404...4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444-14-1410404...4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                100.0a10.0a10.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("mixedmod");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 9, 7);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 41, (double) 1.8f, 3269.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7999999523162842d + "'", double3 == 1.7999999523162842d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "JvVirtulMchineSpecifiction");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: JvVirtulMchineSpecifiction");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("01 33 001 1 1- ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 200, 0);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.04-1.04-1.04-1.04100.0" + "'", str12, "100.04-1.04-1.04-1.04100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("###############################################################################################################################################################################################################################-1.0a35.0a0.0a52.0a52.0", (double) 4.4444446E19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444582382194E19d + "'", double2 == 4.444444582382194E19d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a1a104a10a4" + "'", str21, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 87, 8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 PLATFORM API SPECIFICATIO                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 PLATFORM API SPECIFICATIO                                                                                                              ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a1" + "'", str10, "0a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "041" + "'", str16, "041");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 214, (-1));
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1" + "'", str14, "0#1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 1" + "'", str21, "0 1");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 543, 96);
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("##", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 44, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Environment1.8.0_1811.8.0_1811.8 Runtime SE Jv(TM)          -1.0a35.0a0.0a52.0a52.0          -1.0a35.0a0.0a52.0a52.0          -1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 104);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 1, 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1414040410" + "'", str12, "1414040410");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("##1-4040141-41-", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(220.0f, (float) 43684, (float) 119L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 43684.0f + "'", float3 == 43684.0f);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(136, 230, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 230 + "'", int3 == 230);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 431.0f, (double) 246L, (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 431.0d + "'", double3 == 431.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444444444444444E205d + "'", double1 == 4.444444444444444E205d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1#1#104#10#4" + "'", str21, "-1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4400 1 1 0 100 -144");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 58, (int) (short) 10);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 10 -1" + "'", str12, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 -1" + "'", str14, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 250, 13);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("########################################################################################################################", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 5, 4);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 871, 95);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 100, 1);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(62.0f, (float) 99, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) 'a', 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(23.0f, (float) 8L, (float) 48L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 48.0f + "'", float3 == 48.0f);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 43684, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 5, 1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#4a44");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 19012 + "'", number1, 19012);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 19, 425.0f, 58.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 19.0f + "'", float3 == 19.0f);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1414040410                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                          MIXED MOD32.0 10.0 97.0 104.0 10.0ava32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.032.0 10.0 97.0 104.0 10.0atf32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0API32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0S32.0 10.0 97.0 104.0 10.0pecifica");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("##a#A8-ftu44444444444444444444444444444444444444444444444444444444444444444444444444444444444##a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("J", (double) 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.0d + "'", double2 == 26.0d);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 1.399999976158142d, 120.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("jvVirtulMchineSpecifiction");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 87, 8);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a1" + "'", str10, "0a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2c                                                  sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2co", 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("javaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 5, 4);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1a1a0a0a10" + "'", str17, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 71L, (float) 51L, 246.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 51.0f + "'", float3 == 51.0f);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 23, (double) 24, (double) 82);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (byte) 100, 24);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 220.0" + "'", str11, "-1.0 220.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 99, 0);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 51, 1736);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0#10.0#10.0" + "'", str10, "100.0#10.0#10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0#10.0#10.0" + "'", str12, "100.0#10.0#10.0");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 1791, 1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#1#104#10#4" + "'", str20, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1 1 104 10 4" + "'", str26, "-1 1 104 10 4");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 41, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a1a104a10a4ususususususususususu0#1  aUS 4 0#1  aUS 4 0#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 1791, 14);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(208, 3292, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 45, 5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 208, 21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 26, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(221, 0, 3292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3292 + "'", int3 == 3292);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 1 0 0 10" + "'", str15, "1 1 0 0 10");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444444444444444444444444444444444/Users/sanjitkumar", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(71, 543, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 543 + "'", int3 == 543);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, (double) 2L, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...J...J...J...J...J...J...J...J......J...J...J...J...J...J...J...J......J...J...J...J...J...J...J...J...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...J..\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 425L, (double) 7L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 425.0d + "'", double3 == 425.0d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 45, (long) 47, (long) (short) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 47L + "'", long3 == 47L);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(223, 81, 221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                          V                                                                                                                           ", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("041");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 223, 220);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104-1" + "'", str10, "-14104-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 5, 0);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 71, 1755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 71");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 5.0f, (double) 90, (double) 3293L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3293.0d + "'", double3 == 3293.0d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 90, 4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a-1" + "'", str8, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...", 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-14104-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-14104-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-14-1410404-", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("anjitkumarlang/users/sanjitkumar./users/sanjitkumarstring/users/sanjitkumar;/users/sanjitkumarclass/users/sanjitkumar /users/sanjitkumar[/users/sanjitkumarljava/users/sanjitkumar./users/sanjitkumarlang/users/sanjitkumar./users/sanjitkumarstring/users/sanjitkumar;/users/sanjitkumarclass/users/sanjitkumar /users/sanjitkumar[/users/sanjitkumarljava/users/sanjitkumar./users/sanjitkumarlang/users/sanjitkumar./users/sanjitkumarstring/users/sanjitkumar;");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', 3269.0f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3269.0f + "'", float3 == 3269.0f);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 'a', 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 7, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 110, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#104.0" + "'", str6, "-1.0#104.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(201, (int) (short) 44, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 201 + "'", int3 == 201);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, (float) 75L, (float) 62L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

