package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) (short) 0, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#1#104#10#4" + "'", str9, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-141410441044" + "'", str18, "-141410441044");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 100, (short) 10, (byte) 100, (byte) 1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 100, 10, 100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a0a100a10a100a1" + "'", str8, "0a0a100a10a100a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a0a100a10a100a1" + "'", str10, "0a0a100a10a100a1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0404100410410041" + "'", str12, "0404100410410041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0" + "'", str6, "-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0" + "'", str8, "-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 250, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 250 + "'", int3 == 250);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#100", (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 -1#10#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("edomdexim");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 104, 41);
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4#01#401#1#1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, 119);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#-1#1#100#33#10" + "'", str15, "-1#-1#1#100#33#10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 -1 1 100 33 10" + "'", str17, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#####", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 44, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4aaa4aaa ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 25, (float) 220L, 205.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 25.0f + "'", float3 == 25.0f);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                100.0a10.0a10.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(31L, (long) 30, (long) 431);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 30L + "'", long3 == 30L);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 1791, (int) (byte) 41);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 19012, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("x SO MniifiS niM uiV J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"x SO MniifiS niM uiV J\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#10NE-1#10NE-1#10NE-1#10NE-1#10NE-1#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIR# a 4", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 3, 75);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1#10#-1" + "'", str13, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 10 -1" + "'", str22, "-1 10 -1");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("ENENENENENEusers/sanjitkumar");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahttp://java.oracle.com/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 51, 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aa  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aaaa4aaa4aa  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("3b-8_ 8 ", (byte) 41);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double[] doubleArray6 = new double[] { 1.0f, 52.0f, 220.0f, 4, (byte) 10, 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 6, 6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 52.0, 220.0, 4.0, 10.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 220.0d + "'", double11 == 220.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 220.0d + "'", double12 == 220.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) (short) 10, 3288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(206.0d, (double) 57.0f, 5.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 206.0d + "'", double3 == 206.0d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("sun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjo");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"sun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjob##ftusun#lw#wt#m#cosx#cprinterjo\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-110-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100.0f, (double) 120L, (double) 99);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 120.0d + "'", double3 == 120.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(104L, (long) 19, 3869L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3869L + "'", long3 == 3869L);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a1a0a0a10" + "'", str16, "1a1a0a0a10");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "Java Virtual Machine Specificationaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Java Virtual Machine Specificationaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0a1" + "'", str17, "0a1");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, 10);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-14104-1" + "'", str18, "-14104-1");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(30, 3269, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("######################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 0, 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 223, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 1 0 0 10" + "'", str14, "1 1 0 0 10");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#1#0#0#10" + "'", str17, "1#1#0#0#10");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 201, 242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 201");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#4a44#1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                       #a#aaa4a4aa", (long) 203);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 203L + "'", long2 == 203L);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#aaa4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 44, (double) 230, (double) (-11104L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 230.0d + "'", double3 == 230.0d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (short) 100, (int) (short) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 15, 0);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 104.0d + "'", double21 == 104.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (int) (byte) 10, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a10a10a100a1a100" + "'", str12, "10a10a10a100a1a100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#10#10#100#1#100" + "'", str15, "10#10#10#100#1#100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104104104100414100" + "'", str17, "104104104100414100");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 223, (int) (byte) 41);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 1" + "'", str11, "0 1");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("ENENENENENEusers/sanjitkumar");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4#4 a 4 a#4#4 a 4 a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#4 a 4 a#4#4 a 4 a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 57, 1736);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1A10A-444444444444444444444444", 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("SUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOB", 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("USaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSaUSa", 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(28L, (long) 104, 51L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 208, 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 1 0 0 10" + "'", str11, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a1a0a0a10" + "'", str19, "1a1a0a0a10");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 41, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("    1.a-1.a-1.a-1.a1.     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:     1.a-1.a-1.a-1.a1.      is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1 0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 7, (long) 3293, (-111010L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-111010L) + "'", long3 == (-111010L));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 33, (int) (short) 0);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 55, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 11, (double) 52, 104.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 1696);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1696.0f + "'", float2 == 1696.0f);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4v4Virtu4lM4chineSpecific4tion/Users/s4njitkum4", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 41, 214L, (-1110410L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 214L + "'", long3 == 214L);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("          a4aphicsEnvironment 4awt.CGracle.com/ sun.a.oravaJ http://javacle.com/ tnemnorivnEemitnuRES)MT(a.orava http://ja4a4          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0" + "'", str7, "-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0" + "'", str9, "-1.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" 4 aaa4aaa4  a 4 a 4 aaa4aaa4  a 4 a 4 aaa4aaa4  a 4 a 4 x");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1A0...salc;ecneuqeSrahCegnaleavajL[ ssalc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 52, 7);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a104.0" + "'", str12, "-1.0a104.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str15, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-11104###");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####-1.0# a 4####");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(45.0f, (float) 81L, (float) 115);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 115.0f + "'", float3 == 115.0f);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 25, 10L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1181_0.8.1181_0.8.1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 28, 7);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1a1a0a0a10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1a1a0a0a10");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100#1#1#0#100#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 25, 2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 10 10 100 1 100" + "'", str11, "10 10 10 100 1 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa8-ftua44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa8-ftua44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JtX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JnX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JeX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JmX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JnX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JoX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JrX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JiX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JvX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JnX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JEX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4J X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JeX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JmX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JiX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JtX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JnX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JuX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JRX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4J X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JEX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JSX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4J X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4J)X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JMX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JTX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4J(X SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JaX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JvX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JaX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4JJX SO 4Mn4i4ifi4S 4ni4M 4u4iV 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"X SO \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 23, 0);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 19012, 115);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 8, 871);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444446E19f, 17.0f, (float) (short) 44);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444446E19f + "'", float3 == 4.4444446E19f);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1 1 104 10 4" + "'", str21, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1 1 104 10 4" + "'", str23, "-1 1 104 10 4");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 104 + "'", int25 == 104);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 543, (double) 52, (double) 66.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 543.0d + "'", double3 == 543.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("JAVA PLATFORM API SPECIFICATION");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100 -");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("bbaaaaaaab");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3292, 36, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (byte) 100, 24);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 220.0f + "'", float11 == 220.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.04220.0" + "'", str13, "-1.04220.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 58L, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(25.0d, (double) 10, (double) (-11104L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11104.0d) + "'", double3 == (-11104.0d));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-4014bbaaaaaaab44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-44a44A0143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143340014141-40143");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                               ...J...J...J...J...J...J...J...J...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.8.0_181-b13n1.8.0_181-b13o1.8.0_181-b13i1.8.0_181-b13t1.8.0_181-b13a1.8.0_181-b13c1.8.0_181-b13i1.8.0_181-b13f1.8.0_181-b13i1.8.0_181-b13c1.8.0_181-b13e1.8.0_181-b13p1.8.0_181-b13S1.8.0_181-b13 1.8.0_181-b13e1.8.0_181-b13n1.8.0_181-b13i1.8.0_181-b13h1.8.0_181-b13c1.8.0_181-b13a1.8.0_181-b13M1.8.0_181-b13 1.8.0_181-b13l1.8.0_181-b13a1.8.0_181-b13");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(58.0f, (float) 21, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 0, (int) (short) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a1a0a0a10" + "'", str13, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a1a0a0a10" + "'", str19, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 1 0 0 10" + "'", str23, "1 1 0 0 10");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 220, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 66, 33);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 119, 51);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1#1#104#10#4" + "'", str29, "-1#1#104#10#4");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str16, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 44, (short) (byte) 100, (short) 44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) ' ', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 19, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0 104.0" + "'", str15, "-1.0 104.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 66.0f, (double) 44.0f, (double) (short) 44);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 136.0f, (float) 25L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 136.0f + "'", float3 == 136.0f);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 41, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 205, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-14104-1" + "'", str18, "-14104-1");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a 4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a 4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("xed mod");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 15, 1736);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-14104-1" + "'", str11, "-14104-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("java platiaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(205L, (long) 82, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 205L + "'", long3 == 205L);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double[] doubleArray6 = new double[] { 1.0f, 52.0f, 220.0f, 4, (byte) 10, 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 6, 6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 52.0, 220.0, 4.0, 10.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 220.0d + "'", double11 == 220.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 10, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0 220.0" + "'", str7, "-1.0 220.0");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1 1 104 10 4" + "'", str24, "-1 1 104 10 4");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 23.0f, 115.0d, (double) 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 115.0d + "'", double3 == 115.0d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 104, (int) ' ');
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 30, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 104 + "'", int23 == 104);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44a#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44a#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 58L, 19.0f, 223.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 19.0f + "'", float3 == 19.0f);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("14141040414 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 115, 54);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0#1" + "'", str12, "0#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("sanjitkumar                                                                                          aaaaaaaaaa-1#10#-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#####################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(65, 99, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100, (float) 30, (float) 55L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '4', (int) (short) 1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0#10.0#10.0" + "'", str14, "100.0#10.0#10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0#10.0#10.0" + "'", str16, "100.0#10.0#10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0410.0410.0" + "'", str18, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.0410.0410.0" + "'", str20, "100.0410.0410.0");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, (int) (short) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "class [LjavaelangeCharSequence;clas...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: class [LjavaelangeCharSequence;clas...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1" + "'", str14, "0#1");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(6, 51, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "a #4 a 4  a 4 a 4  a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a #4 a 4  a 4 a 4  a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 206, 115);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0a10.0a10.0" + "'", str16, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 52, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 205, 4);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Sun.lw2wt.m2cosx.CPrinterJob8-FTUsu", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("VA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPE####-1.0# a 4####JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPEC");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: VA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPE####-1.0# a 4####JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPEC is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.Class<?> wildcardClass13 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#10#-1" + "'", str11, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#1#104#10#4" + "'", str20, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-141410441044" + "'", str22, "-141410441044");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1#1#104#10#4" + "'", str24, "-1#1#104#10#4");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 75, (int) (short) 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 104);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0 10.0 10.0" + "'", str12, "100.0 10.0 10.0");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str10, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aJ v  Virtu l M chine Specific tion                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aJ v  Virtu l M chine Specific tion\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 24, 18);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0" + "'", str10, "-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("rSequence;cl uS 4 a  rSequence;cl ", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.5", 150.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5f + "'", float2 == 1.5f);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("RS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                 Java  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 104aaa4aaaJava  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 10                                                                 ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-11104L), 51L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-11104L) + "'", long3 == (-11104L));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a8-FTUaaaaaaaaaaaPLATFORMaaaaaaaaaaAPIaaaaaaaaaaSPECIFICATION");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3269L, (float) 2245, (float) 45);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3269.0f + "'", float3 == 3269.0f);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("041");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 41 + "'", short1 == (short) 41);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 65, (long) 3046, (long) 17);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3046L + "'", long3 == 3046L);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0" + "'", str10, "-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0" + "'", str12, "-1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("JAVA  -1 1 100 33 10 MACHINE SPECIF -1 1 100 33 10JAVA  -1 1 100 33 104AAA4AAAJAVA  -1 1 100 33 10 MACHINE SPECIF -1 1 100 33 10JAVA  -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("32.0410.0497.04104.0410.                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32.0410\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a104.0" + "'", str7, "-1.0a104.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 104.0d + "'", double8 == 104.0d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100 1 1 0 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 1 1 0 100 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.04104.0" + "'", str14, "-1.04104.0");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("31b-181_0.8.1sun.lwawt.macosx.LWCToolkit");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"31b-181_0.8.1sun.lwawt.macosx.LWCToolkit\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 18, (int) (byte) 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 3293, 52);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 246, (int) (byte) 1);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) 44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a100" + "'", str8, "-1a100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 220L, (double) (byte) 1, (double) 43684.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43684.0d + "'", double3 == 43684.0d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 104.0" + "'", str12, "-1.0 104.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.04104.0" + "'", str15, "-1.04104.0");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 57, 9);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 43684, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 5, 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0a1" + "'", str17, "0a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0a1" + "'", str19, "0a1");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a #4 a 4  a 4 a 4", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 1736, 4);
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
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(5L, (long) 223, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 33L, (double) (short) 41, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.0d + "'", double3 == 41.0d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 18, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        short short24 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 1 0 0 10" + "'", str20, "1 1 0 0 10");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1414040410" + "'", str23, "1414040410");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-11104###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-11104###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 58, (int) (byte) 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (byte) 10, 239);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-141410441044" + "'", str21, "-141410441044");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("14141040414 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  ", (long) 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30L + "'", long2 == 30L);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 41, 34);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                          ", 66.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 66.0f + "'", float2 == 66.0f);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("rSequence;cl uS 4 a  rSequence;cl ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str15, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str17, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 62, 26);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.Class<?> wildcardClass18 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a100" + "'", str8, "-1a100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 100" + "'", str16, "-1 100");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("TUsun.HTTP://JAVrJob8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 34, (double) 11, 1.399999976158142d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrin...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (int) (short) 100, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 90, (float) (-11104L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 54, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1#1#104#10#4" + "'", str17, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 223, (int) (byte) 41);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "ne");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ne");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#1#104#10#4" + "'", str9, "-1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 208, 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 1 0 0 10" + "'", str11, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "32.0410.0497.04104.0410.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32.0410.0497.04104.0410.");
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
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444414.46", (float) 1791L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.44444453E18f + "'", float2 == 4.44444453E18f);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ava Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:RTUALMACHINESPECIFICATIONJAVAVIRTUAL AAA AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL                                                                                                                                                                                                                                                      ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                              1a1a0a0a10", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4a4a444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                LATFORM API SPECIFICATIONusususu", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("wa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aa", (long) 3046);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3046L + "'", long2 == 3046L);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 220, (int) (byte) 10);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0 10.0 10.0" + "'", str16, "100.0 10.0 10.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, 3275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("J4 V-1 100", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(246L, 208L, (long) 5);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 246L + "'", long3 == 246L);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 220, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 66, 33);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 119, 51);
        int int28 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }
}

